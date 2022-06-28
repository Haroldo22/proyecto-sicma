import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class añadirUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					añadirUsuario frame = new añadirUsuario();
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
	public añadirUsuario() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(cUsuario.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon ico =  new ImageIcon(getClass().getResource("/Images/inicio.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese los datos del nuevo usuario");
		lblNewLabel_1.setBounds(148, 21, 305, 86);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setBounds(91, 121, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setBounds(91, 167, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		usuario = new JTextField();
		usuario.setBounds(188, 118, 86, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 164, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Añadir nuevo usuario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] contrasena = passwordField.getPassword();
				String c_contrasena = new String(contrasena);

				String u_usuario = String.valueOf(usuario);
				String cc_contrasena = c_contrasena;
				
				JOptionPane.showMessageDialog(null, "Un nuevo usuario ha sido añadido", "Usuario añadido", JOptionPane.INFORMATION_MESSAGE);
				
				inicio n = new inicio();
				n.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(449, 163, 142, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario.setText("");
				passwordField.setText("");
						
				JOptionPane.showMessageDialog(null, "No se ha añadido ningun usuario", "Cancelado", JOptionPane.CANCEL_OPTION);
				
				inicio i = new inicio();
				i.setVisible(true);
				
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(76, 491, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 784, 561);
		ImageIcon img =  new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
	}
	}


