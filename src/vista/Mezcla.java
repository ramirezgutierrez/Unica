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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Mezcla extends JPanel {

	/**
	 * Create the panel.
	 */
	public Mezcla() {
	setBackground(Color.WHITE);
		
		JLabel lblmezcla = new JLabel("COMPOSICI\u00D3N");
		lblmezcla.setHorizontalAlignment(SwingConstants.CENTER);
		lblmezcla.setOpaque(true);
		lblmezcla.setForeground(Color.BLACK);
		lblmezcla.setFont(new Font("SimSun", Font.BOLD, 14));
		lblmezcla.setBorder(BorderFactory.createLineBorder(Color.black));
		lblmezcla.setBackground(Color.ORANGE);
		
		JButton btnMezclaPrelimpia = new JButton("    Mezcla pre-limpia");
		btnMezclaPrelimpia.setHorizontalAlignment(SwingConstants.LEADING);
		btnMezclaPrelimpia.setIcon(new ImageIcon(Mezcla.class.getResource("/imagenes/IC_PRELIMPIA.png")));
		btnMezclaPrelimpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AgregarPreLimpia nuevoform=new AgregarPreLimpia();
				nuevoform.setVisible(true);
				nuevoform.setDefaultCloseOperation(nuevoform.DISPOSE_ON_CLOSE);
			}
		});
		btnMezclaPrelimpia.setBackground(Color.ORANGE);
		
		JButton btnOrdenDeLimpia = new JButton("Orden de limpia");
		btnOrdenDeLimpia.setIcon(new ImageIcon(Mezcla.class.getResource("/imagenes/IC_LIMPIA.png")));
		btnOrdenDeLimpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AgregarOrdenLimpia nuevoform= new AgregarOrdenLimpia();
				nuevoform.setVisible(true);
				nuevoform.setDefaultCloseOperation(nuevoform.DISPOSE_ON_CLOSE);
				
				
				
				
			}
		});
		btnOrdenDeLimpia.setBackground(Color.ORANGE);
		
		JButton btnCrearDeposito = new JButton("Crear Deposito Acondicionado");
		btnCrearDeposito.setIcon(new ImageIcon(Mezcla.class.getResource("/imagenes/IC_DEPOSITO_ACONDICIONADO_SUM.png")));
		btnCrearDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			AgregarDepositoAcondicionado	nuevoform= new AgregarDepositoAcondicionado();
			
			nuevoform.setVisible(true);
			nuevoform.setDefaultCloseOperation(nuevoform.DISPOSE_ON_CLOSE);
			
			
			}
		});
		btnCrearDeposito.setBackground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnMezclaPrelimpia, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnOrdenDeLimpia, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCrearDeposito, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblmezcla, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMezclaPrelimpia, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOrdenDeLimpia, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCrearDeposito))
					.addContainerGap(454, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
