package br.com.erickfreire.espiralquadrada;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha uma espiral quadrada
 * @author Erick Freire
 * @version 1 - Criado em  06-06-2021 as 15:08
 */

public class EspiralQuadrada extends JPanel {
	
	public void paintComponent( Graphics g)
	{
		super.paintComponent( g );
		int passos = 10;
		
		int coordX = getWidth() / 2;
		int coordY = getHeight() / 2;
		
		int coord2X = getWidth() / 2;
		int coord2Y = getHeight() / 2 + ( getHeight() / passos );
		
		g.setColor( Color.blue ); 
		
		for ( int contador = 1; contador  <= 10; contador++ )
		{			
			
			g.drawLine( coordX, coordY, coord2X, coord2Y );
			
			if ( contador % 2 == 1)
			{
				
				coordX -= contador * ( getWidth() / passos );
				coordY += contador * ( getHeight() / passos );
			}
			else
			{
				coordX += contador * ( getWidth() / passos );
				coordY -= contador * ( getHeight() / passos );
			}
			
			g.drawLine( coord2X, coord2Y, coordX, coordY);
			
			if ( contador % 2 == 1)
			{
				coord2X -= contador * ( getWidth() / passos );
				coord2Y -= ( 1 + contador ) * ( getHeight() / passos );
			}
			else
			{
				coord2Y += ( 1 + contador ) * ( getHeight() / passos );
				coord2X += contador * ( getWidth() / passos );
			}
		}
	}

}
