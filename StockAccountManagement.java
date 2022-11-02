import java.util.*;

public class StockAccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int repeat = 0, chooseShare, share, ValueOfRelianceStock = 0, ValueOfTataStock = 0, ValueOfAdaniStock = 0,
				ValueOfBankniftyStock = 0, ValueOfBankOfIndiaStock = 0, ValueOfNifty50Stock = 0,
				TotalValueOfAllStocks = 0;

		System.out.println("Available Stocks");

		while (repeat != 1) {
			System.out.println("1) Reliance    2) Tata            3) Adani");
			System.out.println("4) BankNifty   5) Bank Of India   6) Nifty 50");

			System.out.print("Select which Company Stocks do you want to Buy: ");
			Scanner inp = new Scanner(System.in);

			chooseShare = inp.nextInt();
			switch (chooseShare) {
			case 1:
				System.out.println("Reliance");
				System.out.println("Share Price: 1200 Rs.");
				System.out.print("No. of Shares: ");
				share = inp.nextInt();
				ValueOfRelianceStock = share * 1200;
				TotalValueOfAllStocks = TotalValueOfAllStocks + ValueOfRelianceStock;
				System.out.print("Do you Want to Buy More 0)Yes  1)No : ");
				repeat = inp.nextInt();
				break;
			case 2:
				System.out.println("Tata");
				System.out.println("Share Price: 1700 Rs.");
				System.out.print("No. of Shares: ");
				share = inp.nextInt();
				ValueOfTataStock = share * 1700;
				TotalValueOfAllStocks = TotalValueOfAllStocks + ValueOfTataStock;
				System.out.print("Do you Want to Buy More 0)Yes  1)No : ");
				repeat = inp.nextInt();
				break;
			case 3:
				System.out.println("Adani");
				System.out.println("Share Price: 1800 Rs.");
				System.out.print("No. of Shares: ");
				share = inp.nextInt();
				ValueOfAdaniStock = share * 1800;
				TotalValueOfAllStocks = TotalValueOfAllStocks + ValueOfAdaniStock;
				System.out.print("Do you Want to Buy More 0)Yes  1)No : ");
				repeat = inp.nextInt();
				break;
			case 4:
				System.out.println("Banknifty");
				System.out.println("Share Price: 40000 Rs.");
				System.out.print("No. of Shares: ");
				share = inp.nextInt();
				ValueOfBankniftyStock = share * 40000;
				TotalValueOfAllStocks = TotalValueOfAllStocks + ValueOfBankniftyStock;
				System.out.print("Do you Want to Buy More 0)Yes  1)No : ");
				repeat = inp.nextInt();
				break;
			case 5:
				System.out.println("Bank Of India");
				System.out.println("Share Price: 1000 Rs.");
				System.out.print("No. of Shares: ");
				share = inp.nextInt();
				ValueOfBankOfIndiaStock = share * 1700;
				TotalValueOfAllStocks = TotalValueOfAllStocks + ValueOfBankOfIndiaStock;
				System.out.print("Do you Want to Buy More 0)Yes  1)No : ");
				repeat = inp.nextInt();
				break;
			case 6:
				System.out.println("Nifty50");
				System.out.println("Share Price: 2500 Rs.");
				System.out.print("No. of Shares: ");
				share = inp.nextInt();
				ValueOfNifty50Stock = share * 1700;
				TotalValueOfAllStocks = TotalValueOfAllStocks + ValueOfNifty50Stock;
				System.out.print("Do you Want to Buy More 0)Yes  1)No : ");
				repeat = inp.nextInt();

			}

		}
		
		System.out.println("Value Of each Stocks:");
		System.out.println("Reliance: " + ValueOfRelianceStock + " Rs.");
		System.out.println("Tata: " + ValueOfTataStock + " Rs.");
		System.out.println("Adani: " + ValueOfAdaniStock + " Rs.");
		System.out.println("Banknifty: " + ValueOfBankniftyStock + " Rs.");
		System.out.println("Bank Of India: " + ValueOfBankOfIndiaStock + " Rs.");
		System.out.println("Nifty50: " + ValueOfNifty50Stock);
		System.out.println("Total value of all Stocks: " + TotalValueOfAllStocks + " Rs.");
		
	}

}
