package coding;


public class TimeSensor implements Sensors{

	private int time;

	public int getSensors(int input) {
		
		time = input;
		return time;
	}
	
}
