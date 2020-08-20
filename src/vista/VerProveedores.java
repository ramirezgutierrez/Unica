package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Oproveedores;
import modelo.Mproveedores;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Font;

public class VerProveedores extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerProveedores frame = new VerProveedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Mproveedores mp=new Mproveedores();
	
	List<Oproveedores> proveedores;{
	
	try {
		proveedores=mp.getProveedores();
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	//Object[] prova=prov.toArray();
	private JTable table;
	
	//proveedores=mp.getProveedores();
	/*try {
		
	}catch (Exception e){
		System.out.println("error");
		
	}*/
	
		
	
	
	
	
	/**
	 * Create the frame.
	 */
	public VerProveedores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 762);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblListaDeProveedores = new JLabel(" LISTA DE PROVEEDORES :");
		lblListaDeProveedores.setOpaque(true);
		lblListaDeProveedores.setForeground(Color.BLACK);
		lblListaDeProveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblListaDeProveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblListaDeProveedores.setBackground(Color.ORANGE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblListaDeProveedores, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblListaDeProveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
		);
		DefaultTableModel model=new DefaultTableModel();
		table = new JTable(model);
		table.setBackground(Color.WHITE);
		
		
		
		model.addColumn( "CÓDIGO PROVEEDOR");
		model.addColumn( "NOMBRE");
		model.addColumn( "RAZÓN SOCIAL");
		model.addColumn( "D.N.I./N.I.F.");
		model.addColumn( "DIRECCIÓN");
		model.addColumn( "POBLACIÓN");
		model.addColumn( "CIUDAD");
		model.addColumn( "PAÍS");
		model.addColumn( "C.P.");
		model.addColumn( "E-MAIL");
		model.addColumn( "FAX");
		model.addColumn( "TELF PRINCIPAL");
		model.addColumn( "TELEFONO SECUNDARIO");
		model.addColumn( "OBSERVACIONES");
		
		
		
	
		for(Oproveedores tempprov : proveedores) {
			
			
			
			model.addRow(new Object[] {tempprov.getId(), tempprov.getNombre(),tempprov.getRazon(),tempprov.getDni(),
						tempprov.getDireccion(),tempprov.getPoblacion(),tempprov.getCiudad(),tempprov.getPais(),tempprov.getCp(), 
						tempprov.getCorreo(), tempprov.getFax(), tempprov.getTelp(), 
						tempprov.getTels(), tempprov.getObservaciones()});
			
			
		}
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
	}
}
