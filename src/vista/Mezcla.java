package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class Mezcla extends JPanel {

	/**
	 * Create the panel.
	 */
	public Mezcla() {
	setBackground(Color.WHITE);
		
		JLabel lblmezcla = new JLabel("    MEZCLA ");
		lblmezcla.setOpaque(true);
		lblmezcla.setForeground(Color.BLACK);
		lblmezcla.setFont(new Font("SimSun", Font.BOLD, 14));
		lblmezcla.setBorder(BorderFactory.createLineBorder(Color.black));
		lblmezcla.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(328, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
