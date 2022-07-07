import javax.swing.*;
public class FlujoDatos4App {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Introdueix radi cercle");
		double n = Double.parseDouble(entrada);
		double resultat = Math.PI * Math.pow(n, 2);
		
		System.out.println(resultat);
	}

}
