package ru.dartinc.homefinance.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Data
@NoArgsConstructor
public class Account {

    @Id
    private Long id;

    private String name;

    private BigDecimal amount;

}
