package com.yzx.dao;

import com.yzx.domain.Account;

/**
 * @program: day04spring
 * @description: 账户的持久层接口
 * @author: yanzhixian
 * @create: 2020-05-31 22:04
 */
public interface IAccountDao {
    /**
     * 根据Id查询账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
}
