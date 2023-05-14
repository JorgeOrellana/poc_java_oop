package org.poc_oop.solid.interfacesegregation.problem;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account
{
    @Override
    protected void deposit(BigDecimal amount)
    {
        System.out.println("Deposit " + amount);
    }

    @Override
    protected void withdraw(BigDecimal amount)
    {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount");
    }
}
