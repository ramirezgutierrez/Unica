package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import controlador.OrdenCompra;
import modelo.MAlmacen;
import modelo.MOrdenCompra;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AgregarOrden extends JFrame {

	private JPanel contentPane;
	private JTextField tfkg;
	private JTextField tfprov;
	private JTextField tfalote;
	private JTextField tfcodcom;
	private double kgAlmacenados=0;
	private JTextField tfalmacen;
	private JTextField tfempleado;
	private JTextField tfmuestras;
	private JTextField tftipodegrano;
	private JTextField tffenvase;
	private JTextField tffecha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarOrden frame = new AgregarOrden();
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
	public AgregarOrden() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 744);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAgregarProveedor = new JLabel("AGREGAR PROVEEDOR");
		lblAgregarProveedor.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblAgregarAlmacn = new JLabel("AGREGAR ORDEN DE COMPRA");
		lblAgregarAlmacn.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(492)
					.addComponent(lblAgregarAlmacn, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(lblAgregarProveedor, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAgregarProveedor, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addComponent(lblAgregarAlmacn, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblId = new JLabel("CODIGO DE COMPRA");
		lblId.setOpaque(true);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("SimSun", Font.BOLD, 14));
		lblId.setBorder(BorderFactory.createLineBorder(Color.black));
		lblId.setBackground(Color.ORANGE);
		
		JLabel lblTipo = new JLabel("ALMACEN");
		lblTipo.setOpaque(true);
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("SimSun", Font.BOLD, 14));
		lblTipo.setBorder(BorderFactory.createLineBorder(Color.black));
		lblTipo.setBackground(Color.ORANGE);
		
		JLabel lblCapacidad = new JLabel("KG");
		lblCapacidad.setOpaque(true);
		lblCapacidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad.setForeground(Color.BLACK);
		lblCapacidad.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCapacidad.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCapacidad.setBackground(Color.ORANGE);
		
		JLabel lblNombre = new JLabel("PROVEEDOR");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNombre.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNombre.setBackground(Color.ORANGE);
		
		JLabel lblSituacion = new JLabel("LOTE");
		lblSituacion.setOpaque(true);
		lblSituacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacion.setForeground(Color.BLACK);
		lblSituacion.setFont(new Font("SimSun", Font.BOLD, 14));
		lblSituacion.setBorder(BorderFactory.createLineBorder(Color.black));
		lblSituacion.setBackground(Color.ORANGE);
		
		tfkg = new JTextField();
		tfkg.setText((String) null);
		tfkg.setColumns(10);
		
		tfprov = new JTextField();
		tfprov.setText((String) null);
		tfprov.setColumns(10);
		
		tfalote = new JTextField();
		tfalote.setText((String) null);
		tfalote.setColumns(10);
		
		tfcodcom = new JTextField();
		tfcodcom.setFocusCycleRoot(true);
		tfcodcom.setColumns(10);
		
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
				if(tffenvase.getText().length()==0)tffenvase.setText("0");
				
				
				
				OrdenCompra tempcompra=new OrdenCompra(Integer.parseInt(tfcodcom.getText()),Integer.parseInt(tfprov.getText()), Double.parseDouble(tfkg.getText()),
						Integer.parseInt(tfalote.getText()),0,Integer.parseInt(tfalmacen.getText()), Integer.parseInt(tfempleado.getText()),tfmuestras.getText(),
						ParseFecha(tffecha.getText()), tftipodegrano.getText(),tffenvase.getText() );
				
				
				MOrdenCompra guardar=new MOrdenCompra();
				guardar.setOrdenCompra(tempcompra);
				
				int n=JOptionPane.showConfirmDialog(null, "Orden efectuada correctamente\n ¿Quieres agregar otra orden?.", "Orden efectuada", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (n==JOptionPane.YES_OPTION) {
				
				  
				}else {
					
					
					AgregarOrden.this.dispose();
				}
				
				
				
				
				
				
				
			}
		});
		btnagregar.setBackground(Color.ORANGE);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.ORANGE);
		
		tfalmacen = new JTextField();
		tfalmacen.setText((String) null);
		tfalmacen.setColumns(10);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setOpaque(true);
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setForeground(Color.BLACK);
		lblEmpleado.setFont(new Font("SimSun", Font.BOLD, 14));
		lblEmpleado.setBorder(BorderFactory.createLineBorder(Color.black));
		lblEmpleado.setBackground(Color.ORANGE);
		
		JLabel lblMuestras = new JLabel("MUESTRAS");
		lblMuestras.setOpaque(true);
		lblMuestras.setHorizontalAlignment(SwingConstants.CENTER);
		lblMuestras.setForeground(Color.BLACK);
		lblMuestras.setFont(new Font("SimSun", Font.BOLD, 14));
		lblMuestras.setBorder(BorderFactory.createLineBorder(Color.black));
		lblMuestras.setBackground(Color.ORANGE);
		
		JLabel lblTipoDeGrano = new JLabel("TIPO DE GRANO");
		lblTipoDeGrano.setOpaque(true);
		lblTipoDeGrano.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeGrano.setForeground(Color.BLACK);
		lblTipoDeGrano.setFont(new Font("SimSun", Font.BOLD, 14));
		lblTipoDeGrano.setBorder(BorderFactory.createLineBorder(Color.black));
		lblTipoDeGrano.setBackground(Color.ORANGE);
		
		JLabel lblEnvase = new JLabel("ENVASE");
		lblEnvase.setOpaque(true);
		lblEnvase.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnvase.setForeground(Color.BLACK);
		lblEnvase.setFont(new Font("SimSun", Font.BOLD, 14));
		lblEnvase.setBorder(BorderFactory.createLineBorder(Color.black));
		lblEnvase.setBackground(Color.ORANGE);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setOpaque(true);
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("SimSun", Font.BOLD, 14));
		lblFecha.setBorder(BorderFactory.createLineBorder(Color.black));
		lblFecha.setBackground(Color.ORANGE);
		
		tfempleado = new JTextField();
		tfempleado.setText((String) null);
		tfempleado.setColumns(10);
		
		tfmuestras = new JTextField();
		tfmuestras.setText((String) null);
		tfmuestras.setColumns(10);
		
		tftipodegrano = new JTextField();
		tftipodegrano.setText((String) null);
		tftipodegrano.setColumns(10);
		
		tffenvase = new JTextField();
		tffenvase.setText((String) null);
		tffenvase.setColumns(10);
		
		tffecha = new JTextField();
		tffecha.setText((String) null);
		tffecha.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblId, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblTipo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCapacidad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblSituacion, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
								.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(tfkg, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
									.addComponent(tfprov, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
									.addComponent(tfalote, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(tfcodcom, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
									.addGap(125)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(tffecha)
										.addComponent(lblFecha, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
								.addComponent(tfalmacen, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
							.addGap(24))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblEnvase, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tffenvase, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfempleado, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(340, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblMuestras, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfmuestras, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(340, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblTipoDeGrano, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tftipodegrano, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(340, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(54))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(tfcodcom)
								.addComponent(lblId, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfprov, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblCapacidad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblSituacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(tfkg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfalote, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfalmacen, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tffecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfempleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMuestras, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfmuestras, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTipoDeGrano, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tftipodegrano, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblEnvase, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(93))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(tffenvase, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnagregar)
								.addComponent(btnCancelar))
							.addGap(34))))
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
