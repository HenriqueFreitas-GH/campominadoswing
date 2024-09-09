package br.com.hrnq.cm.visao;

import javax.swing.JFrame;

import br.com.hrnq.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 30);	
		add(new PainelTabuleiro (tabuleiro));
		
		setTitle("Campo Zap Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
	}
}
