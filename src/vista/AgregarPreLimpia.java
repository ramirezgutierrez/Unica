package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.OAlmacen;
import modelo.MAlmacen;
import modelo.MPreMezcla;

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
import java.util.ArrayList;
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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AgregarPreLimpia extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodMez;
	private JTextField tfFecha;
	private JTextField tfEmpleado;
	private JTextField tfNLotes;
	private JTextField tfKgM1;
	private JTextField tfKgM2;
	private JTextField tfKgM3;
	private JTextField tfKgM4;
	private JTextField tfKgM5;
	private JTextField tfKgM6;
	private JTextField tfKgM7;
	private JTextField tfNuevoLote;
	private JTextField tfAlmacenDestino;
	private JComboBox cbLotesM1;
	private ArrayList listaL;
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
		
		ArrayList lista=new ArrayList();
		 listaL=new ArrayList();

		MPreMezcla m=new MPreMezcla();
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
		
		tfCodMez = new JTextField();
		tfCodMez.setColumns(10);
		
		tfFecha = new JTextField();
		tfFecha.setColumns(10);
		
		tfEmpleado = new JTextField();
		tfEmpleado.setColumns(10);
		
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
		
		JPanel pAdd1 = new JPanel();
		pAdd1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd1.setBackground(Color.WHITE);
		
		JPanel pAdd2 = new JPanel();
		pAdd2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd2.setBackground(Color.WHITE);
		
		JComboBox cbLotesM2 = new JComboBox();
		cbLotesM2.setBackground(Color.WHITE);
		
			
			
		
		JComboBox cbAlmacenM2 = new JComboBox();
		cbAlmacenM2.setBackground(Color.WHITE);
		
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM2.addItem(lista.get(i).toString());
		}
		
		JLabel lblKgDM2 = new JLabel("");
		lblKgDM2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblEnvaseM2 = new JLabel("");
		lblEnvaseM2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM2 = new JTextField();
		tfKgM2.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM2.setColumns(10);
		GroupLayout gl_pAdd2 = new GroupLayout(pAdd2);
		gl_pAdd2.setHorizontalGroup(
			gl_pAdd2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd2.createSequentialGroup()
					.addComponent(cbAlmacenM2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM2, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDM2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnvaseM2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
		);
		gl_pAdd2.setVerticalGroup(
			gl_pAdd2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd2.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd2.setLayout(gl_pAdd2);
		
		JPanel pAdd3 = new JPanel();
		pAdd3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd3.setBackground(Color.WHITE);
		
		JComboBox cbLotesM3 = new JComboBox();
		cbLotesM3.setBackground(Color.WHITE);
		
		JComboBox cbAlmacenM3 = new JComboBox();
		cbAlmacenM3.setBackground(Color.WHITE);
		
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM3.addItem(lista.get(i).toString());
		}
		
		JLabel lblKgDM3 = new JLabel("");
		lblKgDM3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblEnvaseM3 = new JLabel("");
		lblEnvaseM3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM3 = new JTextField();
		tfKgM3.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM3.setColumns(10);
		GroupLayout gl_pAdd3 = new GroupLayout(pAdd3);
		gl_pAdd3.setHorizontalGroup(
			gl_pAdd3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd3.createSequentialGroup()
					.addComponent(cbAlmacenM3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM3, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDM3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnvaseM3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
		);
		gl_pAdd3.setVerticalGroup(
			gl_pAdd3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd3.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd3.setLayout(gl_pAdd3);
		
		JPanel pAdd4 = new JPanel();
		pAdd4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd4.setBackground(Color.WHITE);
		
		JComboBox cbLotesM4 = new JComboBox();
		cbLotesM4.setBackground(Color.WHITE);
		
		JComboBox cbAlmacenM4 = new JComboBox();
		cbAlmacenM4.setBackground(Color.WHITE);
		
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM4.addItem(lista.get(i).toString());
		}
		
		JLabel lblKgDM4 = new JLabel("");
		lblKgDM4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblEnvaseM4 = new JLabel("");
		lblEnvaseM4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM4 = new JTextField();
		tfKgM4.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM4.setColumns(10);
		GroupLayout gl_pAdd4 = new GroupLayout(pAdd4);
		gl_pAdd4.setHorizontalGroup(
			gl_pAdd4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd4.createSequentialGroup()
					.addComponent(cbAlmacenM4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM4, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDM4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnvaseM4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
		);
		gl_pAdd4.setVerticalGroup(
			gl_pAdd4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd4.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM4, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM4, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd4.setLayout(gl_pAdd4);
		
		JPanel pAdd5 = new JPanel();
		pAdd5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd5.setBackground(Color.WHITE);
		
		JComboBox cbLotesM5 = new JComboBox();
		cbLotesM5.setBackground(Color.WHITE);
		
		JComboBox cbAlmacenM5 = new JComboBox();
		cbAlmacenM5.setBackground(Color.WHITE);
		
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM5.addItem(lista.get(i).toString());
		}
		
		JLabel lblKgDM5 = new JLabel("");
		lblKgDM5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblEnvaseM5 = new JLabel("");
		lblEnvaseM5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM5 = new JTextField();
		tfKgM5.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM5.setColumns(10);
		GroupLayout gl_pAdd5 = new GroupLayout(pAdd5);
		gl_pAdd5.setHorizontalGroup(
			gl_pAdd5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd5.createSequentialGroup()
					.addComponent(cbAlmacenM5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM5, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDM5, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnvaseM5, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM5, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
		);
		gl_pAdd5.setVerticalGroup(
			gl_pAdd5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd5.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM5, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM5, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd5.setLayout(gl_pAdd5);
		
		JPanel pAdd6 = new JPanel();
		pAdd6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd6.setBackground(Color.WHITE);
		
		JComboBox cbLotesM6 = new JComboBox();
		cbLotesM6.setBackground(Color.WHITE);
		
		JComboBox cbAlmacenM6 = new JComboBox();
		cbAlmacenM6.setBackground(Color.WHITE);
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM6.addItem(lista.get(i).toString());
		}
		
		JLabel lblKgDM6 = new JLabel("");
		lblKgDM6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblEnvaseM6 = new JLabel("");
		lblEnvaseM6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM6 = new JTextField();
		tfKgM6.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM6.setColumns(10);
		GroupLayout gl_pAdd6 = new GroupLayout(pAdd6);
		gl_pAdd6.setHorizontalGroup(
			gl_pAdd6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd6.createSequentialGroup()
					.addComponent(cbAlmacenM6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM6, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDM6, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnvaseM6, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM6, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
		);
		gl_pAdd6.setVerticalGroup(
			gl_pAdd6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd6.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd6.setLayout(gl_pAdd6);
		
		JPanel pAdd7 = new JPanel();
		pAdd7.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pAdd7.setBackground(Color.WHITE);
		
		JComboBox cbLotesM7 = new JComboBox();
		cbLotesM7.setBackground(Color.WHITE);
		
		JComboBox cbAlmacenM7 = new JComboBox();
		cbAlmacenM7.setBackground(Color.WHITE);
		
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM7.addItem(lista.get(i).toString());
		}
		
		JLabel lblKgDM7 = new JLabel("");
		lblKgDM7.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblEnvaseM7 = new JLabel("");
		lblEnvaseM7.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM7 = new JTextField();
		tfKgM7.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM7.setColumns(10);
		GroupLayout gl_pAdd7 = new GroupLayout(pAdd7);
		gl_pAdd7.setHorizontalGroup(
			gl_pAdd7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd7.createSequentialGroup()
					.addComponent(cbAlmacenM7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM7, 0, 134, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKgDM7, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnvaseM7, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM7, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
		);
		gl_pAdd7.setVerticalGroup(
			gl_pAdd7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd7.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM7, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM7, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd7.setLayout(gl_pAdd7);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnMezclarLotes)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblCodMezcla, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfCodMez, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfEmpleado, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNDeLotes, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(tfNLotes, 0, 0, Short.MAX_VALUE))))
						.addComponent(pAdd1, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
						.addComponent(pAdd2, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(pAdd3, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(pAdd4, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(pAdd5, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(pAdd6, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
						.addComponent(pAdd7, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tfCodMez)
						.addComponent(lblCodMezcla, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(tfEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNDeLotes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNLotes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnMezclarLotes)
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pAdd1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pAdd2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pAdd3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pAdd4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pAdd5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pAdd6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(pAdd7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		JLabel lblEnvaseM1 = new JLabel("");
		JLabel lblKgDM1 = new JLabel("");
		 cbLotesM1 = new JComboBox();
		 JComboBox cbAlmacenM1 = new JComboBox();
		 cbLotesM1.addItemListener(new ItemListener() {
		 	public void itemStateChanged(ItemEvent e) {
		 	
		 		String envase;
		 		double kg;
		 		if(cbLotesM1.getItemCount()!=0) {
		 	envase=m.getEnvase(Integer.parseInt(cbLotesM1.getSelectedItem().toString()));
		 	lblEnvaseM1.setText(envase);
		 	
		 	
		 	
			
			kg=m.getKgAlmacen(Integer.parseInt(cbLotesM1.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM1.getSelectedItem().toString()));
			
			lblKgDM1.setText(kg+"");
			
			cbLotesM1.repaint();
			pAdd1.revalidate();
			
			
		 		}
		 	}
		 });
		
		
		
		
	
		cbAlmacenM1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {			
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM1.getSelectedItem().toString()));
				cbLotesM1.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM1.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM1.repaint();
			pAdd1.revalidate();
			
	}
				
			});
		
		cbAlmacenM1.setBackground(Color.WHITE);
		
		lista=m.getListaAlmacen();
		for(int i=0; i<lista.size();i++) {
			
			cbAlmacenM1.addItem(lista.get(i).toString());
			
			
		}
		
		cbAlmacenM2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM2.getSelectedItem().toString()));
				cbLotesM2.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM2.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM2.repaint();
			pAdd1.revalidate();
			
				
			}
		});
		
		cbAlmacenM3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM3.getSelectedItem().toString()));
				cbLotesM3.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM3.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM3.repaint();
			pAdd1.revalidate();
				
			}
		});
		
		cbAlmacenM4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM4.getSelectedItem().toString()));
				cbLotesM4.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM4.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM4.repaint();
			pAdd1.revalidate();
				
			}
		});
		
		cbAlmacenM5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM5.getSelectedItem().toString()));
				cbLotesM5.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM5.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM5.repaint();
			pAdd1.revalidate();
				
			}
		});
		
		cbAlmacenM6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM6.getSelectedItem().toString()));
				cbLotesM6.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM6.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM6.repaint();
			pAdd1.revalidate();
				
			}
		});
		
		cbAlmacenM7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList ListaLote=new ArrayList();
				ListaLote=m.getListaLotes(Integer.parseInt(cbAlmacenM7.getSelectedItem().toString()));
				cbLotesM7.removeAllItems();
			for(int i=0; i<ListaLote.size();i++) {
				
				cbLotesM7.addItem(ListaLote.get(i));
			
			
		}
			cbLotesM7.repaint();
			pAdd1.revalidate();
				
				
			}
		});
		
		 cbLotesM2.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent e) {
			 	
			 		String envase;
			 		double kg;
			 		if(cbLotesM2.getItemCount()!=0) {
			 	envase=m.getEnvase(Integer.parseInt(cbLotesM2.getSelectedItem().toString()));
			 	lblEnvaseM2.setText(envase);
			 	
			 	
			 	
				
				kg=m.getKgAlmacen(Integer.parseInt(cbLotesM2.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM2.getSelectedItem().toString()));
				
				lblKgDM2.setText(kg+"");
				
				cbLotesM2.repaint();
				pAdd2.revalidate();
				
				
			 		}
			 	}
			 });
			
		 cbLotesM3.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent e) {
			 	
			 		String envase;
			 		double kg;
			 		if(cbLotesM3.getItemCount()!=0) {
			 	envase=m.getEnvase(Integer.parseInt(cbLotesM3.getSelectedItem().toString()));
			 	lblEnvaseM3.setText(envase);
			 	
			 	
			 	
				
				kg=m.getKgAlmacen(Integer.parseInt(cbLotesM3.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM3.getSelectedItem().toString()));
				
				lblKgDM3.setText(kg+"");
				
				cbLotesM3.repaint();
				pAdd3.revalidate();
				
				
			 		}
			 	}
			 });
			
		 cbLotesM4.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent e) {
			 	
			 		String envase;
			 		double kg;
			 		if(cbLotesM4.getItemCount()!=0) {
			 	envase=m.getEnvase(Integer.parseInt(cbLotesM4.getSelectedItem().toString()));
			 	lblEnvaseM4.setText(envase);
			 	
			 	
			 	
				
				kg=m.getKgAlmacen(Integer.parseInt(cbLotesM4.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM4.getSelectedItem().toString()));
				
				lblKgDM4.setText(kg+"");
				
				cbLotesM4.repaint();
				pAdd4.revalidate();
				
				
			 		}
			 	}
			 });
			
		 cbLotesM5.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent e) {
			 	
			 		String envase;
			 		double kg;
			 		if(cbLotesM5.getItemCount()!=0) {
			 	envase=m.getEnvase(Integer.parseInt(cbLotesM5.getSelectedItem().toString()));
			 	lblEnvaseM5.setText(envase);
			 	
			 	
			 	
				
				kg=m.getKgAlmacen(Integer.parseInt(cbLotesM5.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM5.getSelectedItem().toString()));
				
				lblKgDM5.setText(kg+"");
				
				cbLotesM5.repaint();
				pAdd5.revalidate();
				
				
			 		}
			 	}
			 });
			
		 cbLotesM6.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent e) {
			 	
			 		String envase;
			 		double kg;
			 		if(cbLotesM6.getItemCount()!=0) {
			 	envase=m.getEnvase(Integer.parseInt(cbLotesM6.getSelectedItem().toString()));
			 	lblEnvaseM6.setText(envase);
			 	
			 	
			 	
				
				kg=m.getKgAlmacen(Integer.parseInt(cbLotesM6.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM6.getSelectedItem().toString()));
				
				lblKgDM6.setText(kg+"");
				
				cbLotesM6.repaint();
				pAdd6.revalidate();
				
				
			 		}
			 	}
			 });
			
		 cbLotesM7.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent e) {
			 	
			 		String envase;
			 		double kg;
			 		if(cbLotesM7.getItemCount()!=0) {
			 	envase=m.getEnvase(Integer.parseInt(cbLotesM7.getSelectedItem().toString()));
			 	lblEnvaseM7.setText(envase);
			 	
			 	
			 	
				
				kg=m.getKgAlmacen(Integer.parseInt(cbLotesM7.getSelectedItem().toString()), Integer.parseInt(cbAlmacenM7.getSelectedItem().toString()));
				
				lblKgDM7.setText(kg+"");
				
				cbLotesM7.repaint();
				pAdd7.revalidate();
				
				
			 		}
			 	}
			 });
		 panel_2.setVisible(false);
		 pAdd1.setVisible(false);
			pAdd2.setVisible(false);
			pAdd3.setVisible(false);
			pAdd4.setVisible(false);
			pAdd5.setVisible(false);
			pAdd6.setVisible(false);
			pAdd7.setVisible(false);
			
		lblKgDM1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		lblEnvaseM1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tfKgM1 = new JTextField();
		tfKgM1.setText("");
		tfKgM1.addFocusListener(new FocusAdapter() {
			
			public void focusLost(FocusEvent arg0) {
				
				if(lblKgDM1.getText()!="" && tfKgM1.getText().isEmpty()==false ) {
					
				
				 if(Double.parseDouble(tfKgM1.getText())>Double.parseDouble(lblKgDM1.getText())) {
					tfKgM1.setText("");
					tfKgM1.requestFocus();
				}
				
			}}
		});
		tfKgM1.setHorizontalAlignment(SwingConstants.RIGHT);
		tfKgM1.setColumns(10);
		
		tfKgM2.addFocusListener(new FocusAdapter() {
			
			public void focusLost(FocusEvent arg0) {
				if(lblKgDM2.getText()!="" && tfKgM2.getText().isEmpty()==false ) {
					
				 if(Double.parseDouble(tfKgM2.getText())>Double.parseDouble(lblKgDM2.getText())) {
					tfKgM2.setText("");
					tfKgM2.requestFocus();
				}
				
			}}
		});
		tfKgM3.addFocusListener(new FocusAdapter() {
	
		public void focusLost(FocusEvent arg0) {
			if(lblKgDM3.getText()!="" && tfKgM3.getText().isEmpty()==false ) {
		if(Double.parseDouble(tfKgM3.getText())>Double.parseDouble(lblKgDM3.getText())) {
			tfKgM3.setText("");
			tfKgM3.requestFocus();
		}
		
		}}
		});
		tfKgM4.addFocusListener(new FocusAdapter() {
	
			public void focusLost(FocusEvent arg0) {
				if(lblKgDM4.getText()!="" && tfKgM4.getText().isEmpty()==false ) {
		if(Double.parseDouble(tfKgM4.getText())>Double.parseDouble(lblKgDM4.getText())) {
			tfKgM4.setText("");
			tfKgM4.requestFocus();
		}
		
		}}
		});
		tfKgM5.addFocusListener(new FocusAdapter() {
	
			public void focusLost(FocusEvent arg0) {
				if(lblKgDM5.getText()!="" && tfKgM5.getText().isEmpty()==false ) {
		if(Double.parseDouble(tfKgM5.getText())>Double.parseDouble(lblKgDM5.getText())) {
			tfKgM5.setText("");
			tfKgM5.requestFocus();
		}
		
			
				}}
		});
		tfKgM6.addFocusListener(new FocusAdapter() {
	
			public void focusLost(FocusEvent arg0) {
				if(lblKgDM6.getText()!="" && tfKgM6.getText().isEmpty()==false ) {
		if(Double.parseDouble(tfKgM6.getText())>Double.parseDouble(lblKgDM6.getText())) {
			tfKgM6.setText("");
			tfKgM6.requestFocus();
		}
				}
			}
		});
		tfKgM7.addFocusListener(new FocusAdapter() {
	
			public void focusLost(FocusEvent arg0) {
				if(lblKgDM7.getText()!="" && tfKgM7.getText().isEmpty()==false ) {
		if(Double.parseDouble(tfKgM7.getText())>Double.parseDouble(lblKgDM6.getText())) {
			tfKgM7.setText("");
			tfKgM7.requestFocus();
		}
				}
			}
		});


		
		cbLotesM1.setBackground(Color.WHITE);
		GroupLayout gl_pAdd1 = new GroupLayout(pAdd1);
		
		btnMezclarLotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Integer.parseInt(tfNLotes.getText())==1){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
				}else if(Integer.parseInt(tfNLotes.getText())==2){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
					 pAdd2.setVisible(true);
				}else if(Integer.parseInt(tfNLotes.getText())==3){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
					 pAdd2.setVisible(true);
					 pAdd3.setVisible(true);
				}else if(Integer.parseInt(tfNLotes.getText())==4){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
					 pAdd2.setVisible(true);
					 pAdd3.setVisible(true);
					 pAdd4.setVisible(true);
				}else if(Integer.parseInt(tfNLotes.getText())==5){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
					 pAdd2.setVisible(true);
					 pAdd3.setVisible(true);
					 pAdd4.setVisible(true);
					 pAdd5.setVisible(true);
				}else if(Integer.parseInt(tfNLotes.getText())==6){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
					 pAdd2.setVisible(true);
					 pAdd3.setVisible(true);
					 pAdd4.setVisible(true);
					 pAdd5.setVisible(true);
					 pAdd6.setVisible(true);
				}else if(Integer.parseInt(tfNLotes.getText())==7){
					 panel_2.setVisible(true);
					 pAdd1.setVisible(true);
					 pAdd2.setVisible(true);
					 pAdd3.setVisible(true);
					 pAdd4.setVisible(true);
					 pAdd5.setVisible(true);
					 pAdd6.setVisible(true);
					 pAdd7.setVisible(true);
				}else {
					tfNLotes.setText("");
					tfNLotes.requestFocus();
					
					 panel_2.setVisible(false);
					 pAdd1.setVisible(false);
						pAdd2.setVisible(false);
						pAdd3.setVisible(false);
						pAdd4.setVisible(false);
						pAdd5.setVisible(false);
						pAdd6.setVisible(false);
						pAdd7.setVisible(false);
				}
				
				
				
			}
		});
		
		
		gl_pAdd1.setHorizontalGroup(
			gl_pAdd1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd1.createSequentialGroup()
					.addComponent(cbAlmacenM1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbLotesM1, 0, 132, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblKgDM1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblEnvaseM1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfKgM1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pAdd1.setVerticalGroup(
			gl_pAdd1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pAdd1.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAlmacenM1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addComponent(tfKgM1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEnvaseM1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblKgDM1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addComponent(cbLotesM1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pAdd1.setLayout(gl_pAdd1);
		
		JComboBox comboBox = new JComboBox();
		pAdd1.add(comboBox,0,0);
		
		JComboBox comboBox_2 = new JComboBox();
		pAdd1.add(comboBox_2,1,0);
		
		JLabel comboBox_1 = new JLabel("KG EN STOK");
		pAdd1.add(comboBox_1,2,0);
		
		JLabel lblNewLabel = new JLabel("New label");
		pAdd1.add(lblNewLabel,3,0);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		pAdd1.add(lblNewLabel_1,0,4);
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
		
		tfNuevoLote = new JTextField();
		tfNuevoLote.setColumns(10);
		
		JButton btnNewButton = new JButton("GENERAR MEZCLA");
		btnNewButton.setBackground(Color.ORANGE);
		
		JLabel lblAlmacenDeDestino = new JLabel("ALMACEN DE DESTINO");
		lblAlmacenDeDestino.setOpaque(true);
		lblAlmacenDeDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacenDeDestino.setForeground(Color.BLACK);
		lblAlmacenDeDestino.setFont(new Font("SimSun", Font.BOLD, 14));
		lblAlmacenDeDestino.setBorder(BorderFactory.createLineBorder(Color.black));
		lblAlmacenDeDestino.setBackground(Color.ORANGE);
		
		tfAlmacenDestino = new JTextField();
		tfAlmacenDestino.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(lblNuevoLoteGenerado, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tfNuevoLote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAlmacenDeDestino)
					.addGap(18)
					.addComponent(tfAlmacenDestino, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNuevoLoteGenerado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfNuevoLote, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton))
						.addComponent(lblAlmacenDeDestino, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfAlmacenDestino, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
	}
}
