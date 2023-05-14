package org.poc_oop.solid.interfacesegregation.fix;

import java.math.BigDecimal;

public class CurrentAccount extends WithdrawalAccount
{
    @Override
    public void deposit(BigDecimal amount)
    {
        System.out.println("depositing amount");
    }

    @Override
    protected void withdraw(BigDecimal amount)
    {
        System.out.println("withdrawal amount");
    }
}
