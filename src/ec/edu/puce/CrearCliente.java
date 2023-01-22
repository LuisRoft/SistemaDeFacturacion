package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class CrearCliente extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCliente frame = new CrearCliente();
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
	public CrearCliente() {
		setResizable(true);
		setMaximizable(true);
		setBounds(100, 100, 660, 621);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 51, 77, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(33, 100, 77, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(33, 152, 77, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(33, 202, 77, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(33, 259, 77, 14);
		getContentPane().add(lblNewLabel_4);
		
		JTextField txtFieldName = new JTextField();
		txtFieldName.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFieldName.setBounds(146, 97, 193, 20);
		getContentPane().add(txtFieldName);
		txtFieldName.setColumns(10);
		
		JTextField txtFieldDir = new JTextField();
		txtFieldDir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFieldDir.setBounds(146, 149, 193, 20);
		getContentPane().add(txtFieldDir);
		txtFieldDir.setColumns(10);
		
		JTextField txtFieldMail = new JTextField();
		txtFieldMail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFieldMail.setBounds(146, 256, 193, 20);
		getContentPane().add(txtFieldMail);
		txtFieldMail.setColumns(10);
		
		JTextField txtFieldTlf = new JTextField();
		txtFieldTlf.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFieldTlf.setBounds(146, 201, 193, 20);
		getContentPane().add(txtFieldTlf);
		txtFieldTlf.setColumns(10);
		
		JTextField txtFieldCI = new JTextField();
		txtFieldCI.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFieldCI.setBounds(146, 50, 193, 20);
		getContentPane().add(txtFieldCI);
		txtFieldCI.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFieldCI.setText("");
				txtFieldName.setText("");
				txtFieldDir.setText("");
				txtFieldTlf.setText("");
				txtFieldMail.setText("");
				
			}
		});
		btnNuevo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNuevo.setBounds(69, 322, 102, 36);
		getContentPane().add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		
		
		String[] columnNames = {
				"Cedula",
                "Nombres",
                "Direccion",
                "Telefono",
                "Email"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);		
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = txtFieldName.getText();
				String dir = txtFieldDir.getText();
				String mail = txtFieldMail.getText();
				String telf = txtFieldTlf.getText();
				String ci = txtFieldCI.getText();	
				String[] dataRow ={ci, name, dir, telf, mail};
				model.addRow(dataRow);
				
			}
		});
		btnAgregar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnAgregar.setBounds(191, 322, 106, 36);
		getContentPane().add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});

		btnCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCancelar.setBounds(320, 322, 102, 36);
		getContentPane().add(btnCancelar);
		

		JTable table = new JTable();	
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setModel(model);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		scrollPane.setBounds(33, 395, 595, 132);
		getContentPane().add(scrollPane);


	}
}
