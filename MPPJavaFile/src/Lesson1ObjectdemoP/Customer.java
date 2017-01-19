package Lesson1ObjectdemoP;

public class Customer {

	private String name;
	private Account checkingAccount;
	
	public Customer(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void createNewAccount(){
		checkingAccount = new Account();
	}
	public void makeDeposit(double amount){
		checkingAccount.updateBalance(amount);
	}
	public void makeWithDrawal(double amount){
		checkingAccount.updateBalance(-amount);
	}
	public double getBalance(){
		return checkingAccount.getBalance();
	}
	public String readCheckingAccountId(){
		return checkingAccount.getId();
	}
	
}
