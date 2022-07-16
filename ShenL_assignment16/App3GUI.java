import javax.swing.*;
import java.awt.*;

class App3 extends JPanel{
JCheckBox cbox;
JSpinner spinner;
SpinnerModel val;
JTextField txtfield;
	public App3(){		
		cbox = new JCheckBox("check");
		val = new SpinnerNumberModel(1,0,10,1);
		spinner = new JSpinner(val);
		txtfield = new JTextField("Text Field");
		this.setPreferredSize(new Dimension(600,600));
		this.setLayout(new FlowLayout());
		this.add(cbox);
		this.add(spinner);
		this.add(txtfield);
	}


public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
public class App3GUI{
  public static void main ( String[] args ){
    JFrame frame = new JFrame("Application 3");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(new App3());
    frame.pack(); 
    frame.setVisible(true);
	
  }
}