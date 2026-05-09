package ui;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class VisualizerPanel extends JPanel{

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(50,50,100,100);
	}
}
