package logic.calculators;

public class CoordinatesCalc {

	public CoordinatesCalc(){

		//Testvalues
		float lat1 = (float) -9.065691; 
		float lng1 = (float) -47.797902;

		float lat2 = (float) 63.250226; //Stortorget
		float lng2 = (float) 26.381786;

		System.out.println("Distance in meters: " +distFrom(lat1, lng1, lat2, lng2));
		double bearing = bearing(lat1, lng1, lat2, lng2);
		System.out.println("Bearing: " + bearing);
		System.out.println("Direction: " + getDirection(bearing));
	}
	
	
	/** 
	 * Calculates the distance in meters between two longitude and latitude points
	 * @param lat1
	 * @param lng1
	 * @param lat2
	 * @param lng2
	 * @return distance in meters
	 */
	private static float distFrom(float lat1, float lng1, float lat2, float lng2) {
		double earthRadius = 6371000; //meters
		double dLat = Math.toRadians(lat2-lat1);
		double dLng = Math.toRadians(lng2-lng1);
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
				Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
				Math.sin(dLng/2) * Math.sin(dLng/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		float dist = (float) (earthRadius * c);

		return dist;
	}

	/**
	 * Calculates the bearing between two longitude and latitude points
	 * @param lat1
	 * @param lon1
	 * @param lat2
	 * @param lon2
	 * @return
	 */
	private static double bearing(double lat1, double lon1, double lat2, double lon2){
		double longitude1 = lon1;
		double longitude2 = lon2;
		double latitude1 = Math.toRadians(lat1);
		double latitude2 = Math.toRadians(lat2);
		double longDiff= Math.toRadians(longitude2-longitude1);
		double y= Math.sin(longDiff)*Math.cos(latitude2);
		double x=Math.cos(latitude1)*Math.sin(latitude2)-Math.sin(latitude1)*Math.cos(latitude2)*Math.cos(longDiff);

		return (Math.toDegrees(Math.atan2(y, x))+360)%360;
	}
	
	

	/**
	 * Translates a bearing to a 8 part compass pointer string
	 * @param bearing
	 * @return
	 */
	public static String getDirection(double bearing){
		String direction = "Direction missing";

		if(bearing>=347.5 && bearing<22.5){
			return "N";		 
		}
		if(bearing>=22.5 && bearing<67.5){
			return "NE";
		}
		if(bearing>=67.5 && bearing<112.5){
			return "E";		 		 
		}
		if(bearing>=112.5 && bearing<157.5){
			return "SE";		 
		}
		if(bearing>=157.5 && bearing<202.5){
			return "S";		 
		}
		if(bearing>=202.5 && bearing<247.5){
			return "SW";		 
		}
		if(bearing>=247.5 && bearing<302.5){
			return "W";		 
		}
		if(bearing>=302.5 && bearing<347.5){
			return "NW";		 
		}

		return direction;

	}	


}
