package coding;

public class WindSensor implements Sensors{

	private int windSpeed;
	
	public int getInput() {
		return 0;
	}
	
	public int getSensors() {
		
		windSpeed = getInput();
		return windSpeed;
	}
}
