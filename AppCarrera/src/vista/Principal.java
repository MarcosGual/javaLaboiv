package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import controlador.GestorTiempos;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Principal extends JFrame {
	private GestorTiempos controlador;
	private JPanel contentPane;
	private JButton btnTiempos;
	private JButton btnClima;
	private JButton btnPromedios;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */

	public Principal() {
		controlador = new GestorTiempos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAltas = new JButton("ALTAS");
		btnAltas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AltaTiempos(this, true, controlador).setVisible(true);
			}
		});
		btnAltas.setBounds(164, 12, 117, 25);
		contentPane.add(btnAltas);
		
		btnTiempos = new JButton("TIEMPOS");
		btnTiempos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReportePorTiempo(this, true, controlador).setVisible(true);
			}
		});
		btnTiempos.setBounds(12, 100, 117, 25);
		contentPane.add(btnTiempos);
		
		btnClima = new JButton("CLIMA");
		btnClima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReportePorClima(this, true, controlador).setVisible(true);
			}
		});
		btnClima.setBounds(164, 100, 117, 25);
		contentPane.add(btnClima);
		
		btnPromedios = new JButton("PROMEDIOS");
		btnPromedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new ReportePorPromedio(this, true, controlador).setVisible(true);
			}
		});
		btnPromedios.setBounds(322, 100, 117, 25);
		contentPane.add(btnPromedios);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 66, 427, 2);
		contentPane.add(separator);
		
		JLabel lblReportes = new JLabel("REPORTES");
		lblReportes.setBounds(186, 66, 96, 15);
		contentPane.add(lblReportes);
		
	}
	
}
