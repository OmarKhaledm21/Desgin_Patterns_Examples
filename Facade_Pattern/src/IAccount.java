import java.math.BigDecimal;

public interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount account,BigDecimal amount);
    public int getAccountNumber();
    public void setAccountNumber(int num);
    public void print();
}
