package com.wipro.bank.util;

public class InsufficientBalanceException extends Exception{
  public String toString(){
	  return("Insufficient Balance");
  }
}
