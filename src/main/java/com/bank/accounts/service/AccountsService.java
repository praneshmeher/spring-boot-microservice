package com.bank.accounts.service;

import com.bank.accounts.dto.CustomerDto;

public interface AccountsService {

    void createAccount(CustomerDto customerDto);
}
