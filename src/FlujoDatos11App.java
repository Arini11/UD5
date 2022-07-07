import javax.swing.JOptionPane;
public class FlujoDatos11App {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Dia semana");
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Hoy es dia laboral");
				break;
			case "martes":
				System.out.println("Hoy es dia laboral");
				break;
			case "miercoles":
				System.out.println("Hoy es dia laboral");
				break;
			case "jueves":
				System.out.println("Hoy es dia laboral");
				break;
			case "viernes":
				System.out.println("Hoy es dia laboral");
				break;
			case "sabado":
				System.out.println("Hoy no es dia laboral");
				break;
			case "domingo":
				System.out.println("Hoy no es dia laboral");
				break;
			default:
				System.out.println("El dia no existe");
		}
		
	}

}
