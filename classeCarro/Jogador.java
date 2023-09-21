package classeCarro;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int camisa;
	private int gols;
	
	public void cadastrar() {
		getNome = JOptionPane.showInputDialog("Nome");
		getCamisa = Integer.parseInt (JOptionPane.showInputDialog);
		getGols= Integer.parseInt (JOptionPane.showInputDialog(nome));
	}
  String exibir() {
	  return getNome()+"_"+getCamisa()"_"+getGols()+"\n";
  }
}
