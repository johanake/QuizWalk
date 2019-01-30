package app.game.enteties;

public class Position {
	private float longitude =0;
	private float latitude =0;
	
	public Position(float latitude, float longitude){
		this.longitude = longitude;
		this.latitude = latitude;
		
	}
	
	public void setLongitude(float longitude){
		this.longitude =longitude;
	}
	
	public float getLongitude(){
		return this.longitude;
	}
	
	public void setLatitude(float latitude){
		this.latitude = latitude;
	}
	
	public float getLatitude(){
		return this.latitude;
	}
	

}
