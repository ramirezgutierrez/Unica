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

public class OrdenCompra extends JPanel {

	/**
	 * Create the panel.
	 */
	public OrdenCompra() {
		setBackground(Color.WHITE);
		
		JLabel lblproveedores = new JLabel("COMPRAS DE GRANO");
		lblproveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblproveedores.setOpaque(true);
		lblproveedores.setForeground(Color.BLACK);
		lblproveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblproveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblproveedores.setBackground(Color.ORANGE);
		
		JButton btnOrdenDeCompra = new JButton("Orden de compra");
		btnOrdenDeCompra.setBackground(Color.ORANGE);
		btnOrdenDeCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarOrden agregarorden=new AgregarOrden();
				agregarorden.setVisible(true);
				agregarorden.setDefaultCloseOperation(agregarorden.DISPOSE_ON_CLOSE);
			}
		});
		
		JButton btnosesabe = new JButton("-----");
		btnosesabe.setBackground(Color.ORANGE);
		
		JButton btnModificarProveedor = new JButton("BORRAR ALMACEN");
		btnModificarProveedor.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOrdenDeCompra)
					.addGap(18)
					.addComponent(btnosesabe, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModificarProveedor, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModificarProveedor)
						.addComponent(btnosesabe)
						.addComponent(btnOrdenDeCompra))
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
