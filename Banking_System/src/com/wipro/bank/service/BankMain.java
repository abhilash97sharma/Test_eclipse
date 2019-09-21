package com.wipro.bank.service;

import com.wipro.bank.bean.TransactionBean;
import com.wipro.bank.dao.BankDAO;
import com.wipro.bank.util.InsufficientBalanceException;

public class BankMain {
	 public String withdraw(String accountnumber, float tr_amount){
		 if(accountnumber.equals("null") || tr_amount==0 || (tr_amount%100)!=0){
			 return "FAILURE";
		 }
		else if(!(new BankDAO().validateAccount(accountnumber))){
			return("INVALID_ACCOUNT");
		}
		else{
			float f=new BankDAO().getBalance(accountnumber);
			if(f-tr_amount>=500){
				new BankDAO().updateBalance(accountnumber, tr_amount, "withdraw");
				TransactionBean tr=new TransactionBean();
				tr.setAccountNo(accountnumber);
				tr.setDate_of_transaction(new java.util.Date());
				tr.setOperation("withdraw");
				tr.setTransactionAmount(tr_amount);
				if(new BankDAO().createTransactionEntry(tr))
				return "SUCCESS";
			}
			else{
				try{
				InsufficientBalanceException e=new InsufficientBalanceException();
				throw e;
				}catch(InsufficientBalanceException e){
					return(e.toString());
				}
			}
		        return"FAILURE";
		 }
}
	 public String deposit(String accountnumber,float tr_amount){
			 if(accountnumber.equals("null") || tr_amount<=0){
				 return "FAILURE";
			 }
	           else	if(!new BankDAO().validateAccount(accountnumber))
					return "INVALID_ACCOUNT";
				else{
					new BankDAO().updateBalance(accountnumber, tr_amount, "deposit");
					TransactionBean tr=new TransactionBean();
					tr.setAccountNo(accountnumber);
					tr.setDate_of_transaction(new java.util.Date());
					tr.setOperation("deposit");
					tr.setTransactionAmount(tr_amount);
					if(new BankDAO().createTransactionEntry(tr))
					return "SUCCESS";  
				}
		 return"FAILURE";
    }
}
