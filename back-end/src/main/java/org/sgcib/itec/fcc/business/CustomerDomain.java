package org.sgcib.itec.fcc.business;

import org.sgcib.itec.fcc.repository.ICustomerRepository;

/*
 * THIS IS NOT EXPECTED TO BECOME A SPRING-BOOT SERVICE
 */
public class CustomerDomain {

    private final ICustomerRepository customerRepository;

    public CustomerDomain(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // ADD YOUR METHODS HERE...
}