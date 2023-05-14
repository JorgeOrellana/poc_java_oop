package org.poc_oop.solid.interfacesegregation.problem;

import java.math.BigDecimal;

public abstract class Account
{
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}
