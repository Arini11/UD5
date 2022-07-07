import javax.swing.JOptionPane;
public class CalculadoraInversa {

	public static void main(String[] args) {
		
		double resultat=0;
		
		String input1 = JOptionPane.showInputDialog("Introduce el primer numero");
		double num1 = Double.parseDouble(input1);
		
		String input2 = JOptionPane.showInputDialog("Introduce el segundo numero");
		double num2 = Double.parseDouble(input2);
		
		String operador = JOptionPane.showInputDialog("Introduce el operador");
		
		switch(operador) {
		
			case "+":
				resultat = num1 + num2;
				break;
			case "-":
				resultat = num1 - num2;
				break;
			case "*":
				resultat = num1 * num2;
				break;
			case "/":
				resultat = num1 / num2;
				break;
			case "^":
				resultat = Math.pow(num1, num2);
				break;
			case "%":
				resultat = num1 % num2;
				break;
		}
		
		System.out.println("El resultat és: " + resultat);
		
	}

}
