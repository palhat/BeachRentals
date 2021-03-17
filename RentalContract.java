import java.util.Date ; 
import java.text.SimpleDateFormat; ; 

public class RentalContract {
	private String contractNum  ;
	private int rentHours ; 
	private int minOver ; 
	private double totalPrice ; 
	private String itemType ; 
	private String charDesig ; 
	private String custNum ; 
	private String payType ; 
	
	public void setContractNum() {
	Date sysDate = new Date() ; // generate date from system
	SimpleDateFormat sysDateF = new SimpleDateFormat("ddMMMMMMyyyy") ; // format date  		 
	contractNum = itemType.concat(charDesig).concat(sysDateF.format(sysDate).toString()) ;  
	}
		
	
	public void setItemType(String itemType) {
		this.itemType = itemType ; 
	}
	
	public void setCharDesig(String charDesig) {
		this.charDesig = charDesig ; 
	}
	
	public void setRentHours(String rentHours) {
		this.rentHours = Integer.parseInt(rentHours) ; 
	}
	
	public void setMinOver(String minOver) {
		this.minOver = Integer.parseInt(minOver) ; 
	}
	
	public void setPayType(String payType) {
		this.payType = payType ;
	}
	
	public String getPayType() {
		return payType ; 
	}
	
	public String getItemType()	{
		return itemType ; 
	}
	  
	public String getCharDesig() { 
		return charDesig ; 
	}
	
	public int getRentHours() {
		return rentHours ; 
	}
	
	public int getMinOver() {
		return minOver ; 
	}
	
	public String getcontractNum () {
		return contractNum ; 
	}
	
	public double getTotalPrice() {
		return totalPrice ; 
	}
	
	//rentHours method
	public void updateRentHours (int rentHours1) {				 				
		rentHours = rentHours1 ;		 
	}
	
	//minOver method
	public void minOver(int minOver1) {						
		minOver = minOver1 ;		
	}
	
	public int getminOver() {
		return minOver ; 
	}
	//totalPrice method
	public double totalPrice() {				
		return totalPrice ; 
	}
	
	 //update rentHours method		
	public void updateRentH() {
		System.out.println("Enter hours: ") ; 				
	}
	
	//update minOver method
	public void updateTimeO() {
		System.out.print("Enter minutes over rental contract: ") ; 		
	}
	
	//update total price method
	public void updateTotalP() {
		totalPrice = (rentHours * 40) + minOver ;  		 		 
	}
	
}	
