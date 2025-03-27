package com.bank.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AccountsDto {


    private String accountNumber;


    private String accountType;


    private String branchAddress;

}
