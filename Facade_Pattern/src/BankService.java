import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Random;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;

    public BankService(){
        this.bankAccounts = new Hashtable<Integer, IAccount>();
    }

    public int createNewAccount(String type, BigDecimal initAmount){
        Random rand = new Random();
        Integer accNum = rand.nextInt(10);

        if(bankAccounts.containsKey(accNum)){
            while(bankAccounts.containsKey(accNum)) {
                accNum = rand.nextInt(10);
            }
        }

        IAccount newAccount= null;
        switch (type){
            case "saving":
                newAccount = new Saving(initAmount);
                newAccount.setAccountNumber(accNum);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                newAccount.setAccountNumber(accNum);
                break;
            default:
                System.out.println("Invalid account type");
                break;
        }
        if(newAccount!=null){
            bankAccounts.put(newAccount.getAccountNumber(),newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(Integer to,Integer from,BigDecimal amt){
        IAccount toAccount = bankAccounts.get(to);
        IAccount fromAccount = bankAccounts.get(from);
        fromAccount.transfer(toAccount,amt);

    }

    public void checkBalance(int accNum){
        IAccount account = this.bankAccounts.get(accNum);
        account.print();
    }
}
