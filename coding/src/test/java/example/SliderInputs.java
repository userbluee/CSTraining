package example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SpringLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import coding.MainController;
import coding.SensorInputs;

public class SliderInputs {
	public JFrame frame;
	//JPanel panel = new JPanel();

	JSlider temp = new JSlider();
	JSlider time = new JSlider(0,24);
	JSlider windSpeed = new JSlider();
	
	MainController mc = new MainController();
		
	public int te, ti, ws;
	
	public SliderInputs(){
		initialize();
	}
	
	public void initialize(){
		frame = new JFrame("Sensors Input");
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		springLayout.putConstraint(SpringLayout.NORTH, temp, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, temp, 105, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(temp);
		
		JLabel lblTemperature = new JLabel("Temperature");
		springLayout.putConstraint(SpringLayout.NORTH, lblTemperature, 6, SpringLayout.SOUTH, temp);
		springLayout.putConstraint(SpringLayout.WEST, lblTemperature, 165, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblTemperature);
		
		springLayout.putConstraint(SpringLayout.NORTH, time, 64, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, time, 0, SpringLayout.EAST, temp);
		frame.getContentPane().add(time);
		
		JLabel lblTime = new JLabel("Time");
		springLayout.putConstraint(SpringLayout.NORTH, lblTime, 6, SpringLayout.SOUTH, time);
		springLayout.putConstraint(SpringLayout.WEST, lblTime, 189, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblTime);
		
		springLayout.putConstraint(SpringLayout.NORTH, windSpeed, 6, SpringLayout.SOUTH, lblTime);
		springLayout.putConstraint(SpringLayout.WEST, windSpeed, 0, SpringLayout.WEST, temp);
		frame.getContentPane().add(windSpeed);
		
		JLabel lblWindSpeed = new JLabel("Wind Speed");
		springLayout.putConstraint(SpringLayout.NORTH, lblWindSpeed, 6, SpringLayout.SOUTH, windSpeed);
		springLayout.putConstraint(SpringLayout.EAST, lblWindSpeed, 0, SpringLayout.EAST, lblTemperature);
		frame.getContentPane().add(lblWindSpeed);
		
		JLabel label = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, temp);
		springLayout.putConstraint(SpringLayout.EAST, label, -4, SpringLayout.WEST, temp);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("100");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, temp);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("00");
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 0, SpringLayout.NORTH, time);
		springLayout.putConstraint(SpringLayout.EAST, label_2, 0, SpringLayout.EAST, label);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("24");
		springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, label_3);
		springLayout.putConstraint(SpringLayout.NORTH, label_3, 0, SpringLayout.NORTH, time);
		springLayout.putConstraint(SpringLayout.WEST, label_3, 1, SpringLayout.EAST, time);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, label_4, 0, SpringLayout.NORTH, windSpeed);
		springLayout.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, label);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("100");
		springLayout.putConstraint(SpringLayout.NORTH, label_5, 0, SpringLayout.NORTH, label_4);
		springLayout.putConstraint(SpringLayout.WEST, label_5, 0, SpringLayout.WEST, label_1);
		frame.getContentPane().add(label_5);
		
		temp.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
		    	te =temp.getValue();
		    	//System.out.println("temperature: "+te);
	        }
	    });
		
		time.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
		    	ti = time.getValue();
		    	//System.out.println("time: "+ti);
	        }
	    });

    	mc.getTemp(te);
    	mc.getTime(ti);
    	mc.getWind(ws);
		
		windSpeed.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	ws = windSpeed.getValue();
	        	//System.out.println("windSpeed: "+ws);
	        }
	    });
	}
	
}
