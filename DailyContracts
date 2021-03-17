DailyContracts.java by Thomas Craddock
import java.io.File;
import java.util.Scanner;

public class DailyContracts {

	public static void main(String [] args) {
		
		try {
				
		int indexItemType = 0 ; 
		int indexCharDesig = 1 ;
		int indexRentHours = 2 ; 
		int indexMinOver = 3 ; 
		int indexCustNum = 4 ; 
		int indexPayType = 5 ; 
		int indexCreditNum = 6; 
		int indexRoutNum = 6 ; 
		int indexAcctNum = 7 ; 
		
		String itemType = "" ;
		String charDesig = "" ;
		String rentHours = "" ;
		String minOver = ""  ;
		String custNum = "" ;
		String payType = "" ; 
		String creditNum = "" ; 
		String routNum = "" ; 
		String acctNum = "" ; 
		
		final int maxObjs = 20 ; 
		int rentIndex = 0 ; 
		int creditIndex = 0 ; 
		int eftIndex = 0 ; 
		int cashTotalContracts = 0 ; 
		int creditTotalContracts = 0 ; 
		int eftTotalContracts = 0 ; 
		int totalContracts = 0 ; 
		
		double totalCashRevenue = 0 ; 
		double totalCreditRevenue = 0 ; 
		double totalEFTRevenue = 0 ; 
		double totalRevenue = 0 ; 
		
		String [] tokens = null ; 		
		File file = new File ("ReturnedEquipment.text") ; // locate input file 
		RentalContract[] rentArray = new RentalContract[maxObjs] ; 
		RentalEFT[] eftArray = new RentalEFT[maxObjs] ; 
		RentalCredit[] creditArray = new RentalCredit[maxObjs] ; 
		Scanner scanner = new Scanner (file) ; // scanner for input file 
		
		
		while (scanner.hasNextLine()) {
			
			String thisLine = scanner.nextLine() ; // read lines from input file 
									  
			
			tokens = thisLine.split(",") ; // split read lines from file		
			itemType = tokens[indexItemType] ;
			charDesig = tokens[indexCharDesig] ; 
			rentHours = tokens[indexRentHours] ; 
			minOver = tokens[indexMinOver] ; 
			custNum = tokens[indexCustNum] ; 					
			payType = tokens[indexPayType] ; 		
				
			// create cash contracts 
			if (payType.contentEquals("$")) { 				 
				RentalContract rentObj = new RentalContract() ; 
				rentObj.setItemType(itemType) ;  
				rentObj.setCharDesig(charDesig); 
				rentObj.setRentHours(rentHours);
				rentObj.setMinOver(minOver);
				rentObj.setPayType(payType);
				rentObj.setContractNum();
				rentArray[rentIndex] = rentObj ; 
				rentObj.updateTotalP();
				rentIndex++ ; 				
			}
			
			// create credit contracts
			if (payType.contentEquals("C")) {
				RentalCredit creditObj = new RentalCredit() ; 
				creditNum = tokens[indexCreditNum] ; 
				creditObj.setItemType(itemType) ;  
				creditObj.setCharDesig(charDesig); 
				creditObj.setRentHours(rentHours);
				creditObj.setMinOver(minOver);
				creditObj.setPayType(payType);
				creditObj.setCCNum(creditNum) ; 
				creditObj.setContractNum();
				creditArray[creditIndex] = creditObj ; 
				creditObj.updateTotalP();
				creditIndex++ ; 
			}
			
			// create EFT contracts
			if (payType.contentEquals("E")) {
				RentalEFT eftObj = new RentalEFT() ; 
				routNum = tokens[indexRoutNum] ; 
				acctNum = tokens[indexAcctNum] ; 
				eftObj.setItemType(itemType) ;  
				eftObj.setCharDesig(charDesig); 
				eftObj.setRentHours(rentHours);
				eftObj.setMinOver(minOver);
				eftObj.setPayType(payType);
				eftObj.setRoutNum(routNum); 
				eftObj.setAcctNum(acctNum);
				eftObj.setContractNum();	
				eftArray[eftIndex] = eftObj ; 
				eftObj.updateTotalP();
				eftIndex++ ; 
			}
			
			
		} 
			
		scanner.close(); 
							
		System.out.printf("        ContractNum\t\tTotalPrice\n") ;	// table header output 			
		System.out.println("=================================================") ;
				
			
		// for loop output cash contracts	
		for (int i = 0 ; i < rentIndex ; i++) {	
			
			cashTotalContracts++ ; 			
			totalCashRevenue = rentArray[i].totalPrice()+ totalCashRevenue ; 
		
			System.out.printf("%26s \t$%8.2f\n", rentArray[i].getcontractNum(), rentArray[i].getTotalPrice()) ;			 					
		
			} 
		
		// for loop output credit contracts 
		for (int i = 0 ; i < creditIndex ; i++) {
			 
			creditTotalContracts++ ; 
			totalCreditRevenue = creditArray[i].totalPrice()+ totalCreditRevenue ; 
			System.out.printf("%26s \t$%8.2f\n", creditArray[i].getcontractNum(), creditArray[i].getTotalPrice()) ;		
		} 
		
		// for loop output EFT contracts 
		for (int i = 0 ; i < eftIndex ; i++) {
			
			eftTotalContracts++ ; 
			totalEFTRevenue = eftArray[i].totalPrice()+ totalEFTRevenue ; 
			System.out.printf("%26s \t$%8.2f\n", eftArray[i].getcontractNum(), eftArray[i].getTotalPrice()) ;		
		} 
		
		
		totalContracts = creditTotalContracts + eftTotalContracts + cashTotalContracts ; 
		totalRevenue = totalCashRevenue + totalCreditRevenue + totalEFTRevenue ; 
		System.out.printf("\nTotal Revenue: $%.2f\t Total Cash: $%.2f\t Total Credit: $%.2f\t Total EFT: $%.2f" , totalRevenue, totalCashRevenue, totalCreditRevenue, totalEFTRevenue) ; 	 	
		System.out.println("\nTotal contracts: " + totalContracts + "\t Total Cash Contracts: " + cashTotalContracts + "\t Total Credit Contracts: " + creditTotalContracts + "\t Total EFT Contracts: " + eftTotalContracts) ; 
	} // end try
		catch(Exception e) {
			e.printStackTrace();
		}
						
	}
	
}
