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
		frame.setSize(screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void playerSetup()
	{	
		int coord1 = screenSize.width - screenSize.width/4;
		int coord2 = screenSize.height/2;
		
		JTextField playerCount = new JTextField();
		playerCount.setBounds(coord1, coord2, 60, 30);
		
		JLabel label1 = new JLabel();
		label1.setBounds(coord1 - 300, coord2, 200,20);
		label1.setText("How many players do you have?");
		
		JButton button1 = new JButton();
		button1.setBounds(coord1 + 50, coord2, 90,30);
		button1.setText("Submit");
		
		frame.add(label1);
		frame.add(button1);
		frame.add(playerCount);
	}
	
}
