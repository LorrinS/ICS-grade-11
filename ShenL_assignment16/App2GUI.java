import javax.swing.*;
import java.awt.*;

class App2 extends JPanel{
ImageIcon img, img2;
JLabel label1, label2;
JTextArea txtA;
	public App2(){		
		img = new ImageIcon("flower.jpg");
		img2 = new ImageIcon("image.jpg");
		label1 = new JLabel("label1", JLabel.LEFT);
		label2 = new JLabel(img, JLabel.RIGHT);
		txtA = new JTextArea("text Area", 2, 2);
		this.setPreferredSize(new Dimension(600,600));
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(label1);
		this.add(label2);
		this.add(txtA);
	}


public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
public class App2GUI{
  public static void main ( String[] args ){
    JFrame frame = new JFrame("Application 2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(new App2());
    frame.pack(); 
    frame.setVisible(true);
  }
}
