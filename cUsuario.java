import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cUsuario extends JFrame {

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
					cUsuario frame = new cUsuario();
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
	public cUsuario() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(cUsuario.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon ico =  new ImageIcon(getClass().getResource("/Images/inicio.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Inice sesión con usuario maestro");
		lblNewLabel_1.setBounds(241, 28, 309, 63);
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
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String u_usuario = "harold";
				String cc_contrasena = "contrasena";
				
				char[] contrasena = passwordField.getPassword();
				String c_contrasena = new String(contrasena);
				
				if (usuario.getText().equals(u_usuario) && c_contrasena.equals(cc_contrasena)){
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido " + u_usuario, "Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
					
					añadirUsuario aU = new añadirUsuario();
					aU.setVisible(true);
					
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto, por favor, intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
					usuario.setText("");
					passwordField.setText("");
				
				}
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(329, 141, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario.setText("");
				passwordField.setText("");
				
				inicio i = new inicio();
				i.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(50, 483, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 784, 561);
		ImageIcon img =  new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
	}

}
