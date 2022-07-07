import javax.swing.JOptionPane;
public class FlujoDatos12App {

	public static void main(String[] args) {
		
		String pass = "admin";
		String input = "";
		int intents = 3;
				
		do{
			input = JOptionPane.showInputDialog("Contrasenya?");
			
			if(input.equals(pass)) {
				System.out.println("Enhorabuena!");
				break;
			}else {
				intents--;
			}
			
		}while(intents != 0 || input.equals(pass));
		
		if(intents == 0) {
			System.out.println("No más intentos disponibles");
		}
	}

}
