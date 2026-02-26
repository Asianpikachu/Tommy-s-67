import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Animation extends JPanel implements Runnable
{

	public Animation()
	{

		new Thread(this).start();
	}

	public void paint( Graphics window )
	{
		Graphics2D g1= (Graphics2D) window;
		Image img1=Toolkit.getDefaultToolkit().getImage("istockphoto-1449539840-612x612.jpg");
		g1.drawImage(img1,0,0,2560,1240,this);
		


	}
	
	public void run()
	{

		try
		{
			while( true )
			{	
			   Thread.sleep(50);
			   repaint();
			}
		}
		catch( Exception e )
		{
			
		}

	}
}