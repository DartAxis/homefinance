package ru.dartinc.homefinance.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BankAccount {

    private Long id;
    private String name;
    private String faceAccount;
    private BigDecimal amount;
    private String someField;


}
