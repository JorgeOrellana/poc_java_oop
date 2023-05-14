package org.poc_oop.solid.interfacesegregation.fix;

import java.math.BigDecimal;

public class FixedTermDepositAccount implements Account
{
    @Override
    public void deposit(BigDecimal amount)
    {
        System.out.println("deposit amount");
    }
}
