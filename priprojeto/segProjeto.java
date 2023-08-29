package priprojeto;
import javax.swing.JOptionPane;

public class segProjeto {
	  public static void main(String[] args) {
		  
	String marca;
	int ano;
	String cor;
	
	
	ArrayList cadastro = new ArrayList<>();
    cadastro.add("Carro");
    cadastro.add("Ano");
    cadastro.add("Cor");
     JOptionPane.showMessageDialog(null, "Cadastro");
	
	ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: "));
	
	
	
}
}