import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.border.LineBorder;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ingresoPaciente extends JFrame {
	FondoPanel fondo = new FondoPanel();
	private ButtonGroup bg= new ButtonGroup();
	IMCr imc = new IMCr();
	
	private JPanel contentPane;
	public static JTextField name1;
	public static JTextField ApellidoP;
	public static JTextField ApellidoM;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoPaciente frame = new ingresoPaciente();
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
			imagen = new ImageIcon(getClass().getResource("/images/inicio.png")).getImage();
			g.drawImage(imagen, 0,0, getWidth(), getHeight(),this);
			setOpaque(false);
			super.paint(g);
		}
		
	}

	public ingresoPaciente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DatosIMC.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new FondoPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("NOMBRE(S)");
		name.setBounds(10, 27, 86, 15);
		contentPane.add(name);
		
		name1 = new JTextField();
		name1.setBounds(141, 24, 86, 20);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new DatosIMC().setVisible(true);
				
				String nombre = name1.getText();
				String apellidoP = ApellidoP.getText();
				String apellidoM = ApellidoM.getText();
		
				DatosIMC.Nombre.setText(nombre);
			
				DatosIMC.AP.setText(apellidoP);
				
				DatosIMC.AM.setText(apellidoM);
			
				
				dispose();
				
			}
		});
		btnNewButton.setBounds(167, 146, 89, 23);
		contentPane.add(btnNewButton);
		
		ApellidoP = new JTextField();
		ApellidoP.setBounds(141, 63, 86, 20);
		contentPane.add(ApellidoP);
		ApellidoP.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("APELLIDO PATERNO");
		lblNewLabel.setBounds(10, 66, 121, 14);
		contentPane.add(lblNewLabel);
		
		ApellidoM = new JTextField();
		ApellidoM.setBounds(141, 94, 86, 20);
		contentPane.add(ApellidoM);
		ApellidoM.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("APELLIDO MATERNO ");
		lblNewLabel_1.setBounds(10, 97, 121, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbMasculino = new JRadioButton("MASCULINO");
		rdbMasculino.setBounds(277, 23, 109, 23);
		contentPane.add(rdbMasculino);
		
		JRadioButton rbdFemenino = new JRadioButton("FEMENINO");
		rbdFemenino.setBounds(277, 49, 109, 23);
		contentPane.add(rbdFemenino);
		
		JRadioButton rbdOtros = new JRadioButton("OTROS");
		rbdOtros.setBounds(277, 75, 109, 23);
		contentPane.add(rbdOtros);
		
		bg.add(rdbMasculino);
		bg.add(rbdFemenino);
		bg.add(rbdOtros);
		
	}
}
