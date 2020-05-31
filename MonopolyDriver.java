import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonopolyDriver extends JPanel
{
	static GraphicsConfiguration g;
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public static void main (String[] args) throws IOException
	{
		 
		JFrame frame = new JFrame("Cedar Crest-Opoly",g);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BufferedImage board = ImageIO.read(new File("Images\\Board.png"));
		
		 JPanel pane = new JPanel() 
		 {
			 @Override
	            protected void paintComponent(Graphics g) 
			 {
	                super.paintComponent(g);
	                Image scaledImage = board.getScaledInstance(screenSize.width/2, screenSize.width/2, java.awt.Image.SCALE_SMOOTH);
	                g.drawImage(scaledImage, 0, 0, null);
			 }
	     };
	     createJFrame(frame);
	     frame.add(pane);
	}
	
	public static void createJFrame(JFrame frame)
	{
		frame.setVisible(true);
		frame.setSize(screenSize.width, screenSize.height);
	}
	
	
}
