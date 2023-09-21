package classeCarro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	private String nome;
	private ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
	
	public void cadastrar() {
		setNome (JOptionPane.show.InputDialog ("Nome time"));
		String continua = "";
		do {
			
			Jogador j= new Jogador();
			j.cadastrar ();
			jogadores.add(j);
			continua =  JOptionPane.showInputDialog("Mais jogadores? S/N");
			
		} while (continua.equalsIgnoreCase ("S"));
	}
    public Jogador artilheiroTime() {
    	Jogador art = jogadores.get(0);
    	for (Jogador j : jogadores) {
    		if (j.getGols()> art.getGols()) {
    	}
    	   
    }
    	return art;
}
    
