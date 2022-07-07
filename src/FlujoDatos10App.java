import javax.swing.JOptionPane;
public class FlujoDatos10App {

	public static void main(String[] args) {
		
		double suma = 0;
		
		String entrada1 = JOptionPane.showInputDialog("Nº ventas");
		int nVentas = Integer.parseInt(entrada1);
		
		nVentas += 1;
		
		for(int i=1; i<nVentas; i++) {
			String entrada = JOptionPane.showInputDialog("Venta nº " + i);
			double resultat = Double.parseDouble(entrada);
			
			suma += resultat;
			
			System.out.println(resultat);
			
		}
		
		System.out.println("Total: " + suma);
		
	}

}
