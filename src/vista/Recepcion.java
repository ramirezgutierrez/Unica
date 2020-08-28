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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartPanel;

import controlador.Graficas;
import java.awt.FlowLayout;

public class Recepcion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Recepcion() {
		setBackground(Color.WHITE);
		
		Graficas panel=new Graficas();
		ChartPanel panelt=panel.CreaPanelTarta(1);
		
		
		
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
		add(panelt);
		
		JPanel panel_1 = new JPanel();
		panel_1.add(panelt);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblproveedores)
					.addGap(203)
					.addComponent(btnAgregarProveedor)
					.addContainerGap(364, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
					.addGap(151))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAgregarProveedor))
						.addComponent(lblproveedores))
					.addGap(108)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(139, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		

	}
}
