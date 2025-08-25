package javawrapperclass;
	class Bank{
	private String AccountNumber;
	private double balance;
	public Bank(String AccountNumber) {
		this.AccountNumber=AccountNumber;
		this.balance=0.0;
	}
	public void Deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance>=amount)
			balance-=amount;
		else
			System.out.println("Insufficient balance");
	}
	public void showBalance() {
		System.out.println("Balance: ₹"+balance);
	}
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank acc=new Bank("SBI109866");
		acc.Deposit(10000);
		acc.withdraw(2000);
		acc.showBalance();
	}

}
