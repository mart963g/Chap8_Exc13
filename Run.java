package Exc_13;

public class Run
{
    public static void main(String[] args)
    {
        BankAccount ac1 = new BankAccount("Gulddreng",100.899);
        BankAccount ac2 = new BankAccount("Martin",2000.00);
        ac2.transfer(ac1,3000);

    }
}
