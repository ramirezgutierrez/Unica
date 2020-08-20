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

public class Recepcion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Recepcion() {
		setBackground(Color.WHITE);
		
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
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAgregarProveedor)
					.addContainerGap(501, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAgregarProveedor))
					.addContainerGap(690, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
