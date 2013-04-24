package ExtraCreditProject;

/**
 * The Test Class for BankTester.
 * @author junjun
 */
public class BankTester
	{

		public static void main(String[] args)
			{
			BankInterface initBank = new Bank();
			initBank.loadData();
			initBank.Menu();
			}

	}
