import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;


class App1 extends JPanel implements ActionListener{
JButton button, button2;
ImageIcon img, img2, img3;
//Image img3;
	public App1(){
		button = new JButton("click here");
		img = new ImageIcon("flower.jpg");
		img2 = new ImageIcon("image.jpg");
		img3 = new ImageIcon("elephant.jpg");
		//img3 = Toolkit.getDefaultToolkit().getImage("elephant.jpg");
		button2 = new JButton(img);
		this.setPreferredSize( new Dimension(600,600));
		this.setLayout(new GridLayout(5, 5));
		//this.setLayout(new FlowLayout());
		this.add(button);
		this.add(button2);
		button.addActionListener(this);
	}

public void actionPerformed(ActionEvent e) {
	//this.setBackground(Color.RED);
	ImageIcon y = new ImageIcon(new ImageIcon("flower.jpg").getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
	JLabel x = new JLabel(y,JLabel.CENTER);
	//x.setIcon(y);
	x.setBounds(0,0,getWidth(),getHeight());
	this.add(x);
	revalidate();
	repaint();
}
public void paintComponent(Graphics g){
        super.paintComponent(g);
		g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), null);
		g.drawImage(img2.getImage(), 500, 500, 100, 100, null);
    }
	
}
public class App1GUI{
  public static void main ( String[] args ){
    JFrame frame = new JFrame("Application 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(new App1());
    frame.pack(); 
    frame.setVisible(true);
  }
 

}
