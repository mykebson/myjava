import javax.swing.JOptionPane;

public class SintaxeJava {
	//"MAIN + CTRL + SPACE" to autocomplete
	public static void main(String[] args) {
		//"Syso + CTRL + SPACE" to criate System.out.println();	
		String numero1 = JOptionPane.showInputDialog("Digite numero 1");		
		String numero2 = JOptionPane.showInputDialog("Digite numero 2");
		
		Integer numerUm = Integer.parseInt(numero1);
		Integer numeroDois = Integer.parseInt(numero2);
		
		JOptionPane.showMessageDialog(null,numerUm + numeroDois);
	}
}




