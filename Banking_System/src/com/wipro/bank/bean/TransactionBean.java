package com.wipro.bank.bean;

import java.util.Date;

public class TransactionBean {
	private String accountNo;
	private  float transactionAmount;
	private  String operation;
	private Date date_of_transaction;
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the transactionAmount
	 */
	public float getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	/**
	 * @return the date_of_transaction
	 */
	public Date getDate_of_transaction() {
		return date_of_transaction;
	}
	/**
	 * @param date_of_transaction the date_of_transaction to set
	 */
	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
}
