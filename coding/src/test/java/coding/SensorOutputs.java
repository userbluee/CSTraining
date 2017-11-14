package coding;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Color;

public class SensorOutputs{

	JFrame frame;
	public int temp = 0;
	public int input = 0;

	MainController mc = new MainController();
	
	public SensorOutputs() {
		initialize();
	}

	private void initialize() {
		
		//SensorOutputs so = new SensorOutputs();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel aircon = new JLabel();
		if(temp == 0){
        	aircon.setText("DOWN");
        }else{
        	aircon.setText("UP");
        }
		frame.getContentPane().add(aircon);
		
		Panel window = new Panel();

		MainController mc = new MainController();
		
		input = mc.window;
		
		if(input==0){
			window.setBackground(Color.WHITE);
		}else{
			window.setBackground(Color.BLACK);
		}
		
		mc.ActorStats();
		frame.getContentPane().add(window);			
	}


}
