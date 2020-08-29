package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import controlador.OLote;
import controlador.OOrdenLimpia;
import modelo.MAlmacen;
import modelo.MFiltraLote;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.GridLayout;

public class AgregarOrdenLimpia extends JFrame {

	private JPanel contentPane;
	private JTextField tfEmpleado;
	private JTextField tfFecha;
	private JTextField tfCodOrd;
	private JComboBox cbLote; 
	private JTextField tfAlimpiar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
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
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				
				MOrdenLimpia m=new MOrdenLimpia();
				List<OOrdenLimpia> listalotes=m.getLotesMezcla();
				
				for (int i=0;i<listalotes.size();i++) {
					
					cbLote.addItem(listalotes.get(i).getLote());
					
					System.out.println("lote: "+listalotes.get(i).getLote());
				}
				
			
				
				
				
			}
		});
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
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblCodOrd = new JLabel("C\u00D3DIGO DE ORDEN");
		lblCodOrd.setOpaque(true);
		lblCodOrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodOrd.setForeground(Color.BLACK);
		lblCodOrd.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCodOrd.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCodOrd.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla = new JLabel("LOTE");
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
				
		}});
		/*if(listaAlm!=null) {
		panel_2.setLayout(new GridLayout(listaAlm.size(), 1, 0, 0));
		}else {
			panel_2.setLayout(new GridLayout(1, 1, 0, 0));
			panel_2.setVisible(false);
		}*/
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		
		panel_2.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		
		
		JLabel lblAlmacn = new JLabel("ALMAC\u00C9N");
		lblAlmacn.setOpaque(true);
		lblAlmacn.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn.setForeground(Color.BLACK);
		lblAlmacn.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn.setBackground(Color.ORANGE);
		
		JLabel lblKgDisponibles = new JLabel("KG DISPONIBLES");
		lblKgDisponibles.setOpaque(true);
		lblKgDisponibles.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles.setForeground(Color.BLACK);
		lblKgDisponibles.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles.setBackground(Color.ORANGE);
		
		tfAlimpiar = new JTextField();
		tfAlimpiar.setColumns(10);
		
		JLabel lblLoteDeMezcla_2_1 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1.setOpaque(true);
		lblLoteDeMezcla_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1.setBackground(Color.ORANGE);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDisponibles, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(lblLoteDeMezcla_2_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tfAlimpiar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblKgDisponibles, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(tfAlimpiar, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblLoteDeMezcla_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAlmacn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
	
		btnagregar.setBackground(Color.ORANGE);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.ORANGE);
		
		cbLote = new JComboBox();
		
		cbLote.setBackground(Color.WHITE);
		
		
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblCodOrd, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
										.addComponent(lblFecha, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(tfCodOrd)
										.addComponent(tfFecha, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
									.addGap(59))
								.addComponent(btnagregar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(205))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblEmpleado, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(tfEmpleado, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(357))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblLoteDeMezcla, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(cbLote, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(357))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(tfCodOrd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodOrd, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFecha, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(cbLote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLoteDeMezcla, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnagregar)
						.addComponent(btnCancelar))
					.addGap(75))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_2.add(panel_3_1);
		
		JLabel lblAlmacn_1 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_1.setOpaque(true);
		lblAlmacn_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_1.setForeground(Color.BLACK);
		lblAlmacn_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_1.setBackground(Color.ORANGE);
		
		JLabel lblKgDisponibles_1 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_1.setOpaque(true);
		lblKgDisponibles_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_1.setForeground(Color.BLACK);
		lblKgDisponibles_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_1.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla_2_1_1 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_1.setOpaque(true);
		lblLoteDeMezcla_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_1.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_1.setBackground(Color.ORANGE);
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_panel_3_1 = new GroupLayout(panel_3_1);
		gl_panel_3_1.setHorizontalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDisponibles_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(lblLoteDeMezcla_2_1_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3_1.setVerticalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblKgDisponibles_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_3_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblLoteDeMezcla_2_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAlmacn_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_3_1.setLayout(gl_panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		panel_2.add(panel_3_2);
		
		JLabel lblAlmacn_2 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_2.setOpaque(true);
		lblAlmacn_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_2.setForeground(Color.BLACK);
		lblAlmacn_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_2.setBackground(Color.ORANGE);
		
		JLabel lblKgDisponibles_2 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_2.setOpaque(true);
		lblKgDisponibles_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_2.setForeground(Color.BLACK);
		lblKgDisponibles_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_2.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla_2_1_2 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_2.setOpaque(true);
		lblLoteDeMezcla_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_2.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_2.setBackground(Color.ORANGE);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel_3_2 = new GroupLayout(panel_3_2);
		gl_panel_3_2.setHorizontalGroup(
			gl_panel_3_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(gl_panel_3_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDisponibles_2, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(lblLoteDeMezcla_2_1_2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3_2.setVerticalGroup(
			gl_panel_3_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGroup(gl_panel_3_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblKgDisponibles_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_3_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblLoteDeMezcla_2_1_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAlmacn_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_3_2.setLayout(gl_panel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.WHITE);
		panel_2.add(panel_3_3);
		
		JLabel lblAlmacn_3 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_3.setOpaque(true);
		lblAlmacn_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_3.setForeground(Color.BLACK);
		lblAlmacn_3.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_3.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_3.setBackground(Color.ORANGE);
		
		JLabel lblKgDisponibles_3 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_3.setOpaque(true);
		lblKgDisponibles_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_3.setForeground(Color.BLACK);
		lblKgDisponibles_3.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_3.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_3.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla_2_1_3 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_3.setOpaque(true);
		lblLoteDeMezcla_2_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_3.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_3.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_3.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_3.setBackground(Color.ORANGE);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout gl_panel_3_3 = new GroupLayout(panel_3_3);
		gl_panel_3_3.setHorizontalGroup(
			gl_panel_3_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(gl_panel_3_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_3, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDisponibles_3, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(lblLoteDeMezcla_2_1_3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3_3.setVerticalGroup(
			gl_panel_3_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGroup(gl_panel_3_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblKgDisponibles_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_3_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblLoteDeMezcla_2_1_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAlmacn_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_3_3.setLayout(gl_panel_3_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(Color.WHITE);
		panel_2.add(panel_3_4);
		
		JLabel lblAlmacn_4 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_4.setOpaque(true);
		lblAlmacn_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_4.setForeground(Color.BLACK);
		lblAlmacn_4.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_4.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_4.setBackground(Color.ORANGE);
		
		JLabel lblKgDisponibles_4 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_4.setOpaque(true);
		lblKgDisponibles_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_4.setForeground(Color.BLACK);
		lblKgDisponibles_4.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_4.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_4.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla_2_1_4 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_4.setOpaque(true);
		lblLoteDeMezcla_2_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_4.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_4.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_4.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_4.setBackground(Color.ORANGE);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout gl_panel_3_4 = new GroupLayout(panel_3_4);
		gl_panel_3_4.setHorizontalGroup(
			gl_panel_3_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(gl_panel_3_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_4, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDisponibles_4, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(lblLoteDeMezcla_2_1_4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3_4.setVerticalGroup(
			gl_panel_3_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGroup(gl_panel_3_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblKgDisponibles_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_3_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblLoteDeMezcla_2_1_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAlmacn_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_3_4.setLayout(gl_panel_3_4);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBackground(Color.WHITE);
		panel_2.add(panel_3_5);
		
		JLabel lblAlmacn_5 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_5.setOpaque(true);
		lblAlmacn_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_5.setForeground(Color.BLACK);
		lblAlmacn_5.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_5.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_5.setBackground(Color.ORANGE);
		
		JLabel lblKgDisponibles_5 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_5.setOpaque(true);
		lblKgDisponibles_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_5.setForeground(Color.BLACK);
		lblKgDisponibles_5.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_5.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_5.setBackground(Color.ORANGE);
		
		JLabel lblLoteDeMezcla_2_1_5 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_5.setOpaque(true);
		lblLoteDeMezcla_2_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_5.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_5.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_5.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_5.setBackground(Color.ORANGE);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_panel_3_5 = new GroupLayout(panel_3_5);
		gl_panel_3_5.setHorizontalGroup(
			gl_panel_3_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(gl_panel_3_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_5, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDisponibles_5, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(lblLoteDeMezcla_2_1_5, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3_5.setVerticalGroup(
			gl_panel_3_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGroup(gl_panel_3_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3_5.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblKgDisponibles_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_3_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblLoteDeMezcla_2_1_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAlmacn_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_3.setVisible(false);
		panel_3_1.setVisible(false);
		panel_3_2.setVisible(false);
		panel_3_3.setVisible(false);
		panel_3_4.setVisible(false);
		panel_3_5.setVisible(false);
		cbLote.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e1) {
				
				if(e1.getStateChange()==ItemEvent.SELECTED) {
					MOrdenLimpia m=new MOrdenLimpia();
					List<OOrdenLimpia> listalotes=m.getLotesMezcla();
					MFiltraLote m2=new MFiltraLote();
					List<OLote> listaAlm=new ArrayList<OLote>();
					for (int i=0;i<listalotes.size();i++) {
						
						
					if(Integer.parseInt(cbLote.getSelectedItem().toString())==(listalotes.get(i).getLote())) {
						
						
						
						if(listalotes.get(i).getTipo()==1) {
							
						
							try {
								listaAlm=m.getkgLotecreado(Integer.parseInt(cbLote.getSelectedItem().toString()));
							} catch (NumberFormatException | SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							

						
						}else if(listalotes.get(i).getTipo()==2){
					
							try {
								listaAlm=m.getKgLoteComprado(Integer.parseInt(cbLote.getSelectedItem().toString()));
							} catch (NumberFormatException | SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							
						}
						
						
						
					}
						
					}
					
					for(int j=0;j<listaAlm.size();j++) {
						
						System.out.println(listaAlm.toString());
						
						
					}
					
					
						
						for(int i=0;i<listaAlm.size();i++) {
							
							if(i==0) {
								panel_3.setVisible(true);
								lblAlmacn.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
								lblKgDisponibles.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
								panel_3_1.setVisible(false);
								panel_3_2.setVisible(false);
								panel_3_3.setVisible(false);
								panel_3_4.setVisible(false);
								panel_3_5.setVisible(false);
								repaint();
								revalidate();
							}else if(i==1) {
								
								panel_3_1.setVisible(true);
								lblAlmacn_1.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
								lblKgDisponibles_1.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
								panel_3_2.setVisible(false);
								panel_3_3.setVisible(false);
								panel_3_4.setVisible(false);
								panel_3_5.setVisible(false);
								repaint();
								revalidate();
							}else if(i==2) {
								

								panel_3_2.setVisible(true);
								lblAlmacn_2.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
								lblKgDisponibles_2.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
								panel_3_3.setVisible(false);
								panel_3_4.setVisible(false);
								panel_3_5.setVisible(false);
								repaint();
								revalidate();
								
							}else if(i==3) {
								

								panel_3_3.setVisible(true);
								lblAlmacn_3.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
								lblKgDisponibles_3.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
								
								panel_3_4.setVisible(false);
								panel_3_5.setVisible(false);
								repaint();
								revalidate();
								
							}else if(i==4) {
								

								panel_3_4.setVisible(true);
								lblAlmacn_4.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
								lblKgDisponibles_4.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
								panel_3_5.setVisible(false);
								repaint();
								revalidate();
								
							}else if(i==5) {
								

								panel_3_5.setVisible(true);
								lblAlmacn_5.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
								lblKgDisponibles_5.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
								repaint();
								revalidate();
								
							}
							
							
							panel_2.repaint();
							panel_2.revalidate();
						
						
						
					}
						
				
					
					
					
					
				}
						
					
					}	
					
				
				
				
		
			
		});
		panel_3_5.setLayout(gl_panel_3_5);
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
