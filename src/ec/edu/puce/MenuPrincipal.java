package ec.edu.puce;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class MenuPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JMenuItem salirApp;
	private JMenuItem crearClientes;
	private JMenuItem crearProductos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setBackground(new Color(255, 255, 255));
		setTitle("SISTEMA FACTURACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 515);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(150, 177, 241));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sistema");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		salirApp = new JMenuItem("Salir");
		salirApp.addActionListener(this);
		mnNewMenu.add(salirApp);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		
		crearClientes = new JMenuItem("Crear Clientes");
		crearClientes.addActionListener(this);
		mnNewMenu_1.add(crearClientes);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lista de Clientes");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Productos");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		crearProductos = new JMenuItem("Crear Producto");
		crearProductos.addActionListener(this);
		mnNewMenu_2.add(crearProductos);
		
		JMenu mnNewMenu_3 = new JMenu("Redes Sociales");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_3.setIcon(null);
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Instagram");
		mntmNewMenuItem_3.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/logos/instagram.png")));
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Facebook");
		mntmNewMenuItem_4.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/logos/facebook.png")));
		mnNewMenu_3.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, "desktopPane");
		desktopPane.setLayout(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salirApp) {
			System.exit(EXIT_ON_CLOSE);
		} else if (e.getSource() == crearClientes) {
			CrearCliente form = new CrearCliente();
			crear(form);					
		} else if (e.getSource() == crearProductos) {
			CrearProducto form = new CrearProducto();
			crear(form);	
		}		
	}

	private void crear(JInternalFrame form) {		
		boolean mostrar=true;

		for (int a=0;a<desktopPane.getComponentCount();a++){     
		    if( form.getClass().isInstance( desktopPane.getComponent(a) )){
		        System.out.println("es instancia, no se debe mostrar");
		        mostrar=false;
		    }else{
		        System.out.println("no lo es, puede mostrarse");
		    }
		}
		if(mostrar){ 
			desktopPane.add(form);
			form.setVisible(true);
		}	
		
	}
}
