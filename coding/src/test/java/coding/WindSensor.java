package coding;


public class WindSensor implements Sensors{

	private int windSpeed;

	public int getSensors(int input) {
		
		windSpeed = input;
		return windSpeed;
	}

}
