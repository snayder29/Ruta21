package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;

public class Reporte extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte frame = new Reporte();
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
	public Reporte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Reporte.class.getResource("/iconos16x16/presentacion.png")));
		setTitle("Reporte de Ventas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 34, 802, 225);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		Object t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
		t1 = Registro.total_1;t2 = Registro.total_2;t3 = Registro.total_3;t4 = Registro.total_4;t5 = Registro.total_5;
		t6 = Registro.total_6;t7 = Registro.total_7;t8 = Registro.total_8;t9 = Registro.total_9;t10 = Registro.total_10;
		t11 = Registro.total_11;t12 = Registro.total_12;
		
		Object v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;
		v1 = Registro.polos1;v2 = Registro.polos2;v3 = Registro.polos3;v4 = Registro.polos4;v5 = Registro.polos5;
		v6 = Registro.polos6;v7 = Registro.polos7;v8 = Registro.polos8;v9 = Registro.polos9;v10 = Registro.polos10;
		v11 = Registro.polos11;v12 = Registro.polos12;
		
		Object c1,c2,c3,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
		c1 = Inicio.cantidadOptima1;c2 = Inicio.cantidadOptima2;c3 = Inicio.cantidadOptima3;
		p1 = Vender.cantidad1;p2 = Vender.cantidad2;p3 = Vender.cantidad3;p4 = Vender.cantidad4;p5 = Vender.cantidad5;p6 = Vender.cantidad6;
		p7 = Vender.cantidad7;p8 = Vender.cantidad8;p9 = Vender.cantidad9;p10 = Vender.cantidad10;p11 = Vender.cantidad11;p12 = Vender.cantidad12;
		
		Object r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
		r1 = Registro.regalos1;r2 = Registro.regalos2;r3 = Registro.regalos3;r4 = Registro.regalos4;r5 = Registro.regalos5;r6 = Registro.regalos6;
		r7 = Registro.regalos7;r8 = Registro.regalos8;r9 = Registro.regalos9;r10 = Registro.regalos10;r11 = Registro.regalos11;r12 = Registro.regalos12;
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Trujillo - Chiclayo", "Normal", "8 AM", p1+ "/" + c1 , r1 + "  billetera(s)", v1 + "  Polo(s)", t1},
				{"Trujillo - Chiclayo", "Doble Piso", "10 AM", p2+ "/" + c2, r2 + "  billetera(s)", v2 + "  Polo(s)", t2},
				{"Trujillo - Chiclayo", "Bus Cama", "12 PM", p3+ "/" + c3, r3 + "  billetera(s)", v3 + "  Polo(s)", t3},
				{"Trujillo - Chiclayo", "Normal", "3 PM", p4+ "/" + c1, r4 + "  billetera(s)", v4 + "  Polo(s)", t4},
				{"Trujillo - Lima", "Normal", "10 AM", p5+ "/" + c1, r5 + "  billetera(s)", v5 + "  Polo(s)", t5},
				{"Trujillo - Lima", "Doble Piso", "12 PM", p6+ "/" + c2, r6 + "  billetera(s)", v6 + "  Polo(s)", t6},
				{"Trujillo - Lima", "Doble Piso", "3 PM", p7+ "/" + c2, r7 + "  billetera(s)", v7 + "  Polo(s)", t7},
				{"Trujillo - Lima", "Bus Cama", "8 PM", p8+ "/" + c3, r8 + "  billetera(s)", v8 + "  Polo(s)", t8},
				{"Trujillo - Chimbote", "Normal", "8 AM", p9+ "/" + c1, r9 + "  billetera(s)", v9 + "  Polo(s)", t9},
				{"Trujillo - Chimbote", "Doble Piso", "9 AM", p10+ "/" + c1, r10 + "  billetera(s)", v10 + "  Polo(s)", t10},
				{"Trujillo - Chimbote", "Bus Cama", "10 AM", p11+ "/" + c3, r11 + "  billetera(s)", v11 + "  Polo(s)", t11},
				{"Trujillo - Chimbote", "Doble Piso", "12 PM", p12+ "/" + c2, r12 + "  billetera(s)", v12 + "  Polo(s)", t12},
			},
			new String[] {
				"Ruta", "Tipo de Bus", "Hora de Salida", "Pasajes Vendidos", "Regalos", "Obsequios", "I. de Pago Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(112);
		table.getColumnModel().getColumn(0).setMinWidth(24);
		table.getColumnModel().getColumn(1).setPreferredWidth(123);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(3).setPreferredWidth(108);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(119);
		table.getColumnModel().getColumn(6).setPreferredWidth(115);
		scrollPane.setViewportView(table);
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(367, 291, 111, 28);
		contentPane.add(btnNewButton);
		

		setLocationRelativeTo(null);
			
	}
}
