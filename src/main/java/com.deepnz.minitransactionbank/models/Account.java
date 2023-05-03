public class Account {

    public Account(){}

    public Account(int accountnumber, int balance, List<Transaction> listOfTransactions) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.listOfTransactions = listOfTransactions;
    }

    private int accountnumber;
    private int balance;
    private List<Transaction> listOfTransactions;
    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }

    public void setListOfTransactions(List<Transaction> listOfTransactions) {
        this.listOfTransactions = listOfTransactions;
    }


        }