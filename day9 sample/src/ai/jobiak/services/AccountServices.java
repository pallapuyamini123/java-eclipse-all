package ai.jobiak.services;

public interface AccountServices {
	public double Withdraw(double amount)throws WithdrawException;
	public double Deposit(double amount)throws DepositException;
	public boolean Transfer(Account acctNo, double amount)throws TransferException;
	public double getBalance(String acctno);
	//double getbalance(String acctno);

}
