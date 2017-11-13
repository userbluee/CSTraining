package coding;

public class MainController implements Runnable {
	public int windSpeed = 0;
	public int temperature = 0;
	public int time = 0;
	
	public MainController(){
		
		TempSensor tes = new TempSensor();
		TimeSensor tis = new TimeSensor();
		WindSensor wis = new WindSensor();
		
		this.temperature = tes.getSensors();
		this.time = tis.getSensors();
		this.windSpeed = wis.getSensors();
		
	}

	public void run() {
		
	}
	
	public void start(){
		
	}
}
 