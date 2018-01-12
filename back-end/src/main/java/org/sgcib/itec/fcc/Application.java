package org.sgcib.itec.fcc;

import org.sgcib.itec.fcc.business.Account;
import org.sgcib.itec.fcc.business.Customer;
import org.sgcib.itec.fcc.repository.IAccountRepository;
import org.sgcib.itec.fcc.repository.ICustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Sample accounts
     */
    @Bean
    public IAccountRepository accountRepository() {

        final List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("STEVE_001", 100));
        accounts.add(new Account("STEVE_002", 200));
        accounts.add(new Account("BILL_001", 300));

        return new IAccountRepository() {
            @Override
            public Optional<Account> getAccount(String id) {
                return accounts.stream().filter(p -> p.getId().equalsIgnoreCase(id)).findAny();
            }
        };
    }

    /**
     * Sample customers
     */
    @Bean
    public ICustomerRepository customerRepository(IAccountRepository accountRepository) {

        final List<Customer> customers = new ArrayList<>();

        // Steve Jobs
        Customer steveJobs = new Customer("steve.jobs");
        accountRepository.getAccount("STEVE_001").ifPresent(acc -> steveJobs.getAccounts().add(acc));
        accountRepository.getAccount("STEVE_002").ifPresent(acc -> steveJobs.getAccounts().add(acc));
        customers.add(steveJobs);

        // Bill Gates
        Customer billGates = new Customer("bill.gates");
        accountRepository.getAccount("BILL_001").ifPresent(acc -> billGates.getAccounts().add(acc));
        customers.add(billGates);

        return new ICustomerRepository() {
            @Override
            public Optional<Customer> getCustomer(String login) {
                return customers.stream().filter(p -> p.getLogin().equalsIgnoreCase(login)).findAny();
            }
        };
    }

    /**
     * To be able to call endpoints from same host
     */
    @Bean
    public CorsFilter corsFilter() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
