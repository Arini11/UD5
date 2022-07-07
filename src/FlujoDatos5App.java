import javax.swing.JOptionPane;
public class FlujoDatos5App {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Introdueix numero");
		double numero = Double.parseDouble(entrada);
		
		if(numero % 2 == 0) {
			System.out.println("Numero divisble entre dos");
		}else {
			System.out.println("Numero NO divisble entre dos");
		}

	}

}
