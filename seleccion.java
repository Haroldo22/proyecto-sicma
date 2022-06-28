import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class seleccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seleccion frame = new seleccion();
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
	public seleccion() {
		setRootPaneCheckingEnabled(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(seleccion.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 884, 561);
		ImageIcon ico =  new ImageIcon(getClass().getResource("/Images/Datos del paciente.png"));
		ImageIcon img =  new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Ingresar Nuevo Paciente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DatosIMC DT = new DatosIMC();
				DT.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(568, 244, 184, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Ver Pacientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				verPaciente vP =  new verPaciente();
				vP.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(153, 244, 184, 72);
		contentPane.add(btnNewButton);
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
	}
}
