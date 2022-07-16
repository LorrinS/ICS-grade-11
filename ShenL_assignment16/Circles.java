import javax.swing.*;
import java.awt.*;
/*
Lorrin Shen
May 27 2020
assignment: chapter 36 excercise 1
ICS3U7-01 Ms.Strelkovska
*/


class CirclePanel extends JPanel{

  public CirclePanel()
 {
    setPreferredSize(new Dimension(1280, 800));
    setBackground( Color.WHITE );
  }

  public void paintComponent (Graphics gr){ 
    super.paintComponent(gr);

    // Determine the center of the panel
    int cntrX = getWidth()/4;
    int cntrY = getHeight()/4;

    // Calculate the radius
    int radius = getWidth()/12;

    // Draw the top left Circle
    gr.setColor(Color.RED);
    gr.drawOval((cntrX-radius), (cntrY-radius), radius*2, radius*2);

    //Draw the top right Circle
    gr.setColor(Color.BLUE);
    gr.drawOval((cntrX-radius)*4, (cntrY-radius), radius*2, radius*2);

    //Draw the bottom left Circle
    gr.setColor(Color.GREEN);
    gr.drawOval((cntrX-radius), (cntrY-radius)*5, radius*2, radius*2);

    //Draw the bottom right Circle
    gr.setColor(Color.YELLOW);
    gr.drawOval((cntrX-radius)*4, (cntrY-radius)*5, radius*2, radius*2);
   }
}

public class Circles{
   public static void main ( String[] args ){
      JFrame frame = new JFrame("Circles");
      frame.setPreferredSize(new Dimension(1280, 800));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new CirclePanel());

      frame.pack();
      frame.setVisible( true );
   }
}