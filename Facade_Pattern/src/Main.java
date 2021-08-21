import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Customer script scenario

        BankService myBank = new BankService();

        int mySaving = myBank.createNewAccount("saving",new BigDecimal("500.0"));

        int myInvestment = myBank.createNewAccount("investment",new BigDecimal("1500.0"));

        myBank.transferMoney(mySaving,myInvestment,new BigDecimal("300.0"));

        myBank.checkBalance(mySaving);
        myBank.checkBalance(myInvestment);
    }
}
