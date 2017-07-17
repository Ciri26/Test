import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PolaczPanel extends JPanel implements ActionListener {
	
	private JButton pokaz;

		public PolaczPanel() {
			pokaz=new JButton("pokaz");
			pokaz.addActionListener(this);
			setPreferredSize(new Dimension(500,500));
			add(pokaz);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.ORANGE);
		
		
	}

}
