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

public class Almacenes extends JPanel {

	/**
	 * Create the panel.
	 */
	public Almacenes() {
		setBackground(Color.WHITE);
		
		JLabel lblproveedores = new JLabel("ALMACENES");
		lblproveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblproveedores.setOpaque(true);
		lblproveedores.setForeground(Color.BLACK);
		lblproveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblproveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblproveedores.setBackground(Color.ORANGE);
		
		JButton btnAgregarAlmacen = new JButton("AGREGAR ALMACEN");
		btnAgregarAlmacen.setBackground(Color.ORANGE);
		btnAgregarAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarAlmacen agregaralm=new AgregarAlmacen();
				agregaralm.setVisible(true);
				agregaralm.setDefaultCloseOperation(agregaralm.DISPOSE_ON_CLOSE);
			}
		});
		
		JButton btnEliminarProveedor = new JButton("CONSULTAR ALMACEN");
		btnEliminarProveedor.setBackground(Color.ORANGE);
		
		JButton btnModificarProveedor = new JButton("BORRAR ALMACEN");
		btnModificarProveedor.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAgregarAlmacen)
					.addGap(18)
					.addComponent(btnEliminarProveedor, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnModificarProveedor, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAgregarAlmacen)
						.addComponent(btnEliminarProveedor)
						.addComponent(btnModificarProveedor))
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
