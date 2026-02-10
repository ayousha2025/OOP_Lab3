public class BankAccount {
    int AccountNumber;
    String AccountHolderName;
    int InitialBalance;

    BankAccount(int number , String name , int initialBalance){
        this.AccountNumber = number;
        this. AccountHolderName = name;
        this.InitialBalance = initialBalance ;
    }
    void display(){
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder Name: " + AccountHolderName);
        System.out.println("Initial Balance: " + InitialBalance);
    }

    public static void main(String[] arg){
        BankAccount account1 = new BankAccount(12345 , "Ali" , 256000);
        account1.display();
        BankAccount account2 = new BankAccount(54321 , "Umair" , 0);
        account2.display();

    }
}
