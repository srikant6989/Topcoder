public class SpeedRadar {
	public static int count = 0;
	public static double average_speed = 0.0;
	
	public static double averageSpeed(int minLimit, int maxLimit, int[] readings) {
	
		int length = readings.length;
		double ten_percent = (length * 10)/100;
		
		for(int i=0; i<length; i++) {
		
			if(readings[i] > maxLimit || readings[i] < minLimit) {
			
				count++;
			}
			else {
			
				average_speed = average_speed + readings[i];
			}
		}
		
		if(count > ten_percent)
			return 0.0;
			
		else
			return average_speed/(length - count);
		
	}
	
	public static void main(String[] args) {
	
		int[] readings = {40,45,50};
		double speed = averageSpeed(1,50,readings);
	}
}