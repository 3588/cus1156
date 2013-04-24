package ExtraCreditProject;

import java.util.Date;

/**
 * The Class Transaction.
 * @author junjun
 */
public class Transaction {
/**
 * Deposit transaction.
 * NameAndDate return an organized string for service Type and date;
 * AmtAndendBal return an organized string for amount and End balance;
 * @param amt the amount
 * @param endBal the End balance
 * @return the string
 */
public String DepositTransaction(double amt, double endBal){
		return NameAndDate("Deposit")+AmtAndendBal(amt,endBal)+"\n";
	}
	
	/**
	 * Withdraw transaction.
	 * NameAndDate return an organized string for service Type and date;
	 * AmtAndendBal return an organized string for amount and End balance;
	 * @param amt the amount
	 * @param endBal the End balance
	 * @return the string
	 */
	public String WithdrawTransaction(double amt, double endBal) {
		return NameAndDate("Withdrawal")+AmtAndendBal(-amt,endBal)+"\n";
		}
	
	/**
	 * Transfer transaction.
	 * NameAndDate return an organized string for service Type and date;
	 * @param fromAcctNumber the from account number
	 * @param toAcctNumber the to(Transfer) account number
	 * @param amt the amount
	 * @return the string
	 */
	public String TransferTransaction(String fromAcctNumber, String toAcctNumber,  double amt){
		return NameAndDate("Transfer")+"amount : "+amt+" From account "+fromAcctNumber+" To account "+toAcctNumber+"\n";
	} 
	/**
	 * Error transaction.
	 *
	 * @param acctNumber the account number
	 * @param errorDescription the error description
	 * @param amt the amount
	 * @return the string
	 */
	public String ErrorTransaction(String acctNumber, String errorDescription, double amt)
	{
		String str=NameAndDate("Error");
		str=str+errorDescription+" amount : "+amt+" account "+acctNumber;
		return str+"\n";
		
	}
	/**
	 * NameAndDate return an organized string for service Type and date;
	 * @param type the type
	 * @return the string
	 */
	public String NameAndDate(String type)
	{
		Date today = new Date();
	return type+" : "+today+" ";
	}
	
	/**
	 * AmtAndendBal return an organized string for amount and End balance;
	 * @param amt the amount
	 * @param endBal the End balance
	 * @return the string
	 */
	public String AmtAndendBal(double amt, double endBal)
	{
	return "amount : "+amt+" End balance : "+endBal;
	}
	 
}
