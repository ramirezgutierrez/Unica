package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import modelo.MAlmacen;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;

public class AgregarPreLimpia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField tfNLotes;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarPreLimpia frame = new AgregarPreLimpia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgregarPreLimpia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 855);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblMezclaPRe = new JLabel("MEZCLA PRELIMPIA");
		lblMezclaPRe.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(558)
					.addComponent(lblMezclaPRe, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblMezclaPRe, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblCodMezcla = new JLabel("NUMERO MEZCLA");
		lblCodMezcla.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodMezcla.setOpaque(true);
		lblCodMezcla.setForeground(Color.BLACK);
		lblCodMezcla.setFont(new Font("SimSun", Font.BOLD, 14));
		lblCodMezcla.setBorder(BorderFactory.createLineBorder(Color.black));
		lblCodMezcla.setBackground(Color.ORANGE);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setOpaque(true);
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("SimSun", Font.BOLD, 14));
		lblFecha.setBorder(BorderFactory.createLineBorder(Color.black));
		lblFecha.setBackground(Color.ORANGE);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setOpaque(true);
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setForeground(Color.BLACK);
		lblEmpleado.setFont(new Font("SimSun", Font.BOLD, 14));
		lblEmpleado.setBorder(BorderFactory.createLineBorder(Color.black));
		lblEmpleado.setBackground(Color.ORANGE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNDeLotes = new JLabel("N\u00BA DE LOTES A EMPLEAR");
		lblNDeLotes.setOpaque(true);
		lblNDeLotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblNDeLotes.setForeground(Color.BLACK);
		lblNDeLotes.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNDeLotes.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNDeLotes.setBackground(Color.ORANGE);
		
		tfNLotes = new JTextField();
		tfNLotes.setColumns(10);
		
		JButton btnMezclarLotes = new JButton("MEZCLAR LOTES");
		btnMezclarLotes.setBackground(Color.ORANGE);
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		panel_3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3.setBackground(Color.WHITE);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_1.setBackground(Color.WHITE);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setBackground(Color.WHITE);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setColumns(10);
		GroupLayout gl_panel_3_1 = new GroupLayout(panel_3_1);
		gl_panel_3_1.setHorizontalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addComponent(comboBox_3_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4_1, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3_1.setVerticalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_3_1.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3_1.setLayout(gl_panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_2.setBackground(Color.WHITE);
		
		JComboBox comboBox_4_2 = new JComboBox();
		comboBox_4_2.setBackground(Color.WHITE);
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setColumns(10);
		GroupLayout gl_panel_3_2 = new GroupLayout(panel_3_2);
		gl_panel_3_2.setHorizontalGroup(
			gl_panel_3_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel_3_2.createSequentialGroup()
					.addComponent(comboBox_3_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4_2, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3_2.setVerticalGroup(
			gl_panel_3_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_3_2.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3_2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4_2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3_2.setLayout(gl_panel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_3.setBackground(Color.WHITE);
		
		JComboBox comboBox_4_3 = new JComboBox();
		comboBox_4_3.setBackground(Color.WHITE);
		
		JComboBox comboBox_3_3 = new JComboBox();
		comboBox_3_3.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setColumns(10);
		GroupLayout gl_panel_3_3 = new GroupLayout(panel_3_3);
		gl_panel_3_3.setHorizontalGroup(
			gl_panel_3_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel_3_3.createSequentialGroup()
					.addComponent(comboBox_3_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4_3, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3_3.setVerticalGroup(
			gl_panel_3_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_3_3.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3_3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4_3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3_3.setLayout(gl_panel_3_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_4.setBackground(Color.WHITE);
		
		JComboBox comboBox_4_4 = new JComboBox();
		comboBox_4_4.setBackground(Color.WHITE);
		
		JComboBox comboBox_3_4 = new JComboBox();
		comboBox_3_4.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setColumns(10);
		GroupLayout gl_panel_3_4 = new GroupLayout(panel_3_4);
		gl_panel_3_4.setHorizontalGroup(
			gl_panel_3_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel_3_4.createSequentialGroup()
					.addComponent(comboBox_3_4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4_4, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3_4.setVerticalGroup(
			gl_panel_3_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_3_4.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3_4, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4_4, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3_4.setLayout(gl_panel_3_4);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_5.setBackground(Color.WHITE);
		
		JComboBox comboBox_4_5 = new JComboBox();
		comboBox_4_5.setBackground(Color.WHITE);
		
		JComboBox comboBox_3_5 = new JComboBox();
		comboBox_3_5.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_5 = new JLabel("New label");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_5 = new JLabel("New label");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_8.setColumns(10);
		GroupLayout gl_panel_3_5 = new GroupLayout(panel_3_5);
		gl_panel_3_5.setHorizontalGroup(
			gl_panel_3_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel_3_5.createSequentialGroup()
					.addComponent(comboBox_3_5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4_5, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3_5.setVerticalGroup(
			gl_panel_3_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_3_5.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3_5, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4_5, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3_5.setLayout(gl_panel_3_5);
		
		JPanel panel_3_6 = new JPanel();
		panel_3_6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3_6.setBackground(Color.WHITE);
		
		JComboBox comboBox_4_6 = new JComboBox();
		comboBox_4_6.setBackground(Color.WHITE);
		
		JComboBox comboBox_3_6 = new JComboBox();
		comboBox_3_6.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_6 = new JLabel("New label");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_6 = new JLabel("New label");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setColumns(10);
		GroupLayout gl_panel_3_6 = new GroupLayout(panel_3_6);
		gl_panel_3_6.setHorizontalGroup(
			gl_panel_3_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel_3_6.createSequentialGroup()
					.addComponent(comboBox_3_6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4_6, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_6, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_6, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3_6.setVerticalGroup(
			gl_panel_3_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_3_6.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3_6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3_6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2_6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4_6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3_6.setLayout(gl_panel_3_6);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnMezclarLotes)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblCodMezcla, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNDeLotes, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfNLotes, 0, 0, Short.MAX_VALUE))))
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
						.addComponent(panel_3_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodMezcla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNDeLotes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNLotes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnMezclarLotes)
					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3_4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3_5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(panel_3_6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.WHITE);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_4, 0, 132, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
					.addComponent(comboBox_3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(comboBox_4, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JComboBox comboBox = new JComboBox();
		panel_3.add(comboBox,0,0);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_3.add(comboBox_2,1,0);
		
		JLabel comboBox_1 = new JLabel("KG EN STOK");
		panel_3.add(comboBox_1,2,0);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_3.add(lblNewLabel,3,0);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_3.add(lblNewLabel_1,0,4);
		panel_2.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel lblAlmacen = new JLabel("ALMACEN");
		lblAlmacen.setOpaque(true);
		lblAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacen.setForeground(Color.BLACK);
		lblAlmacen.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacen.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacen.setBackground(Color.ORANGE);
		panel_2.add(lblAlmacen);
		
		JLabel lblLotesEnAlmacen = new JLabel("LOTES EN ALMACEN");
		lblLotesEnAlmacen.setOpaque(true);
		lblLotesEnAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		lblLotesEnAlmacen.setForeground(Color.BLACK);
		lblLotesEnAlmacen.setFont(new Font("SimSun", Font.BOLD, 14));
		lblLotesEnAlmacen.setBorder(BorderFactory.createLineBorder(Color.black));
		lblLotesEnAlmacen.setBackground(Color.ORANGE);
		panel_2.add(lblLotesEnAlmacen);
		
		JLabel lblKgDisponibles = new JLabel("KG DISPONIBLES");
		lblKgDisponibles.setOpaque(true);
		lblKgDisponibles.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgDisponibles.setForeground(Color.BLACK);
		lblKgDisponibles.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgDisponibles.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgDisponibles.setBackground(Color.ORANGE);
		panel_2.add(lblKgDisponibles);
		
		JLabel lblEnvase = new JLabel("ENVASE");
		lblEnvase.setOpaque(true);
		lblEnvase.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnvase.setForeground(Color.BLACK);
		lblEnvase.setFont(new Font("SimSun", Font.BOLD, 14));
		lblEnvase.setBorder(BorderFactory.createLineBorder(Color.black));
		lblEnvase.setBackground(Color.ORANGE);
		panel_2.add(lblEnvase);
		
		JLabel lblKgASeleccionar = new JLabel("KG A SELECCIONAR");
		lblKgASeleccionar.setOpaque(true);
		lblKgASeleccionar.setHorizontalAlignment(SwingConstants.CENTER);
		lblKgASeleccionar.setForeground(Color.BLACK);
		lblKgASeleccionar.setFont(new Font("SimSun", Font.BOLD, 14));
		lblKgASeleccionar.setBorder(BorderFactory.createLineBorder(Color.black));
		lblKgASeleccionar.setBackground(Color.ORANGE);
		panel_2.add(lblKgASeleccionar);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JLabel lblNuevoLoteGenerado = new JLabel("NUEVO LOTE GENERADO");
		lblNuevoLoteGenerado.setOpaque(true);
		lblNuevoLoteGenerado.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoLoteGenerado.setForeground(Color.BLACK);
		lblNuevoLoteGenerado.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNuevoLoteGenerado.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNuevoLoteGenerado.setBackground(Color.ORANGE);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("GENERAR MEZCLA");
		btnNewButton.setBackground(Color.ORANGE);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(lblNuevoLoteGenerado, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNuevoLoteGenerado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
	}
}
