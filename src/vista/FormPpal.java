package vista;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.border.Border;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPpal  {

	private JFrame frmFlowIntegralSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPpal window = new FormPpal();
					window.frmFlowIntegralSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			
			
			
			
			
			
			
			
			
			
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormPpal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFlowIntegralSystem = new JFrame();
		
		
		frmFlowIntegralSystem.setTitle("Flow Integral System");
		frmFlowIntegralSystem.setUndecorated(false);
		frmFlowIntegralSystem.setExtendedState(frmFlowIntegralSystem.MAXIMIZED_BOTH);
		frmFlowIntegralSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				int xx = e.getXOnScreen();
				int yy=e.getYOnScreen();
				frmFlowIntegralSystem.setLocation(xx-x,yy-y);
				
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			
			
		
			
			
			public void mousePressed(MouseEvent e) {
				
				x=e.getX();
				y=e.getY();
				
			}
		});
		panel.setBackground(Color.ORANGE);
		frmFlowIntegralSystem.getContentPane().add(panel, BorderLayout.NORTH);
		frmFlowIntegralSystem.setSize(frmFlowIntegralSystem.getMaximumSize());
		panel.setMaximumSize(frmFlowIntegralSystem.getMaximumSize());
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		//lblUsuario.setOpaque(true);
		lblUsuario.setForeground(Color.BLACK);
		
		JLabel lblicono_usu = new JLabel("");
		lblicono_usu.setIcon(new ImageIcon("C:\\Users\\ramir\\Desktop\\Harinera\\imagenes\\usuario.png"));
		
		JLabel lblAdministrador = new JLabel("ADMINISTRADOR");
		lblAdministrador.setForeground(Color.BLACK);
		lblAdministrador.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		
		JLabel lblicono_x = new JLabel("");
		lblicono_x.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
				
			}
		});
		lblicono_x.setIcon(new ImageIcon("C:\\Users\\ramir\\Desktop\\Harinera\\imagenes\\cerrar1peq.png"));
		//lblUsuario.setBorder(BorderFactory.createLineBorder(Color.black));
		//lblUsuario.setBackground(Color.ORANGE);
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(1383, Short.MAX_VALUE)
					.addComponent(lblicono_usu)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAdministrador, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
					.addGap(83)
					.addComponent(lblicono_x)
					.addGap(29))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblicono_usu)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(8)
							.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAdministrador, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblicono_x, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_opciones = new JPanel();
		panel_opciones.setBackground(Color.BLACK);
		frmFlowIntegralSystem.getContentPane().add(panel_opciones, BorderLayout.WEST);
		JPanel Desp_rec = new JPanel();
		Desp_rec.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				
			}
		});
		JToggleButton desplegable = new JToggleButton("");
		desplegable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(desplegable.isSelected())Desp_rec.setVisible(true);
				if(desplegable.isSelected()==false)Desp_rec.setVisible(false);
				
			}
		});
		Desp_rec.setVisible(false);
		
		JLabel lblproveedores = new JLabel("  PROVEEDORES  ");
		
		lblproveedores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Proveeedores prov=new Proveeedores();
				
				nuevoPanel(prov);
				
				
			}
		});
		lblproveedores.setForeground(Color.BLACK);
		lblproveedores.setBackground(Color.ORANGE);
		lblproveedores.setOpaque(true);
		lblproveedores.setBorder(BorderFactory.createLineBorder(Color.black));
	
		
		
		lblproveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		
		JLabel lblrecepcion = new JLabel("   RECEPCI\u00D3N");
		lblrecepcion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(desplegable.isSelected()==false)Desp_rec.setVisible(false);
				Desp_rec.setVisible(true);
				if(Desp_rec.isVisible())Desp_rec.setVisible(false);
				
				Recepcion rec=new Recepcion();
				nuevoPanel(rec);

				
			}
		});
		lblrecepcion.setOpaque(true);
		lblrecepcion.setForeground(Color.BLACK);
		lblrecepcion.setFont(new Font("SimSun", Font.BOLD, 14));
		lblrecepcion.setBorder(BorderFactory.createLineBorder(Color.black));
		lblrecepcion.setBackground(Color.ORANGE);
		
		JLabel lblmezcla = new JLabel("    MEZCLA ");
		lblmezcla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Mezcla mez=new Mezcla();
				nuevoPanel(mez);
				
			}
		});
		lblmezcla.setOpaque(true);
		lblmezcla.setForeground(Color.BLACK);
		lblmezcla.setFont(new Font("SimSun", Font.BOLD, 14));
		lblmezcla.setBorder(BorderFactory.createLineBorder(Color.black));
		lblmezcla.setBackground(Color.ORANGE);
		
		JLabel lblstrock = new JLabel("     STOCK ");
		lblstrock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Stock sto=new Stock();
				nuevoPanel(sto);
				
			}
		});
		lblstrock.setOpaque(true);
		lblstrock.setForeground(Color.BLACK);
		lblstrock.setFont(new Font("SimSun", Font.BOLD, 14));
		lblstrock.setBorder(BorderFactory.createLineBorder(Color.black));
		lblstrock.setBackground(Color.ORANGE);
		
		JLabel lblgastos = new JLabel("    GASTOS");
		lblgastos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Gastos gas =new Gastos();
				nuevoPanel (gas);
				
				
			}
		});
		lblgastos.setOpaque(true);
		lblgastos.setForeground(Color.BLACK);
		lblgastos.setFont(new Font("SimSun", Font.BOLD, 14));
		lblgastos.setBorder(BorderFactory.createLineBorder(Color.black));
		lblgastos.setBackground(Color.ORANGE);
		
		JLabel lblclientes = new JLabel("   CLIENTES");
		lblclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clientes cli=new Clientes();
				nuevoPanel(cli);
				
				
			}
		});
		lblclientes.setOpaque(true);
		lblclientes.setForeground(Color.BLACK);
		lblclientes.setFont(new Font("SimSun", Font.BOLD, 14));
		lblclientes.setBorder(BorderFactory.createLineBorder(Color.black));
		lblclientes.setBackground(Color.ORANGE);
		
		JLabel lblventas = new JLabel("    VENTAS");
		lblventas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Ventas ven=new Ventas();
				nuevoPanel(ven);
				
				
			}
		});
		lblventas.setOpaque(true);
		lblventas.setForeground(Color.BLACK);
		lblventas.setFont(new Font("SimSun", Font.BOLD, 14));
		lblventas.setBorder(BorderFactory.createLineBorder(Color.black));
		lblventas.setBackground(Color.ORANGE);
		
		JLabel lblchat = new JLabel("     CHAT");
		lblchat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		lblchat.setOpaque(true);
		lblchat.setForeground(Color.BLACK);
		lblchat.setFont(new Font("SimSun", Font.BOLD, 14));
		lblchat.setBorder(BorderFactory.createLineBorder(Color.black));
		lblchat.setBackground(Color.ORANGE);
		
		
		Desp_rec.setBackground(Color.BLACK);
		
		//JToggleButton desplegable = new JToggleButton("");
		desplegable.setBackground(Color.ORANGE);
		GroupLayout gl_panel_opciones = new GroupLayout(panel_opciones);
		gl_panel_opciones.setHorizontalGroup(
			gl_panel_opciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_opciones.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_opciones.createParallelGroup(Alignment.LEADING)
						.addComponent(lblproveedores, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblchat, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblgastos, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblclientes, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblventas, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(Desp_rec, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblstrock, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_opciones.createSequentialGroup()
							.addComponent(desplegable, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblrecepcion, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_opciones.setVerticalGroup(
			gl_panel_opciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_opciones.createSequentialGroup()
					.addGap(68)
					.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(106)
					.addGroup(gl_panel_opciones.createParallelGroup(Alignment.LEADING)
						.addComponent(desplegable, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblrecepcion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Desp_rec, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(lblstrock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(lblgastos, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(lblclientes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(lblventas, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(lblchat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JLabel lblAlmacenes = new JLabel("ALMACENES");
		lblAlmacenes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Almacenes alm=new Almacenes();
				nuevoPanel(alm);
				Desp_rec.setVisible(false);
				
			}
		});
		lblAlmacenes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacenes.setOpaque(true);
		lblAlmacenes.setForeground(Color.BLACK);
		lblAlmacenes.setFont(new Font("SimSun", Font.BOLD, 10));
		lblAlmacenes.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacenes.setBackground(Color.ORANGE);
		
		JLabel lblCompraDeGrano = new JLabel("COMPRA DE GRANO");
		lblCompraDeGrano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				/*AgregarOrden orden=new AgregarOrden();
				nuevoPanel(orden);
				orden.setVisible(false);
				*/
				
			}
		});
		lblCompraDeGrano.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompraDeGrano.setOpaque(true);
		lblCompraDeGrano.setForeground(Color.BLACK);
		lblCompraDeGrano.setFont(new Font("SimSun", Font.BOLD, 10));
		lblCompraDeGrano.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCompraDeGrano.setBackground(Color.ORANGE);
		
		JLabel lblMovimientoDeAlmacenes = new JLabel("MOVIMIENTO DE ALMACENES");
		lblMovimientoDeAlmacenes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovimientoDeAlmacenes.setOpaque(true);
		lblMovimientoDeAlmacenes.setForeground(Color.BLACK);
		lblMovimientoDeAlmacenes.setFont(new Font("SimSun", Font.BOLD, 10));
		lblMovimientoDeAlmacenes.setBorder(BorderFactory.createLineBorder(Color.black));
		lblMovimientoDeAlmacenes.setBackground(Color.ORANGE);
		GroupLayout gl_Desp_rec = new GroupLayout(Desp_rec);
		gl_Desp_rec.setHorizontalGroup(
			gl_Desp_rec.createParallelGroup(Alignment.LEADING)
				.addComponent(lblAlmacenes, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
				.addComponent(lblCompraDeGrano, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
				.addComponent(lblMovimientoDeAlmacenes, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
		);
		gl_Desp_rec.setVerticalGroup(
			gl_Desp_rec.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Desp_rec.createSequentialGroup()
					.addComponent(lblAlmacenes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCompraDeGrano, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMovimientoDeAlmacenes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Desp_rec.setLayout(gl_Desp_rec);
		panel_opciones.setLayout(gl_panel_opciones);
		
		panel_card = new JPanel();
		panel_card.setBackground(new Color(255, 255, 255));
		frmFlowIntegralSystem.getContentPane().add(panel_card, BorderLayout.CENTER);
		panel_card.setLayout(new CardLayout(0, 0));
		
		JLabel lblBienvenidoFlowIntegral = new JLabel("BIENVENIDO FLOW INTEGRAL SYSTEM");
		lblBienvenidoFlowIntegral.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblBienvenidoFlowIntegral.setHorizontalAlignment(SwingConstants.CENTER);
		panel_card.add(lblBienvenidoFlowIntegral, "name_2695754230899");
		
		
		
	
	
		

	}
	
	public void nuevoPanel(JPanel panelActual) {
		
		panel_card.removeAll();
		panel_card.add(panelActual);
		panel_card.repaint();
		panel_card.revalidate();
			
			
		
		
	}
	
	JPanel panel_card =new JPanel();
	private int x,y;
}
