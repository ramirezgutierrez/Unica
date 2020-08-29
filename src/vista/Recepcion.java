package vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartPanel;

import controlador.Graficas;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Recepcion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Recepcion() {
		setBackground(Color.WHITE);
		
		Graficas panel=new Graficas();
		List<ChartPanel> ListaPaneles=new ArrayList<ChartPanel>();
		
		try {
			ListaPaneles=panel.getGraficos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*ChartPanel panelt=panel.CreaPanelTarta(1);
		ChartPanel panelt1=panel.CreaPanelTarta(2);
		ChartPanel panelt2=panel.CreaPanelTarta(3);*/
		
		
		
		
		JLabel lblproveedores = new JLabel("RECEPCI\u00D3N");
		lblproveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblproveedores.setOpaque(true);
		lblproveedores.setForeground(Color.BLACK);
		lblproveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblproveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblproveedores.setBackground(Color.ORANGE);
		
		JButton btnAgregarProveedor = new JButton("UBICACI\u00D3N DE LOTE");
		btnAgregarProveedor.setBackground(Color.ORANGE);
		btnAgregarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeguimientoLote seguimiento=new SeguimientoLote();
				seguimiento.setVisible(true);
				seguimiento.setDefaultCloseOperation(seguimiento.DISPOSE_ON_CLOSE);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAgregarProveedor))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1081, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblproveedores)
						.addComponent(btnAgregarProveedor))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));
		if(ListaPaneles.size()>2 && ListaPaneles.size()<=4) {
			panel_1.setLayout(new GridLayout(2,2,0,0));
		}else if(ListaPaneles.size()>4 && ListaPaneles.size()<=6) {
			panel_1.setLayout(new GridLayout(2,3,0,0));
		}else if(ListaPaneles.size()>6 && ListaPaneles.size()<=9) {
			panel_1.setLayout(new GridLayout(3,3,0,0));
		}else {
			
		}
		
		for(int i=0;i<ListaPaneles.size();i++) {
			
			panel_1.add(ListaPaneles.get(i));
			
			
		}
		
		/*panel_1.add(panelt);
		panel_1.add(panelt1);
		panel_1.add(panelt2);*/
		
		setLayout(groupLayout);
		

	}
}
