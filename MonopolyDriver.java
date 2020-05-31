import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonopolyDriver extends JPanel
{
	static GraphicsConfiguration g;
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("Cedar Crest-Opoly",g);
		createJFrame(frame);
	}
	
	public static void createJFrame(JFrame frame)
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setVisible(true);
		frame.setSize(screenSize.width, screenSize.height);
	}
	
}
