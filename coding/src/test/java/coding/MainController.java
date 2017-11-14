package coding;

import java.awt.EventQueue;

public class MainController implements Runnable {
	public int windSpeed;
	public int temperature;
	public int roomTemp;
	public int time;
	
	TempSensor tes = new TempSensor();
	TimeSensor tis = new TimeSensor();
	WindSensor wis = new WindSensor();
	
	public int window = 0, airCon = 0;
	

	public void getTemp(int a){
		
		this.temperature = tes.getSensors(a);
		this.roomTemp = tes.getRoom(45);
		//System.out.println("Temp: "+this.temperature);
		
	}
	public void getTime(int b){
		
		this.time = tis.getSensors(b);
		//System.out.println("Time: "+this.time);
		
	}
	public void getWind(int c){

		this.windSpeed = wis.getSensors(c);
		//System.out.println("Wind: "+this.windSpeed);
	}
	
	public MainController(){
	
	}
	
	public void ShowGUI(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					SensorInputs si = new SensorInputs();
					si.frame.setVisible(true);
						
					SensorOutputs so = new SensorOutputs();
					so.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void ActorStats(){

		ActorAirCon ac = new ActorAirCon();
		ActorWindow wd = new ActorWindow();
		
		if(this.time > 18){
			if(this.temperature >= this.roomTemp){
				airCon = ac.Aircon("DOWN");
			}else if( this.temperature <= this.roomTemp){
				airCon = ac.Aircon("UP");
			}
			window = wd.Window("CLOSE");
		}else if(this.time < 18){
			if(this.temperature >= this.roomTemp){
				airCon = ac.Aircon("DOWN");
			}else if( this.temperature <= this.roomTemp){
				airCon = ac.Aircon("UP");
			}
			window = wd.Window("OPEN");
		}
		
		System.out.printf("window= %d, AC=%d \n",window, airCon);
	}
	
	
	
	public void run() {
	}
	
}
 