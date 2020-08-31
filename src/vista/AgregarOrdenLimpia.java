package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OLote;
import controlador.OOrdenLimpia;
import controlador.OOrdenTraspaso;
import modelo.MFiltraLote;
import modelo.MOrdenLimpia;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.sql.SQLException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AgregarOrdenLimpia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField tfCodigo;
	private JTextField tfFecha;
	private JTextField tfEmpleado;
	private JTextField tfMerma;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblAlmacn;
	private JLabel lblKgDisponibles;
	private JLabel lblLoteDeMezcla_2;
	private JLabel lblAlmacn_1;
	private JLabel lblKgDisponibles_1;
	private JLabel lblLoteDeMezcla_2_1;
	private JPanel panel_6;
	private JLabel lblAlmacn_2;
	private JLabel lblKgDisponibles_2;
	private JLabel lblLoteDeMezcla_2_1_1;
	private JPanel panel_7;
	private JLabel lblAlmacn_3;
	private JLabel lblKgDisponibles_3;
	private JLabel lblLoteDeMezcla_2_1_2;
	private JPanel panel_8;
	private JTextField tfpanel7;
	private JLabel lblAlmacn_4;
	private JLabel lblKgDisponibles_4;
	private JLabel lblLoteDeMezcla_2_1_3;
	private JPanel panel_3;
	private JLabel lblAlmacn_5;
	private JLabel lblKgDisponibles_5;
	private JLabel lblLoteDeMezcla_2_1_4;
	private JPanel panel_2;
	private JComboBox cbLote; 
	private JLabel lblTotalKG;
	private JLabel lblKgLimpios;
	private JTextField tfDeposito;
	private List<OLote> listaAlm;
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
					
					
				}
				
			
				
				
				
			}
				
				
			
		});
		cbLote = new JComboBox();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 824);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAgregarAlmacn = new JLabel("ORDEN DE LIMPIA");
		lblAgregarAlmacn.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(566, Short.MAX_VALUE)
					.addComponent(lblAgregarAlmacn, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAgregarAlmacn, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblCodOrd = new JLabel("C\u00D3DIGO DE ORDEN");
		lblCodOrd.setOpaque(true);
		lblCodOrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodOrd.setForeground(Color.BLACK);
		lblCodOrd.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCodOrd.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCodOrd.setBackground(Color.ORANGE);
		lblCodOrd.setBounds(10, 62, 176, 33);
		panel_1.add(lblCodOrd);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setOpaque(true);
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("SimSun", Font.BOLD, 14));
		lblFecha.setBorder(BorderFactory.createLineBorder(Color.black));
		lblFecha.setBackground(Color.ORANGE);
		lblFecha.setBounds(10, 101, 176, 30);
		panel_1.add(lblFecha);
		
		tfCodigo = new JTextField();
		tfCodigo.setFocusCycleRoot(true);
		tfCodigo.setColumns(10);
		tfCodigo.setBounds(196, 62, 167, 33);
		panel_1.add(tfCodigo);
		
		tfFecha = new JTextField();
		tfFecha.setText((String) null);
		tfFecha.setColumns(10);
		tfFecha.setBounds(196, 101, 167, 30);
		panel_1.add(tfFecha);
		
		tfEmpleado = new JTextField();
		tfEmpleado.setText((String) null);
		tfEmpleado.setColumns(10);
		tfEmpleado.setBounds(196, 137, 167, 30);
		panel_1.add(tfEmpleado);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setOpaque(true);
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setForeground(Color.BLACK);
		lblEmpleado.setFont(new Font("SimSun", Font.BOLD, 14));
		lblEmpleado.setBorder(BorderFactory.createLineBorder(Color.black));
		lblEmpleado.setBackground(Color.ORANGE);
		lblEmpleado.setBounds(10, 137, 176, 30);
		panel_1.add(lblEmpleado);
		
		JLabel lblLoteDeMezcla = new JLabel("LOTE");
		lblLoteDeMezcla.setOpaque(true);
		lblLoteDeMezcla.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoteDeMezcla.setForeground(Color.BLACK);
		lblLoteDeMezcla.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla.setBackground(Color.ORANGE);
		lblLoteDeMezcla.setBounds(10, 173, 176, 30);
		panel_1.add(lblLoteDeMezcla);
		
		
		cbLote.setBackground(Color.WHITE);
		cbLote.setBounds(196, 173, 167, 30);
		cbLote.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e1) {
			
			if(e1.getStateChange()==ItemEvent.SELECTED) {
				MOrdenLimpia m=new MOrdenLimpia();
				List<OOrdenLimpia> listalotes=m.getLotesMezcla();
				MFiltraLote m2=new MFiltraLote();
				listaAlm=new ArrayList<OLote>();
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
					
					
					
					
				}
				
				
					
					for(int i=0;i<listaAlm.size();i++) {
						
						if(i==0) {
							panel_4.setVisible(true);
							lblAlmacn.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
							lblKgDisponibles.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
							panel_5.setVisible(false);
							panel_6.setVisible(false);
							panel_7.setVisible(false);
							panel_8.setVisible(false);
							panel_3.setVisible(false);
							repaint();
							revalidate();
						}else if(i==1) {
							
							panel_5.setVisible(true);
							lblAlmacn_1.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
							lblKgDisponibles_1.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
							panel_6.setVisible(false);
							panel_7.setVisible(false);
							panel_8.setVisible(false);
							panel_3.setVisible(false);
							repaint();
							revalidate();
						}else if(i==2) {
							

							panel_6.setVisible(true);
							lblAlmacn_2.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
							lblKgDisponibles_2.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
							panel_7.setVisible(false);
							panel_8.setVisible(false);
							panel_3.setVisible(false);
							repaint();
							revalidate();
							
						}else if(i==3) {
							

							panel_7.setVisible(true);
							lblAlmacn_3.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
							lblKgDisponibles_3.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
							
							panel_8.setVisible(false);
							panel_3.setVisible(false);
							repaint();
							revalidate();
							
						}else if(i==4) {
							

							panel_8.setVisible(true);
							lblAlmacn_4.setText("ALMACÉN: "+listaAlm.get(i).getAlmacen());
							lblKgDisponibles_4.setText("KG DISPONIBLES:"+listaAlm.get(i).getKg()+" KG");
							panel_3.setVisible(false);
							repaint();
							revalidate();
							
						}else if(i==5) {
							

							panel_3.setVisible(true);
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
		panel_1.add(cbLote);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 214, 715, 377);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 1, 0, 0));
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4);
		
		lblAlmacn = new JLabel("ALMAC\u00C9N");
		lblAlmacn.setOpaque(true);
		lblAlmacn.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn.setForeground(Color.BLACK);
		lblAlmacn.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn.setBackground(Color.ORANGE);
		
		lblKgDisponibles = new JLabel("KG DISPONIBLES");
		lblKgDisponibles.setOpaque(true);
		lblKgDisponibles.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles.setForeground(Color.BLACK);
		lblKgDisponibles.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles.setBackground(Color.ORANGE);
		
		lblLoteDeMezcla_2 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2.setOpaque(true);
		lblLoteDeMezcla_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2.setForeground(Color.BLACK);
		lblLoteDeMezcla_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2.setBackground(Color.ORANGE);
		
		JTextField tfpanel4 = new JTextField();
		tfpanel4.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblKgDisponibles, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblLoteDeMezcla_2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfpanel4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAlmacn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKgDisponibles, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLoteDeMezcla_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(2)
							.addComponent(tfpanel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_2.add(panel_5);
		
		lblAlmacn_1 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_1.setOpaque(true);
		lblAlmacn_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_1.setForeground(Color.BLACK);
		lblAlmacn_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_1.setBackground(Color.ORANGE);
		
		lblKgDisponibles_1 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_1.setOpaque(true);
		lblKgDisponibles_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_1.setForeground(Color.BLACK);
		lblKgDisponibles_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_1.setBackground(Color.ORANGE);
		
		lblLoteDeMezcla_2_1 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1.setOpaque(true);
		lblLoteDeMezcla_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1.setBackground(Color.ORANGE);
		
		JTextField tfpanel5 = new JTextField();
		tfpanel5.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblKgDisponibles_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblLoteDeMezcla_2_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfpanel5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(15)
							.addComponent(lblAlmacn_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(15)
							.addComponent(lblKgDisponibles_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(15)
							.addComponent(lblLoteDeMezcla_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(17)
							.addComponent(tfpanel5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_2.add(panel_6);
		
		lblAlmacn_2 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_2.setOpaque(true);
		lblAlmacn_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_2.setForeground(Color.BLACK);
		lblAlmacn_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_2.setBackground(Color.ORANGE);
		
		lblKgDisponibles_2 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_2.setOpaque(true);
		lblKgDisponibles_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_2.setForeground(Color.BLACK);
		lblKgDisponibles_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_2.setBackground(Color.ORANGE);
		
		lblLoteDeMezcla_2_1_1 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_1.setOpaque(true);
		lblLoteDeMezcla_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_1.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_1.setBackground(Color.ORANGE);
		
		JTextField tfpanel6 = new JTextField();
		tfpanel6.setColumns(10);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblKgDisponibles_2, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblLoteDeMezcla_2_1_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfpanel6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(15)
							.addComponent(lblAlmacn_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(15)
							.addComponent(lblKgDisponibles_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(15)
							.addComponent(lblLoteDeMezcla_2_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(17)
							.addComponent(tfpanel6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_6.setLayout(gl_panel_6);
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_2.add(panel_7);
		
		lblAlmacn_3 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_3.setOpaque(true);
		lblAlmacn_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_3.setForeground(Color.BLACK);
		lblAlmacn_3.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_3.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_3.setBackground(Color.ORANGE);
		
		lblKgDisponibles_3 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_3.setOpaque(true);
		lblKgDisponibles_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_3.setForeground(Color.BLACK);
		lblKgDisponibles_3.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_3.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_3.setBackground(Color.ORANGE);
		
		lblLoteDeMezcla_2_1_2 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_2.setOpaque(true);
		lblLoteDeMezcla_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_2.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_2.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_2.setBackground(Color.ORANGE);
		
		tfpanel7 = new JTextField();
		tfpanel7.setColumns(10);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_3, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblKgDisponibles_3, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblLoteDeMezcla_2_1_2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfpanel7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_7.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(15)
							.addComponent(lblAlmacn_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(15)
							.addComponent(lblKgDisponibles_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(15)
							.addComponent(lblLoteDeMezcla_2_1_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(17)
							.addComponent(tfpanel7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		
		panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_2.add(panel_8);
		
		lblAlmacn_4 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_4.setOpaque(true);
		lblAlmacn_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_4.setForeground(Color.BLACK);
		lblAlmacn_4.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_4.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_4.setBackground(Color.ORANGE);
		
		lblKgDisponibles_4 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_4.setOpaque(true);
		lblKgDisponibles_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_4.setForeground(Color.BLACK);
		lblKgDisponibles_4.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_4.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_4.setBackground(Color.ORANGE);
		
		lblLoteDeMezcla_2_1_3 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_3.setOpaque(true);
		lblLoteDeMezcla_2_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_3.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_3.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_3.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_3.setBackground(Color.ORANGE);
		
		JTextField tfpanel8 = new JTextField();
		tfpanel8.setColumns(10);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_4, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblKgDisponibles_4, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblLoteDeMezcla_2_1_3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfpanel8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_8.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(15)
							.addComponent(lblAlmacn_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(15)
							.addComponent(lblKgDisponibles_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(15)
							.addComponent(lblLoteDeMezcla_2_1_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(17)
							.addComponent(tfpanel8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_8.setLayout(gl_panel_8);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		
		lblAlmacn_5 = new JLabel("ALMAC\u00C9N");
		lblAlmacn_5.setOpaque(true);
		lblAlmacn_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacn_5.setForeground(Color.BLACK);
		lblAlmacn_5.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacn_5.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacn_5.setBackground(Color.ORANGE);
		
		lblKgDisponibles_5 = new JLabel("KG DISPONIBLES");
		lblKgDisponibles_5.setOpaque(true);
		lblKgDisponibles_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles_5.setForeground(Color.BLACK);
		lblKgDisponibles_5.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles_5.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles_5.setBackground(Color.ORANGE);
		
		lblLoteDeMezcla_2_1_4 = new JLabel("KG A LIMPIAR: ");
		lblLoteDeMezcla_2_1_4.setOpaque(true);
		lblLoteDeMezcla_2_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoteDeMezcla_2_1_4.setForeground(Color.BLACK);
		lblLoteDeMezcla_2_1_4.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_2_1_4.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_2_1_4.setBackground(Color.ORANGE);
		
		JTextField tfpanel3 = new JTextField();
		tfpanel3.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlmacn_5, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblKgDisponibles_5, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblLoteDeMezcla_2_1_4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfpanel3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(15)
							.addComponent(lblAlmacn_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(15)
							.addComponent(lblKgDisponibles_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(15)
							.addComponent(lblLoteDeMezcla_2_1_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(17)
							.addComponent(tfpanel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblLoteDeMezcla_1 = new JLabel("TOTAL KG A LIMPIAR");
		lblLoteDeMezcla_1.setOpaque(true);
		lblLoteDeMezcla_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoteDeMezcla_1.setForeground(Color.BLACK);
		lblLoteDeMezcla_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_1.setBackground(Color.ORANGE);
		lblLoteDeMezcla_1.setBounds(44, 639, 204, 30);
		panel_1.add(lblLoteDeMezcla_1);
		
		JLabel lblMerma = new JLabel("MERMA");
		lblMerma.setOpaque(true);
		lblMerma.setHorizontalAlignment(SwingConstants.CENTER);
		lblMerma.setForeground(Color.BLACK);
		lblMerma.setFont(new Font("SimSun", Font.BOLD, 14));
		lblMerma.setBorder(BorderFactory.createLineBorder(Color.black));
		lblMerma.setBackground(Color.ORANGE);
		lblMerma.setBounds(257, 639, 78, 30);
		panel_1.add(lblMerma);
		
		tfMerma = new JTextField();
		tfMerma.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
				if(tfpanel3.getText().equals(""))tfpanel3.setText("0");
				if(tfpanel4.getText().equals(""))tfpanel4.setText("0");
				if(tfpanel6.getText().equals(""))tfpanel6.setText("0");
				if(tfpanel7.getText().equals(""))tfpanel7.setText("0");
				if(tfpanel5.getText().equals(""))tfpanel5.setText("0");
				if(tfpanel8.getText().equals(""))tfpanel8.setText("0");
				
				lblTotalKG.setText((Integer.parseInt(tfpanel3.getText())+Integer.parseInt(tfpanel4.getText())+Integer.parseInt(tfpanel5.getText())
						+Integer.parseInt(tfpanel6.getText())+Integer.parseInt(tfpanel7.getText())+Integer.parseInt(tfpanel8.getText()))+"");
				
				
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				lblKgLimpios.setText(""+(Integer.parseInt(lblTotalKG.getText())-Integer.parseInt(tfMerma.getText())));
				
			}
		});
		tfMerma.setBounds(258, 677, 78, 30);
		panel_1.add(tfMerma);
		tfMerma.setColumns(10);
		
		JLabel lblLoteDeMezcla_1_1 = new JLabel("TOTAL KG LIMPIOS");
		lblLoteDeMezcla_1_1.setOpaque(true);
		lblLoteDeMezcla_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoteDeMezcla_1_1.setForeground(Color.BLACK);
		lblLoteDeMezcla_1_1.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLoteDeMezcla_1_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLoteDeMezcla_1_1.setBackground(Color.ORANGE);
		lblLoteDeMezcla_1_1.setBounds(345, 639, 204, 30);
		panel_1.add(lblLoteDeMezcla_1_1);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MOrdenLimpia m=new MOrdenLimpia();
				
				OOrdenLimpia n= new OOrdenLimpia(Integer.parseInt(tfCodigo.getText()), Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(lblTotalKG.getText()), Integer.parseInt(cbLote.getSelectedItem().toString()),
						 ParseFecha(tfFecha.getText()),Integer.parseInt(tfDeposito.getText()), Double.parseDouble(tfMerma.getText()));
				m.setOrdenLimpia(n);
				
				if(tfpanel4.getText().isEmpty()==false) {
				
				OOrdenTraspaso trasp=new OOrdenTraspaso(0, Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(tfpanel4.getText())
						, 0, ParseFecha(tfFecha.getText()), listaAlm.get(0).getAlmacen(), 0);
				m.SetLimpiaProvision(trasp);
				
				}else if (tfpanel5.getText().isEmpty()==false) {
					
					OOrdenTraspaso trasp=new OOrdenTraspaso(0, Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(tfpanel5.getText())
							, 0, ParseFecha(tfFecha.getText()), listaAlm.get(1).getAlmacen(), 0);
					
								m.SetLimpiaProvision(trasp);
				}else if (tfpanel6.getText().isEmpty()==false) {
								
								OOrdenTraspaso trasp=new OOrdenTraspaso(0, Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(tfpanel6.getText())
										, 0, ParseFecha(tfFecha.getText()), listaAlm.get(2).getAlmacen(), 0);
								
											m.SetLimpiaProvision(trasp);
				}else if (tfpanel7.getText().isEmpty()==false) {
					
					OOrdenTraspaso trasp=new OOrdenTraspaso(0, Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(tfpanel7.getText())
							, 0, ParseFecha(tfFecha.getText()), listaAlm.get(3).getAlmacen(), 0);
					
								m.SetLimpiaProvision(trasp);
				}else if (tfpanel8.getText().isEmpty()==false) {
					
					OOrdenTraspaso trasp=new OOrdenTraspaso(0, Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(tfpanel8.getText())
							, 0, ParseFecha(tfFecha.getText()), listaAlm.get(4).getAlmacen(), 0);
					
								m.SetLimpiaProvision(trasp);
				}else if (tfpanel3.getText().isEmpty()==false) {
					
					OOrdenTraspaso trasp=new OOrdenTraspaso(0, Integer.parseInt(tfEmpleado.getText()), Double.parseDouble(tfpanel3.getText())
							, 0, ParseFecha(tfFecha.getText()),listaAlm.get(5).getAlmacen(), 0);
					
								m.SetLimpiaProvision(trasp);
				}
	
	
	
			}
		});
		btnagregar.setBackground(Color.ORANGE);
		btnagregar.setBounds(721, 644, 85, 23);
		panel_1.add(btnagregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.ORANGE);
		btnCancelar.setBounds(719, 681, 87, 23);
		panel_1.add(btnCancelar);
		
		lblTotalKG = new JLabel("--- KG");
		lblTotalKG.setOpaque(true);
		lblTotalKG.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalKG.setForeground(Color.BLACK);
		lblTotalKG.setFont(new Font("SimSun", Font.BOLD, 14));
		lblTotalKG.setBorder(BorderFactory.createLineBorder(Color.black));
		lblTotalKG.setBackground(Color.ORANGE);
		lblTotalKG.setBounds(44, 677, 204, 30);
		panel_1.add(lblTotalKG);
		
		lblKgLimpios = new JLabel("--- KG");
		lblKgLimpios.setOpaque(true);
		lblKgLimpios.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgLimpios.setForeground(Color.BLACK);
		lblKgLimpios.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgLimpios.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgLimpios.setBackground(Color.ORANGE);
		lblKgLimpios.setBounds(346, 677, 204, 30);
		panel_1.add(lblKgLimpios);
		
		JLabel lblDepsitoAcondicionado = new JLabel("DEP. ACONDICIONADO");
		lblDepsitoAcondicionado.setOpaque(true);
		lblDepsitoAcondicionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepsitoAcondicionado.setForeground(Color.BLACK);
		lblDepsitoAcondicionado.setFont(new Font("SimSun", Font.BOLD, 14));
		lblDepsitoAcondicionado.setBorder(BorderFactory.createLineBorder(Color.black));
		lblDepsitoAcondicionado.setBackground(Color.ORANGE);
		lblDepsitoAcondicionado.setBounds(559, 639, 152, 30);
		panel_1.add(lblDepsitoAcondicionado);
		
		tfDeposito = new JTextField();
		tfDeposito.setColumns(10);
		tfDeposito.setBounds(560, 679, 149, 28);
		panel_1.add(tfDeposito);
		
		panel_3.setVisible(false);
		panel_4.setVisible(false);
		panel_5.setVisible(false);
		panel_6.setVisible(false);
		panel_7.setVisible(false);
		panel_8.setVisible(false);
		
		
		
		
		
		
		
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
