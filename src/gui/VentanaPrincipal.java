package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import converter.Conversor;
import converter.Divisa;

public class VentanaPrincipal {
	
	JFrame ventana;
	JButton btnConvertir;
	JLabel texto, textoResultado;
	JTextField campo1;
	JComboBox<String> comboBox1, comboBox2;
	Conversor conversor;
	int divisa1, divisa2;
	double resultadoDouble;
	String resultadoString;
	String valorRecibidoString;
	double valorRecibidoDouble;
	
	public VentanaPrincipal() {
		
		conversor = new Conversor();
				
		ventana = new JFrame();
		ventana.setVisible(true);
		ventana.setBounds(960, 540, 600, 350);
		ventana.setDefaultCloseOperation(3);
		ventana.setTitle("Conversor de Divisas");
		ventana.setLayout(null);
		
		texto("Introduzca el valor:", 45, 120, 200, 30);
		texto("Convertir:", 45, 10, 200, 30);
		texto("a", 257, 40, 50, 30);
		botonConvertir(190, 250, 120, 50);
		cajaVerResultado(250, 200, 200, 30);
		
		campo1 = new JTextField();
		ventana.add(campo1);
		campo1.setBounds(250, 120, 200, 30);
		campo1.setFocusable(true);
		
		// combo box 1
		comboBox1 = new JComboBox<String>();
		ventana.add(comboBox1);
		comboBox1.setBounds(45, 40, 200, 30);
		comboBox1.addItem("--");
		for (Divisa divisa : Divisa.values()) {
			comboBox1.addItem(divisa.name());
		}
		comboBox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				divisa1 = comboBox1.getSelectedIndex();
				System.out.println(comboBox1.getSelectedIndex());
				if(comboBox1.getSelectedItem() != Divisa.PESO_ARG.name()) {
					comboBox2.setSelectedItem(Divisa.PESO_ARG.name());
					comboBox2.setEnabled(false);
				}else if(comboBox1.getSelectedItem() == Divisa.PESO_ARG.name()) {
					comboBox2.setEnabled(true);
				}
			}
		});
		
		// combo box 2
		comboBox2 = new JComboBox<String>();
		ventana.add(comboBox2);
		comboBox2.setBounds(280, 40, 200, 30);
		comboBox2.addItem("--");
		for (Divisa divisa : Divisa.values()) {
			comboBox2.addItem(divisa.name());
		}
		comboBox2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				divisa2 = comboBox2.getSelectedIndex();
				System.out.println(comboBox2.getSelectedIndex());
			}
		});
		
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
				valorRecibidoString = campo1.getText();
				//System.out.println(valorRecibidoString);
				valorRecibidoDouble = Double.parseDouble(valorRecibidoString);
				//System.out.println(valorRecibidoDouble);
				System.out.println(comboBox1.getSelectedItem());
				System.out.println(comboBox1.getSelectedItem() != Divisa.PESO_ARG.name());
				System.out.println(comboBox1.getSelectedItem());
				System.out.println(Divisa.PESO_ARG.name());
				
				if(comboBox1.getSelectedItem() != Divisa.PESO_ARG.name()) {
					conversor.convertirMonedaExtanjeraAPeso(divisa1, valorRecibidoDouble);
				}else {
					conversor.convertirPesoAMonedaExtanjera(divisa2, valorRecibidoDouble);
				}
				
				resultadoDouble = conversor.getValorConvertido();
				resultadoString = Double.toString(resultadoDouble);		
				textoResultado.setText(resultadoString);
			}
		});	
	}
	
	public void texto(String text, int x, int y, int largo, int ancho) {
		texto = new JLabel();
		ventana.add(texto);
		texto.setText(text);
		texto.setBounds(x, y, largo, ancho);
		texto.setFont(new Font("Arial", Font.BOLD, 16));
	}
	
	public void cajaVerResultado(int x, int y, int largo, int ancho) {
		textoResultado = new JLabel();
		ventana.add(textoResultado);
//		texto2.setText(resultadoString);
		textoResultado.setBounds(x, y, largo, ancho);
		textoResultado.setFont(new Font("Arial", Font.BOLD, 16));
		textoResultado.setOpaque(true);
		textoResultado.setBackground(Color.WHITE);
	}
	
	public void botonConvertir(int x, int y, int largo, int ancho) {
		btnConvertir = new JButton();
		ventana.add(btnConvertir);
		btnConvertir.setBounds(x, y, largo, ancho);
		btnConvertir.setText("CONVERTIR");
		btnConvertir.setFont(new Font("Arial", Font.BOLD, 12));
	}
}
