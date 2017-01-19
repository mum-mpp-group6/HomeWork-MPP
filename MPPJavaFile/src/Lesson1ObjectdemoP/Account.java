package Lesson1ObjectdemoP;

public class Account {

	private String Id;
	private double balance = 0.0;
	Account(){
		Id = generateId();
	}
	public void updateBalance(double amount){
		balance += amount;
	}
	public double getBalance(){
		return balance;
	}
	public String getId(){
		return Id;
	}
	public String generateId(){
		return "" + RandomNumbers.getRandomInt(1000, 9999);
	}
}
