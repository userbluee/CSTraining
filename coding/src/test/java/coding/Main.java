package coding;

public class Main {

	public static void main(String[] args) {
		
		int time;
		int temperature;
		int windSpeed;
		
		MainController mc = new MainController();
		
		temperature = mc.temperature;
		time = mc.time;
		windSpeed = mc.windSpeed;
		
		System.out.printf("temp : %d \ntime: %d \nwind: %d ",temperature,time,windSpeed);
	}
}
