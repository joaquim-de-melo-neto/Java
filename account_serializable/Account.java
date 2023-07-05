package account_serializable;

import java.io.Serializable;

public class Account implements Serializable {
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account()
	 {
	 this(0, "", "", 0.0); // chama outro construtor
	 }
	
	public Account(int account, String firstName, String lastName, double balance) {
		
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	/**
	 * @return the account
	 */
	public int getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(int account) {
		this.account = account;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
