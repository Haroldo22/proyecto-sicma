import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMCr extends JFrame {
	FondoPanel fondo = new FondoPanel();
	//DatosIMC cal1 = new DatosIMC();
	public static JPanel contentPane;
	public static JTextField txt1;
	public static JTextField txt2;
	public static JTextField txt3;
	public static JTextField txt4;
	public static JTextField txt5;
	public static JTextField txt6;
	public static JTextField txt7;
	public static JTextField txt8;
	public static JTextField txt9;
	public static JTextField txt10;
	public static JTextField txt11;
	public static JTextField txt12;
	public static JTextField txt13;
	public static JTextField txt14;
	public static JTextField txt15;
	public static JTextField nombre;
	public static JTextField pat;
	public static JTextField mat;
	public static JTextField Edad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMCr frame = new IMCr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class FondoPanel extends JPanel {
		private Image imagen;
		public void paint (Graphics g) {
			imagen = new ImageIcon(getClass().getResource("/images/Datos del paciente.png")).getImage();
			g.drawImage(imagen, 0,0, getWidth(), getHeight(),this);
			setOpaque(false);
			super.paint(g);
		}
		
	}
	public IMCr() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DatosIMC.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 436);
		contentPane = new FondoPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("IMC");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl1.setBounds(10, 132, 46, 26);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Peso recomendado");
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl2.setBounds(10, 163, 154, 26);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Peso relativo");
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl3.setBounds(10, 194, 154, 26);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Peso saludable");
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl4.setBounds(10, 225, 154, 26);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Peso ideal por Brocca (k)");
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl5.setBounds(10, 256, 192, 26);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("ICC");
		lbl6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl6.setBounds(10, 287, 162, 26);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("Sumatoria de 4 pliegues");
		lbl7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl7.setBounds(10, 318, 180, 26);
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("%Grasa de m\u00E1s o menos");
		lbl8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl8.setBounds(10, 349, 192, 26);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("Kg de grasa de m\u00E1s  o menos");
		lbl9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl9.setBounds(303, 349,230, 26);
		contentPane.add(lbl9);
		
		JLabel lbl10 = new JLabel("Masa Magra");
		lbl10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl10.setBounds(303, 318, 154, 26);
		contentPane.add(lbl10);
		
		JLabel lbl11 = new JLabel("AMC (mm)2");
		lbl11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl11.setForeground(new Color(0, 0, 0));
		lbl11.setBounds(303, 287, 154, 26);
		contentPane.add(lbl11);
		
		JLabel lbl12 = new JLabel("Kg en grasa total");
		lbl12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl12.setForeground(new Color(0, 0, 0));
		lbl12.setBounds(303, 256, 154, 26);
		contentPane.add(lbl12);
		
		JLabel lbl13 = new JLabel("Complexi\u00F3n F\u00EDsica");
		lbl13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl13.setBounds(303, 194, 185, 26);
		contentPane.add(lbl13);
		
		txt1 = new JTextField();
		txt1.setEnabled(false);
		txt1.setBounds(200, 138, 79, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setEnabled(false);
		txt2.setBounds(200, 171, 79, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setEnabled(false);
		txt3.setBounds(200, 202, 79, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setEnabled(false);
		txt4.setBounds(200, 233, 79, 20);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setEnabled(false);
		txt5.setBounds(200, 264, 79, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setEnabled(false);
		txt6.setBounds(200, 295, 79, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		txt7 = new JTextField();
		txt7.setEnabled(false);
		txt7.setBounds(200, 326, 79, 20);
		contentPane.add(txt7);
		txt7.setColumns(10);
		
		txt8 = new JTextField();
		txt8.setEnabled(false);
		txt8.setBounds(200, 357, 79, 20);
		contentPane.add(txt8);
		txt8.setColumns(10);
		
		txt9 = new JTextField();
		txt9.setEnabled(false);
		txt9.setBounds(520, 357, 79, 20);
		contentPane.add(txt9);
		txt9.setColumns(10);
		
		txt10 = new JTextField();
		txt10.setEnabled(false);
		txt10.setBounds(520, 326, 79, 20);
		contentPane.add(txt10);
		txt10.setColumns(10);
		
		txt11 = new JTextField();
		txt11.setEnabled(false);
		txt11.setBounds(520, 295, 79, 20);
		contentPane.add(txt11);
		txt11.setColumns(10);
		
		txt12 = new JTextField();
		txt12.setEnabled(false);
		txt12.setBounds(520, 264, 79, 20);
		contentPane.add(txt12);
		txt12.setColumns(10);
		
		txt13 = new JTextField();
		txt13.setEnabled(false);
		txt13.setBounds(520, 202, 79, 20);
		contentPane.add(txt13);
		txt13.setColumns(10);
		
		JLabel lbl14 = new JLabel("A");
		lbl14.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl14.setBounds(379, 234, 30, 14);
		contentPane.add(lbl14);
		
		txt14 = new JTextField();
		txt14.setEnabled(false);
		txt14.setBounds(520, 233, 79, 20);
		contentPane.add(txt14);
		txt14.setColumns(10);
		
		JLabel lbl15 = new JLabel("5% del peso recomendado");
		lbl15.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl15.setBounds(303, 163, 207, 26);
		contentPane.add(lbl15);
		
		txt15 = new JTextField();
		txt15.setEnabled(false);
		txt15.setBounds(520, 171, 79, 20);
		contentPane.add(txt15);
		txt15.setColumns(10);
		
		nombre = new JTextField();
		nombre.setEnabled(false);
		nombre.setBounds(371, 5, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		pat = new JTextField();
		pat.setEnabled(false);
		pat.setBounds(371, 36, 86, 20);
		contentPane.add(pat);
		pat.setColumns(10);
		
		mat = new JTextField();
		mat.setEnabled(false);
		mat.setBounds(371, 67, 86, 20);
		contentPane.add(mat);
		mat.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre(s)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(224, 0, 137, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido paterno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(224, 31, 154, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido materno");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(224, 62, 137, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(470, 11, 73, 17);
		contentPane.add(lblNewLabel_3);
		
		Edad = new JTextField();
		Edad.setEnabled(false);
		Edad.setBounds(553, 11, 46, 20);
		contentPane.add(Edad);
		Edad.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("RESULTADOS");
		lblNewLabel_4.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 25));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(233, 103, 176, 34);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Regresar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new seleccion().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(491, 66, 108, 23);
		contentPane.add(btnNewButton);
		
	}
}
