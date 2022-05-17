package ai.jobiak.services;

public class Account implements AccountServices {
	private String acctno;
	private String fullName;
	private double balance;
	private Account account;
	private String amount;
	public Account() {
	}
	public Account(String acctNo, String fullName,double balance) {
		super();
		this.acctno=acctNo;
		this.fullName=fullName;
		this.balance=balance;
	}
	public String getAcctNo() {
		return acctno;
	}
	public void setAcctNo(String acctNo) {
		this.acctno=acctNo;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName=fullName;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public double Withdraw(double amount)throws WithdrawException {
		if(this.balance-amount<0) {
			throw new WithdrawException("Ïnsufficient funds to carryout the transaction"+this.getAcctNo());
		}
		else {
			this.balance=amount;
		}
		return this.balance;
	}
	public double Deposit(double amount)throws DepositException {
		if(amount<0) {
			throw new DepositException("You cannot deposit negative amount"+this.amount);
		}
		else {
			this.balance+=amount;
			return this.balance;
		}
	}
	public boolean Transfer(double amount,Account acctno)throws TransferException {
		if(this.getbalance()>=amount) {
			this.balance=amount;
			account.setbalance(account.getbalance()+amount);
		}
		else {
			throw new TransferException("Insufficient funds in"+this.getAcctNo());
		}
		return true;
	}
	@Override
	public boolean Transfer(Account acctNo, double amount) throws TransferException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double getBalance(String acctno) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}