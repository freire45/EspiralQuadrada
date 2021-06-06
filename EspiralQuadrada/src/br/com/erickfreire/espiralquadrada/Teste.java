package br.com.erickfreire.espiralquadrada;

import javax.swing.JFrame;

public class Teste {
	public static void main(String[] args) {
		EspiralQuadrada painel = new EspiralQuadrada();
		JFrame aplicacao = new JFrame();
		
		aplicacao.add(painel);
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.setSize(400,400);
		aplicacao.setVisible(true);
	}

}
