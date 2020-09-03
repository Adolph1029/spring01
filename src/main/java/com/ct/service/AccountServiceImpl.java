package com.ct.service;

import com.ct.dao.AccountDao;
import com.ct.dao.AccountDaoImpl;
import com.ct.domain.Account;

import java.util.List;

/**
 * @author chentiewen
 * @date 2020/9/3 - 10:46
 */
public class AccountServiceImpl implements AccountService {

    //成员属性
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
