package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import controlador.OOrdenTraspaso;
import modelo.MAlmacen;
import modelo.MordenTraspaso;

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

public class AgregarOrdenTraspaso extends JFrame {

	private JPanel contentPane;
	private JTextField tfkg;
	private JTextField tffecha;
	private JTextField tfalmOrigen;
	private JTextField tfcodtras;
	
	private JTextField tfempleado;
	private JTextField tfalmDestino;
	private JTextField tflote;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarOrdenTraspaso frame = new AgregarOrdenTraspaso();
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
	public AgregarOrdenTraspaso() {
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
		
		JLabel lblAgregarAlmacn = new JLabel("ORDEN DE TRASPASO");
		lblAgregarAlmacn.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(558)
					.addComponent(lblAgregarAlmacn, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(lblAgregarProveedor, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAgregarProveedor, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblAgregarAlmacn, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblId = new JLabel("CODIGO DE TRASPASO");
		lblId.setOpaque(true);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("SimSun", Font.BOLD, 14));
		lblId.setBorder(BorderFactory.createLineBorder(Color.black));
		lblId.setBackground(Color.ORANGE);
		
		JLabel lblTipo = new JLabel("ALMACEN DESTINO");
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
		
		JLabel lblNombre = new JLabel("FECHA");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNombre.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNombre.setBackground(Color.ORANGE);
		
		JLabel lblSituacion = new JLabel("ALMACEN ORIGEN");
		lblSituacion.setOpaque(true);
		lblSituacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacion.setForeground(Color.BLACK);
		lblSituacion.setFont(new Font("SimSun", Font.BOLD, 14));
		lblSituacion.setBorder(BorderFactory.createLineBorder(Color.black));
		lblSituacion.setBackground(Color.ORANGE);
		
		tfkg = new JTextField();
		tfkg.setText((String) null);
		tfkg.setColumns(10);
		
		tffecha = new JTextField();
		tffecha.setText((String) null);
		tffecha.setColumns(10);
		
		tfalmOrigen = new JTextField();
		tfalmOrigen.setText((String) null);
		tfalmOrigen.setColumns(10);
		
		tfcodtras = new JTextField();
		tfcodtras.setFocusCycleRoot(true);
		tfcodtras.setColumns(10);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				

				if(tffecha.getText().length()==0) tffecha.setText("01/01/2000");
				//if(cbtipo.getSelectedItem().toString().("SIN REGISTRO");
				if(tfkg.getText().length()==0)tfkg.setText("0");
				if(tfalmOrigen.getText().length()==0)tfalmOrigen.setText("0");
				
				
				
				
				
				OOrdenTraspaso tempTras= new OOrdenTraspaso(Integer.parseInt((tfcodtras.getText())),Integer.parseInt(tfempleado.getText()),Double.parseDouble(tfkg.getText()),
						Integer.parseInt(tflote.getText()),ParseFecha(tffecha.getText()),Integer.parseInt(tfalmOrigen.getText()),Integer.parseInt(tfalmDestino.getText()));
				
				MordenTraspaso guardar=new MordenTraspaso();
				guardar.setOrdenTraspaso(tempTras);
				
				
				int n=JOptionPane.showConfirmDialog(null, "Almacén guardado correctamente\n ¿Quieres agregar otro almacén?.", "Almcén guardado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (n==JOptionPane.YES_OPTION) {
				  tfkg.setText(null);;
				  tffecha.setText(null);;
				  tfalmOrigen.setText(null);
				  tfcodtras.setText(null);;
				  
				}else {
					
					
					AgregarOrdenTraspaso.this.dispose();
				}
				
				
				
				
				
				
				
			}
		});
		btnagregar.setBackground(Color.ORANGE);
		
		JLabel lblCdigoPostal = new JLabel("EMPLEADO");
		lblCdigoPostal.setOpaque(true);
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoPostal.setForeground(Color.BLACK);
		lblCdigoPostal.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCdigoPostal.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCdigoPostal.setBackground(Color.ORANGE);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.ORANGE);
		
		tfempleado = new JTextField();
		tfempleado.setText((String) null);
		tfempleado.setColumns(10);
		
		tfalmDestino = new JTextField();
		tfalmDestino.setText((String) null);
		tfalmDestino.setColumns(10);
		
		JLabel lblLote = new JLabel("LOTE");
		lblLote.setOpaque(true);
		lblLote.setHorizontalAlignment(SwingConstants.CENTER);
		lblLote.setForeground(Color.BLACK);
		lblLote.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLote.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLote.setBackground(Color.ORANGE);
		
		tflote = new JTextField();
		tflote.setText((String) null);
		tflote.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblId, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
								.addComponent(lblCdigoPostal, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(tffecha, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfcodtras, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfempleado, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
							.addGap(392))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(205))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblTipo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblCapacidad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblSituacion, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(tfkg, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
									.addComponent(tfalmOrigen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
								.addComponent(tfalmDestino, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(392, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblLote, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tflote, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(392, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(tfcodtras, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addComponent(lblId, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tffecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCdigoPostal, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfempleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLote, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tflote, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblCapacidad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblSituacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(tfkg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfalmOrigen, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfalmDestino, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(239))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(494, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnagregar)
						.addComponent(btnCancelar))
					.addGap(75))
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
