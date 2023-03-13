package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal {
	
	JFrame ventana;
	JButton btnConvertir;
	JLabel texto1;
	JTextField campo1;
	
	public VentanaPrincipal() {
		
		ventana = new JFrame();
		ventana.setVisible(true);
		ventana.setBounds(960, 540, 500, 300);
		ventana.setDefaultCloseOperation(3);
		ventana.setTitle("Conversor de Divisas");
		ventana.setLayout(null);
		
		texto1 = new JLabel();
		ventana.add(texto1);
		texto1.setText("Introduzca el valor:");
		texto1.setBounds(45, 20, 200, 30);
		texto1.setFont(new Font("Arial", Font.BOLD, 16));
		
		campo1 = new JTextField();
		ventana.add(campo1);
		campo1.setBounds(250, 20, 200, 30);
		campo1.setFocusable(true);
		
		btnConvertir = new JButton();
		ventana.add(btnConvertir);
		btnConvertir.setBounds(300, 200, 120, 50);
		btnConvertir.setText("CONVERTIR");
		btnConvertir.setFont(new Font("Arial", Font.BOLD, 12));
		
		// lanzador de acciones del mouse
		ventana.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// lanzador de acciones al presionar un boton
		btnConvertir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
