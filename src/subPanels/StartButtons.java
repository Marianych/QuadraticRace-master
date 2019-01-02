package subPanels;

import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logics.Difficulty;
import events.StartButtonsAdapter;

public class StartButtons extends JPanel {

	/**
	 * 
	 */

	private Image buttonEasy = new ImageIcon(getClass().getClassLoader().getResource("pictures/buttonEasy.png"))
			.getImage();
	private Image buttonNormal = new ImageIcon(getClass().getClassLoader().getResource("pictures/buttonNormal.png"))
			.getImage();
	private Image buttonHard = new ImageIcon(getClass().getClassLoader().getResource("pictures/buttonHard.png"))
			.getImage();

	public StartButtons(JFrame buttonsFrame) {

		JButton b1 = new JButton("easy");
		JButton b2 = new JButton("normal");
		JButton b3 = new JButton("hard");

		b1.setIcon(new ImageIcon(buttonEasy));
		b1.setVerticalTextPosition(AbstractButton.BOTTOM);
		b1.setHorizontalTextPosition(AbstractButton.CENTER);

		b2.setIcon(new ImageIcon(buttonNormal));
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);

		b3.setIcon(new ImageIcon(buttonHard));
		b3.setVerticalTextPosition(AbstractButton.BOTTOM);
		b3.setHorizontalTextPosition(AbstractButton.CENTER);

		b1.addActionListener(new StartButtonsAdapter(buttonsFrame, Difficulty.easy));
		b2.addActionListener(new StartButtonsAdapter(buttonsFrame, Difficulty.normal));
		b3.addActionListener(new StartButtonsAdapter(buttonsFrame, Difficulty.hard));

		add(b1);
		add(b2);
		add(b3);
	}
}
