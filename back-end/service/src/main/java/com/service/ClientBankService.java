package com.service;

import com.domain.ClientBankDomainService;
import org.springframework.stereotype.Service;

@Service
public class ClientBankService {

    private ClientBankDomainService innerService;

    public ClientBankService() {
        this.innerService = new ClientBankDomainService();
    }
}
