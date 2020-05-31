import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
