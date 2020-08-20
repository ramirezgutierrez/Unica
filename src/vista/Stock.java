package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class Stock extends JPanel {

	/**
	 * Create the panel.
	 */
	public Stock() {
	setBackground(Color.WHITE);
		
		JLabel lblstrock = new JLabel("     STOCK ");
		lblstrock.setOpaque(true);
		lblstrock.setForeground(Color.BLACK);
		lblstrock.setFont(new Font("SimSun", Font.BOLD, 14));
		lblstrock.setBorder(BorderFactory.createLineBorder(Color.black));
		lblstrock.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblstrock, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(328, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblstrock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
