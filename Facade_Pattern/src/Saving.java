import java.math.BigDecimal;

public class Saving implements IAccount{
    private BigDecimal balance;
    private int accountNumber;



    public Saving(BigDecimal amt){
        balance = amt;
    }


    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public void transfer(IAccount account,BigDecimal amount) {
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public void setAccountNumber(int num) {
        accountNumber=num;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public void print(){
        System.out.println("SAVE: "+balance);
    }
}
