package stepdefinitions;

public class Geolocation {

	private Double latitude;
	private Double longitude;
	
	public Geolocation(Double latitude, Double longitude) {
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
