package coding;

public class ActorAirCon{
	int airCon;
	public int Aircon(String input){
		if(input.equals("DOWN")){
			this.airCon = 0;
		}else if (input.equals("UP")){
			this.airCon = 1;
		}
		
		return this.airCon;
	}

}
