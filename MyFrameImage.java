package p20230918;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrameImage extends JFrame{
	public MyFrameImage() {
		setTitle("레이블테스트");
		setSize(400,250);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("강아지");
		ImageIcon icon = new ImageIcon("C:\\Users\\USER\\Downloads\\dog.png");
		label.setIcon(icon);
		
		JButton button = new JButton("자세한");
		panel.add(label);
		panel.add(button);
		this.add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
