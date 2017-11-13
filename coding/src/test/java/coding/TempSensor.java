package coding;

public class TempSensor implements Sensors {
	
	private int temp;
	
	public int getInput(){
		return 0;
	}
	
	public int getSensors() {
		
		temp = getInput();
		return temp;
	}

	
}
