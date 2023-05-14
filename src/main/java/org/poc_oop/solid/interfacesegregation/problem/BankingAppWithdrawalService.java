package org.poc_oop.solid.interfacesegregation.problem;

import java.math.BigDecimal;

public class BankingAppWithdrawalService
{
    private Account account;

    public BankingAppWithdrawalService(Account account)
    {
        this.account = account;
    }

    public void withdraw(BigDecimal amount)
    {
        account.withdraw(amount);
    }
}
