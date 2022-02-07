package stepdefinitions;

public class Geolocation2 {

	private Double latitude;
	private Double longitude;
	
	public Geolocation2(Double latitude, Double longitude) {
	 this.latitude = latitude;
	 this.longitude = longitude;
	}
	
	public void setGeoLocation(Double latitude,Double longitude){
		this.latitude = latitude;
		 this.longitude = longitude;
	}
	
	public Double getLat(){
		return this.latitude;
	}
	
	public Double getLong(){
		return this.longitude;
	}
	
}
