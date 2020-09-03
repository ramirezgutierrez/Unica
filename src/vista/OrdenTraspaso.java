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
import javax.swing.ImageIcon;

public class OrdenTraspaso extends JPanel {

	/**
	 * Create the panel.
	 */
	public OrdenTraspaso() {
		setBackground(Color.WHITE);
		
		JLabel lblproveedores = new JLabel("TRASPASOS ENTRE ALMACENES");
		lblproveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblproveedores.setOpaque(true);
		lblproveedores.setForeground(Color.BLACK);
		lblproveedores.setFont(new Font("SimSun", Font.BOLD, 14));
		lblproveedores.setBorder(BorderFactory.createLineBorder(Color.black));
		lblproveedores.setBackground(Color.ORANGE);
		
		JButton btnCrearTraspaso = new JButton("Crear traspaso");
		btnCrearTraspaso.setIcon(new ImageIcon(OrdenTraspaso.class.getResource("/imagenes/IC_NUEVO_TRASPASO.png")));
		btnCrearTraspaso.setBackground(Color.ORANGE);
		btnCrearTraspaso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarOrdenTraspaso agregarOrdenT=new AgregarOrdenTraspaso();
				agregarOrdenT.setVisible(true);
				agregarOrdenT.setDefaultCloseOperation(agregarOrdenT.DISPOSE_ON_CLOSE);
			}
		});
		
		JButton btnEliminarProveedor = new JButton("------");
		btnEliminarProveedor.setBackground(Color.ORANGE);
		
		JButton btnModificarProveedor = new JButton("------");
		btnModificarProveedor.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCrearTraspaso)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEliminarProveedor, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnModificarProveedor, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblproveedores, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModificarProveedor)
						.addComponent(btnCrearTraspaso)
						.addComponent(btnEliminarProveedor))
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
