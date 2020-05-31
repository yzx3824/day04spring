package com.yzx.service.impl;

import com.yzx.dao.IAccountDao;
import com.yzx.domain.Account;
import com.yzx.service.IAccountService;

/**
 * @program: day04spring
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-01 00:35
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer....");
        //2.1根据名称查询转出账户
        Account source = accountDao.findAccountByName(sourceName);
        //2.2根据名称查询转入账户
        Account target = accountDao.findAccountByName(targetName);
        //2.3转出账户减钱
        source.setMoney(source.getMoney()-money);
        //2.4转入账户加钱
        target.setMoney(target.getMoney()+money);
        //2.5更新转出账户
        accountDao.updateAccount(source);

//        int i=1/0;

        //2.6更新转入账户
        accountDao.updateAccount(target);
    }
}
