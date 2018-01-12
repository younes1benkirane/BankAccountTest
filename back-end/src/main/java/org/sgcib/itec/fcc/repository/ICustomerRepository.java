package org.sgcib.itec.fcc.repository;

import org.sgcib.itec.fcc.business.Customer;

import java.util.Optional;

public interface ICustomerRepository {

    Optional<Customer> getCustomer(String login);
}
