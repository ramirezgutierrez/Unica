package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class Clientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public Clientes() {
		
		setBackground(Color.WHITE);
	
	JLabel lblclientes = new JLabel("   CLIENTES");
	lblclientes.setOpaque(true);
	lblclientes.setForeground(Color.BLACK);
	lblclientes.setFont(new Font("SimSun", Font.BOLD, 14));
	lblclientes.setBorder(BorderFactory.createLineBorder(Color.black));
	lblclientes.setBackground(Color.ORANGE);
	GroupLayout groupLayout = new GroupLayout(this);
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addComponent(lblclientes, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(328, Short.MAX_VALUE))
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addComponent(lblclientes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(270, Short.MAX_VALUE))
	);
	setLayout(groupLayout);

	}

}
