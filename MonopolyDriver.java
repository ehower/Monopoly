import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonopolyDriver extends JPanel
{
	static GraphicsConfiguration g;
	

	public static void main (String[] args) throws IOException
	{
		JFrame frame = new JFrame("Cedar Crest-Opoly",g);	
		
		BufferedImage image = ImageIO.read(new File("Images\\Board.png"));
		
		 JPanel pane = new JPanel() 
		 {
			 @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(image, 0, 0, null);
	            }
	     };
	     createJFrame(frame);
	     frame.add(pane);
	}
	
	public static void createJFrame(JFrame frame)
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setVisible(true);
		frame.setSize(screenSize.width, screenSize.height);
	}
	
	
}
