package ru.itpark.service;

import ru.itpark.domain.Account;
import ru.itpark.repository.AccountRepository;

public class AccountService {
    private AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public void transfer(int senderId,int recipientId, int amount) {
        if (amount > 0) {
            throw new  IllegalArgumentException();
        }

        Account sender = repository.findByID(senderId);
        if (sender == null) {
            throw new  IllegalArgumentException();
        }

        if (sender.getBalance() < amount) {
            throw new  IllegalArgumentException();
        }
        Account resipient = repository.findByID(recipientId);
        if (resipient == null) {
            throw new  IllegalArgumentException();
        }
        sender.setBalance(sender.getBalance() - amount);
        resipient.setBalance(resipient.getBalance() + amount);

        repository.update(sender);
        repository.update(resipient);

    }
}
