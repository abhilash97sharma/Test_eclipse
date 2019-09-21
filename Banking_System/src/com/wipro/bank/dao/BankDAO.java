package com.wipro.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import com.wipro.bank.bean.TransactionBean;
import com.wipro.bank.util.DBUtil;

public class BankDAO {
	public boolean validateAccount(String Accountno){
		try {
			Connection ct=DBUtil.getDBConnection();
			Statement ps=ct.createStatement();
			ResultSet rs=ps.executeQuery("select ACCOUNTHOLDER_NAME from ACCOUNT_TBL where ACCOUNT_NUMBER="+"'"+Accountno+"'");
			if(rs.next())
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean updateBalance(String Accountnumber, float amount,String operation){
		if(operation.equals("deposit")){
			try{
			//	Class.forName("oracle.jdbc.OracleDriver");
				Connection ct=DBUtil.getDBConnection();
				Statement ps=ct.createStatement();
				ResultSet rs=ps.executeQuery("select BALANCE from ACCOUNT_TBL where ACCOUNT_NUMBER="+"'"+Accountnumber+"'");
				while(rs.next()){
				float f=rs.getFloat(1);
				ps.executeUpdate("update ACCOUNT_TBL set BALANCE="+(f+amount)+"where ACCOUNT_NUMBER="+"'"+Accountnumber+"'");
				return true;
				}
			}
			catch(Exception e){
				System.out.println("Not updated the Balance");
			}
		}
		else if(operation.equals("withdraw")){
			try{
		//		Class.forName("oracle.jdbc.OracleDriver");
				Connection ct=DBUtil.getDBConnection();
				Statement ps=ct.createStatement();
				ResultSet rs=ps.executeQuery("select BALANCE from ACCOUNT_TBL where ACCOUNT_NUMBER="+"'"+Accountnumber+"'");
				while(rs.next()){
				float f=rs.getFloat(1);
				ps.executeUpdate("update ACCOUNT_TBL set BALANCE="+(f-amount)+"where ACCOUNT_NUMBER="+"'"+Accountnumber+"'");
				return true;
				}
			}
			catch(Exception e){
				System.out.println("Not updated the Balance");
			}
		}
			return false;
	}
	public boolean createTransactionEntry(TransactionBean bean){
		String s=bean.getAccountNo();
		float f=bean.getTransactionAmount();
		String ope=bean.getOperation();
		Date d=bean.getDate_of_transaction();
		try{
	//		Class.forName("oracle.jdbc.OracleDriver");
			Connection ct=DBUtil.getDBConnection();
			PreparedStatement ps=ct.prepareStatement("insert into ACCOUNT_TRANSACTION_TBL values(?,?,?,?)");
			ps.setString(1,s);
			long ms=d.getTime();
			java.sql.Date d1=new java.sql.Date(ms);
			ps.setDate(2,d1);
			ps.setFloat(3,f);
			ps.setString(4,ope);
			ps.executeUpdate();
			return true;
		}catch(Exception e){
			System.out.println("unable to perform a transaction entry");
			return false;
		}
	}
	public float getBalance(String accountnumber){
		try{
		//	Class.forName("oracle.jdbc.OracleDriver");
			Connection ct=DBUtil.getDBConnection();
			Statement ps=ct.createStatement();
			System.out.println("Conncection established");
			ResultSet rs=ps.executeQuery("select BALANCE from ACCOUNT_TBL where ACCOUNT_NUMBER="+"'"+accountnumber+"'");
			while(rs.next()){
				return(rs.getFloat(1));
				
			}
		}catch(Exception e){
			System.out.println("unable to show balance");
		}
		return 0.0f;
	}
}
