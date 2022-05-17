package ai.jobiak.services;

public class BankOfAndhra {
	
	public static void main(String[] args)throws TransferException {
		
		
		Account account=new Account("101S","John",5000);
		Account account2=new Account("102D","Doe",75000);
		Account account3=new Account("103C","Jone",25000);
		//System.out.println(account);
		//System.out.println(account2);
		//System.out.println(account3);
		
		AccountServices service=account;
		double result;
		try {
			result=service.Deposit(-1);
			
		}catch(DepositException e) {
			System.err.println(e);
		}
		
		service=account2;
		try {
			result=service.Withdraw(75500);
			
		}catch(WithdrawException e) {
			System.err.println(e);
		}
		System.out.println(account2.getbalance());
		service=account3;
		System.out.println("Äccount state before transfer");
		System.out.println(account2.getfullName()+"$"+account2.getbalance());
		System.out.println(account3.getfullName()+"$"+account3.getbalance());
		
		boolean success;
		try {
			success=service.Transfer(account2,25500);
			System.out.println(success);
			
		}catch(TransferException e) {
			System.err.println(e);
		}
		System.out.println("Account state after transfer");
		System.out.println(account2.getfullName()+"$"+account2.getbalance());
		System.out.println(account3.getfullName()+"$"+account3.getbalance());
		

	}
		
	

}
