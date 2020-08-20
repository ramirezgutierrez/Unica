package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import modelo.MAlmacen;

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
import java.awt.event.ActionEvent;

public class AgregarPreLimpia extends JFrame {

	private JPanel contentPane;
	private JTextField tfcapacidad;
	private JTextField tfnombre;
	private JTextField tfsituacion;
	private JTextField tfid;
	private JComboBox cbtipo;
	private JComboBox cbubicacion;
	private double kgAlmacenados;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarPreLimpia frame = new AgregarPreLimpia();
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
	public AgregarPreLimpia() {
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
		
		JLabel lblCrearMezclaPreLimpia = new JLabel("CREAR MEZCLA PRE-LIMPIA");
		lblCrearMezclaPreLimpia.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(511)
					.addComponent(lblCrearMezclaPreLimpia, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(lblAgregarProveedor, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAgregarProveedor, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addComponent(lblCrearMezclaPreLimpia, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblId = new JLabel("ID");
		lblId.setOpaque(true);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("SimSun", Font.BOLD, 14));
		lblId.setBorder(BorderFactory.createLineBorder(Color.black));
		lblId.setBackground(Color.ORANGE);
		
		JLabel lblTipo = new JLabel("UBICACI\u00D3N");
		lblTipo.setOpaque(true);
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("SimSun", Font.BOLD, 14));
		lblTipo.setBorder(BorderFactory.createLineBorder(Color.black));
		lblTipo.setBackground(Color.ORANGE);
		
		JLabel lblCapacidad = new JLabel("CAPACIDAD");
		lblCapacidad.setOpaque(true);
		lblCapacidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad.setForeground(Color.BLACK);
		lblCapacidad.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCapacidad.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCapacidad.setBackground(Color.ORANGE);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNombre.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNombre.setBackground(Color.ORANGE);
		
		JLabel lblSituacion = new JLabel("SITUACION");
		lblSituacion.setOpaque(true);
		lblSituacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacion.setForeground(Color.BLACK);
		lblSituacion.setFont(new Font("SimSun", Font.BOLD, 14));
		lblSituacion.setBorder(BorderFactory.createLineBorder(Color.black));
		lblSituacion.setBackground(Color.ORANGE);
		
		tfcapacidad = new JTextField();
		tfcapacidad.setText((String) null);
		tfcapacidad.setColumns(10);
		
		tfnombre = new JTextField();
		tfnombre.setText((String) null);
		tfnombre.setColumns(10);
		
		tfsituacion = new JTextField();
		tfsituacion.setText((String) null);
		tfsituacion.setColumns(10);
		
		tfid = new JTextField();
		tfid.setFocusCycleRoot(true);
		tfid.setColumns(10);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				

				if(tfnombre.getText().length()==0) tfnombre.setText("SIN REGISTRO");
				//if(cbtipo.getSelectedItem().toString().("SIN REGISTRO");
				if(tfcapacidad.getText().length()==0)tfcapacidad.setText("S/R");
				if(tfsituacion.getText().length()==0)tfsituacion.setText("SIN REGISTRO");
				
				
				
				
				
				OAlmacen tempAlm= new OAlmacen(Integer.parseInt((tfid.getText())),tfnombre.getText(),cbtipo.getSelectedItem().toString(),Double.parseDouble(tfcapacidad.getText())
						,tfsituacion.getText(),cbubicacion.getSelectedItem().toString(),kgAlmacenados);
				
				MAlmacen guardar=new MAlmacen();
				guardar.setAlmacenes(tempAlm);
				
				
				int n=JOptionPane.showConfirmDialog(null, "Almacén guardado correctamente\n ¿Quieres agregar otro almacén?.", "Almcén guardado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (n==JOptionPane.YES_OPTION) {
				  tfcapacidad.setText(null);;
				  tfnombre.setText(null);;
				  tfsituacion.setText(null);
				  tfid.setText(null);;
				  
				}else {
					
					
					AgregarPreLimpia.this.dispose();
				}
				
				
				
				
				
				
				
			}
		});
		btnagregar.setBackground(Color.ORANGE);
		
		JLabel lblCdigoPostal = new JLabel("TIPO DE ALMAC\u00C9N");
		lblCdigoPostal.setOpaque(true);
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoPostal.setForeground(Color.BLACK);
		lblCdigoPostal.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCdigoPostal.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCdigoPostal.setBackground(Color.ORANGE);
		
		 cbtipo = new JComboBox();
		cbtipo.setBackground(Color.WHITE);
		cbtipo.setModel(new DefaultComboBoxModel(new String[] {"NAVE", "ERA", "CAMPA", "SILO", "LOCAL", "SUELO"}));
		
		 cbubicacion = new JComboBox();
		cbubicacion.setBackground(Color.WHITE);
		cbubicacion.setModel(new DefaultComboBoxModel(new String[] {"INTERNO", "EXTERNO"}));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.ORANGE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblId, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblTipo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCapacidad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblSituacion, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
								.addComponent(lblCdigoPostal, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(cbubicacion, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(tfcapacidad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
									.addComponent(tfnombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
									.addComponent(tfsituacion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
									.addComponent(cbtipo, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(tfid, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
							.addGap(392))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(205))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(tfid, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addComponent(lblId, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfnombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(cbtipo)
						.addComponent(lblCdigoPostal, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblCapacidad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblSituacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(tfcapacidad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfsituacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(cbubicacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(285))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(494, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnagregar)
						.addComponent(btnCancelar))
					.addGap(75))
		);
		panel_1.setLayout(gl_panel_1);
		
	}
	
}
