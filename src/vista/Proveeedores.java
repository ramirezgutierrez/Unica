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

public class Proveeedores extends JPanel {

	/**
	 * Create the panel.
	 */
	public Proveeedores() {
		setBackground(Color.WHITE);
		
		JLabel lblproveedores = new JLabel("  PROVEEDORES  ");
		lblproveedores.setOpaque(true);
		lblproveedores.setForeground(Color.BLACK);
		lblproveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblproveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblproveedores.setBackground(Color.ORANGE);
		
		JButton btnAgregarProveedor = new JButton("Agregar proveedor");
		btnAgregarProveedor.setBackground(Color.ORANGE);
		btnAgregarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FAgregarprov agregarprov=new FAgregarprov();
				agregarprov.setVisible(true);
				agregarprov.setDefaultCloseOperation(agregarprov.DISPOSE_ON_CLOSE);
			}
		});
		
		JButton btnEliminarProveedor = new JButton("Eliminar proveedor");
		btnEliminarProveedor.setBackground(Color.ORANGE);
		
		JButton btnModificarProveedor = new JButton("Modificar proveedor");
		btnModificarProveedor.setBackground(Color.ORANGE);
		
		JButton btnVerproveedores = new JButton("Ver proveedores");
		btnVerproveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerProveedores vp=new VerProveedores();
				vp.setVisible(true);
				vp.setDefaultCloseOperation(vp.DISPOSE_ON_CLOSE);
				
			}
		});
		btnVerproveedores.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAgregarProveedor)
					.addGap(18)
					.addComponent(btnEliminarProveedor, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnModificarProveedor)
					.addGap(18)
					.addComponent(btnVerproveedores, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAgregarProveedor)
						.addComponent(btnEliminarProveedor)
						.addComponent(btnModificarProveedor)
						.addComponent(btnVerproveedores))
					.addContainerGap(707, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
