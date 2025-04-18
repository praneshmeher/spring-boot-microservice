package com.bank.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {

    private String statusCode;

    private String statusMsg;

    private T body;
}
