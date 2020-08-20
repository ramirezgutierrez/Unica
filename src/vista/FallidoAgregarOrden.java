package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import controlador.OrdenCompra;
import modelo.MOrdenCompra;

public class FallidoAgregarOrden extends JFrame {

	private JPanel contentPane;
	private JTextField tfcodcom;
	
	
	private JTextField tfprov=null;
	private JTextField tfkg=null;
	private JTextField tfalote=null;
	private JTextField tfalmacen=null;
	private JTextField tfempleado=null;
	private JTextField tfmuestras=null;
	private JTextField tffecha=null;
	private JTextField tftipodegrano=null;
	private JTextField tfenvase=null;
//	private JTextField tfdni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FallidoAgregarOrden frame = new FallidoAgregarOrden();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FallidoAgregarOrden() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				tfcodcom.requestFocus();
			}
		});
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 669);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAgregarProveedor = new JLabel("ORDEN DE COMPRA");
		lblAgregarProveedor.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		/*GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(736)
					.addComponent(lblAgregarProveedor, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAgregarProveedor, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);*/
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("C\u00D3DIGO DE COMPRA");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setOpaque(true);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("SimSun", Font.BOLD, 14));
		lblId.setBorder(BorderFactory.createLineBorder(Color.black));
		lblId.setBackground(Color.ORANGE);
		
		tfcodcom = new JTextField();
		tfcodcom.setFocusCycleRoot(true);
		
		
		tfcodcom.setColumns(10);
		
		JLabel lblNombre = new JLabel("PROVEEDOR");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNombre.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNombre.setBackground(Color.ORANGE);
		
		
		
		
		JLabel lblRaznSocial = new JLabel("KG");
		lblRaznSocial.setOpaque(true);
		lblRaznSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaznSocial.setForeground(Color.BLACK);
		lblRaznSocial.setFont(new Font("SimSun", Font.BOLD, 14));
		lblRaznSocial.setBorder(BorderFactory.createLineBorder(Color.black));
		lblRaznSocial.setBackground(Color.ORANGE);
		
		tfkg = new JTextField();
		tfkg.setColumns(10);
		tfkg.setText(null);
		
		
		JLabel lblCorreoElectrnico = new JLabel("LOTE");
		lblCorreoElectrnico.setOpaque(true);
		lblCorreoElectrnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoElectrnico.setForeground(Color.BLACK);
		lblCorreoElectrnico.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCorreoElectrnico.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCorreoElectrnico.setBackground(Color.ORANGE);
		
		tfalote = new JTextField();
		tfalote.setColumns(10);
		tfalote.setText(null);
		
		JLabel lblDniCif = new JLabel("ALMACEN");
		lblDniCif.setOpaque(true);
		lblDniCif.setHorizontalAlignment(SwingConstants.CENTER);
		lblDniCif.setForeground(Color.BLACK);
		lblDniCif.setFont(new Font("SimSun", Font.BOLD, 14));
		lblDniCif.setBorder(BorderFactory.createLineBorder(Color.black));
		lblDniCif.setBackground(Color.ORANGE);
		
		
		
		JLabel lblDireccin = new JLabel("EMPLEADO");
		lblDireccin.setOpaque(true);
		lblDireccin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccin.setForeground(Color.BLACK);
		lblDireccin.setFont(new Font("SimSun", Font.BOLD, 14));
		lblDireccin.setBorder(BorderFactory.createLineBorder(Color.black));
		lblDireccin.setBackground(Color.ORANGE);
		
		JLabel lblPoblacin = new JLabel("MUESTRAS");
		lblPoblacin.setOpaque(true);
		lblPoblacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoblacin.setForeground(Color.BLACK);
		lblPoblacin.setFont(new Font("SimSun", Font.BOLD, 14));
		lblPoblacin.setBorder(BorderFactory.createLineBorder(Color.black));
		lblPoblacin.setBackground(Color.ORANGE);
		
		JLabel lblCiudad = new JLabel("FECHA");
		lblCiudad.setOpaque(true);
		lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudad.setForeground(Color.BLACK);
		lblCiudad.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCiudad.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCiudad.setBackground(Color.ORANGE);
		
		JLabel lblPas = new JLabel("TIPO DE GRANO");
		lblPas.setOpaque(true);
		lblPas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPas.setForeground(Color.BLACK);
		lblPas.setFont(new Font("SimSun", Font.BOLD, 14));
		lblPas.setBorder(BorderFactory.createLineBorder(Color.black));
		lblPas.setBackground(Color.ORANGE);
		
		JLabel lblCdigoPostal = new JLabel("ENVASE");
		lblCdigoPostal.setOpaque(true);
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoPostal.setForeground(Color.BLACK);
		lblCdigoPostal.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCdigoPostal.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCdigoPostal.setBackground(Color.ORANGE);
		
		tfempleado = new JTextField();
		tfempleado.setColumns(10);
		tfempleado.setText(null);
		
		tfmuestras = new JTextField();
		tfmuestras.setColumns(10);
		tfmuestras.setText(null);
		
		tffecha = new JTextField();
		tffecha.setColumns(10);
		tffecha.setText(null);
		
		
		tftipodegrano = new JTextField();
		tftipodegrano.setColumns(10);
		tftipodegrano.setText(null);
		
		tfenvase = new JTextField();
		tfenvase.setColumns(10);
		tfenvase.setText(null);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tfcodcom.getText().length()==0) tfcodcom.setText("SIN REGISTRO");
				if(tfprov.getText().length()==0)tfprov.setText("SIN REGISTRO");
				if(tfkg.getText().length()==0)tfkg.setText("S/R");
				if(tfalote.getText().length()==0)tfalote.setText("SIN REGISTRO");
				if(tfalmacen.getText().length()==0)tfalmacen.setText("SIN REGISTRO");
				if(tfempleado.getText().length()==0)tfempleado.setText("SIN REGISTRO");
				if(tfmuestras.getText().length()==0)tfmuestras.setText("SIN REGISTRO");
				if(tffecha.getText().length()==0)tffecha.setText("01/01/00");
				if(tftipodegrano.getText().length()==0)tftipodegrano.setText("SIN REGISTRO");
				if(tfenvase.getText().length()==0)tfenvase.setText("0");
				
				
				
				OrdenCompra tempcompra=new OrdenCompra(Integer.parseInt(tfcodcom.getText()),Integer.parseInt(tfprov.getText()), Double.parseDouble(tfkg.getText()),
						Integer.parseInt(tfalote.getText()),0,Integer.parseInt(tfalmacen.getText()), Integer.parseInt(tfempleado.getText()),tfmuestras.getText(),
						ParseFecha(tffecha.getText()), tftipodegrano.getText(),tfenvase.getText() );
				
				
				MOrdenCompra guardar=new MOrdenCompra();
				guardar.setOrdenCompra(tempcompra);
				 
				int n=JOptionPane.showConfirmDialog(null, "Proveedor guardado correctamente\n ¿Quieres agregar otro proveedor.", "Proveedor guardado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				/*if (n==JOptionPane.YES_OPTION) {
				 tfcodcom.setText(null);
				 tfprov.setText(null);
				 tfrazon.setText(null);
				 tfcorreo.setText(null);
				 tfdni.setText(null);
				 tfdireccion.setText(null);
				 tfpoblacion.setText(null);
				 tfciudad.setText(null);
				 tfpais.setText(null);
				 tfcp.setText(null);
				 tffax.setText(null);
				 tfntp.setText(null);
				 tfntp_1.setText(null);
				 taobservaciones.setText(null);
				 
			
				 
				 
				
				}else {	
					
					AgregarOrdenCompra.this.dispose();
					
				}*/
			
			
		
			}
			
		});
		btnagregar.setBackground(Color.ORANGE);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setBackground(Color.ORANGE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(845, Short.MAX_VALUE)
					.addComponent(lblAgregarProveedor)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblAgregarProveedor))
		);
		panel.setLayout(gl_panel);
		
		panel_1.add(tfprov);
		panel_1.add(tfalmacen);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGap(255)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						
						.addComponent(tfempleado, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(tffecha, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDniCif, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfkg, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(tftipodegrano, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorreoElectrnico, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPas, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCdigoPostal, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(btncancelar, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfmuestras, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfenvase, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfalote, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDireccin, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPoblacin, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRaznSocial, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(255)
							.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(531, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGap(95)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addComponent(tfempleado, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(tffecha, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(lblDniCif, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(tfkg, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(tftipodegrano, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(lblCorreoElectrnico, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95)
						.addGap(95)
						.addComponent(lblPas, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(lblCdigoPostal, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(btncancelar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(tfmuestras, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(tfenvase, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(tfalote, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(lblDireccin, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(lblPoblacin, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(95).addGap(95)
						.addComponent(lblRaznSocial, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addGap(95)
					.addGap(95)
					.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(95))
		);
		panel_1.setLayout(gl_panel_1);
			
	}
	public static Date ParseFecha(String fecha) {
		
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
		Date fechaDate= null;
		try {
			fechaDate=formato.parse(fecha);
		}catch(ParseException ex) {
			System.out.println(ex);
		}
	return fechaDate;	
	}
	}
	
		

