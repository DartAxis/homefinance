package ru.dartinc.homefinance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.dartinc.homefinance.model.Account;
import ru.dartinc.homefinance.model.Expenditure;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OperationDto {
    private long id;
    private Account account;
    private BigDecimal amount;
    private Expenditure typeOfExpenses;

    private LocalDateTime dateOfOperation;
    private String description;
}
