package ru.dartinc.homefinance.service.impl;

import ru.dartinc.homefinance.model.Account;
import ru.dartinc.homefinance.model.Operation;
import ru.dartinc.homefinance.service.AccountService;

import java.math.BigDecimal;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public String getBallanse(List<Account> accounts) {
        return accounts.stream()
                .map(Account::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add).toString();
    }

    @Override
    public boolean appyOperation(Operation operation) {
        if (operation.getAccount().getCreditLimit().abs().add(operation.getAccount().getAmount()).add(operation.getAmount()).compareTo(BigDecimal.ZERO) > 0) {
            operation.getAccount().setAmount(operation.getAccount().getAmount().add(operation.getAmount()));
            return true;
        } else return false;
    }

}
