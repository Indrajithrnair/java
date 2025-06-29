import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BankAccount{

    	private String holderName;
    	private double balance;
    	static int accountCount = 0;

	BankAccount(String name, double balance){
		
		this.holderName = name;
		this.balance = balance;
		accountCount = accountCount + 1;
		System.out.println("Account created");

	}

    	public static BankAccount transferMoney(BankAccount sender, BankAccount receiver, double amount){
		
		sender.balance -= amount;
		receiver.balance += amount;
		return sender;	

    	}

	public void accountInfo(){
	
		System.out.println("Account Details:");
		System.out.println("----------------");
		System.out.println("Holder Name: " + this.holderName);
		System.out.println("Balance: " + this.balance);

	}

}


public class BankAccountPassbook {
        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BankAccount u1 = new BankAccount("Arjun", 1000);

		BankAccount u2 = new BankAccount("Amal", 2000);

		System.out.println("Before Transaction: ");	
		
		u1.accountInfo();
		System.out.println();			
		u2.accountInfo();

		System.out.println("Enter the amount you want to trasfer: ");
		double amount = Double.parseDouble(br.readLine());		
		
		BankAccount updateSender = BankAccount.transferMoney(u1, u2, amount);

		System.out.println("Transaction Successfull");	
		System.out.println();			

		u1.accountInfo();	
		System.out.println();		
		u2.accountInfo();

		System.out.println("Total account created: " + BankAccount.accountCount);		

		
        }
}
