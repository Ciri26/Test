import java.awt.EventQueue;

public class PolaczTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				new PolaczRamka();
			}
		});
	}

}
