import javax.swing.SwingUtilities;

public class Application {

	public static void main(String[] args){
		
		System.out.println("Hello, I want to start create my new app - TTT");
		
		System.out.println("v0.1");
		
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new TicTacToeGUI();
				
			}
			
		});
	}
	
}
