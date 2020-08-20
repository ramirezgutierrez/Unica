package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class Ventas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ventas() {
	setBackground(Color.WHITE);
		
		JLabel lblventas = new JLabel("    VENTAS");
		lblventas.setOpaque(true);
		lblventas.setForeground(Color.BLACK);
		lblventas.setFont(new Font("SimSun", Font.BOLD, 14));
		lblventas.setBorder(BorderFactory.createLineBorder(Color.black));
		lblventas.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblventas, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(328, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblventas, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
