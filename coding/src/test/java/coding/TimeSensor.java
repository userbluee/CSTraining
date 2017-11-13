package coding;

public class TimeSensor implements Sensors{

	private int time;
	
	public int getInput() {
		return 0;
	}
	public int getSensors() {
		
		time = getInput();
		return time;
	}
	
}
