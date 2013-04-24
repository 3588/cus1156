package ExtraCreditProject;
import java.util.ArrayList;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * This class represents a Bank Account
 * It maintains a balance and allows operations such as withdrawing money,
 * depositing money, and transfers.
 *
 * @author Bonnie MacKellar
 */
public class BankAccount
	{
           
           private double balance;
           
           private String accountNumber;
           
           private String ownerLastName;
           
           private String ownerFirstName;

           
           /** The transaction log.
            * to save the transaction log 
            *  */
           ArrayList<String> transactionLog = new ArrayList<String>();
           
           /** The string transaction.
            * to display the transaction and save to transactionLog
            *  */
           private Transaction stringTransaction=new Transaction();
           /** The Constant OVERDRAFT_FEE. */
           private static final double OVERDRAFT_FEE = 25.0;

           /**
            * create a BankAccount with initial values.
            *
            * @param initialBalance the initial balance
            * @param acctNum the acct num
            * @param lname the lname
            * @param fname the fname
            */
           public BankAccount(double initialBalance,
        		              String acctNum,
        		              String lname,
        		              String fname)
        	   {
        		   balance = initialBalance;
        		   accountNumber = acctNum;
        		   ownerLastName = lname;
        		   ownerFirstName = fname;
        		  
        	   }

           /**
            * deposit an amount. The BankAccount balance will be updated.
            * The deposit will also be recorded in the transaction log.
            * @param amt the amount to deposit
            */
           void deposit(double amt)
        	   {
        		   balance = balance + amt;
        		   transactionLog.add(stringTransaction.DepositTransaction(amt, balance));
        	   }

           /**
            * withdraw an amount from the BankAccount.
            * the balance in the account will be updated
            * If there is not enough money in the account
            * a warning message will be sent and a $25 overdraft
            * fee applied to the account, but the withdrawal will be done
            * The transaction will be recorded in the transaction log.
            * @param amt the amount to remove
            */
           void withdraw(double amt)
        	   {
        		   balance = balance - amt;
        		   if (balance < 0)
        		   {
        			   sendWarning(amt);
        			   applyOverdraftFee(amt);
        		   }
        		   else {
        			transactionLog.add(stringTransaction.WithdrawTransaction(amt, balance));
				}

        	   }

           /**
            * transfer money between two accounts
            * If there is not enough money in the from account,
            * a warning will be sent and a $25 overdraft fee applied
            *  The transaction will be recorded in the transaction log.
            * @param toAccount the account receiving the money
            * @param amount the amount to be transferred
            */
           public void transfer(BankAccount toAccount, double amount)
        	   {
        		   // check that the accounts are owned by the same person
        		   if (!(ownerLastName.equals(toAccount.ownerLastName)) ||
        				 !(ownerFirstName.equals(toAccount.ownerFirstName)))
        		   {
        			   System.out.println("You are not authorized to make this transfer");
       				transactionLog.add(stringTransaction.ErrorTransaction(this.accountNumber, "ERR2312A - not authorized to make this transfer", amount));

        		   }
        		   else
        		   {
        		      withdraw(amount);
        		      transferLog(accountNumber,toAccount.getAccountNumber(),amount);
        	    	  toAccount.deposit(amount);
        	    	  toAccount.transferLog(accountNumber,toAccount.getAccountNumber(),amount);

        		   }
        	   }
           
           /**
            * Transfer log.
            *
            * @param fromAcctNumber the from acct number
            * @param toAcctNumber the to acct number
            * @param amount the amount
            */
           void transferLog(String fromAcctNumber,String toAcctNumber,double amount)
           {
        	   transactionLog.add(stringTransaction.TransferTransaction(fromAcctNumber, toAcctNumber, amount));
           }
           
           /**
            * Send warning.
            *
            * @param amt the amt
            */
           private void sendWarning(double amt)
			{
				System.out.println("Warning : Your balance is under $0. A fee of $25 will be applied");
				transactionLog.add(stringTransaction.WithdrawTransaction(amt, this.balance-OVERDRAFT_FEE));

			}


		/**
		 * Apply overdraft fee.
		 *
		 * @param amt the amt
		 */
		private void applyOverdraftFee(double amt)
        	   {
        		   balance = balance - OVERDRAFT_FEE;
				   transactionLog.add(stringTransaction.ErrorTransaction(this.accountNumber, "ERR2556B - insufficient funds", amt));
        	   }

       /**
        * return the current balance.
        *
        * @return the balance
        */
		public double getBalance()
			{
				return balance;
			}



		/**
		 * return the account number.
		 *
		 * @return the account number
		 */
		public String getAccountNumber()
			{
				return accountNumber;
			}

		/**
		 * set the account number.
		 *
		 * @param accountNumber the new account number
		 */
		public void setAccountNumber(String accountNumber)
			{
				this.accountNumber = accountNumber;
			}

		/**
		 * return the account owner last name.
		 *
		 * @return the owner last name
		 */
		public String getOwnerLastName()
			{
				return ownerLastName;
			}


		/**
		 * set the account owner last name.
		 *
		 * @param ownerLastName the new owner last name
		 */
		public void setOwnerLastName(String ownerLastName)
			{
				this.ownerLastName = ownerLastName;
			}

		/**
		 * return the account owner first name.
		 *
		 * @return the owner first name
		 */
		public String getOwnerFirstName()
			{
				return ownerFirstName;
			}


		/**
		 * set the account owner first name.
		 *
		 * @param ownerFirstName the new owner first name
		 */
		public void setOwnerFirstName(String ownerFirstName)
			{
				this.ownerFirstName = ownerFirstName;
			}

		/**
		 * display the current balance.
		 *
		 * @return the string
		 */
		public String accountInfoToString()
			{
				return "Account : " + accountNumber + " Your current balance is " + balance;
			}

		/**
		 * create a bank statement, including the transactions
		 * that have occurred.
		 *
		 * @return the string
		 */
		public String makeStatement()
			{
			Date  today = new Date();
			String statement="Bank Account " +accountNumber+ " Statement Date : "+today+" Current balance : "+balance+"\n";
			for(int i = transactionLog.size()-1;i>-1;i--)//时间按照新到旧
			{
				statement=statement+transactionLog.get(i);
			}
			return statement+"\n";
			}


	}
