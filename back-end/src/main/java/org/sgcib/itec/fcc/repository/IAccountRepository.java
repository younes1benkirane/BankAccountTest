package org.sgcib.itec.fcc.repository;

import org.sgcib.itec.fcc.business.Account;

import java.util.Optional;

public interface IAccountRepository {

    Optional<Account> getAccount(String id);
}
