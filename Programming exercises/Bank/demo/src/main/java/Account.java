public class Account {
    
    private int number;
    private String holder;
    private double balance=0;

    public Account() {
    }
    
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= (amount + 5.0);
        }
        else{
            System.out.println("Insufficient balance to make the withdraw.");
        }  
    }

    public String toString(){
        return "Account "
                + number
                +", Holder: "
                + holder
                +", Balance: $ "
                + String.format("%.2f", balance);
                
    }
}
