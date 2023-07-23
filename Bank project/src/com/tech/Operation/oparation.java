package com.tech.Operation;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.tech.Model.Customer;

public class oparation {

	Set<Customer> s = new TreeSet<Customer>();
	Customer c;
	Scanner sc1 = new Scanner(System.in);

	public void createAccount() {
		c = new Customer();
		while (true) {

			try {

				System.out.println("Account type:-");
				System.out.println("Choose anyone \n 1.Saving\n 2.Current");
				int accountType = sc1.nextInt();
				switch (accountType) {
				case 1:
					c.setAccountType("Saving Account");
					System.out.println(c.getAccountType());
					break;
				case 2:
					c.setAccountType("Current Account");
					System.out.println(c.getAccountType());
					break;
				default:
					System.out.println("Please select valid option");
				}

			} catch (InputMismatchException e) {
				System.out.println("Please select correct choice");
			}

			System.out.println("Customer Name:-");
			c.setCustomerName(sc1.next());
			// System.out.println(c.getCustomerName());

			while (true) {
				System.out.println("Accout Number:-");

				try {

					c.setAccountNumber(sc1.nextLong());

					break;
				} catch (InputMismatchException i) {
					System.out.println("Enter the numeric value only");
				}
			}

			System.out.println("Customer Mobile Number :- ");
			c.setCustomerMoNumber(sc1.next());

			System.out.println("Customer Email:-");
			c.setCustomerEmail(sc1.next());

			System.out.println("Customer Aadhar Number:-");
			c.setCustomerAadharNo(sc1.next());

			System.out.println("Customer Address:-");
			c.setCustomerAddress(sc1.next());

			System.out.println("First deposit amount:-");

			while (true) {

				try {
					double d = sc1.nextDouble();
					if (d >= 500) {
						c.setDepositAmount(d);
						c.setTotal_amount(c.getDepositAmount());
						break;
					} else {

						System.out.println("deposit amount should be more than 500");
					}
				} catch (InputMismatchException e) {
					System.out.println("Enter Integer number in amount");
				}

			}

			System.out.println("UserId:-");
			c.setUserId(sc1.next());

			System.out.println("Set Password:-");
			c.setPassword(sc1.next());

			if (c != null) {
				s.add(c);
			} else {
				System.out.println("account is null");
			}
			System.out.println("Done, Your account create Successfully.");
			break;
		}

	}

