import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window 
{
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JFrame frame;
	public Window(JFrame f)
	{
		frame = f;
	}
	public void WindowSetup()
	{
		frame.setVisible(true);
		frame.setSize(screenSize.width, screenSize.height);
		frame.setLayout(null);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void playerSetup()
	{	
		int coord1 = screenSize.width - screenSize.width/4;
		int coord2 = screenSize.height/2;
		
		JTextField playerCount = new JTextField();
		playerCount.setBounds(coord1, coord2, coord1 + 100, coord2 - 100);
		
		JLabel label1 = new JLabel();
		label1.setBounds(coord1 - 150, coord2, coord1 - 50, coord2 - 100);
		label1.setText("How many players do you have?");
		
		JButton button1 = new JButton();
		button1.setBounds(coord1 + 50, coord2, coord1 + 150, coord2 - 20);
		
		frame.add(label1);
		frame.add(button1);
		frame.add(playerCount);
	}
	
}
