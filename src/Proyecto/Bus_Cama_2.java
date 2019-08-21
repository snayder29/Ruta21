package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Bus_Cama_2 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbtAsiento1;
	private JPanel panel_1;
	private JRadioButton rbtAsiento2;
	private JPanel panel_2;
	private JRadioButton rbtAsiento3;
	private JRadioButton rbtAsiento4;
	private JRadioButton rbtAsiento8;
	private JRadioButton rbtAsiento7;
	private JRadioButton rbtAsiento6;
	private JRadioButton rbtAsiento5;
	private JRadioButton rbtAsiento9;
	private JRadioButton rbtAsiento10;
	private JRadioButton rbtAsiento11;
	private JRadioButton rbtAsiento12;
	private JRadioButton rbtAsiento13;
	private JRadioButton rbtAsiento14;
	private JRadioButton rbtAsiento15;
	private JRadioButton rbtAsiento16;
	private JRadioButton rbtAsiento20;
	private JRadioButton rbtAsiento19;
	private JRadioButton rbtAsiento18;
	private JRadioButton rbtAsiento17;
	private JRadioButton rbtAsiento21;
	private JRadioButton rbtAsiento22;
	private JRadioButton rbtAsiento23;
	private JRadioButton rbtAsiento24;
	private JRadioButton rbtAsiento26;
	private JRadioButton rbtAsiento25;
	private JRadioButton rbtAsiento28;
	private JRadioButton rbtAsiento27;
	private JRadioButton rbtAsiento29;
	private JRadioButton rbtAsiento30;
	private JRadioButton rbtAsiento31;
	private JRadioButton rbtAsiento32;
	private JRadioButton rbtAsiento33;
	private JRadioButton rbtAsiento34;
	private JRadioButton rbtAsiento35;
	private JRadioButton rbtAsiento36;
	private JRadioButton rbtAsiento37;
	private JRadioButton rbtAsiento38;
	private JRadioButton rbtAsiento39;
	private JRadioButton rbtAsiento40;
	private JRadioButton rbtAsiento44;
	private JRadioButton rbtAsiento43;
	private JPanel panel_21;
	private JRadioButton rbtAsiento42;
	private JRadioButton rbtAsiento41;
	private JRadioButton rbtAsiento53;
	private JRadioButton rbtAsiento54;
	private JRadioButton rbtAsiento57;
	private JRadioButton rbtAsiento58;
	private JRadioButton rbtAsiento55;
	private JRadioButton rbtAsiento56;
	private JRadioButton rbtAsiento59;
	private JRadioButton rbtAsiento60;
	private JPanel panel_30;
	private JRadioButton rbtAsiento45;
	private JRadioButton rbtAsiento46;
	private JRadioButton rbtAsiento47;
	private JRadioButton rbtAsiento48;
	private JRadioButton rbtAsiento49;
	private JRadioButton rbtAsiento50;
	private JRadioButton rbtAsiento51;
	private JRadioButton rbtAsiento52;
	private JLabel lblRuta;
	private JLabel lblruta;
	private JLabel lblhora;
	private JLabel lblHora;
	private JLabel lblBus;
	private JLabel lblbus;
	private JPanel panel_31;
	private JLabel lblAsientoOcupado;
	private JLabel lblAsientoLibre;
	private JPanel panel_32;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bus_Cama_2 frame = new Bus_Cama_2();
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
	public Bus_Cama_2() {
		
		setResizable(false);
		
		setTitle("Asientos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 74, 1113, 322);
		contentPane.add(panel);
		panel.setLayout(null);
		
		rbtAsiento1 = new JRadioButton("01");
		rbtAsiento1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento1.setBackground(new Color(30, 144, 255));
		rbtAsiento1.setForeground(new Color(0, 0, 0));
		rbtAsiento1.setBounds(79, 21, 59, 55);
		panel.add(rbtAsiento1);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(669, 21, 59, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/escaleras.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 0, 59, 55);
		panel_1.add(label_4);
		
		rbtAsiento2 = new JRadioButton("02");
		rbtAsiento2.setForeground(Color.BLACK);
		rbtAsiento2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento2.setBackground(new Color(30, 144, 255));
		rbtAsiento2.setBounds(79, 76, 59, 55);
		panel.add(rbtAsiento2);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(669, 76, 59, 55);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/escaleras.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 0, 59, 55);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		panel_3.setBounds(374, 21, 59, 55);
		panel.add(panel_3);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/escaleras.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 0, 59, 55);
		panel_3.add(label_3);
		
		rbtAsiento3 = new JRadioButton("03");
		rbtAsiento3.setForeground(Color.BLACK);
		rbtAsiento3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento3.setBackground(new Color(30, 144, 255));
		rbtAsiento3.setBounds(79, 186, 59, 55);
		panel.add(rbtAsiento3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(669, 131, 59, 55);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setLayout(null);
		panel_5.setBounds(374, 76, 59, 55);
		panel.add(panel_5);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/escaleras.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 59, 55);
		panel_5.add(label_2);
		
		rbtAsiento4 = new JRadioButton("04");
		rbtAsiento4.setForeground(Color.BLACK);
		rbtAsiento4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento4.setBackground(new Color(30, 144, 255));
		rbtAsiento4.setBounds(79, 241, 59, 55);
		panel.add(rbtAsiento4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setLayout(null);
		panel_6.setBounds(79, 131, 59, 55);
		panel.add(panel_6);
		
		rbtAsiento8 = new JRadioButton("08");
		rbtAsiento8.setForeground(Color.BLACK);
		rbtAsiento8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento8.setBackground(new Color(30, 144, 255));
		rbtAsiento8.setBounds(138, 241, 59, 55);
		panel.add(rbtAsiento8);
		
		rbtAsiento7 = new JRadioButton("07");
		rbtAsiento7.setForeground(Color.BLACK);
		rbtAsiento7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento7.setBackground(new Color(30, 144, 255));
		rbtAsiento7.setBounds(138, 186, 59, 55);
		panel.add(rbtAsiento7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setLayout(null);
		panel_7.setBounds(138, 131, 59, 55);
		panel.add(panel_7);
		
		rbtAsiento6 = new JRadioButton("06");
		rbtAsiento6.setForeground(Color.BLACK);
		rbtAsiento6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento6.setBackground(new Color(30, 144, 255));
		rbtAsiento6.setBounds(138, 76, 59, 55);
		panel.add(rbtAsiento6);
		
		rbtAsiento5 = new JRadioButton("05");
		rbtAsiento5.setForeground(Color.BLACK);
		rbtAsiento5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento5.setBackground(new Color(30, 144, 255));
		rbtAsiento5.setBounds(138, 21, 59, 55);
		panel.add(rbtAsiento5);
		
		rbtAsiento16 = new JRadioButton("16");
		rbtAsiento16.setForeground(Color.BLACK);
		rbtAsiento16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento16.setBackground(new Color(30, 144, 255));
		rbtAsiento16.setBounds(256, 241, 59, 55);
		panel.add(rbtAsiento16);
		
		rbtAsiento12 = new JRadioButton("12");
		rbtAsiento12.setForeground(Color.BLACK);
		rbtAsiento12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento12.setBackground(new Color(30, 144, 255));
		rbtAsiento12.setBounds(197, 241, 59, 55);
		panel.add(rbtAsiento12);
		
		rbtAsiento11 = new JRadioButton("11");
		rbtAsiento11.setForeground(Color.BLACK);
		rbtAsiento11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento11.setBackground(new Color(30, 144, 255));
		rbtAsiento11.setBounds(197, 186, 59, 55);
		panel.add(rbtAsiento11);
		
		rbtAsiento15 = new JRadioButton("15");
		rbtAsiento15.setForeground(Color.BLACK);
		rbtAsiento15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento15.setBackground(new Color(30, 144, 255));
		rbtAsiento15.setBounds(256, 186, 59, 55);
		panel.add(rbtAsiento15);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setLayout(null);
		panel_8.setBounds(256, 131, 59, 55);
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(197, 131, 59, 55);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		rbtAsiento10 = new JRadioButton("10");
		rbtAsiento10.setForeground(Color.BLACK);
		rbtAsiento10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento10.setBackground(new Color(30, 144, 255));
		rbtAsiento10.setBounds(197, 76, 59, 55);
		panel.add(rbtAsiento10);
		
		rbtAsiento14 = new JRadioButton("14");
		rbtAsiento14.setForeground(Color.BLACK);
		rbtAsiento14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento14.setBackground(new Color(30, 144, 255));
		rbtAsiento14.setBounds(256, 76, 59, 55);
		panel.add(rbtAsiento14);
		
		rbtAsiento13 = new JRadioButton("13");
		rbtAsiento13.setForeground(Color.BLACK);
		rbtAsiento13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento13.setBackground(new Color(30, 144, 255));
		rbtAsiento13.setBounds(256, 21, 59, 55);
		panel.add(rbtAsiento13);
		
		rbtAsiento9 = new JRadioButton("09");
		rbtAsiento9.setForeground(Color.BLACK);
		rbtAsiento9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento9.setBackground(new Color(30, 144, 255));
		rbtAsiento9.setBounds(197, 21, 59, 55);
		panel.add(rbtAsiento9);
		
		rbtAsiento28 = new JRadioButton("28");
		rbtAsiento28.setForeground(Color.BLACK);
		rbtAsiento28.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento28.setBackground(new Color(30, 144, 255));
		rbtAsiento28.setBounds(492, 76, 59, 55);
		panel.add(rbtAsiento28);
		
		rbtAsiento24 = new JRadioButton("24");
		rbtAsiento24.setForeground(Color.BLACK);
		rbtAsiento24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento24.setBackground(new Color(30, 144, 255));
		rbtAsiento24.setBounds(433, 76, 59, 55);
		panel.add(rbtAsiento24);
		
		rbtAsiento23 = new JRadioButton("23");
		rbtAsiento23.setForeground(Color.BLACK);
		rbtAsiento23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento23.setBackground(new Color(30, 144, 255));
		rbtAsiento23.setBounds(433, 21, 59, 55);
		panel.add(rbtAsiento23);
		
		rbtAsiento27 = new JRadioButton("27");
		rbtAsiento27.setForeground(Color.BLACK);
		rbtAsiento27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento27.setBackground(new Color(30, 144, 255));
		rbtAsiento27.setBounds(492, 21, 59, 55);
		panel.add(rbtAsiento27);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setLayout(null);
		panel_10.setBounds(492, 131, 59, 55);
		panel.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setLayout(null);
		panel_11.setBounds(433, 131, 59, 55);
		panel.add(panel_11);
		
		rbtAsiento22 = new JRadioButton("22");
		rbtAsiento22.setForeground(Color.BLACK);
		rbtAsiento22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento22.setBackground(new Color(30, 144, 255));
		rbtAsiento22.setBounds(374, 241, 59, 55);
		panel.add(rbtAsiento22);
		
		rbtAsiento26 = new JRadioButton("26");
		rbtAsiento26.setForeground(Color.BLACK);
		rbtAsiento26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento26.setBackground(new Color(30, 144, 255));
		rbtAsiento26.setBounds(433, 241, 59, 55);
		panel.add(rbtAsiento26);
		
		rbtAsiento25 = new JRadioButton("25");
		rbtAsiento25.setForeground(Color.BLACK);
		rbtAsiento25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento25.setBackground(new Color(30, 144, 255));
		rbtAsiento25.setBounds(433, 186, 59, 55);
		panel.add(rbtAsiento25);
		
		rbtAsiento21 = new JRadioButton("21");
		rbtAsiento21.setForeground(Color.BLACK);
		rbtAsiento21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento21.setBackground(new Color(30, 144, 255));
		rbtAsiento21.setBounds(374, 186, 59, 55);
		panel.add(rbtAsiento21);
		
		rbtAsiento17 = new JRadioButton("17");
		rbtAsiento17.setForeground(Color.BLACK);
		rbtAsiento17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento17.setBackground(new Color(30, 144, 255));
		rbtAsiento17.setBounds(315, 21, 59, 55);
		panel.add(rbtAsiento17);
		
		rbtAsiento18 = new JRadioButton("18");
		rbtAsiento18.setForeground(Color.BLACK);
		rbtAsiento18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento18.setBackground(new Color(30, 144, 255));
		rbtAsiento18.setBounds(315, 76, 59, 55);
		panel.add(rbtAsiento18);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_12.setLayout(null);
		panel_12.setBounds(315, 131, 59, 55);
		panel.add(panel_12);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 59, 55);
		panel_12.add(label_1);
		label_1.setIcon(new ImageIcon(Bus_Normal_1.class.getResource("/imagenes/tv.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		rbtAsiento19 = new JRadioButton("19");
		rbtAsiento19.setForeground(Color.BLACK);
		rbtAsiento19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento19.setBackground(new Color(30, 144, 255));
		rbtAsiento19.setBounds(315, 186, 59, 55);
		panel.add(rbtAsiento19);
		
		rbtAsiento20 = new JRadioButton("20");
		rbtAsiento20.setForeground(Color.BLACK);
		rbtAsiento20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento20.setBackground(new Color(30, 144, 255));
		rbtAsiento20.setBounds(315, 241, 59, 55);
		panel.add(rbtAsiento20);
		
		rbtAsiento40 = new JRadioButton("40");
		rbtAsiento40.setForeground(Color.BLACK);
		rbtAsiento40.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento40.setBackground(new Color(30, 144, 255));
		rbtAsiento40.setBounds(669, 241, 59, 55);
		panel.add(rbtAsiento40);
		
		rbtAsiento36 = new JRadioButton("36");
		rbtAsiento36.setForeground(Color.BLACK);
		rbtAsiento36.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento36.setBackground(new Color(30, 144, 255));
		rbtAsiento36.setBounds(610, 76, 59, 55);
		panel.add(rbtAsiento36);
		
		rbtAsiento32 = new JRadioButton("32");
		rbtAsiento32.setForeground(Color.BLACK);
		rbtAsiento32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento32.setBackground(new Color(30, 144, 255));
		rbtAsiento32.setBounds(551, 76, 59, 55);
		panel.add(rbtAsiento32);
		
		rbtAsiento31 = new JRadioButton("31");
		rbtAsiento31.setForeground(Color.BLACK);
		rbtAsiento31.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento31.setBackground(new Color(30, 144, 255));
		rbtAsiento31.setBounds(551, 21, 59, 55);
		panel.add(rbtAsiento31);
		
		rbtAsiento35 = new JRadioButton("35");
		rbtAsiento35.setForeground(Color.BLACK);
		rbtAsiento35.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento35.setBackground(new Color(30, 144, 255));
		rbtAsiento35.setBounds(610, 21, 59, 55);
		panel.add(rbtAsiento35);
		
		rbtAsiento39 = new JRadioButton("39");
		rbtAsiento39.setForeground(Color.BLACK);
		rbtAsiento39.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento39.setBackground(new Color(30, 144, 255));
		rbtAsiento39.setBounds(669, 186, 59, 55);
		panel.add(rbtAsiento39);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setLayout(null);
		panel_13.setBounds(728, 131, 59, 55);
		panel.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setLayout(null);
		panel_14.setBounds(610, 131, 59, 55);
		panel.add(panel_14);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/tv.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(0, 0, 59, 55);
		panel_14.add(label_6);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setLayout(null);
		panel_15.setBounds(551, 131, 59, 55);
		panel.add(panel_15);
		
		rbtAsiento30 = new JRadioButton("30");
		rbtAsiento30.setForeground(Color.BLACK);
		rbtAsiento30.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento30.setBackground(new Color(30, 144, 255));
		rbtAsiento30.setBounds(492, 241, 59, 55);
		panel.add(rbtAsiento30);
		
		rbtAsiento34 = new JRadioButton("34");
		rbtAsiento34.setForeground(Color.BLACK);
		rbtAsiento34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento34.setBackground(new Color(30, 144, 255));
		rbtAsiento34.setBounds(551, 241, 59, 55);
		panel.add(rbtAsiento34);
		
		rbtAsiento38 = new JRadioButton("38");
		rbtAsiento38.setForeground(Color.BLACK);
		rbtAsiento38.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento38.setBackground(new Color(30, 144, 255));
		rbtAsiento38.setBounds(610, 241, 59, 55);
		panel.add(rbtAsiento38);
		
		rbtAsiento37 = new JRadioButton("37");
		rbtAsiento37.setForeground(Color.BLACK);
		rbtAsiento37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento37.setBackground(new Color(30, 144, 255));
		rbtAsiento37.setBounds(610, 186, 59, 55);
		panel.add(rbtAsiento37);
		
		rbtAsiento33 = new JRadioButton("33");
		rbtAsiento33.setForeground(Color.BLACK);
		rbtAsiento33.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento33.setBackground(new Color(30, 144, 255));
		rbtAsiento33.setBounds(551, 186, 59, 55);
		panel.add(rbtAsiento33);
		
		rbtAsiento29 = new JRadioButton("29");
		rbtAsiento29.setForeground(Color.BLACK);
		rbtAsiento29.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento29.setBackground(new Color(30, 144, 255));
		rbtAsiento29.setBounds(492, 186, 59, 55);
		panel.add(rbtAsiento29);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.setLayout(null);
		panel_16.setBounds(1023, 21, 59, 55);
		panel.add(panel_16);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/sshh.png")));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(0, 0, 59, 55);
		panel_16.add(label_8);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_17.setLayout(null);
		panel_17.setBounds(1023, 76, 59, 55);
		panel.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_18.setLayout(null);
		panel_18.setBounds(1023, 131, 59, 55);
		panel.add(panel_18);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/sshh.png")));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(0, 0, 59, 55);
		panel_18.add(label_9);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_19.setBounds(1023, 186, 59, 55);
		panel.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_20.setBounds(1023, 241, 59, 55);
		panel.add(panel_20);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/sshh.png")));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(0, 0, 59, 55);
		panel_20.add(label_10);
		
		rbtAsiento44 = new JRadioButton("44");
		rbtAsiento44.setForeground(Color.BLACK);
		rbtAsiento44.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento44.setBackground(new Color(30, 144, 255));
		rbtAsiento44.setBounds(728, 241, 59, 55);
		panel.add(rbtAsiento44);
		
		rbtAsiento43 = new JRadioButton("43");
		rbtAsiento43.setForeground(Color.BLACK);
		rbtAsiento43.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento43.setBackground(new Color(30, 144, 255));
		rbtAsiento43.setBounds(728, 186, 59, 55);
		panel.add(rbtAsiento43);
		
		panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_21.setBounds(787, 131, 59, 55);
		panel.add(panel_21);
		
		rbtAsiento42 = new JRadioButton("42");
		rbtAsiento42.setForeground(Color.BLACK);
		rbtAsiento42.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento42.setBackground(new Color(30, 144, 255));
		rbtAsiento42.setBounds(728, 76, 59, 55);
		panel.add(rbtAsiento42);
		
		rbtAsiento41 = new JRadioButton("41");
		rbtAsiento41.setForeground(Color.BLACK);
		rbtAsiento41.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento41.setBackground(new Color(30, 144, 255));
		rbtAsiento41.setBounds(728, 21, 59, 55);
		panel.add(rbtAsiento41);
		
		rbtAsiento48 = new JRadioButton("48");
		rbtAsiento48.setForeground(Color.BLACK);
		rbtAsiento48.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento48.setBackground(new Color(30, 144, 255));
		rbtAsiento48.setBounds(787, 241, 59, 55);
		panel.add(rbtAsiento48);
		
		rbtAsiento47 = new JRadioButton("47");
		rbtAsiento47.setForeground(Color.BLACK);
		rbtAsiento47.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento47.setBackground(new Color(30, 144, 255));
		rbtAsiento47.setBounds(787, 186, 59, 55);
		panel.add(rbtAsiento47);
		
		rbtAsiento51 = new JRadioButton("51");
		rbtAsiento51.setForeground(Color.BLACK);
		rbtAsiento51.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento51.setBackground(new Color(30, 144, 255));
		rbtAsiento51.setBounds(846, 186, 59, 55);
		panel.add(rbtAsiento51);
		
		rbtAsiento52 = new JRadioButton("52");
		rbtAsiento52.setForeground(Color.BLACK);
		rbtAsiento52.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento52.setBackground(new Color(30, 144, 255));
		rbtAsiento52.setBounds(846, 241, 59, 55);
		panel.add(rbtAsiento52);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_22.setBounds(846, 131, 59, 55);
		panel.add(panel_22);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Bus_Cama_1.class.getResource("/imagenes/tv.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(0, 0, 59, 55);
		panel_22.add(label_7);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_23.setBounds(905, 131, 59, 55);
		panel.add(panel_23);
		
		rbtAsiento50 = new JRadioButton("50");
		rbtAsiento50.setForeground(Color.BLACK);
		rbtAsiento50.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento50.setBackground(new Color(30, 144, 255));
		rbtAsiento50.setBounds(846, 76, 59, 55);
		panel.add(rbtAsiento50);
		
		rbtAsiento46 = new JRadioButton("46");
		rbtAsiento46.setForeground(Color.BLACK);
		rbtAsiento46.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento46.setBackground(new Color(30, 144, 255));
		rbtAsiento46.setBounds(787, 76, 59, 55);
		panel.add(rbtAsiento46);
		
		rbtAsiento45 = new JRadioButton("45");
		rbtAsiento45.setForeground(Color.BLACK);
		rbtAsiento45.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento45.setBackground(new Color(30, 144, 255));
		rbtAsiento45.setBounds(787, 21, 59, 55);
		panel.add(rbtAsiento45);
		
		rbtAsiento49 = new JRadioButton("49");
		rbtAsiento49.setForeground(Color.BLACK);
		rbtAsiento49.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento49.setBackground(new Color(30, 144, 255));
		rbtAsiento49.setBounds(846, 21, 59, 55);
		panel.add(rbtAsiento49);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_24.setBounds(374, 131, 59, 55);
		panel.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_25.setBounds(20, 131, 59, 55);
		panel.add(panel_25);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 59, 55);
		panel_25.add(label);
		label.setIcon(new ImageIcon(Bus_Normal_1.class.getResource("/imagenes/tv.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_26.setBounds(20, 76, 59, 55);
		panel.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_27.setBounds(20, 21, 59, 55);
		panel.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_28.setBounds(20, 241, 59, 55);
		panel.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_29.setBounds(20, 186, 59, 55);
		panel.add(panel_29);
		
		rbtAsiento53 = new JRadioButton("53");
		rbtAsiento53.setForeground(Color.BLACK);
		rbtAsiento53.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento53.setBackground(new Color(30, 144, 255));
		rbtAsiento53.setBounds(905, 21, 59, 55);
		panel.add(rbtAsiento53);
		
		rbtAsiento54 = new JRadioButton("54");
		rbtAsiento54.setForeground(Color.BLACK);
		rbtAsiento54.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento54.setBackground(new Color(30, 144, 255));
		rbtAsiento54.setBounds(905, 76, 59, 55);
		panel.add(rbtAsiento54);
		
		rbtAsiento57 = new JRadioButton("57");
		rbtAsiento57.setForeground(Color.BLACK);
		rbtAsiento57.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento57.setBackground(new Color(30, 144, 255));
		rbtAsiento57.setBounds(964, 21, 59, 55);
		panel.add(rbtAsiento57);
		
		rbtAsiento58 = new JRadioButton("58");
		rbtAsiento58.setForeground(Color.BLACK);
		rbtAsiento58.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento58.setBackground(new Color(30, 144, 255));
		rbtAsiento58.setBounds(964, 76, 59, 55);
		panel.add(rbtAsiento58);
		
		rbtAsiento55 = new JRadioButton("55");
		rbtAsiento55.setForeground(Color.BLACK);
		rbtAsiento55.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento55.setBackground(new Color(30, 144, 255));
		rbtAsiento55.setBounds(905, 186, 59, 55);
		panel.add(rbtAsiento55);
		
		rbtAsiento56 = new JRadioButton("56");
		rbtAsiento56.setForeground(Color.BLACK);
		rbtAsiento56.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento56.setBackground(new Color(30, 144, 255));
		rbtAsiento56.setBounds(905, 241, 59, 55);
		panel.add(rbtAsiento56);
		
		rbtAsiento59 = new JRadioButton("59");
		rbtAsiento59.setForeground(Color.BLACK);
		rbtAsiento59.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento59.setBackground(new Color(30, 144, 255));
		rbtAsiento59.setBounds(964, 186, 59, 55);
		panel.add(rbtAsiento59);
		
		rbtAsiento60 = new JRadioButton("60");
		rbtAsiento60.setForeground(Color.BLACK);
		rbtAsiento60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtAsiento60.setBackground(new Color(30, 144, 255));
		rbtAsiento60.setBounds(964, 241, 59, 55);
		panel.add(rbtAsiento60);
		
		panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_30.setBounds(964, 131, 59, 55);
		panel.add(panel_30);
		
		JLabel lblSeleccioneElAsiento = new JLabel("Seleccione el Asiento:");
		lblSeleccioneElAsiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSeleccioneElAsiento.setBounds(20, 11, 169, 18);
		contentPane.add(lblSeleccioneElAsiento);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AsientosSeleccionado();
				
				Registro dato = new Registro();
				dato.setVisible(true);
				dispose();
			}
		});
		btnSiguiente.setForeground(Color.BLUE);
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSiguiente.setBounds(832, 456, 125, 32);
		contentPane.add(btnSiguiente);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Vender venta = new Vender();
				venta.setVisible(true);
				dispose();
			}
		});
		btnAtras.setForeground(Color.BLACK);
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAtras.setBounds(194, 456, 125, 32);
		contentPane.add(btnAtras);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Inicio inicio = new Inicio();
				inicio.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(Color.RED);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(513, 456, 125, 32);
		contentPane.add(btnCancelar);
		
		lblRuta = new JLabel("Ruta :");
		lblRuta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRuta.setBounds(66, 40, 71, 23);
		contentPane.add(lblRuta);
		
		lblruta = new JLabel("");
		lblruta.setForeground(Color.BLUE);
		lblruta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblruta.setBounds(147, 40, 152, 23);
		contentPane.add(lblruta);
		
		lblhora = new JLabel("");
		lblhora.setForeground(Color.BLUE);
		lblhora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblhora.setBounds(524, 40, 152, 23);
		contentPane.add(lblhora);
		
		lblHora = new JLabel("Hora : ");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHora.setBounds(443, 40, 71, 23);
		contentPane.add(lblHora);
		
		lblBus = new JLabel("Bus : ");
		lblBus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBus.setBounds(807, 40, 71, 23);
		contentPane.add(lblBus);
		
		lblbus = new JLabel("");
		lblbus.setForeground(Color.BLUE);
		lblbus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblbus.setBounds(888, 40, 152, 23);
		contentPane.add(lblbus);
		
		panel_31 = new JPanel();
		panel_31.setBackground(Color.RED);
		panel_31.setBounds(380, 407, 36, 23);
		contentPane.add(panel_31);
		
		lblAsientoOcupado = new JLabel("Asiento Ocupado");
		lblAsientoOcupado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAsientoOcupado.setBounds(425, 407, 163, 23);
		contentPane.add(lblAsientoOcupado);
		
		lblAsientoLibre = new JLabel("Asiento Libre");
		lblAsientoLibre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAsientoLibre.setBounds(699, 407, 163, 23);
		contentPane.add(lblAsientoLibre);
		
		panel_32 = new JPanel();
		panel_32.setBackground(SystemColor.textHighlight);
		panel_32.setBounds(654, 407, 36, 23);
		contentPane.add(panel_32);
		
		
		lblruta.setText(Vender.ruta);
		lblbus.setText(Vender.bus);
		lblhora.setText(Vender.hora);
		
		setLocationRelativeTo(null);
		
		if(a1 > 0)
		{
			rbtAsiento1.setEnabled(false);
			rbtAsiento1.setSelected(false);
			rbtAsiento1.setBackground(Color.red);
		}
		if(a2 > 0)
		{
			rbtAsiento2.setSelected(false); 
			rbtAsiento2.setBackground(Color.red);
			rbtAsiento2.setEnabled(false);
		}
		if(a3 >0)
		{
			rbtAsiento3.setBackground(Color.red);
			rbtAsiento3.setEnabled(false);
			rbtAsiento3.setSelected(false);
		}
		if(a4 > 0)
		{
			rbtAsiento4.setEnabled(false);
			rbtAsiento4.setSelected(false);
			rbtAsiento4.setBackground(Color.red);
		}
		if(a5 > 0)
		{
			rbtAsiento5.setSelected(false); 
			rbtAsiento5.setBackground(Color.red);
			rbtAsiento5.setEnabled(false);
		}
		if(a6 >0)
		{
			rbtAsiento6.setBackground(Color.red);
			rbtAsiento6.setEnabled(false);
			rbtAsiento6.setSelected(false);
		}
		if(a7 > 0)
		{
			rbtAsiento7.setEnabled(false);
			rbtAsiento7.setSelected(false);
			rbtAsiento7.setBackground(Color.red);
		}
		if(a8 > 0)
		{
			rbtAsiento8.setSelected(false); 
			rbtAsiento8.setBackground(Color.red);
			rbtAsiento8.setEnabled(false);
		}
		if(a9 >0)
		{
			rbtAsiento9.setBackground(Color.red);
			rbtAsiento9.setEnabled(false);
			rbtAsiento9.setSelected(false);
		}
		if(b >0)
		{
			rbtAsiento10.setBackground(Color.red);
			rbtAsiento10.setEnabled(false);
			rbtAsiento10.setSelected(false);
		}
		if(b1 > 0)
		{
			rbtAsiento11.setEnabled(false);
			rbtAsiento11.setSelected(false);
			rbtAsiento11.setBackground(Color.red);
		}
		if(b2 > 0)
		{
			rbtAsiento12.setSelected(false); 
			rbtAsiento12.setBackground(Color.red);
			rbtAsiento12.setEnabled(false);
		}
		if(b3 >0)
		{
			rbtAsiento13.setBackground(Color.red);
			rbtAsiento13.setEnabled(false);
			rbtAsiento13.setSelected(false);
		}
		if(b4 > 0)
		{
			rbtAsiento14.setEnabled(false);
			rbtAsiento14.setSelected(false);
			rbtAsiento14.setBackground(Color.red);
		}
		if(b5 > 0)
		{
			rbtAsiento15.setSelected(false); 
			rbtAsiento15.setBackground(Color.red);
			rbtAsiento15.setEnabled(false);
		}
		if(b6 >0)
		{
			rbtAsiento16.setBackground(Color.red);
			rbtAsiento16.setEnabled(false);
			rbtAsiento16.setSelected(false);
		}
		if(b7 > 0)
		{
			rbtAsiento17.setEnabled(false);
			rbtAsiento17.setSelected(false);
			rbtAsiento17.setBackground(Color.red);
		}
		if(b8 > 0)
		{
			rbtAsiento18.setSelected(false); 
			rbtAsiento18.setBackground(Color.red);
			rbtAsiento18.setEnabled(false);
		}
		if(b9 >0)
		{
			rbtAsiento19.setBackground(Color.red);
			rbtAsiento19.setEnabled(false);
			rbtAsiento19.setSelected(false);
		}
		if(c >0)
		{
			rbtAsiento20.setBackground(Color.red);
			rbtAsiento20.setEnabled(false);
			rbtAsiento20.setSelected(false);
		}
		if(c1 > 0)
		{
			rbtAsiento21.setEnabled(false);
			rbtAsiento21.setSelected(false);
			rbtAsiento21.setBackground(Color.red);
		}
		if(c2 > 0)
		{
			rbtAsiento22.setSelected(false); 
			rbtAsiento22.setBackground(Color.red);
			rbtAsiento22.setEnabled(false);
		}
		if(c3 >0)
		{
			rbtAsiento23.setBackground(Color.red);
			rbtAsiento23.setEnabled(false);
			rbtAsiento23.setSelected(false);
		}
		if(c4 > 0)
		{
			rbtAsiento24.setEnabled(false);
			rbtAsiento24.setSelected(false);
			rbtAsiento24.setBackground(Color.red);
		}
		if(c5 > 0)
		{
			rbtAsiento25.setSelected(false); 
			rbtAsiento25.setBackground(Color.red);
			rbtAsiento25.setEnabled(false);
		}
		if(c6 >0)
		{
			rbtAsiento26.setBackground(Color.red);
			rbtAsiento26.setEnabled(false);
			rbtAsiento26.setSelected(false);
		}
		if(c7 > 0)
		{
			rbtAsiento27.setEnabled(false);
			rbtAsiento27.setSelected(false);
			rbtAsiento27.setBackground(Color.red);
		}
		if(c8 > 0)
		{
			rbtAsiento28.setSelected(false); 
			rbtAsiento28.setBackground(Color.red);
			rbtAsiento28.setEnabled(false);
		}
		if(c9 >0)
		{
			rbtAsiento29.setBackground(Color.red);
			rbtAsiento29.setEnabled(false);
			rbtAsiento29.setSelected(false);
		}
		if(d >0)
		{
			rbtAsiento30.setBackground(Color.red);
			rbtAsiento30.setEnabled(false);
			rbtAsiento30.setSelected(false);
		}
		if(d1 > 0)
		{
			rbtAsiento31.setEnabled(false);
			rbtAsiento31.setSelected(false);
			rbtAsiento31.setBackground(Color.red);
		}
		if(d2 > 0)
		{
			rbtAsiento31.setSelected(false); 
			rbtAsiento32.setBackground(Color.red);
			rbtAsiento32.setEnabled(false);
		}
		if(d3 >0)
		{
			rbtAsiento33.setBackground(Color.red);
			rbtAsiento33.setEnabled(false);
			rbtAsiento33.setSelected(false);
		}
		if(d4 > 0)
		{
			rbtAsiento34.setEnabled(false);
			rbtAsiento34.setSelected(false);
			rbtAsiento34.setBackground(Color.red);
		}
		if(d5 > 0)
		{
			rbtAsiento35.setSelected(false); 
			rbtAsiento35.setBackground(Color.red);
			rbtAsiento35.setEnabled(false);
		}
		if(d6 >0)
		{
			rbtAsiento36.setBackground(Color.red);
			rbtAsiento36.setEnabled(false);
			rbtAsiento36.setSelected(false);
		}
		if(d7 > 0)
		{
			rbtAsiento37.setEnabled(false);
			rbtAsiento37.setSelected(false);
			rbtAsiento37.setBackground(Color.red);
		}
		if(d8 > 0)
		{
			rbtAsiento38.setSelected(false); 
			rbtAsiento38.setBackground(Color.red);
			rbtAsiento38.setEnabled(false);
		}
		if(d9 >0)
		{
			rbtAsiento39.setBackground(Color.red);
			rbtAsiento39.setEnabled(false);
			rbtAsiento39.setSelected(false);
		}
		if(e >0)
		{
			rbtAsiento40.setBackground(Color.red);
			rbtAsiento40.setEnabled(false);
			rbtAsiento40.setSelected(false);
		}
		if(e1 > 0)
		{
			rbtAsiento41.setEnabled(false);
			rbtAsiento41.setSelected(false);
			rbtAsiento41.setBackground(Color.red);
		}
		if(e2 > 0)
		{
			rbtAsiento42.setSelected(false); 
			rbtAsiento42.setBackground(Color.red);
			rbtAsiento42.setEnabled(false);
		}
		if(e3 >0)
		{
			rbtAsiento43.setBackground(Color.red);
			rbtAsiento43.setEnabled(false);
			rbtAsiento43.setSelected(false);
		}
		if(e4 > 0)
		{
			rbtAsiento44.setEnabled(false);
			rbtAsiento44.setSelected(false);
			rbtAsiento44.setBackground(Color.red);
		}
		if(e5 > 0)
		{
			rbtAsiento45.setSelected(false); 
			rbtAsiento45.setBackground(Color.red);
			rbtAsiento45.setEnabled(false);
		}
		if(e6 >0)
		{
			rbtAsiento46.setBackground(Color.red);
			rbtAsiento46.setEnabled(false);
			rbtAsiento46.setSelected(false);
		}
		if(e7 > 0)
		{
			rbtAsiento47.setEnabled(false);
			rbtAsiento47.setSelected(false);
			rbtAsiento47.setBackground(Color.red);
		}
		if(e8 > 0)
		{
			rbtAsiento48.setSelected(false); 
			rbtAsiento48.setBackground(Color.red);
			rbtAsiento48.setEnabled(false);
		}
		if(e9 >0)
		{
			rbtAsiento49.setBackground(Color.red);
			rbtAsiento49.setEnabled(false);
			rbtAsiento49.setSelected(false);
		}
		if(f >0)
		{
			rbtAsiento50.setBackground(Color.red);
			rbtAsiento50.setEnabled(false);
			rbtAsiento50.setSelected(false);
		}
		if(f1 > 0)
		{
			rbtAsiento51.setEnabled(false);
			rbtAsiento51.setSelected(false);
			rbtAsiento51.setBackground(Color.red);
		}
		if(f2 > 0)
		{
			rbtAsiento52.setSelected(false); 
			rbtAsiento52.setBackground(Color.red);
			rbtAsiento52.setEnabled(false);
		}
		if(f3 >0)
		{
			rbtAsiento53.setBackground(Color.red);
			rbtAsiento53.setEnabled(false);
			rbtAsiento53.setSelected(false);
		}
		if(f4 > 0)
		{
			rbtAsiento54.setEnabled(false);
			rbtAsiento54.setSelected(false);
			rbtAsiento54.setBackground(Color.red);
		}
		if(f5 > 0)
		{
			rbtAsiento55.setSelected(false); 
			rbtAsiento55.setBackground(Color.red);
			rbtAsiento55.setEnabled(false);
		}
		if(f6 >0)
		{
			rbtAsiento56.setBackground(Color.red);
			rbtAsiento56.setEnabled(false);
			rbtAsiento56.setSelected(false);
		}
		if(f7 > 0)
		{
			rbtAsiento57.setEnabled(false);
			rbtAsiento57.setSelected(false);
			rbtAsiento57.setBackground(Color.red);
		}
		if(f8 > 0)
		{
			rbtAsiento58.setSelected(false); 
			rbtAsiento58.setBackground(Color.red);
			rbtAsiento58.setEnabled(false);
		}
		if(f9 >0)
		{
			rbtAsiento59.setBackground(Color.red);
			rbtAsiento59.setEnabled(false);
			rbtAsiento59.setSelected(false);
		}
		if(g >0)
		{
			rbtAsiento60.setBackground(Color.red);
			rbtAsiento60.setEnabled(false);
			rbtAsiento60.setSelected(false);
		}
		
	}
	
	public static int  a1,a2,a3,a4,a5,a6,a7,a8,a9,b,b1,b2,b3,b4,b5,b6,b7,b8,b9,c,c1,c2,c3,c4,c5,c6,c7,c8,c9,
	d,d1,d2,d3,d4,d5,d6,d7,d8,d9,e,e1,e2,e3,e4,e5,e6,e7,e8,e9,f,f1,f2,f3,f4,f5,f6,f7,f8,f9,g;
	
	public static String asiento = "";
	public static int cantidad =  0;

	void AsientosSeleccionado()
	{		
		if(rbtAsiento1.isSelected())
		{
			a1 = Integer.parseInt(rbtAsiento1.getText().toString());
			asiento+=" 01 ";
			cantidad++;
		}
		if(rbtAsiento2.isSelected())
		{
			a2 = Integer.parseInt(rbtAsiento2.getText().toString());
			asiento+=" 02 ";
			cantidad++;
		}
		if(rbtAsiento3.isSelected())
		{
			a3 = Integer.parseInt(rbtAsiento3.getText().toString());
			asiento+=" 03 ";
			cantidad++;
		}
		if(rbtAsiento4.isSelected())
		{
			a4 = Integer.parseInt(rbtAsiento4.getText().toString());
			asiento+=" 04 ";
			cantidad++;
		}
		if(rbtAsiento5.isSelected())
		{
			a5 = Integer.parseInt(rbtAsiento5.getText().toString());
			asiento+=" 05 ";
			cantidad++;
		}
		if(rbtAsiento6.isSelected())
		{
			a6 = Integer.parseInt(rbtAsiento6.getText().toString());
			asiento+=" 06 ";
			cantidad++;
		}
		if(rbtAsiento7.isSelected())
		{
			a7 = Integer.parseInt(rbtAsiento7.getText().toString());
			asiento+=" 07 ";
			cantidad++;
		}
		if(rbtAsiento8.isSelected())
		{
			a8 = Integer.parseInt(rbtAsiento8.getText().toString());
			asiento+=" 08 ";
			cantidad++;
		}
		if(rbtAsiento9.isSelected())
		{
			a9 = Integer.parseInt(rbtAsiento9.getText().toString());
			asiento+=" 09 ";
			cantidad++;
		}
		if(rbtAsiento10.isSelected())
		{
			b = Integer.parseInt(rbtAsiento10.getText().toString());
			asiento+=" 10 ";
			cantidad++;
		}
		if(rbtAsiento11.isSelected())
		{
			b1 = Integer.parseInt(rbtAsiento11.getText().toString());
			asiento+=" 11 ";
			cantidad++;
		}
		if(rbtAsiento12.isSelected())
		{
			b2 = Integer.parseInt(rbtAsiento12.getText().toString());
			asiento+=" 12 ";
			cantidad++;
		}
		if(rbtAsiento13.isSelected())
		{
			b3 = Integer.parseInt(rbtAsiento13.getText().toString());
			asiento+=" 13 ";
			cantidad++;
		}
		if(rbtAsiento14.isSelected())
		{
			b4 = Integer.parseInt(rbtAsiento14.getText().toString());
			asiento+=" 14 ";
			cantidad++;
		}
		if(rbtAsiento15.isSelected())
		{
			b5 = Integer.parseInt(rbtAsiento15.getText().toString());
			asiento+=" 15 ";
			cantidad++;
		}
		if(rbtAsiento16.isSelected())
		{
			b6 = Integer.parseInt(rbtAsiento16.getText().toString());
			asiento+=" 16 ";
			cantidad++;
		}
		if(rbtAsiento17.isSelected())
		{
			b7 = Integer.parseInt(rbtAsiento17.getText().toString());
			asiento+=" 17 ";
			cantidad++;
		}
		if(rbtAsiento18.isSelected())
		{
			b8 = Integer.parseInt(rbtAsiento18.getText().toString());
			asiento+=" 18 ";
			cantidad++;
		}
		if(rbtAsiento19.isSelected())
		{
			b9 = Integer.parseInt(rbtAsiento19.getText().toString());
			asiento+=" 19 ";
			cantidad++;
		}
		if(rbtAsiento20.isSelected())
		{
			c = Integer.parseInt(rbtAsiento20.getText().toString());
			asiento+=" 20 ";
			cantidad++;
		}
		if(rbtAsiento21.isSelected())
		{
			c1 = Integer.parseInt(rbtAsiento21.getText().toString());
			asiento+=" 21 ";
			cantidad++;
		}
		if(rbtAsiento22.isSelected())
		{
			c2 = Integer.parseInt(rbtAsiento22.getText().toString()); 
			asiento+=" 22 ";
			cantidad++;
		}
		if(rbtAsiento23.isSelected())
		{
			c3 = Integer.parseInt(rbtAsiento23.getText().toString());
			asiento+=" 23 ";
			cantidad++;
		}
		if(rbtAsiento24.isSelected())
		{
			c4 = Integer.parseInt(rbtAsiento24.getText().toString());
			asiento+=" 24 ";
			cantidad++;
		}
		if(rbtAsiento25.isSelected())
		{
			c5 = Integer.parseInt(rbtAsiento25.getText().toString());
			asiento+=" 25 ";
			cantidad++;
		}
		if(rbtAsiento26.isSelected())
		{
			c6 = Integer.parseInt(rbtAsiento26.getText().toString());
			asiento+=" 26 ";
			cantidad++;
		}
		if(rbtAsiento27.isSelected())
		{
			c7 = Integer.parseInt(rbtAsiento27.getText().toString());
			asiento+=" 27 ";
			cantidad++;
		}
		if(rbtAsiento28.isSelected())
		{
			c8 = Integer.parseInt(rbtAsiento28.getText().toString());
			asiento+=" 28 ";
			cantidad++;
		}
		if(rbtAsiento29.isSelected())
		{
			c9 = Integer.parseInt(rbtAsiento29.getText().toString());
			asiento+=" 29 ";
			cantidad++;
		}
		if(rbtAsiento30.isSelected())
		{
			d = Integer.parseInt(rbtAsiento30.getText().toString());
			asiento+=" 30 ";
			cantidad++;
		}
		if(rbtAsiento31.isSelected())
		{
			d1 = Integer.parseInt(rbtAsiento31.getText().toString());
			asiento+=" 31 ";
			cantidad++;
		}
		if(rbtAsiento32.isSelected())
		{
			d2 = Integer.parseInt(rbtAsiento32.getText().toString());
			asiento+=" 32 ";
			cantidad++;
		}
		if(rbtAsiento33.isSelected())
		{
			d3 = Integer.parseInt(rbtAsiento33.getText().toString());
			asiento+=" 33 ";
			cantidad++;
		}
		if(rbtAsiento34.isSelected())
		{
			d4 = Integer.parseInt(rbtAsiento34.getText().toString());
			asiento+=" 34 ";
			cantidad++;
		}
		if(rbtAsiento35.isSelected())
		{
			d5 = Integer.parseInt(rbtAsiento35.getText().toString());
			asiento+=" 35 ";
			cantidad++;
		}
		if(rbtAsiento36.isSelected())
		{
			d6 = Integer.parseInt(rbtAsiento36.getText().toString());
			asiento+=" 36 ";
			cantidad++;
		}
		if(rbtAsiento37.isSelected())
		{
			d7 = Integer.parseInt(rbtAsiento37.getText().toString());
			asiento+=" 37 ";
			cantidad++;
		}
		if(rbtAsiento38.isSelected())
		{
			d8 = Integer.parseInt(rbtAsiento38.getText().toString());
			asiento+=" 38 ";
			cantidad++;
		}
		if(rbtAsiento39.isSelected())
		{
			d9 = Integer.parseInt(rbtAsiento39.getText().toString());
			asiento+=" 39 ";
			cantidad++;
		}
		if(rbtAsiento40.isSelected())
		{
			e = Integer.parseInt(rbtAsiento40.getText().toString());
			asiento+=" 40 ";
			cantidad++;
		}
		if(rbtAsiento41.isSelected())
		{
			e1 = Integer.parseInt(rbtAsiento41.getText().toString());
			asiento+=" 41 ";
			cantidad++;
		}
		if(rbtAsiento42.isSelected())
		{
			e2 = Integer.parseInt(rbtAsiento42.getText().toString());
			asiento+=" 42 ";
			cantidad++;
		}
		if(rbtAsiento41.isSelected())
		{
			e3 = Integer.parseInt(rbtAsiento43.getText().toString());
			asiento+=" 43 ";
			cantidad++;
		}
		if(rbtAsiento44.isSelected())
		{
			e4 = Integer.parseInt(rbtAsiento44.getText().toString());
			asiento+=" 44 ";
			cantidad++;
		}
		if(rbtAsiento45.isSelected())
		{
			e5 = Integer.parseInt(rbtAsiento45.getText().toString());
			asiento+=" 45 ";
			cantidad++;
		}
		if(rbtAsiento46.isSelected())
		{
			e6 = Integer.parseInt(rbtAsiento46.getText().toString());
			asiento+=" 46 ";
			cantidad++;
		}
		if(rbtAsiento47.isSelected())
		{
			e7 = Integer.parseInt(rbtAsiento47.getText().toString());
			asiento+=" 47 ";
			cantidad++;
		}
		if(rbtAsiento48.isSelected())
		{
			e8 = Integer.parseInt(rbtAsiento48.getText().toString());
			asiento+=" 48 ";
			cantidad++;
		}
		if(rbtAsiento49.isSelected())
		{
			e9 = Integer.parseInt(rbtAsiento49.getText().toString());
			asiento+=" 49 ";
			cantidad++;
		}
		if(rbtAsiento50.isSelected())
		{
			f = Integer.parseInt(rbtAsiento50.getText().toString());
			asiento+=" 50 ";
			cantidad++;
		}
		if(rbtAsiento51.isSelected())
		{
			f1 = Integer.parseInt(rbtAsiento51.getText().toString());
			asiento+=" 51 ";
			cantidad++;
		}
		if(rbtAsiento52.isSelected())
		{
			f2 = Integer.parseInt(rbtAsiento52.getText().toString());
			asiento+=" 52 ";
			cantidad++;
		}
		if(rbtAsiento53.isSelected())
		{
			f3 = Integer.parseInt(rbtAsiento53.getText().toString());
			asiento+=" 53 ";
			cantidad++;
		}
		if(rbtAsiento54.isSelected())
		{
			f4 = Integer.parseInt(rbtAsiento54.getText().toString());
			asiento+=" 54 ";
			cantidad++;
		}
		if(rbtAsiento55.isSelected())
		{
			f5 = Integer.parseInt(rbtAsiento55.getText().toString());
			asiento+=" 55 ";
			cantidad++;
		}
		if(rbtAsiento56.isSelected())
		{
			f6 = Integer.parseInt(rbtAsiento56.getText().toString());
			asiento+=" 56 ";
			cantidad++;
		}
		if(rbtAsiento57.isSelected())
		{
			f7 = Integer.parseInt(rbtAsiento57.getText().toString());
			asiento+=" 57 ";
			cantidad++;
		}
		if(rbtAsiento58.isSelected())
		{
			f8 = Integer.parseInt(rbtAsiento58.getText().toString());
			asiento+=" 58 ";
			cantidad++;
		}
		if(rbtAsiento59.isSelected())
		{
			f9 = Integer.parseInt(rbtAsiento59.getText().toString());
			asiento+=" 57 ";
			cantidad++;
		}
		if(rbtAsiento60.isSelected())
		{
			g = Integer.parseInt(rbtAsiento60.getText().toString());
			asiento+=" 60 ";
			cantidad++;
		}
	}
}