	public void showAccount() {

		for (Customer ac : s) {
			while (true) {
				System.out.println("Enter your Account Number:-");

				try {
					long accno = sc1.nextLong();
					if (ac.getAccountNumber() == accno) {
						System.out.println("Account Type: " + ac.getAccountType());
						System.out.println("Account Holder Name: " + ac.getCustomerName());
						System.out.println("Account Number: " + ac.getAccountNumber());
						System.out.println("Customer Mobile Number: " + ac.getCustomerMoNumber());
						System.out.println("Customer Email: " + ac.getCustomerEmail());
						System.out.println("Customer Aadhar Number: " + ac.getCustomerAadharNo());
						System.out.println("Customer Address: " + ac.getCustomerAddress());
						System.out.println("Total Account Balance: " + ac.getDepositAmount());
						System.out.println("UserId: " + ac.getUserId());
						System.out.println("User Password: " + ac.getPassword());
						ac.setTotal_amount(ac.getDepositAmount());
						ac.getTotal_amount();
						break;
					} else {
						System.out.println("Please enter correct Account number.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Enter numeric value type account number");
				}

			}

		}
	}

	public void depositMoney() {

		for (Customer ac : s) {
			while (true) {
				System.out.println("Enter your Account Number:-");
				try {
					long accno = sc1.nextLong();
					if (ac.getAccountNumber() == accno) {
						System.out.println("Enter deposit amount:-");
						ac.setAmount(sc1.nextDouble());
						System.out.println("Total amount in your Account:");
						double total = ac.getDepositAmount() + ac.getAmount();
						ac.setTotal_amount(total);
						ac.setDepositAmount(total);
						System.out.println(ac.getTotal_amount());
						break;

					} else {
						System.out.println("Enter correct account number.");
					}

				} catch (InputMismatchException i) {
					System.out.println("Account number in numeric value");
				}
			}
		}

	}

	public void withdrawMoney() {

		for (Customer ac : s) {
			while (true) {
				System.out.println("Enter your account number:-");
				try {
					long accno = sc1.nextLong();
					if (ac.getAccountNumber() == accno) {
						System.out.println("Enter withdraw amount:-");
						ac.setWithdrawAmount(sc1.nextLong());
						double balance = (ac.getTotal_amount() - ac.getWithdrawAmount());
						ac.setTotal_amount(balance);
						ac.setDepositAmount(balance);
						System.out.println("Your Balance amount:-\n" + balance);
						break;

					} else {
						System.out.println("Enter correct account number");
					}
				} catch (InputMismatchException i) {
					System.out.println("Account number should be in numeric value only");
				}
			}
		}

	}

	public void balanceCheck() {

		for (Customer ac : s) {
			while (true) {
				System.out.println("Enter your account number:-");
				try {
					long accno = sc1.nextLong();
					if (ac.getAccountNumber() == accno) {
						System.out.println("Total balance in your account:-");
						System.out.println(ac.getTotal_amount());
						break;
					} else {
						System.out.println("Enter correct account number");
					}
				} catch (InputMismatchException e) {

					System.out.println("Account should be in numeric value");
				}
			}
		}

	}

	public void moneyTransfer() {
		Iterator<Customer> itr = s.iterator();
		while (itr.hasNext()) {
			Customer ac = itr.next();
			System.out.println("Enter in which account to Transfer money:");
			long acc = sc1.nextLong();
			if (acc == ac.getAccountNumber()) {
				System.out.println("This account number is valid");
				break;
			} else {
				System.out.println("This account is not available and please create account");
			}
		}

		Iterator<Customer> itr1 = s.iterator();
		while (itr1.hasNext()) {

			Customer ac = itr1.next();
			System.out.println("Enter Account from money transfer:");
			long acc = sc1.nextLong();
			if (acc == ac.getAccountNumber()) {
				System.out.println("Enter transfer amount:");
				c.setTransferAmount(sc1.nextDouble());
				// System.out.println(ac.getTotal_amount());
				double total_bal = ac.getTotal_amount() - c.getTransferAmount();
				if (total_bal >= 500) {

					ac.setDepositAmount(total_bal);
					ac.setTotal_amount(ac.getDepositAmount());
					System.out.println("Total balance amount:" + total_bal);
					System.out.println("Transfer amount successfuly");
					break;
				} else {
					System.out.println("Insufficient balance for Transfer");
				}

			} else {
				System.out.println("Account number not match");
			}
		}
		Iterator<Customer> itr2 = s.iterator();
		while (itr2.hasNext()) {

			Customer ac = itr2.next();
			System.out.println("Enter Account Number2:");
			long acc = sc1.nextLong();

			if (acc == ac.getAccountNumber()) {

				ac.setDepositAmount(ac.getTotal_amount() + c.getTransferAmount());
				System.out.println(ac.getDepositAmount());
				break;
			} else {
				System.out.println("acc no not match");
			}
		}
	}

	public void get() {

		for (Customer x : s) {
			System.out.println("Account Type: " + x.getAccountType());

			System.out.println("Account Holder Name: " + x.getCustomerName());
			System.out.println("Account Number: " + x.getAccountNumber());
			System.out.println("Email: " + x.getCustomerEmail());
			System.out.println("Mobile Number: " + x.getCustomerMoNumber());
			System.out.println("Aadhar Number: " + x.getCustomerAadharNo());
			System.out.println("Address: " + x.getCustomerAddress());
			System.out.println("Account Balance: " + x.getDepositAmount());
			System.out.println("UserId: " + x.getUserId());
			System.out.println("Password: " + x.getPassword());
			System.out.println();
		}

	}

}
