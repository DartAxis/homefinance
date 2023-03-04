package ru.dartinc.homefinance.service;

import ru.dartinc.homefinance.model.Account;
import ru.dartinc.homefinance.model.Operation;

import java.util.List;

public interface AccountService {
    String getBallanse(List<Account> accounts);
    boolean appyOperation(Operation operation);

}
