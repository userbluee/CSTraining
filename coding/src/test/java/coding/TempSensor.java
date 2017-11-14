package coding;

import java.util.Scanner;

public class TempSensor implements Sensors {
	
	private int temp, roomTemp;
	Scanner sc = new Scanner(System.in);
	
	public int getRoom(int rT){
		this.roomTemp = rT;
		
		return roomTemp;
	}

	public int getSensors(int input) {
		
		temp = input;
		return temp;
	}
	

	
}
