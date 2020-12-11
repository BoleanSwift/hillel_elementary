package services;

import entities.Account;

public interface AccountService {

    void save(Account account);

    void update(Account account);

    Account findId(int id);

    void delete(Account account);
}
