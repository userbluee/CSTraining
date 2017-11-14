package coding;

public class ActorWindow{
	int window;
	public int Window(String input){
		if(input.equals("CLOSE")){
			this.window =  0;
		}else if (input.equals("OPEN")){
			this.window = 1;
		}
		
		return this.window;
	}

}
