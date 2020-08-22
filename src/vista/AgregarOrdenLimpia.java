package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import controlador.OOrdenLimpia;
import modelo.MAlmacen;
import modelo.MOrdenLimpia;

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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgregarOrdenLimpia extends JFrame {

	private JPanel contentPane;
	private JTextField tfLoteMezcla;
	private JTextField tfEmpleado;
	private JTextField tfFecha;
	private JTextField tfCodOrd;
	private JTextField tfKg;
	private JTextField tfAlmOrigen;
	private JTextField tfAlmDestino;
	private JTextField tfMerma;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarOrdenLimpia frame = new AgregarOrdenLimpia();
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
	public AgregarOrdenLimpia() {
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
		
		JLabel lblAgregarAlmacn = new JLabel("ORDEN DE LIMPIA");
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
		
		JLabel lblCodOrd = new JLabel("C\u00D3DIGO DE ORDEN");
		lblCodOrd.setOpaque(true);
		lblCodOrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodOrd.setForeground(Color.BLACK);
		lblCodOrd.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCodOrd.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCodOrd.setBackground(Color.ORANGE);
		
		JLabel lblAlmOrigen = new JLabel("ALMACEN DE ORIGEN");
		lblAlmOrigen.setOpaque(true);
		lblAlmOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmOrigen.setForeground(Color.BLACK);
		lblAlmOrigen.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmOrigen.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmOrigen.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla = new JLabel("LOTE DE MEZCLA");
		lblLoteDeMezcla.setOpaque(true);
		lblLoteDeMezcla.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoteDeMezcla.setForeground(Color.BLACK);
		lblLoteDeMezcla.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla.setBackground(Color.ORANGE);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setOpaque(true);
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setForeground(Color.BLACK);
		lblEmpleado.setFont(new Font("SimSun", Font.BOLD, 14));
		lblEmpleado.setBorder(BorderFactory.createLineBorder(Color.black));
		lblEmpleado.setBackground(Color.ORANGE);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setOpaque(true);
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("SimSun", Font.BOLD, 14));
		lblFecha.setBorder(BorderFactory.createLineBorder(Color.black));
		lblFecha.setBackground(Color.ORANGE);
		
		tfLoteMezcla = new JTextField();
		tfLoteMezcla.setText((String) null);
		tfLoteMezcla.setColumns(10);
		
		tfEmpleado = new JTextField();
		tfEmpleado.setText((String) null);
		tfEmpleado.setColumns(10);
		
		tfFecha = new JTextField();
		tfFecha.setText((String) null);
		tfFecha.setColumns(10);
		
		tfCodOrd = new JTextField();
		tfCodOrd.setFocusCycleRoot(true);
		tfCodOrd.setColumns(10);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MOrdenLimpia m=new MOrdenLimpia();
				
				OOrdenLimpia orden=new OOrdenLimpia(Integer.parseInt(tfCodOrd.getText()),Integer.parseInt(tfEmpleado.getText()),
						Double.parseDouble(tfKg.getText()),Integer.parseInt(tfLoteMezcla.getText()),
						ParseFecha(tfFecha.getText()),Integer.parseInt(tfAlmOrigen.getText()),
						Integer.parseInt(tfAlmDestino.getText()),Double.parseDouble(tfMerma.getText()));
				m.setOrdenLimpia(orden);
				
				
				
				
			}
		});
	
		btnagregar.setBackground(Color.ORANGE);
		
		JLabel lblkg = new JLabel("KG");
		lblkg.setOpaque(true);
		lblkg.setHorizontalAlignment(SwingConstants.CENTER);
		lblkg.setForeground(Color.BLACK);
		lblkg.setFont(new Font("SimSun", Font.BOLD, 14));
		lblkg.setBorder(BorderFactory.createLineBorder(Color.black));
		lblkg.setBackground(Color.ORANGE);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.ORANGE);
		
		tfKg = new JTextField();
		tfKg.setText((String) null);
		tfKg.setColumns(10);
		
		tfAlmOrigen = new JTextField();
		tfAlmOrigen.setText((String) null);
		tfAlmOrigen.setColumns(10);
		
		JLabel lblAlmacenDeDestino = new JLabel("ALMACEN DE DESTINO");
		lblAlmacenDeDestino.setOpaque(true);
		lblAlmacenDeDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacenDeDestino.setForeground(Color.BLACK);
		lblAlmacenDeDestino.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacenDeDestino.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacenDeDestino.setBackground(Color.ORANGE);
		
		JLabel lblMerma = new JLabel("MERMA");
		lblMerma.setOpaque(true);
		lblMerma.setHorizontalAlignment(SwingConstants.CENTER);
		lblMerma.setForeground(Color.BLACK);
		lblMerma.setFont(new Font("SimSun", Font.BOLD, 14));
		lblMerma.setBorder(BorderFactory.createLineBorder(Color.black));
		lblMerma.setBackground(Color.ORANGE);
		
		JLabel lblKgTot = new JLabel("---Kg");
		tfAlmDestino = new JTextField();
		tfAlmDestino.setText((String) null);
		tfAlmDestino.setColumns(10);
		
		tfMerma = new JTextField();
		tfMerma.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				
				double kgTotal=(Double.parseDouble(tfKg.getText())-Double.parseDouble(tfMerma.getText()));
				
				lblKgTot.setText(kgTotal+" Kg");
				
			}
		});
		tfMerma.setText((String) null);
		tfMerma.setColumns(10);
		
		JLabel lblKgTotalesDespues = new JLabel("KG TOTALES DESPU\u00C9S DEL PROCESO");
		lblKgTotalesDespues.setOpaque(true);
		lblKgTotalesDespues.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgTotalesDespues.setForeground(Color.BLACK);
		lblKgTotalesDespues.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgTotalesDespues.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgTotalesDespues.setBackground(Color.ORANGE);
		
		
		lblKgTot.setOpaque(true);
		lblKgTot.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgTot.setForeground(Color.BLACK);
		lblKgTot.setFont(new Font("SimSun", Font.BOLD, 20));
		lblKgTot.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgTot.setBackground(Color.ORANGE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblCodOrd, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfCodOrd, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGap(357))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(205))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblLoteDeMezcla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(lblEmpleado, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(lblFecha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(lblkg, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(tfFecha)
									.addComponent(tfEmpleado, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
								.addComponent(tfKg, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfLoteMezcla, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
							.addGap(357))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblAlmOrigen, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfAlmOrigen, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGap(357))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblAlmacenDeDestino, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfAlmDestino, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblMerma, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfMerma, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblKgTotalesDespues, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblKgTot, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
							.addGap(30))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(tfCodOrd, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addComponent(lblCodOrd, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(tfKg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblkg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLoteDeMezcla, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfLoteMezcla, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAlmOrigen, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfAlmOrigen, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAlmacenDeDestino, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfAlmDestino, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(tfMerma, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMerma, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblKgTotalesDespues, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblKgTot, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(148)
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
