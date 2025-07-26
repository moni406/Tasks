package JavaOopsTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc=new BankAccount();
		acc.deposit(1000);
		acc.withdraw(300);
		System.out.println("Remaining balance: RS"+acc.getBalance());
	}

}
