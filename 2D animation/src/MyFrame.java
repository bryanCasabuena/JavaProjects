import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	
	MyPanel panel;
	
	MyFrame (){
		
		panel = new MyPanel();
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.add(panel); 	
		this.setVisible(true);
		this.setSize(500,500);
		
	
	
		
	}
}