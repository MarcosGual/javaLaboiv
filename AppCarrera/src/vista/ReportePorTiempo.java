package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.GestorTiempos;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReportePorTiempo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private GestorTiempos controlador;
	private JTextField tf_tiempo;
	private JLabel lb_tiempo;

	/**
	 * Create the dialog.
	 */
	public ReportePorTiempo(ActionListener actionListener, boolean modal, GestorTiempos controlador) {
		setTitle("TIEMPOS");
		getContentPane().setBackground(Color.WHITE);
		this.controlador = controlador;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(0, 0, 1, 235);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 235, 440, 35);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Buscar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int corredores = controlador.contarTiemposMenores(Float.parseFloat(tf_tiempo.getText()));
						lb_tiempo.setText(String.valueOf(corredores));
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel lblIngreseTiempoA = new JLabel("Tiempo a buscar:");
			lblIngreseTiempoA.setBounds(12, 12, 171, 15);
			getContentPane().add(lblIngreseTiempoA);
		}

		tf_tiempo = new JTextField();
		tf_tiempo.setText("0.0");
		tf_tiempo.setBounds(201, 8, 114, 19);
		getContentPane().add(tf_tiempo);
		tf_tiempo.setColumns(10);
		{
			JLabel lblTotalDeCorredores = new JLabel("Total de corredores:");
			lblTotalDeCorredores.setBounds(12, 67, 171, 15);
			getContentPane().add(lblTotalDeCorredores);
		}
		{
			lb_tiempo = new JLabel("0");
			lb_tiempo.setForeground(Color.BLUE);
			lb_tiempo.setBackground(Color.WHITE);
			lb_tiempo.setBounds(201, 67, 114, 15);
			getContentPane().add(lb_tiempo);
		}
	}
}
