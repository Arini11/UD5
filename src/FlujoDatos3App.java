import javax.swing.JOptionPane;
public class FlujoDatos3App {

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog("Introdueix el teu nom");
		
		JOptionPane.showMessageDialog(null, "Benvingut " + nom);

	}

}
