import javax.swing.JOptionPane;
public class FlujoDatos6App {

	public static void main(String[] args) {
		
		final double IVA = 0.21; 
		
		String entrada = JOptionPane.showInputDialog("Introdueix preu producte");
		double numero = Double.parseDouble(entrada);
		
		double resultat = numero*IVA;
		System.out.println(resultat);
	}

}
