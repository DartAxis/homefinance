package ru.dartinc.homefinance.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_name")
    private Long accountId;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "creditlimit")
    private BigDecimal creditLimit;
    @Column(name = "number")
    private String number;
    @Column(name = "description")
    private String description;

}
