package inheritance;

public class Account {

	int accountNo, phoneNo, dob;
	public Account(int accountNo, int phoneNo, int dob, String name, String address, float balance) {
		super();
		this.accountNo = accountNo;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.name = name;
		this.address = address;
		this.balance = balance;
		
	}
	String name,address;
	float balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	void closeAccount() {
		
	}
}
public class SavingAccount extends Account{
	void Withdraw() {
		
	}
	void deposit() {
		
	}
	void fixeddeposit() {
		
	}
}
public class LoanAccount extends Account{
	void payEMI() {
		
	}
	void topUpLoan()
	{
		
	}
	void repayment()
	{
		
	}
}
