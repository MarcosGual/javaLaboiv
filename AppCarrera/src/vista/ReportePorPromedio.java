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
import modelo.DtoCarrera.Promedio;

import javax.swing.JList;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class ReportePorPromedio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private GestorTiempos controlador;
	private JList lista;


	/**
	 * Create the dialog.
	 */
	public ReportePorPromedio(ActionListener actionListener, boolean modal, GestorTiempos controlador) {
		setTitle("PROMEDIOS");
		this.controlador = controlador;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JList list = new JList();
			list.setBounds(444, 229, -442, -225);
			list.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(list);
		}
		{
			lista = new JList();
			lista.setBackground(Color.LIGHT_GRAY);
			lista.setBounds(12, 12, 426, 213);
			contentPanel.add(lista);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Buscar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						List<Promedio> lst = new ArrayList<>();
						lst = controlador.promedioPorCorredor();
						
						lista.setListData(lst.toArray());
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
