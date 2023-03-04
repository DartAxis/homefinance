package ru.dartinc.homefinance.dto;

import lombok.*;
import ru.dartinc.homefinance.model.Account;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AccountDto {
    private Long id;

    private String name;

    private String amount;

    private String creditLimit;

    private String number;

    private String description;

    public AccountDto(Account account) {
        this.id = account.getAccountId();
        this.name = account.getName();
        this.amount = account.getAmount().toString();
        this.creditLimit = account.getCreditLimit().toString();
        this.number = account.getNumber();
        this.description = account.getDescription();
    }
}
