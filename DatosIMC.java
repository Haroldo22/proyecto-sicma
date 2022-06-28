import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DatosIMC extends JFrame {
	IMCr ventana = new IMCr();
	private JPanel contentPane;
	//Declarar una imagen para un Jlabel de fondo
		FondoPanel fondo = new FondoPanel();
		float peso, altura,alturacm, muslo, muñeca, brazo, antebrazo, pantorrilla, cintura, cadera, biceps,triceps, subescular, suprailico, estatura;
		int edad;
		float IMC,A, PesoRecomendado,PesoIdealPorBrocca, ComplexionFisica, AMB, PesoRelativo, PesoSaludable, cincoporcientoDelPesoRecomendado,TotalDeGrasa, ICC, SumatoriaDeCuatroPliegues, PorDeMasOMenos, KgDeGrasaDeMasOMenos, MasaMagra;
		//variables redondeadas
		float IMC1,A1, PesoRecomendado1,PesoIdealPorBrocca1, ComplexionFisica1, AMB1,ICC1, PesoRelativo1, PesoSaludable1, cincoporcientoDelPesoRecomendado1, SumatoriaDeCuatroPliegues1;
		String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t51, t15, edad1;
		
	    public static JTextField CajaEdad;
	    public static JTextField CajaPeso;
	    public static JTextField CajaAltura;
	    public static JTextField CajaMuñeca;
	    public static JTextField CajaBrazo;
	    public static JTextField CajaAntebrazo;
	    public static JTextField CajaMuslo;
	    public static JTextField CajaPantorrilla;
	    public static JTextField CajaCintura;
	    public static JTextField CajaCadera;
	    public static JTextField CajaBiceps;
	    public static JTextField CajaTriceps;
	    public static JTextField CajaSubescular;
	    public static JTextField CajaSuprailico;
	    public static JTextField Cajacm;
	    public static JTextField Nombre;
	    public static JTextField AP;
	    public static JTextField AM;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosIMC frame = new DatosIMC();
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
	public DatosIMC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DatosIMC.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new   FondoPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabel = new JLabel("Calculadora de IMC");
		lblLabel.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 25));
		lblLabel.setForeground(Color.BLACK);
		lblLabel.setBounds(257, 0, 245, 22);
		contentPane.add(lblLabel);
		
		JLabel lblEdad = new JLabel("EDAD (a\u00F1os)");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEdad.setForeground(Color.BLACK);
		lblEdad.setBounds(543, 169, 109, 25);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("PESO (K)");
		lblPeso.setForeground(Color.BLACK);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPeso.setBounds(543, 205, 109, 25);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("ESTATURA (cm)");
		lblAltura.setForeground(Color.BLACK);
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltura.setBounds(42, 205, 132, 25);
		contentPane.add(lblAltura);
		
		JLabel lblMuñeca = new JLabel("MU\u00D1ECA (mm)");
		lblMuñeca.setForeground(Color.BLACK);
		lblMuñeca.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMuñeca.setBounds(42, 315, 138, 25);
		contentPane.add(lblMuñeca);
		
		JLabel lblBrazo = new JLabel("BRAZO (mm)");
		lblBrazo.setForeground(Color.BLACK);
		lblBrazo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBrazo.setBounds(42, 351, 98, 25);
		contentPane.add(lblBrazo);
		
		JLabel lblAntebrazo = new JLabel("ANTEBRAZO (cm)");
		lblAntebrazo.setForeground(Color.BLACK);
		lblAntebrazo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAntebrazo.setBounds(280, 279, 142, 25);
		contentPane.add(lblAntebrazo);
		
		JLabel lblMuslo = new JLabel("MUSLO (cm)");
		lblMuslo.setForeground(Color.BLACK);
		lblMuslo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMuslo.setBounds(280, 315, 136, 25);
		contentPane.add(lblMuslo);
		
		JLabel lblPantorrilla = new JLabel("PANTORRILLA (cm)");
		lblPantorrilla.setForeground(Color.BLACK);
		lblPantorrilla.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPantorrilla.setBounds(280, 351, 166, 25);
		contentPane.add(lblPantorrilla);
		
		JLabel lblCintura = new JLabel("CINTURA (cm)");
		lblCintura.setForeground(Color.BLACK);
		lblCintura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCintura.setBounds(543, 351, 122, 25);
		contentPane.add(lblCintura);
		
		JLabel lblCadera = new JLabel("CADERA (cm)");
		lblCadera.setForeground(Color.BLACK);
		lblCadera.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadera.setBounds(543, 315, 122, 25);
		contentPane.add(lblCadera);
		
		JLabel lblBiceps = new JLabel("BICEPS (mm)");
		lblBiceps.setForeground(Color.BLACK);
		lblBiceps.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBiceps.setBounds(48, 444, 166, 25);
		contentPane.add(lblBiceps);
		
		JLabel lblTriceps = new JLabel("TRICEPS (mm)");
		lblTriceps.setForeground(Color.BLACK);
		lblTriceps.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTriceps.setBounds(48, 480, 166, 25);
		contentPane.add(lblTriceps);
		
		JLabel lblSubescular = new JLabel("SUBESCULAR (mm)");
		lblSubescular.setForeground(Color.BLACK);
		lblSubescular.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubescular.setBounds(481, 447, 215, 23);
		contentPane.add(lblSubescular);
		
		JLabel lblSupralico = new JLabel("SUPRAILICO (mm)");
		lblSupralico.setForeground(Color.BLACK);
		lblSupralico.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSupralico.setBounds(481, 481, 215, 23);
		contentPane.add(lblSupralico);
		
		JLabel lblcm = new JLabel("ESTATURA (mts)");
		lblcm.setForeground(Color.BLACK);
		lblcm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblcm.setBounds(42, 169, 142, 25);
		contentPane.add(lblcm);
		
		JLabel lblNewLabel = new JLabel("INDICADORES ANTROPOM\u00C9TRICOS");
		lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(188, 130, 452, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CIRCUNFERENCIAS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 25));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(264, 241, 333, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLIEGUES O PAN\u00CDCULOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(238, 387, 369, 49);
		contentPane.add(lblNewLabel_2);
		
		JLabel nombre = new JLabel("Nombre(s)");
		nombre.setForeground(Color.BLACK);
		nombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		nombre.setBounds(556, 3, 137, 26);
		contentPane.add(nombre);
		
		JLabel ap = new JLabel("Apellido paterno");
		ap.setForeground(Color.BLACK);
		ap.setFont(new Font("Tahoma", Font.BOLD, 15));
		ap.setBounds(556, 31, 154, 26);
		contentPane.add(ap);
		
		JLabel am = new JLabel("Apellido materno");
		am.setForeground(Color.BLACK);
		am.setFont(new Font("Tahoma", Font.BOLD, 15));
		am.setBounds(556, 63, 137, 26);
		contentPane.add(am);
		
		//Jtexte
		CajaEdad = new JTextField();
		CajaEdad.setBounds(672, 173, 46, 20);
		contentPane.add(CajaEdad);
		CajaEdad.setColumns(10);
		
		CajaPeso = new JTextField();
		CajaPeso.setBounds(672, 209, 46, 20);
		contentPane.add(CajaPeso);
		CajaPeso.setColumns(10);
		
		CajaAltura = new JTextField();
		CajaAltura.setBounds(200, 209, 46, 20);
		contentPane.add(CajaAltura);
		CajaAltura.setColumns(10); 
		
		CajaMuñeca = new JTextField();
		CajaMuñeca.setBounds(168, 319, 46, 20);
		contentPane.add(CajaMuñeca);
		CajaMuñeca.setColumns(10);
		
		CajaBrazo = new JTextField();
		CajaBrazo.setBounds(168, 355, 46, 20);
		contentPane.add(CajaBrazo);
		CajaBrazo.setColumns(10);
		
		CajaAntebrazo = new JTextField();
		CajaAntebrazo.setBounds(456, 283, 46, 20);
		contentPane.add(CajaAntebrazo);
		CajaAntebrazo.setColumns(10);
		
		CajaMuslo = new JTextField();
		CajaMuslo.setBounds(456, 320, 46, 20);
		contentPane.add(CajaMuslo);
		CajaMuslo.setColumns(10);
		
		CajaPantorrilla = new JTextField();
		CajaPantorrilla.setBounds(456, 355, 46, 20);
		contentPane.add(CajaPantorrilla);
		CajaPantorrilla.setColumns(10);
		
		CajaCintura = new JTextField();
		CajaCintura.setBounds(672, 355, 46, 20);
		contentPane.add(CajaCintura);
		CajaCintura.setColumns(10);
		
		CajaCadera = new JTextField();
		CajaCadera.setBounds(672, 319, 46, 20);
		contentPane.add(CajaCadera);
		CajaCadera.setColumns(10);
		
		CajaBiceps = new JTextField();
		CajaBiceps.setBounds(200, 448, 46, 20);
		contentPane.add(CajaBiceps);
		CajaBiceps.setColumns(10);
		
		CajaTriceps = new JTextField();
		CajaTriceps.setBounds(200, 484, 46, 20);
		contentPane.add(CajaTriceps);
		CajaTriceps.setColumns(10);
		
		CajaSubescular = new JTextField();
		CajaSubescular.setBounds(672, 450, 46, 20);
		contentPane.add(CajaSubescular);
		CajaSubescular.setColumns(10);
		
		CajaSuprailico = new JTextField();
		CajaSuprailico.setBounds(672, 484, 46, 20);
		contentPane.add(CajaSuprailico);
		CajaSuprailico.setColumns(10);
		
		Cajacm = new JTextField();
		Cajacm.setBounds(200, 173, 46, 20);
		contentPane.add(Cajacm);
		Cajacm.setColumns(10);
		
		
		
		JButton btnEnter = new JButton("CALCULAR");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pasar String a integer
				
				cambioVariables();

				//Operaciones matematicas 
				
				operaciones();
				
				//Mostrar datos
				t1 = Float.toString(IMC1);
				t2 = String.valueOf(PesoRecomendado1);
				t3 = String.valueOf(ComplexionFisica1);
				t4 = String.valueOf(PesoRelativo1);
				t5 = String.valueOf(PesoSaludable1);
				t51 = String.valueOf(A1);
				t6 = String.valueOf(cincoporcientoDelPesoRecomendado1);
				t7 = String.valueOf(TotalDeGrasa);
				t8 = String.valueOf(ICC1);
				t9 = String.valueOf(SumatoriaDeCuatroPliegues1);
				t10 = String.valueOf(PorDeMasOMenos);
				t11 = String.valueOf(KgDeGrasaDeMasOMenos);
				t12 = String.valueOf(MasaMagra);
				t13 = String.valueOf(AMB1);
				t14 = String.valueOf(PesoIdealPorBrocca1);
				edad1 = String.valueOf(edad);
				JOptionPane.showMessageDialog(null, "Tu FOLIO es: " + crearFolio(), "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
				//Abrir la ventana y cerra la actual 
				new IMCr().setVisible(true);
				dispose();
				//Sacar los datos a otra ventana 
			
				IMCr.txt1.setText(t1);
				IMCr.txt2.setText(t2);
				IMCr.txt13.setText(t3);
				IMCr.txt3.setText(t4);
				IMCr.txt4.setText(t5);
				IMCr.txt15.setText(t6);
				IMCr.txt12.setText(t7);
				IMCr.txt6.setText(t8);
				IMCr.txt7.setText(t9);
				IMCr.txt8.setText(t10);
				IMCr.txt9.setText(t11);
				IMCr.txt10.setText(t12);
				IMCr.txt11.setText(t13);
				IMCr.txt5.setText(t14);
				IMCr.txt14.setText(t51);
				IMCr.Edad.setText(edad1);
				
				IMCr.nombre.setText(Nombre.getText());
				IMCr.pat.setText(AP.getText());
				IMCr.mat.setText(AM.getText());
				}
			//Clase de herencia para JButton
			private void operaciones() {
				
				ICC = cintura/cadera;
				ICC1 = Math.round(ICC);
				SumatoriaDeCuatroPliegues = biceps+triceps+subescular+suprailico;
				SumatoriaDeCuatroPliegues1 = Math.round(SumatoriaDeCuatroPliegues);
				PorDeMasOMenos = 18*peso/100;
				KgDeGrasaDeMasOMenos = peso*PorDeMasOMenos/100;
				MasaMagra = (float) (peso-11.868);
				AMB = (float) ((brazo-(3.1416*triceps))*((brazo-(3.1416*triceps)))/(3.1416*4));
				AMB1 = Math.round(AMB);
				PesoIdealPorBrocca = altura-100;
				PesoIdealPorBrocca1 = Math.round(PesoIdealPorBrocca);
				TotalDeGrasa = (float) ((12.9*peso)/100);
				IMC = peso / (alturacm*alturacm);
				IMC1 = Math.round(IMC);
				PesoRecomendado = alturacm*alturacm*24;
				PesoRecomendado1 = Math.round(PesoRecomendado);
				ComplexionFisica =altura/muñeca;
				ComplexionFisica1 = Math.round(ComplexionFisica);
				PesoRelativo = peso/PesoRecomendado*100;
				PesoRelativo1 = Math.round(PesoRelativo);
				cincoporcientoDelPesoRecomendado = (float)(PesoRecomendado*0.05);
				cincoporcientoDelPesoRecomendado1 = Math.round(cincoporcientoDelPesoRecomendado);
				PesoSaludable = PesoRecomendado - cincoporcientoDelPesoRecomendado;
				PesoSaludable1 = Math.round(PesoSaludable);
				A = (PesoRecomendado) + (cincoporcientoDelPesoRecomendado);
				A1 =Math.round(A);
				
			}
			private void cambioVariables() {
				altura = Float.parseFloat(CajaAltura.getText());
				peso = Float.parseFloat(CajaPeso.getText());
				muslo = Float.parseFloat(CajaMuslo.getText());
				muñeca = Float.parseFloat(CajaMuñeca.getText());
				brazo = Float.parseFloat(CajaBrazo.getText());
				antebrazo = Float.parseFloat(CajaAntebrazo.getText());
				altura = Float.parseFloat(CajaAltura.getText());
				alturacm = Float.parseFloat(Cajacm.getText());
				pantorrilla= Float.parseFloat(CajaPantorrilla.getText());
				cintura = Float.parseFloat(CajaCintura.getText());
				cadera = Float.parseFloat(CajaCadera.getText());
				biceps = Float.parseFloat(CajaBiceps.getText());
				triceps = Float.parseFloat(CajaTriceps.getText());
				subescular = Float.parseFloat(CajaSubescular.getText());
				suprailico = Float.parseFloat(CajaSuprailico.getText());
				edad = Integer.parseInt(CajaEdad.getText());
				
			}
		});
		btnEnter.setBounds(357, 527, 130, 23);
		contentPane.add(btnEnter);
		
		Nombre = new JTextField();
		Nombre.setEnabled(false);
		Nombre.setBounds(688, 8, 86, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		AP = new JTextField();
		AP.setEnabled(false);
		AP.setText("");
		AP.setBounds(688, 36, 86, 20);
		contentPane.add(AP);
		AP.setColumns(10);
		
		AM = new JTextField();
		AM.setEnabled(false);
		AM.setBounds(688, 68, 86, 20);
		contentPane.add(AM);
		AM.setColumns(10);
		}
	public static String crearFolio() {

		int numero = (int)(Math.random()*99999+10000);
		
		String folio = numero+"";
		
		return folio;
		
		}
}
