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
import modelo.DtoCarrera.Carrera;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;

public class ReportePorClima extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private GestorTiempos controlador;
	private JTextField tf_tiempo;
	private JList list;

	/**
	 * Create the dialog.
	 */
	public ReportePorClima(ActionListener actionListener, boolean modal, GestorTiempos controlador) {
		setTitle("CLIMA");
		this.controlador = controlador;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTiempoABuscar = new JLabel("Tiempo a buscar:");
			lblTiempoABuscar.setBounds(12, 12, 121, 15);
			contentPanel.add(lblTiempoABuscar);
		}
		{
			tf_tiempo = new JTextField();
			tf_tiempo.setText("0.0");
			tf_tiempo.setBounds(142, 10, 114, 19);
			contentPanel.add(tf_tiempo);
			tf_tiempo.setColumns(10);
		}
		{
			list = new JList();
			list.setBackground(Color.LIGHT_GRAY);
			list.setBounds(12, 39, 426, 184);
			contentPanel.add(list);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Buscar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						List<Carrera> lst = new ArrayList<>();
						lst = controlador.tiemposPorClima(Float.parseFloat(tf_tiempo.getText()));
						
						list.setListData(lst.toArray());
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
	}

}
