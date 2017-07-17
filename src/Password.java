import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Password extends JFrame implements KeyListener {
	private int counter;
	private String wpisz="";
	private final String haslo="kotek";
	
	public Password() {
		super("Podaj haslo");
		setPreferredSize(new Dimension(380,450));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent ev) {
		// TODO Auto-generated method stub
		char z=ev.getKeyChar();
		if (counter<haslo.length())
			check(z);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	private void check(char z) {
		if (z==haslo.charAt(counter)) {
			counter++;
			wpisz=wpisz+z;
		}
		else {
			System.out.println("Niepoprawne hasło, spróbuj ponownie ");
			counter=0;
			wpisz="";
		}
		if(wpisz.equals(haslo)) {
			setTitle("Nagroda");
		
			
	}

}
}
