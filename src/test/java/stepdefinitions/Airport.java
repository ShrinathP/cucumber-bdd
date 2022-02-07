package stepdefinitions;

public class Airport {

	private String airportName;
	
	Airport(String airport){
		this.airportName = airport;
	}
	
	public void setAirportName(String airport){
		this.airportName = airport;
	}
	
	public String getAirportName(){
		return this.airportName;
	}
}
