import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolaczRamka extends JFrame {
	public PolaczRamka() {
		super("Ciekawe czy sie uda");
		JPanel panel=new PolaczPanel();
		add(panel);
		///pack();
		setVisible(true);
	}

}
