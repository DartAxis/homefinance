package ru.dartinc.homefinance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operation_id")
    private long id;
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    private BigDecimal amount;
    private Expenditure typeOfExpenses;

    private LocalDateTime dateOfOperation;
    private String description;

}
