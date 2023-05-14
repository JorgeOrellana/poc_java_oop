package org.poc_oop.solid.interfacesegregation.fix;

import java.math.BigDecimal;

public abstract class WithdrawalAccount implements Account
{
    protected abstract void withdraw(BigDecimal amount);
}
