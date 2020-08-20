package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnMezclaPrelimpia = new JButton("Mezcla pre-limpia");
		btnMezclaPrelimpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AgregarPreLimpia nuevoform=new AgregarPreLimpia();
				nuevoform.setVisible(true);
				nuevoform.setDefaultCloseOperation(nuevoform.DISPOSE_ON_CLOSE);
			}
		});
		btnMezclaPrelimpia.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnMezclaPrelimpia, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMezclaPrelimpia))
					.addContainerGap(270, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
