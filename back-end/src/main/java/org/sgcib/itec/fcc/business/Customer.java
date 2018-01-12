package org.sgcib.itec.fcc.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    private final String login;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String login) {
        this.login = login;
    }

    public Customer(String login, Account... accounts) {
        this(login);
        this.accounts.addAll(Arrays.asList(accounts));
    }

    public String getLogin() {
        return login;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
