package com.tech.Model;

public class Customer implements Comparable{

	private String accountType;
	private String customerName;
	private long accountNumber;
	private String customerMoNumber;
	private String customerEmail;
	private String customerAddress;
	private String customerAadharNo;
	private double depositAmount;
	private String userId;
	private String password;
	private double amount;
	private double total_amount;
	private long withdrawAmount;
	private double transferAmount;

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public long getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(long withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getCustomerAadharNo() {
		return customerAadharNo;
	}

	public void setCustomerAadharNo(String customerAadharNo) {

		this.customerAadharNo = customerAadharNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {

		
		this.customerName = customerName.toUpperCase();
	}

	

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerMoNumber() {
		return customerMoNumber;
	}

	public void setCustomerMoNumber(String customerMoNumber) {

		this.customerMoNumber = customerMoNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	@Override
	public int compareTo(Object o) {
		Customer c=(Customer) o;
		
		if( this.accountNumber>c.getAccountNumber()) 
		{
			return 1;
		}
		else if(this.accountNumber<c.getAccountNumber())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
