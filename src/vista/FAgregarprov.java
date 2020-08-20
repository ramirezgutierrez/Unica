package vista;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Oproveedores;
import modelo.Mproveedores;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.FocusTraversalPolicy;

public class FAgregarprov extends JFrame {

	private JPanel contentPane;
	private JTextField tfid;
	
	
	private JTextField tfnombre;
	
	private JTextField tfrazon=null;
	private JTextField tfcorreo=null;
	private JTextField tfdni=null;
	private JTextField tfdireccion=null;
	private JTextField tfpoblacion=null;
	private JTextField tfciudad=null;
	private JTextField tfpais=null;
	private JTextField tfcp=null;
	private JTextField tffax=null;
	private JTextField tfntp=null;
	private JTextField tfntp_1=null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAgregarprov frame = new FAgregarprov();
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
	public FAgregarprov() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				tfid.requestFocus();
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
		
		JLabel lblAgregarProveedor = new JLabel("AGREGAR PROVEEDOR");
		lblAgregarProveedor.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(758)
					.addComponent(lblAgregarProveedor, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAgregarProveedor, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setOpaque(true);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("SimSun", Font.BOLD, 14));
		lblId.setBorder(BorderFactory.createLineBorder(Color.black));
		lblId.setBackground(Color.ORANGE);
		
		tfid = new JTextField();
		tfid.setFocusCycleRoot(true);
		
		
		tfid.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNombre.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNombre.setBackground(Color.ORANGE);
		
		tfnombre = new JTextField();
		tfnombre.setColumns(10);
		tfnombre.setText(null);
		
		
		JLabel lblRaznSocial = new JLabel("RAZ\u00D3N SOCIAL");
		lblRaznSocial.setOpaque(true);
		lblRaznSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaznSocial.setForeground(Color.BLACK);
		lblRaznSocial.setFont(new Font("SimSun", Font.BOLD, 14));
		lblRaznSocial.setBorder(BorderFactory.createLineBorder(Color.black));
		lblRaznSocial.setBackground(Color.ORANGE);
		
		tfrazon = new JTextField();
		tfrazon.setColumns(10);
		tfrazon.setText(null);
		
		
		JLabel lblCorreoElectrnico = new JLabel("CORREO ELECTR\u00D3NICO");
		lblCorreoElectrnico.setOpaque(true);
		lblCorreoElectrnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoElectrnico.setForeground(Color.BLACK);
		lblCorreoElectrnico.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCorreoElectrnico.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCorreoElectrnico.setBackground(Color.ORANGE);
		
		tfcorreo = new JTextField();
		tfcorreo.setColumns(10);
		tfcorreo.setText(null);
		
		JLabel lblDniCif = new JLabel("D.N.I. / C.I.F.");
		lblDniCif.setOpaque(true);
		lblDniCif.setHorizontalAlignment(SwingConstants.CENTER);
		lblDniCif.setForeground(Color.BLACK);
		lblDniCif.setFont(new Font("SimSun", Font.BOLD, 14));
		lblDniCif.setBorder(BorderFactory.createLineBorder(Color.black));
		lblDniCif.setBackground(Color.ORANGE);
		
		tfdni = new JTextField();
		tfdni.setColumns(10);
		tfdni.setText(null);
		
		JLabel lblDireccin = new JLabel("DIRECCI\u00D3N");
		lblDireccin.setOpaque(true);
		lblDireccin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccin.setForeground(Color.BLACK);
		lblDireccin.setFont(new Font("SimSun", Font.BOLD, 14));
		lblDireccin.setBorder(BorderFactory.createLineBorder(Color.black));
		lblDireccin.setBackground(Color.ORANGE);
		
		JLabel lblPoblacin = new JLabel("POBLACI\u00D3N");
		lblPoblacin.setOpaque(true);
		lblPoblacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoblacin.setForeground(Color.BLACK);
		lblPoblacin.setFont(new Font("SimSun", Font.BOLD, 14));
		lblPoblacin.setBorder(BorderFactory.createLineBorder(Color.black));
		lblPoblacin.setBackground(Color.ORANGE);
		
		JLabel lblCiudad = new JLabel("CIUDAD");
		lblCiudad.setOpaque(true);
		lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudad.setForeground(Color.BLACK);
		lblCiudad.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCiudad.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCiudad.setBackground(Color.ORANGE);
		
		JLabel lblPas = new JLabel("PA\u00CDS");
		lblPas.setOpaque(true);
		lblPas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPas.setForeground(Color.BLACK);
		lblPas.setFont(new Font("SimSun", Font.BOLD, 14));
		lblPas.setBorder(BorderFactory.createLineBorder(Color.black));
		lblPas.setBackground(Color.ORANGE);
		
		JLabel lblCdigoPostal = new JLabel("C\u00D3DIGO POSTAL");
		lblCdigoPostal.setOpaque(true);
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoPostal.setForeground(Color.BLACK);
		lblCdigoPostal.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCdigoPostal.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCdigoPostal.setBackground(Color.ORANGE);
		
		JLabel lblFax = new JLabel("FAX");
		lblFax.setOpaque(true);
		lblFax.setHorizontalAlignment(SwingConstants.CENTER);
		lblFax.setForeground(Color.BLACK);
		lblFax.setFont(new Font("SimSun", Font.BOLD, 14));
		lblFax.setBorder(BorderFactory.createLineBorder(Color.black));
		lblFax.setBackground(Color.ORANGE);
		
		JLabel lblNTelefonoPrincipal = new JLabel("N\u00BA TELEFONO PRINCIPAL");
		lblNTelefonoPrincipal.setOpaque(true);
		lblNTelefonoPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblNTelefonoPrincipal.setForeground(Color.BLACK);
		lblNTelefonoPrincipal.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNTelefonoPrincipal.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNTelefonoPrincipal.setBackground(Color.ORANGE);
		
