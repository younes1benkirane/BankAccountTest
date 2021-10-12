package com.bank.domain;

import com.bank.api.ClientBankDomain;
import com.bank.spi.AccountRepository;
import com.bank.spi.ClientRepository;

/**
 * this class implementation of ClientBankDomain
 */
public class ClientBankDomainImpl implements ClientBankDomain {

    private AccountRepository accountRepository;
    private ClientRepository clientRepository;
}
