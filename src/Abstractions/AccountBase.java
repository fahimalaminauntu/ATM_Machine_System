package Abstractions;

public abstract class AccountBase {
    public abstract int getCustomerNumber();

    public abstract void setCustomerNumber(int customerNumber);

    public abstract int getPinNumber();

    public abstract void setPinNumber(int pinNumber);

    public abstract double getCheckingBalance();

    public abstract void setCheckingBalance(double checkingBalance);

    public abstract double getSavingBalance();

    public abstract void setSavingBalance(double savingBalance);

}
