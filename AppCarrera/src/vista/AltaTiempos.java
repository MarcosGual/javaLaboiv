package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.GestorTiempos;
import modelo.Corredor;
import modelo.Tiempo;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class AltaTiempos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private GestorTiempos controlador;
	private JTextField tf_tiempo;
	private JTextField tf_club;
	private JComboBox<Corredor> cb_corredor;
	private JComboBox cb_clima;

	/**
	 * Create the dialog.
	 */
	public AltaTiempos(ActionListener actionListener, boolean modal, GestorTiempos controlador) {
		this.controlador = controlador;
		setBounds(100, 100, 295, 205);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCoredores = new JLabel("Coredores");
			lblCoredores.setBounds(24, 14, 74, 15);
			contentPanel.add(lblCoredores);
		}
		{
			cb_corredor = new JComboBox();
			cb_corredor.setBounds(113, 9, 114, 24);
			contentPanel.add(cb_corredor);
		}
		{
			JLabel lblTiempo = new JLabel("Tiempo");
			lblTiempo.setBounds(24, 41, 51, 15);
			contentPanel.add(lblTiempo);
		}
		{
			tf_tiempo = new JTextField();
			tf_tiempo.setBounds(113, 39, 114, 19);
			tf_tiempo.setText("0.0");
			tf_tiempo.setColumns(10);
			contentPanel.add(tf_tiempo);
		}
		{
			JLabel lblClima = new JLabel("Clima");
			lblClima.setBounds(24, 68, 38, 15);
			contentPanel.add(lblClima);
		}
		{
			cb_clima = new JComboBox();
			cb_clima.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Frio", "Luvia", "Viento"}));
			cb_clima.setBounds(113, 63, 114, 24);
			contentPanel.add(cb_clima);
		}
		{
			JLabel lblClub = new JLabel("Club");
			lblClub.setBounds(24, 95, 31, 15);
			contentPanel.add(lblClub);
		}
		{
			tf_club = new JTextField();
			tf_club.setBounds(113, 93, 114, 19);
			tf_club.setColumns(10);
			contentPanel.add(tf_club);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Cargar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Corredor corredor = (Corredor) cb_corredor.getSelectedItem();
							float tiempo = Float.parseFloat(tf_tiempo.getText());
							String club = tf_club.getText();
							String clima = (String) cb_clima.getSelectedItem();

							Tiempo nuevoTiempo = new Tiempo(corredor, tiempo, club, clima);

							if (controlador.agregarTiempo(nuevoTiempo) == true)
								JOptionPane.showMessageDialog(null, "Servicio registrado!","EXITO", JOptionPane.INFORMATION_MESSAGE);
							else
								JOptionPane.showMessageDialog(null, "ERROR Servicio no registrado!","ERROR", JOptionPane.ERROR_MESSAGE);
						} catch (Exception ex) {
							JOptionPane.showMessageDialog(null, "Error en los datos","ERROR", JOptionPane.ERROR_MESSAGE);
							System.out.println(ex);
						}
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
		cargarCombos();
	}

	public void cargarCombos() {
		List<Corredor> lst = new ArrayList<Corredor>();
		lst = controlador.obtenerCorredores();

		for (Corredor c : lst)
			cb_corredor.addItem(c);
	}
	
}
