package com.ct.dao;

import com.ct.domain.Account;

import java.util.List;

/**
 * @author chentiewen
 * @date 2020/9/3 - 10:43
 */
public interface AccountDao {

    public List<Account> findAll();
}
