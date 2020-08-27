package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OLote;
import controlador.Oproveedores;
import modelo.MFiltraLote;
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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SeguimientoLote extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeguimientoLote frame = new SeguimientoLote();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	//Object[] prova=prov.toArray();
	private JTable table;
	private JTextField tflote;
	
	//proveedores=mp.getProveedores();
	/*try {
		
	}catch (Exception e){
		System.out.println("error");
		
	}*/
	
		
	
	
	
	
	/**
	 * Create the frame.
	 */
	public SeguimientoLote() {
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
		
		JLabel lblListaDeProveedores = new JLabel("LOTE A LOCALIZAR:");
		lblListaDeProveedores.setOpaque(true);
		lblListaDeProveedores.setForeground(Color.BLACK);
		lblListaDeProveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblListaDeProveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblListaDeProveedores.setBackground(Color.ORANGE);
		
		tflote = new JTextField();
		tflote.setColumns(10);
		
		
		
		JLabel lblKgComprados = new JLabel("KG COMPRADOS");
		lblKgComprados.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgComprados.setOpaque(true);
		lblKgComprados.setForeground(Color.BLACK);
		lblKgComprados.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgComprados.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgComprados.setBackground(Color.ORANGE);
		
		JLabel lblKg = new JLabel("");
		
		DefaultTableModel model=new DefaultTableModel();
		table = new JTable(model);
		
		JButton btnUbicarDeLote = new JButton("UBICAR DE LOTE");
		btnUbicarDeLote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double x=0;
				int lote=Integer.parseInt(tflote.getText());
				
				MFiltraLote m=new MFiltraLote();
				
				try {
				x=m.getkgcomprados(lote);
				String cadena=String.valueOf(x);
			
					
					lblKg.setText(cadena);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
				MFiltraLote mp=new MFiltraLote();
				
				List<OLote> KgList=new ArrayList<>();{
				
				try {
					KgList=mp.getkgalmacen(Integer.parseInt(tflote.getText()));
					
					
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				}
				double tpc1 = 0;
				DecimalFormat formato1 = new DecimalFormat("#.00");
				
				for(OLote tempLote : KgList) {
					
					if(tempLote.getAlmacen()!=0) {
					
					tpc1=(tempLote.getKg()/x)*100;
					
						
					model.addRow(new Object[] {tempLote.getAlmacen(), tempLote.getKg(),Integer.parseInt(tflote.getText()),formato1.format(tpc1)+"%"});
					}
					
				}
				List<OLote> lotesMezclados=new ArrayList<>();
				
				try {
					lotesMezclados=mp.getkgLoteDestino(lote);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(OLote tempLote:lotesMezclados) {
					
					
					double tpc2 = (tempLote.getKg()/x)*100;
					
					model.addRow(new Object[] {tempLote.getAlmacen(), tempLote.getKg(),
							Integer.parseInt(tflote.getText()),formato1.format(tpc2)+"%",tempLote.getloteDest()});
				}
					
				}
				

		
		
		
			
		});
		
		btnUbicarDeLote.setBackground(Color.ORANGE);
		
		
		lblKg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKg.setOpaque(true);
		lblKg.setForeground(Color.BLACK);
		lblKg.setFont(new Font("SimSun", Font.BOLD, 18));
		lblKg.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKg.setBackground(Color.ORANGE);
		
		
		
		JLabel lblListaDeProveedores_2_1 = new JLabel("KG");
		lblListaDeProveedores_2_1.setOpaque(true);
		lblListaDeProveedores_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblListaDeProveedores_2_1.setForeground(Color.BLACK);
		lblListaDeProveedores_2_1.setFont(new Font("SimSun", Font.BOLD, 22));
		lblListaDeProveedores_2_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblListaDeProveedores_2_1.setBackground(Color.ORANGE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(154)
							.addComponent(lblKg, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblListaDeProveedores_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblListaDeProveedores, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKgComprados, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(tflote, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnUbicarDeLote, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))))
					.addGap(672))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblListaDeProveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tflote, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUbicarDeLote))
					.addGap(29)
					.addComponent(lblKgComprados, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblKg, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
							.addGap(11))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblListaDeProveedores_2_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 553, GroupLayout.PREFERRED_SIZE))
		);
		
		table.setBackground(Color.WHITE);
		
		
		
		model.addColumn( "ALMACÉN");
		model.addColumn( "KG");
		model.addColumn("LOTE");
		model.addColumn("% DEL LOTE");
		model.addColumn("LOTE DESTINO");
		
		

		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
	}
}
