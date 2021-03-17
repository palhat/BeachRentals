public class RentalEFT extends RentalContract {
	private String routeNum ; 
	private String acctNum ; 
	
	public void setRoutNum(String routNum) {
		this.routeNum = routNum ; 
	}
	
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum ;
	}
	
	public String getRoutNum() {
		return routeNum ; 
	}
	
	public String getAcctNum() {
		return acctNum ; 
	}
}
