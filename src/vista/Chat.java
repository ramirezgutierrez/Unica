package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class Chat extends JPanel {

	/**
	 * Create the panel.
	 */
	public Chat() {
	setBackground(Color.WHITE);
		
		JLabel lblchat = new JLabel("     CHAT");
		lblchat.setOpaque(true);
		lblchat.setForeground(Color.BLACK);
		lblchat.setFont(new Font("SimSun", Font.BOLD, 14));
		lblchat.setBorder(BorderFactory.createLineBorder(Color.black));
		lblchat.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblchat, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(328, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblchat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