		JLabel lblNTelefonoSecundario = new JLabel("N\u00BA TELEFONO SECUNDARIO");
		lblNTelefonoSecundario.setOpaque(true);
		lblNTelefonoSecundario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNTelefonoSecundario.setForeground(Color.BLACK);
		lblNTelefonoSecundario.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNTelefonoSecundario.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNTelefonoSecundario.setBackground(Color.ORANGE);
		
		JLabel lblObservaciones = new JLabel("OBSERVACIONES");
		lblObservaciones.setOpaque(true);
		lblObservaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblObservaciones.setForeground(Color.BLACK);
		lblObservaciones.setFont(new Font("SimSun", Font.BOLD, 14));
		lblObservaciones.setBorder(BorderFactory.createLineBorder(Color.black));
		lblObservaciones.setBackground(Color.ORANGE);
		
		tfdireccion = new JTextField();
		tfdireccion.setColumns(10);
		tfdireccion.setText(null);
		
		tfpoblacion = new JTextField();
		tfpoblacion.setColumns(10);
		tfpoblacion.setText(null);
		
		tfciudad = new JTextField();
		tfciudad.setColumns(10);
		tfciudad.setText(null);
		
		
		tfpais = new JTextField();
		tfpais.setColumns(10);
		tfpais.setText(null);
		
		tfcp = new JTextField();
		tfcp.setColumns(10);
		tfcp.setText(null);
		
		tffax = new JTextField();
		tffax.setColumns(10);
		tffax.setText(null);
		
		tfntp = new JTextField();
		tfntp.setColumns(10);
		tfntp.setText(null);
		
		tfntp_1 = new JTextField();
		tfntp_1.setColumns(10);
		tfntp_1.setText(null);
		
		
		JTextArea taobservaciones = new JTextArea();
		taobservaciones.setText(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tfnombre.getText().length()==0) tfnombre.setText("SIN REGISTRO");
				if(tfrazon.getText().length()==0)tfrazon.setText("SIN REGISTRO");
				if(tfdni.getText().length()==0)tfdni.setText("S/R");
				if(tfdireccion.getText().length()==0)tfdireccion.setText("SIN REGISTRO");
				if(tfpoblacion.getText().length()==0)tfpoblacion.setText("SIN REGISTRO");
				if(tfciudad.getText().length()==0)tfciudad.setText("SIN REGISTRO");
				if(tfpais.getText().length()==0)tfpais.setText("SIN REGISTRO");
				if(tfcp.getText().length()==0)tfcp.setText("0");
				if(tfcorreo.getText().length()==0)tfcorreo.setText("SIN REGISTRO");
				if(tffax.getText().length()==0)tffax.setText("0");
				if(tfntp.getText().length()==0)tfntp.setText("0");
				if(tfntp_1.getText().length()==0)tfntp_1.setText("0");
				if(taobservaciones.getText().length()==0)taobservaciones.setText("SIN REGISTRO");
				
				Oproveedores tempprov=new Oproveedores(Integer.parseInt(tfid.getText()), tfnombre.getText(), tfrazon.getText(), tfdni.getText(),
						tfdireccion.getText(), tfpoblacion.getText(),tfciudad.getText(), tfpais.getText(),Integer.parseInt(tfcp.getText()), 
						tfcorreo.getText(), Integer.parseInt(tffax.getText()), Integer.parseInt(tfntp.getText()), 
						Integer.parseInt(tfntp_1.getText()), taobservaciones.getText());
				
				
				Mproveedores guardar=new Mproveedores();
				guardar.setProveedor(tempprov);
				 
				int n=JOptionPane.showConfirmDialog(null, "Proveedor guardado correctamente\n ¿Quieres agregar otro proveedor.", "Proveedor guardado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (n==JOptionPane.YES_OPTION) {
				 tfid.setText(null);
				 tfnombre.setText(null);
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
					
					FAgregarprov.this.dispose();
					
				}
			
			
		
			}
			
		});
		btnagregar.setBackground(Color.ORANGE);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setBackground(Color.ORANGE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblId, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblFax, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblCdigoPostal, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblPas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblCiudad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblPoblacin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblDniCif, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblRaznSocial, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblCorreoElectrnico, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
							.addComponent(lblDireccin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(tfcorreo, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfnombre, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfrazon, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfdni, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfdireccion, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(tfpoblacion, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfciudad, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfpais, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfcp, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(tffax, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
						.addComponent(tfid, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNTelefonoSecundario, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNTelefonoPrincipal, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
						.addComponent(lblObservaciones, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(tfntp, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfntp_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnagregar)
							.addGap(18)
							.addComponent(btncancelar)))
					.addGap(576))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tfntp, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addComponent(lblNTelefonoPrincipal, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addComponent(lblId, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tfid))
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfnombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNTelefonoSecundario, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfntp_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRaznSocial, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfrazon, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblObservaciones, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCorreoElectrnico, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfcorreo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDniCif, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfdni, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDireccin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfdireccion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblPoblacin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(tfpoblacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfciudad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblPas, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblCdigoPostal, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblFax, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(tfpais, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfcp, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(tffax, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnagregar)
										.addComponent(btncancelar)))))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
					.addGap(52))
			
				/*panel_1.setFocusTraversalPolicy(new FocusTaversalOnArray(new Component[] { tfid,tfnombre,tfrazon,tfcorreo,tfdni,tfdireccion,tfpoblacion,
				 tfciudad,tfpais,tfcp,tffax,tfntp,tfntp_1,taobservaciones}));*/
		);
		
		
		scrollPane.setViewportView(taobservaciones);
		panel_1.setLayout(gl_panel_1);
		
	}
	
		
	
}
