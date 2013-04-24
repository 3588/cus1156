package ExtraCreditProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * The Class Bank.
 */
public  class Bank implements BankInterface {
	
	/** The bank accounts. */
	ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	
	/* (non-Javadoc)
	 * @see ExtraCreditProject.BankInterface#loadData()
	 */
	@Override
	public void loadData() {
		File bankInfo = new File("C:\\program1\\info.txt" );
		try {
			 Scanner fileIn = new Scanner(bankInfo);
		while(fileIn.hasNextLine()){
			String line = fileIn.nextLine();
			String[] arrLine=line.split(","); 
			BankAccount acct = new BankAccount(Double.parseDouble(arrLine[0]),arrLine[1],arrLine[2],arrLine[3]);
			bankAccounts.add(acct);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see ExtraCreditProject.BankInterface#Menu()
	 */
	@Override
	public void Menu() {
		while(true)
			{
		String strMenu="Options\nd: deposit\nw: withdraw\nt: transfer\np: print statement\nq: quit \n";
		System.out.print(strMenu);
		userChoose();
		}
	}
	
	/**
	 * User choose.
	 */
	public void userChoose()
	{
		Scanner input = new Scanner(System.in);
		String chooseString = input.next();
		userAction(chooseString.charAt(0));
	}
	
	/**
	 * User action.
	 *
	 * @param options the options
	 */
	public void userAction(char options) {
		switch (options) {
		case 'd':
			userActionDeposit();
			break;
		case 'w':
			userActionWithdraw();
			break;
		case 't':
			userActionTransfer();
			break;
		case 'p':
			userActionPrintStatement();
			break;
		case 'q':
			System.out.print("Bye!");
			System.exit(-1);
			break;
		default:
			break;
		}
		
	}
	/**
	 * User action deposit.
	 * Check the account number, if found deposit the money and save the transaction
	 */
	public void userActionDeposit() {
		System.out.print("Enter account number\n");
		Scanner input = new Scanner(System.in);
		String enterAccountNumber=input.next();
		boolean isFound = false;
		for(BankAccount bankAccount:bankAccounts)
		{
			if(bankAccount.getAccountNumber().equals(enterAccountNumber))
			{
				System.out.print("Enter amount to deposit\n");
				double enterAmount = input.nextDouble();
				bankAccount.deposit(enterAmount);
				System.out.println(bankAccount.accountInfoToString());
				isFound = true;
				break;
			}
		}
		if(!isFound)
		{System.out.print("Wrong account number!\n");}
		
	}
	
	/**
	 * User action withdraw.
	 * Check the account number, if found withdraw the money and save the transaction
	 */
	public void userActionWithdraw(){
		System.out.print("Enter account number\n");
		Scanner input = new Scanner(System.in);
		String enterAccountNumber=input.next();
		boolean isFound = false;
		for(BankAccount bankAccount:bankAccounts)
		{
			if(bankAccount.getAccountNumber().equals(enterAccountNumber))
			{
				System.out.print("Enter amount to withdraw\n");
				double enterAmount = input.nextDouble();
				bankAccount.withdraw(enterAmount);
				System.out.println(bankAccount.accountInfoToString());
				isFound = true;
				break;
			}
		}
		if(!isFound)
		{System.out.print("Wrong account number!\n");}
	}
	
	/**
	 * User action transfer.
	 * Check the two account number, if they are right transfer the money and save the transaction
	 */
	public void userActionTransfer() {
		System.out.print("Enter your account number\n");
		Scanner input = new Scanner(System.in);
		String enterAccountNumber=input.next();
		boolean isFound1 = false, isFound2 = false;
		for(BankAccount fromBankAccount:bankAccounts)
		{
			if(fromBankAccount.getAccountNumber().equals(enterAccountNumber))
			{
				isFound1 = true;
				System.out.print("Enter transfer account number\n");
				enterAccountNumber=input.next();
				for(BankAccount toBankAccount:bankAccounts)
				{
					if(toBankAccount.getAccountNumber().equals(enterAccountNumber))
					{
						isFound2 = true;
						System.out.print("Enter amount to transfer\n");
						double enterAmount = input.nextDouble();
						fromBankAccount.transfer(toBankAccount, enterAmount);
						System.out.println(fromBankAccount.accountInfoToString());
						System.out.println(toBankAccount.accountInfoToString());
						
						break;
					}
				}
				break;
			}
		}
		if(!isFound1&&!isFound1)
		{System.out.print("Wrong account number!\n");}
	}
	
	/**
	 * User action print statement.
	 * Check the two account number, if found display the transaction
	 */
	public void userActionPrintStatement() {
		System.out.print("Enter account number\n");
		Scanner input = new Scanner(System.in);
		String enterAccountNumber=input.next();
		boolean isFound = false;
		for(BankAccount bankAccount:bankAccounts)
		{
			if(bankAccount.getAccountNumber().equals(enterAccountNumber))
			{
				System.out.print(bankAccount.makeStatement());
				isFound = true;
				break;
			}
		}
		if(!isFound)
		{System.out.print("Wrong account number!\n");}
	}
}
