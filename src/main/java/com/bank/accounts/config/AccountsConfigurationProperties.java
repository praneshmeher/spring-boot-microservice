package com.bank.accounts.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
@ToString
public class AccountsConfigurationProperties {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
