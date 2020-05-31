package com.yzx.service;

import com.yzx.domain.Account;

/**
 * @program: day04spring
 * @description: 账户的业务层接口
 * @author: yanzhixian
 * @create: 2020-06-01 00:35
 */
public interface IAccountService {
    /**
     * 根据id查询账户信息
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 转账
     * @param sourceName    转成账户名称
     * @param targetName    转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
