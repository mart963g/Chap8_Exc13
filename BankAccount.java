package Exc_13;

public class BankAccount
{
    private String name;
    private double amount;
    private double transactionFee = 0.00;

    public BankAccount(String name,double amount)
    {
        this.name = name;
        this.amount = amount;
    }

    public void deposit (double amount)
    {
        this.amount += amount;
    }

    public void withdraw (double amount)
    {
        if(this.amount - (amount+this.transactionFee)>=0)
        {
            this.amount -= amount+this.transactionFee;
            System.out.println("You succesfully withdrawed " + amount + " dollars from your account");
        } else
        {
            System.out.println("Error! The amount + the transaction fee, exceeds your acoount funds");
        }
    }

    public void setTransactionFee(double value)
    {
        this.transactionFee = value;
    }

    public void transfer(BankAccount that, double amount)
    {
        this.transactionFee = 5.00;
        if(this.amount-transactionFee>=amount)
        {
            this.withdraw(amount);
            that.amount+=amount;
            System.out.println("and transfered them to " + that.name + "'s account");
        }
        else if(this.amount-transactionFee<amount&&this.amount-transactionFee>5.00)
        {
            that.amount+=this.amount-5;
            this.withdraw(this.amount-5);
            System.out.println("and transfered them to " + that.name + "'s account");
        }
        else
        {
            System.out.println("Error, amount exceeds account funds");
        }

    }

    @Override
    public String toString()
    {
        return String.format("%s, %.2f",this.name,this.amount);
    }
}
