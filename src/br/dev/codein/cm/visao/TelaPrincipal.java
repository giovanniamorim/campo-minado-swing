package br.dev.codein.cm.visao;

import javax.swing.JFrame;

import br.dev.codein.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {
		Tabuleiro  tabuleiro = new Tabuleiro(16, 30, 50);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null); // centraliza a tela
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // mata o processo quando clica em fechar
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

}
