package sudoku;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;




import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class SudukoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txt00;
	private JPanel panel_2;
	private JTextField txt01;
	private JTextField txt02;
	private JTextField txt12;
	private JTextField txt11;
	private JTextField txt10;
	private JTextField txt22;
	private JTextField txt21;
	private JTextField txt20;
	private JPanel panel_1;
	private JTextField txt03;
	private JTextField txt04;
	private JTextField txt05;
	private JTextField txt15;
	private JTextField txt14;
	private JTextField txt13;
	private JTextField txt25;
	private JTextField txt24;
	private JTextField txt23;
	private JPanel panel_3;
	private JTextField txt33;
	private JTextField txt34;
	private JTextField txt35;
	private JTextField txt45;
	private JTextField txt44;
	private JTextField txt43;
	private JTextField txt55;
	private JTextField txt54;
	private JTextField txt53;
	private JPanel panel_4;
	private JTextField txt30;
	private JTextField txt31;
	private JTextField txt32;
	private JTextField txt42;
	private JTextField txt41;
	private JTextField txt40;
	private JTextField txt52;
	private JTextField txt51;
	private JTextField txt50;
	private JPanel panel_5;
	private JTextField txt63;
	private JTextField txt64;
	private JTextField txt65;
	private JTextField txt75;
	private JTextField txt74;
	private JTextField txt73;
	private JTextField txt85;
	private JTextField txt84;
	private JTextField txt83;
	private JPanel panel_6;
	private JTextField txt60;
	private JTextField txt61;
	private JTextField txt62;
	private JTextField txt72;
	private JTextField txt71;
	private JTextField txt70;
	private JTextField txt82;
	private JTextField txt81;
	private JTextField txt80;
	private JPanel panel_7;
	private JTextField txt06;
	private JTextField txt07;
	private JTextField txt08;
	private JTextField txt18;
	private JTextField txt17;
	private JTextField txt16;
	private JTextField txt28;
	private JTextField txt27;
	private JTextField txt26;
	private JPanel panel_8;
	private JTextField txt36;
	private JTextField txt37;
	private JTextField txt38;
	private JTextField txt48;
	private JTextField txt47;
	private JTextField txt46;
	private JTextField txt58;
	private JTextField txt57;
	private JTextField txt56;
	private JPanel panel_9;
	private JTextField txt66;
	private JTextField txt67;
	private JTextField txt68;
	private JTextField txt78;
	private JTextField txt77;
	private JTextField txt76;
	private JTextField txt88;
	private JTextField txt87;
	private JTextField txt86;
	private JButton btnChangeGame;
	private JCheckBox checkoxHints;
	private JButton btnStartGamne;
	
	int minutes = 0;
	
	private int Score = 0;
	
	int timecounter = 0;

	int count =0;
	boolean checkP1= false;
	boolean checkP2= false;
	boolean checkP3= false;
	private JButton btnFinished;
	
	int grid[][];
	private JLabel lblNewLabel_1;
	private JLabel lblScore;
	
	int score = 0;
	
	Timer tm;
	private JLabel LableTime;
	private JLabel lblTime;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SudukoFrame frame = new SudukoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SudukoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Suduko Game");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 28));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(294, 11, 216, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(10, 62, 770, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBounds(0, 0, 141, 143);
		panel.add(panel_2);
		
		txt00 = new JTextField();
		txt00.setHorizontalAlignment(SwingConstants.CENTER);
		txt00.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt00.setBounds(10, 11, 40, 40);
		panel_2.add(txt00);
		txt00.setColumns(10);
		
		txt01 = new JTextField();
		txt01.setHorizontalAlignment(SwingConstants.CENTER);
		txt01.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt01.setColumns(10);
		txt01.setBounds(53, 11, 40, 40);
		panel_2.add(txt01);
		
		txt02 = new JTextField();
		txt02.setHorizontalAlignment(SwingConstants.CENTER);
		txt02.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt02.setColumns(10);
		txt02.setBounds(96, 11, 40, 40);
		panel_2.add(txt02);
		
		txt12 = new JTextField();
		txt12.setHorizontalAlignment(SwingConstants.CENTER);
		txt12.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt12.setColumns(10);
		txt12.setBounds(96, 54, 40, 40);
		panel_2.add(txt12);
		
		txt11 = new JTextField();
		txt11.setHorizontalAlignment(SwingConstants.CENTER);
		txt11.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt11.setColumns(10);
		txt11.setBounds(53, 54, 40, 40);
		panel_2.add(txt11);
		
		txt10 = new JTextField();
		txt10.setHorizontalAlignment(SwingConstants.CENTER);
		txt10.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt10.setColumns(10);
		txt10.setBounds(10, 54, 40, 40);
		panel_2.add(txt10);
		
		txt22 = new JTextField();
		txt22.setHorizontalAlignment(SwingConstants.CENTER);
		txt22.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt22.setColumns(10);
		txt22.setBounds(96, 96, 40, 40);
		panel_2.add(txt22);
		
		txt21 = new JTextField();
		txt21.setHorizontalAlignment(SwingConstants.CENTER);
		txt21.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt21.setColumns(10);
		txt21.setBounds(53, 96, 40, 40);
		panel_2.add(txt21);
		
		txt20 = new JTextField();
		txt20.setHorizontalAlignment(SwingConstants.CENTER);
		txt20.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt20.setColumns(10);
		txt20.setBounds(10, 96, 40, 40);
		panel_2.add(txt20);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(138, 0, 135, 143);
		panel.add(panel_1);
		
		txt03 = new JTextField();
		txt03.setHorizontalAlignment(SwingConstants.CENTER);
		txt03.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt03.setColumns(10);
		txt03.setBounds(5, 11, 40, 40);
		panel_1.add(txt03);
		
		txt04 = new JTextField();
		txt04.setHorizontalAlignment(SwingConstants.CENTER);
		txt04.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt04.setColumns(10);
		txt04.setBounds(48, 11, 40, 40);
		panel_1.add(txt04);
		
		txt05 = new JTextField();
		txt05.setHorizontalAlignment(SwingConstants.CENTER);
		txt05.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt05.setColumns(10);
		txt05.setBounds(91, 11, 40, 40);
		panel_1.add(txt05);
		
		txt15 = new JTextField();
		txt15.setHorizontalAlignment(SwingConstants.CENTER);
		txt15.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt15.setColumns(10);
		txt15.setBounds(91, 54, 40, 40);
		panel_1.add(txt15);
		
		txt14 = new JTextField();
		txt14.setHorizontalAlignment(SwingConstants.CENTER);
		txt14.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt14.setColumns(10);
		txt14.setBounds(48, 54, 40, 40);
		panel_1.add(txt14);
		
		txt13 = new JTextField();
		txt13.setHorizontalAlignment(SwingConstants.CENTER);
		txt13.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt13.setColumns(10);
		txt13.setBounds(5, 54, 40, 40);
		panel_1.add(txt13);
		
		txt25 = new JTextField();
		txt25.setHorizontalAlignment(SwingConstants.CENTER);
		txt25.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt25.setColumns(10);
		txt25.setBounds(91, 96, 40, 40);
		panel_1.add(txt25);
		
		txt24 = new JTextField();
		txt24.setHorizontalAlignment(SwingConstants.CENTER);
		txt24.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt24.setColumns(10);
		txt24.setBounds(48, 96, 40, 40);
		panel_1.add(txt24);
		
		txt23 = new JTextField();
		txt23.setHorizontalAlignment(SwingConstants.CENTER);
		txt23.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt23.setColumns(10);
		txt23.setBounds(5, 96, 40, 40);
		panel_1.add(txt23);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBounds(138, 142, 135, 136);
		panel.add(panel_3);
		
		txt33 = new JTextField();
		txt33.setHorizontalAlignment(SwingConstants.CENTER);
		txt33.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt33.setColumns(10);
		txt33.setBounds(5, 6, 40, 40);
		panel_3.add(txt33);
		
		txt34 = new JTextField();
		txt34.setHorizontalAlignment(SwingConstants.CENTER);
		txt34.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt34.setColumns(10);
		txt34.setBounds(48, 6, 40, 40);
		panel_3.add(txt34);
		
		txt35 = new JTextField();
		txt35.setHorizontalAlignment(SwingConstants.CENTER);
		txt35.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt35.setColumns(10);
		txt35.setBounds(91, 6, 40, 40);
		panel_3.add(txt35);
		
		txt45 = new JTextField();
		txt45.setHorizontalAlignment(SwingConstants.CENTER);
		txt45.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt45.setColumns(10);
		txt45.setBounds(91, 49, 40, 40);
		panel_3.add(txt45);
		
		txt44 = new JTextField();
		txt44.setHorizontalAlignment(SwingConstants.CENTER);
		txt44.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt44.setColumns(10);
		txt44.setBounds(48, 49, 40, 40);
		panel_3.add(txt44);
		
		txt43 = new JTextField();
		txt43.setHorizontalAlignment(SwingConstants.CENTER);
		txt43.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt43.setColumns(10);
		txt43.setBounds(5, 49, 40, 40);
		panel_3.add(txt43);
		
		txt55 = new JTextField();
		txt55.setHorizontalAlignment(SwingConstants.CENTER);
		txt55.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt55.setColumns(10);
		txt55.setBounds(91, 91, 40, 40);
		panel_3.add(txt55);
		
		txt54 = new JTextField();
		txt54.setHorizontalAlignment(SwingConstants.CENTER);
		txt54.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt54.setColumns(10);
		txt54.setBounds(48, 91, 40, 40);
		panel_3.add(txt54);
		
		txt53 = new JTextField();
		txt53.setHorizontalAlignment(SwingConstants.CENTER);
		txt53.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt53.setColumns(10);
		txt53.setBounds(5, 91, 40, 40);
		panel_3.add(txt53);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_4.setBounds(0, 142, 141, 136);
		panel.add(panel_4);
		
		txt30 = new JTextField();
		txt30.setHorizontalAlignment(SwingConstants.CENTER);
		txt30.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt30.setColumns(10);
		txt30.setBounds(10, 6, 40, 40);
		panel_4.add(txt30);
		
		txt31 = new JTextField();
		txt31.setHorizontalAlignment(SwingConstants.CENTER);
		txt31.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt31.setColumns(10);
		txt31.setBounds(53, 6, 40, 40);
		panel_4.add(txt31);
		
		txt32 = new JTextField();
		txt32.setHorizontalAlignment(SwingConstants.CENTER);
		txt32.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt32.setColumns(10);
		txt32.setBounds(96, 6, 40, 40);
		panel_4.add(txt32);
		
		txt42 = new JTextField();
		txt42.setToolTipText("");
		txt42.setHorizontalAlignment(SwingConstants.CENTER);
		txt42.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt42.setColumns(10);
		txt42.setBounds(96, 48, 40, 40);
		panel_4.add(txt42);
		
		txt41 = new JTextField();
		txt41.setHorizontalAlignment(SwingConstants.CENTER);
		txt41.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt41.setColumns(10);
		txt41.setBounds(53, 48, 40, 40);
		panel_4.add(txt41);
		
		txt40 = new JTextField();
		txt40.setHorizontalAlignment(SwingConstants.CENTER);
		txt40.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt40.setColumns(10);
		txt40.setBounds(10, 48, 40, 40);
		panel_4.add(txt40);
		
		txt52 = new JTextField();
		txt52.setHorizontalAlignment(SwingConstants.CENTER);
		txt52.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt52.setColumns(10);
		txt52.setBounds(96, 91, 40, 40);
		panel_4.add(txt52);
		
		txt51 = new JTextField();
		txt51.setHorizontalAlignment(SwingConstants.CENTER);
		txt51.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt51.setColumns(10);
		txt51.setBounds(53, 91, 40, 40);
		panel_4.add(txt51);
		
		txt50 = new JTextField();
		txt50.setHorizontalAlignment(SwingConstants.CENTER);
		txt50.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt50.setColumns(10);
		txt50.setBounds(10, 91, 40, 40);
		panel_4.add(txt50);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_5.setBounds(138, 273, 135, 136);
		panel.add(panel_5);
		
		txt63 = new JTextField();
		txt63.setHorizontalAlignment(SwingConstants.CENTER);
		txt63.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt63.setColumns(10);
		txt63.setBounds(5, 6, 40, 40);
		panel_5.add(txt63);
		
		txt64 = new JTextField();
		txt64.setHorizontalAlignment(SwingConstants.CENTER);
		txt64.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt64.setColumns(10);
		txt64.setBounds(48, 6, 40, 40);
		panel_5.add(txt64);
		
		txt65 = new JTextField();
		txt65.setHorizontalAlignment(SwingConstants.CENTER);
		txt65.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt65.setColumns(10);
		txt65.setBounds(91, 6, 40, 40);
		panel_5.add(txt65);
		
		txt75 = new JTextField();
		txt75.setHorizontalAlignment(SwingConstants.CENTER);
		txt75.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt75.setColumns(10);
		txt75.setBounds(91, 49, 40, 40);
		panel_5.add(txt75);
		
		txt74 = new JTextField();
		txt74.setHorizontalAlignment(SwingConstants.CENTER);
		txt74.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt74.setColumns(10);
		txt74.setBounds(48, 49, 40, 40);
		panel_5.add(txt74);
		
		txt73 = new JTextField();
		txt73.setHorizontalAlignment(SwingConstants.CENTER);
		txt73.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt73.setColumns(10);
		txt73.setBounds(5, 49, 40, 40);
		panel_5.add(txt73);
		
		txt85 = new JTextField();
		txt85.setHorizontalAlignment(SwingConstants.CENTER);
		txt85.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt85.setColumns(10);
		txt85.setBounds(91, 91, 40, 40);
		panel_5.add(txt85);
		
		txt84 = new JTextField();
		txt84.setHorizontalAlignment(SwingConstants.CENTER);
		txt84.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt84.setColumns(10);
		txt84.setBounds(48, 91, 40, 40);
		panel_5.add(txt84);
		
		txt83 = new JTextField();
		txt83.setHorizontalAlignment(SwingConstants.CENTER);
		txt83.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt83.setColumns(10);
		txt83.setBounds(5, 91, 40, 40);
		panel_5.add(txt83);
		
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_6.setBounds(0, 273, 141, 136);
		panel.add(panel_6);
		
		txt60 = new JTextField();
		txt60.setHorizontalAlignment(SwingConstants.CENTER);
		txt60.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt60.setColumns(10);
		txt60.setBounds(10, 6, 40, 40);
		panel_6.add(txt60);
		
		txt61 = new JTextField();
		txt61.setHorizontalAlignment(SwingConstants.CENTER);
		txt61.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt61.setColumns(10);
		txt61.setBounds(53, 6, 40, 40);
		panel_6.add(txt61);
		
		txt62 = new JTextField();
		txt62.setHorizontalAlignment(SwingConstants.CENTER);
		txt62.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt62.setColumns(10);
		txt62.setBounds(96, 6, 40, 40);
		panel_6.add(txt62);
		
		txt72 = new JTextField();
		txt72.setHorizontalAlignment(SwingConstants.CENTER);
		txt72.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt72.setColumns(10);
		txt72.setBounds(96, 48, 40, 40);
		panel_6.add(txt72);
		
		txt71 = new JTextField();
		txt71.setHorizontalAlignment(SwingConstants.CENTER);
		txt71.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt71.setColumns(10);
		txt71.setBounds(53, 48, 40, 40);
		panel_6.add(txt71);
		
		txt70 = new JTextField();
		txt70.setHorizontalAlignment(SwingConstants.CENTER);
		txt70.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt70.setColumns(10);
		txt70.setBounds(10, 48, 40, 40);
		panel_6.add(txt70);
		
		txt82 = new JTextField();
		txt82.setHorizontalAlignment(SwingConstants.CENTER);
		txt82.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt82.setColumns(10);
		txt82.setBounds(96, 91, 40, 40);
		panel_6.add(txt82);
		
		txt81 = new JTextField();
		txt81.setHorizontalAlignment(SwingConstants.CENTER);
		txt81.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt81.setColumns(10);
		txt81.setBounds(53, 91, 40, 40);
		panel_6.add(txt81);
		
		txt80 = new JTextField();
		txt80.setHorizontalAlignment(SwingConstants.CENTER);
		txt80.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt80.setColumns(10);
		txt80.setBounds(10, 91, 40, 40);
		panel_6.add(txt80);
		
		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_7.setBounds(270, 0, 135, 143);
		panel.add(panel_7);
		
		txt06 = new JTextField();
		txt06.setHorizontalAlignment(SwingConstants.CENTER);
		txt06.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt06.setColumns(10);
		txt06.setBounds(5, 11, 40, 40);
		panel_7.add(txt06);
		
		txt07 = new JTextField();
		txt07.setHorizontalAlignment(SwingConstants.CENTER);
		txt07.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt07.setColumns(10);
		txt07.setBounds(48, 11, 40, 40);
		panel_7.add(txt07);
		
		txt08 = new JTextField();
		txt08.setHorizontalAlignment(SwingConstants.CENTER);
		txt08.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt08.setColumns(10);
		txt08.setBounds(91, 11, 40, 40);
		panel_7.add(txt08);
		
		txt18 = new JTextField();
		txt18.setHorizontalAlignment(SwingConstants.CENTER);
		txt18.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt18.setColumns(10);
		txt18.setBounds(91, 54, 40, 40);
		panel_7.add(txt18);
		
		txt17 = new JTextField();
		txt17.setHorizontalAlignment(SwingConstants.CENTER);
		txt17.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt17.setColumns(10);
		txt17.setBounds(48, 54, 40, 40);
		panel_7.add(txt17);
		
		txt16 = new JTextField();
		txt16.setHorizontalAlignment(SwingConstants.CENTER);
		txt16.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt16.setColumns(10);
		txt16.setBounds(5, 54, 40, 40);
		panel_7.add(txt16);
		
		txt28 = new JTextField();
		txt28.setHorizontalAlignment(SwingConstants.CENTER);
		txt28.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt28.setColumns(10);
		txt28.setBounds(91, 96, 40, 40);
		panel_7.add(txt28);
		
		txt27 = new JTextField();
		txt27.setHorizontalAlignment(SwingConstants.CENTER);
		txt27.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt27.setColumns(10);
		txt27.setBounds(48, 96, 40, 40);
		panel_7.add(txt27);
		
		txt26 = new JTextField();
		txt26.setHorizontalAlignment(SwingConstants.CENTER);
		txt26.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt26.setColumns(10);
		txt26.setBounds(5, 96, 40, 40);
		panel_7.add(txt26);
		
		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_8.setBounds(270, 142, 135, 136);
		panel.add(panel_8);
		
		txt36 = new JTextField();
		txt36.setHorizontalAlignment(SwingConstants.CENTER);
		txt36.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt36.setColumns(10);
		txt36.setBounds(5, 6, 40, 40);
		panel_8.add(txt36);
		
		txt37 = new JTextField();
		txt37.setHorizontalAlignment(SwingConstants.CENTER);
		txt37.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt37.setColumns(10);
		txt37.setBounds(48, 6, 40, 40);
		panel_8.add(txt37);
		
		txt38 = new JTextField();
		txt38.setHorizontalAlignment(SwingConstants.CENTER);
		txt38.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt38.setColumns(10);
		txt38.setBounds(91, 6, 40, 40);
		panel_8.add(txt38);
		
		txt48 = new JTextField();
		txt48.setHorizontalAlignment(SwingConstants.CENTER);
		txt48.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt48.setColumns(10);
		txt48.setBounds(91, 49, 40, 40);
		panel_8.add(txt48);
		
		txt47 = new JTextField();
		txt47.setHorizontalAlignment(SwingConstants.CENTER);
		txt47.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt47.setColumns(10);
		txt47.setBounds(48, 49, 40, 40);
		panel_8.add(txt47);
		
		txt46 = new JTextField();
		txt46.setHorizontalAlignment(SwingConstants.CENTER);
		txt46.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt46.setColumns(10);
		txt46.setBounds(5, 49, 40, 40);
		panel_8.add(txt46);
		
		txt58 = new JTextField();
		txt58.setHorizontalAlignment(SwingConstants.CENTER);
		txt58.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt58.setColumns(10);
		txt58.setBounds(91, 91, 40, 40);
		panel_8.add(txt58);
		
		txt57 = new JTextField();
		txt57.setHorizontalAlignment(SwingConstants.CENTER);
		txt57.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt57.setColumns(10);
		txt57.setBounds(48, 91, 40, 40);
		panel_8.add(txt57);
		
		txt56 = new JTextField();
		txt56.setHorizontalAlignment(SwingConstants.CENTER);
		txt56.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt56.setColumns(10);
		txt56.setBounds(5, 91, 40, 40);
		panel_8.add(txt56);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_9.setBounds(270, 273, 135, 136);
		panel.add(panel_9);
		
		txt66 = new JTextField();
		txt66.setHorizontalAlignment(SwingConstants.CENTER);
		txt66.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt66.setColumns(10);
		txt66.setBounds(5, 6, 40, 40);
		panel_9.add(txt66);
		
		txt67 = new JTextField();
		txt67.setHorizontalAlignment(SwingConstants.CENTER);
		txt67.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt67.setColumns(10);
		txt67.setBounds(48, 6, 40, 40);
		panel_9.add(txt67);
		
		txt68 = new JTextField();
		txt68.setHorizontalAlignment(SwingConstants.CENTER);
		txt68.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt68.setColumns(10);
		txt68.setBounds(91, 6, 40, 40);
		panel_9.add(txt68);
		
		txt78 = new JTextField();
		txt78.setHorizontalAlignment(SwingConstants.CENTER);
		txt78.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt78.setColumns(10);
		txt78.setBounds(91, 49, 40, 40);
		panel_9.add(txt78);
		
		txt77 = new JTextField();
		txt77.setHorizontalAlignment(SwingConstants.CENTER);
		txt77.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt77.setColumns(10);
		txt77.setBounds(48, 49, 40, 40);
		panel_9.add(txt77);
		
		txt76 = new JTextField();
		txt76.setHorizontalAlignment(SwingConstants.CENTER);
		txt76.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt76.setColumns(10);
		txt76.setBounds(5, 49, 40, 40);
		panel_9.add(txt76);
		
		txt88 = new JTextField();
		txt88.setHorizontalAlignment(SwingConstants.CENTER);
		txt88.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt88.setColumns(10);
		txt88.setBounds(91, 91, 40, 40);
		panel_9.add(txt88);
		
		txt87 = new JTextField();
		txt87.setHorizontalAlignment(SwingConstants.CENTER);
		txt87.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt87.setColumns(10);
		txt87.setBounds(48, 91, 40, 40);
		panel_9.add(txt87);
		
		txt86 = new JTextField();
		txt86.setHorizontalAlignment(SwingConstants.CENTER);
		txt86.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txt86.setColumns(10);
		txt86.setBounds(5, 91, 40, 40);
		panel_9.add(txt86); 
		
		btnStartGamne = new JButton("Start Game");
		btnStartGamne.setFont(new Font("Segoe Script", Font.BOLD, 16));
		btnStartGamne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnstartGame("p1");
			}
		});
		btnStartGamne.setBounds(507, 34, 164, 42);
		panel.add(btnStartGamne);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(608, 369, 119, 23);
		panel.add(btnExit);
		
		btnChangeGame = new JButton("New Game");
		btnChangeGame.setFont(new Font("Segoe Script", Font.BOLD, 16));
		btnChangeGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newGame();
			}
		});
		btnChangeGame.setBounds(508, 102, 164, 36);
		panel.add(btnChangeGame);
		
		checkoxHints = new JCheckBox("Switch On the Hints");
		checkoxHints.setFont(new Font("Segoe Script", Font.BOLD, 16));
		checkoxHints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxActionForHintss() ;
			}
			
		});
		checkoxHints.setBounds(507, 172, 201, 36);
		panel.add(checkoxHints);

		
		btnFinished = new JButton("I am Finished");
		btnFinished.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt00.getText().toString().equals(" ") || txt01.getText().toString().equals(" ") || txt02.getText().toString().equals(" ") || txt03.getText().toString().equals(" ") || txt04.getText().toString().equals(" ") || txt05.getText().toString().equals(" ") || txt06.getText().toString().equals(" ") || txt07.getText().toString().equals(" ") || txt08.getText().toString().equals(" ") ||
						txt10.getText().toString().equals(" ") || txt11.getText().toString().equals(" ") || txt12.getText().toString().equals(" ") || txt13.getText().toString().equals(" ") || txt14.getText().toString().equals(" ") || txt15.getText().toString().equals(" ") || txt16.getText().toString().equals(" ") || txt17.getText().toString().equals(" ") || txt18.getText().toString().equals(" ") ||	
						txt20.getText().toString().equals(" ") || txt21.getText().toString().equals(" ") || txt22.getText().toString().equals(" ") || txt23.getText().toString().equals(" ") || txt24.getText().toString().equals(" ") || txt25.getText().toString().equals(" ") || txt26.getText().toString().equals(" ") || txt27.getText().toString().equals(" ") || txt28.getText().toString().equals(" ") ||	
						txt30.getText().toString().equals(" ") || txt31.getText().toString().equals(" ") || txt32.getText().toString().equals(" ") || txt33.getText().toString().equals(" ") || txt34.getText().toString().equals(" ") || txt35.getText().toString().equals(" ") || txt36.getText().toString().equals(" ") || txt37.getText().toString().equals(" ") || txt38.getText().toString().equals(" ") ||	
						txt40.getText().toString().equals(" ") || txt41.getText().toString().equals(" ") || txt42.getText().toString().equals(" ") || txt43.getText().toString().equals(" ") || txt44.getText().toString().equals(" ") || txt45.getText().toString().equals(" ") || txt46.getText().toString().equals(" ") || txt47.getText().toString().equals(" ") || txt48.getText().toString().equals(" ") ||	
						txt50.getText().toString().equals(" ") || txt51.getText().toString().equals(" ") || txt52.getText().toString().equals(" ") || txt53.getText().toString().equals(" ") || txt54.getText().toString().equals(" ") || txt55.getText().toString().equals(" ") || txt56.getText().toString().equals(" ") || txt57.getText().toString().equals(" ") || txt58.getText().toString().equals(" ") ||	
						txt60.getText().toString().equals(" ") || txt61.getText().toString().equals(" ") || txt62.getText().toString().equals(" ") || txt63.getText().toString().equals(" ") || txt64.getText().toString().equals(" ") || txt65.getText().toString().equals(" ") || txt66.getText().toString().equals(" ") || txt67.getText().toString().equals(" ") || txt68.getText().toString().equals(" ") ||	
						txt70.getText().toString().equals(" ") || txt71.getText().toString().equals(" ") || txt72.getText().toString().equals(" ") || txt73.getText().toString().equals(" ") || txt74.getText().toString().equals(" ") || txt75.getText().toString().equals(" ") || txt76.getText().toString().equals(" ") || txt77.getText().toString().equals(" ") || txt78.getText().toString().equals(" ") ||	
						txt80.getText().toString().equals(" ") || txt81.getText().toString().equals(" ") || txt82.getText().toString().equals(" ") || txt83.getText().toString().equals(" ") || txt84.getText().toString().equals(" ") || txt85.getText().toString().equals(" ") || txt86.getText().toString().equals(" ") || txt87.getText().toString().equals(" ") || txt88.getText().toString().equals(" ") 	
						) {
				   	JOptionPane.showMessageDialog(SudukoFrame.this, "Please Attemp For All Boxes", "Alert", JOptionPane.DEFAULT_OPTION);		
				   	return;
				}
 
				grid = new int[][]
					 {{Integer.parseInt(txt00.getText().toString().trim()),Integer.parseInt(txt01.getText().toString().trim()),Integer.parseInt(txt02.getText().toString().trim()),Integer.parseInt(txt03.getText().toString().trim()),Integer.parseInt(txt04.getText().toString().trim()),Integer.parseInt(txt05.getText().toString().trim()),Integer.parseInt(txt06.getText().toString().trim()),Integer.parseInt(txt07.getText().toString().trim()),Integer.parseInt(txt08.getText().toString().trim())},
		         {Integer.parseInt(txt10.getText().toString().trim()),Integer.parseInt(txt11.getText().toString().trim()),Integer.parseInt(txt12.getText().toString().trim()),Integer.parseInt(txt13.getText().toString().trim()),Integer.parseInt(txt14.getText().toString().trim()),Integer.parseInt(txt15.getText().toString().trim()),Integer.parseInt(txt16.getText().toString().trim()),Integer.parseInt(txt17.getText().toString().trim()),Integer.parseInt(txt18.getText().toString().trim())},
		         {Integer.parseInt(txt20.getText().toString().trim()),Integer.parseInt(txt21.getText().toString().trim()),Integer.parseInt(txt22.getText().toString().trim()),Integer.parseInt(txt23.getText().toString().trim()),Integer.parseInt(txt24.getText().toString().trim()),Integer.parseInt(txt25.getText().toString().trim()),Integer.parseInt(txt26.getText().toString().trim()),Integer.parseInt(txt27.getText().toString().trim()),Integer.parseInt(txt28.getText().toString().trim())},
		         {Integer.parseInt(txt30.getText().toString().trim()),Integer.parseInt(txt31.getText().toString().trim()),Integer.parseInt(txt32.getText().toString().trim()),Integer.parseInt(txt33.getText().toString().trim()),Integer.parseInt(txt34.getText().toString().trim()),Integer.parseInt(txt35.getText().toString().trim()),Integer.parseInt(txt36.getText().toString().trim()),Integer.parseInt(txt37.getText().toString().trim()),Integer.parseInt(txt38.getText().toString().trim())},
		         {Integer.parseInt(txt40.getText().toString().trim()),Integer.parseInt(txt41.getText().toString().trim()),Integer.parseInt(txt42.getText().toString().trim()),Integer.parseInt(txt43.getText().toString().trim()),Integer.parseInt(txt44.getText().toString().trim()),Integer.parseInt(txt45.getText().toString().trim()),Integer.parseInt(txt46.getText().toString().trim()),Integer.parseInt(txt47.getText().toString().trim()),Integer.parseInt(txt48.getText().toString().trim())},
		         {Integer.parseInt(txt50.getText().toString().trim()),Integer.parseInt(txt51.getText().toString().trim()),Integer.parseInt(txt52.getText().toString().trim()),Integer.parseInt(txt53.getText().toString().trim()),Integer.parseInt(txt54.getText().toString().trim()),Integer.parseInt(txt55.getText().toString().trim()),Integer.parseInt(txt56.getText().toString().trim()),Integer.parseInt(txt57.getText().toString().trim()),Integer.parseInt(txt58.getText().toString().trim())},
		         {Integer.parseInt(txt60.getText().toString().trim()),Integer.parseInt(txt61.getText().toString().trim()),Integer.parseInt(txt62.getText().toString().trim()),Integer.parseInt(txt63.getText().toString().trim()),Integer.parseInt(txt64.getText().toString().trim()),Integer.parseInt(txt65.getText().toString().trim()),Integer.parseInt(txt66.getText().toString().trim()),Integer.parseInt(txt67.getText().toString().trim()),Integer.parseInt(txt68.getText().toString().trim())},
		         {Integer.parseInt(txt70.getText().toString().trim()),Integer.parseInt(txt71.getText().toString().trim()),Integer.parseInt(txt72.getText().toString().trim()),Integer.parseInt(txt73.getText().toString().trim()),Integer.parseInt(txt74.getText().toString().trim()),Integer.parseInt(txt75.getText().toString().trim()),Integer.parseInt(txt76.getText().toString().trim()),Integer.parseInt(txt77.getText().toString().trim()),Integer.parseInt(txt78.getText().toString().trim())},
		         {Integer.parseInt(txt80.getText().toString().trim()),Integer.parseInt(txt81.getText().toString().trim()),Integer.parseInt(txt82.getText().toString().trim()),Integer.parseInt(txt83.getText().toString().trim()),Integer.parseInt(txt84.getText().toString().trim()),Integer.parseInt(txt85.getText().toString().trim()),Integer.parseInt(txt86.getText().toString().trim()),Integer.parseInt(txt87.getText().toString().trim()),Integer.parseInt(txt88.getText().toString().trim())}};
				
		         
		         boolean check = false;
		         
		         for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid.length; j++) {
						check =  validity( i, j,grid);
					}
				}
		         
		         if(check == true) {
		            	JOptionPane.showMessageDialog(SudukoFrame.this, "Congratulation Puzzled Solved", "Congrats", JOptionPane.DEFAULT_OPTION);			
		            	score = score + 100;
		            	newGame();
		         }else {
		            	JOptionPane.showMessageDialog(SudukoFrame.this, "Sorry Puzzled is not Solved", "Warning", JOptionPane.DEFAULT_OPTION);
		         }
		        
				
				
				
			}
		});
		btnFinished.setFont(new Font("Segoe Script", Font.BOLD, 16));
		btnFinished.setBounds(507, 228, 164, 36);
		panel.add(btnFinished);
		
		lblNewLabel_1 = new JLabel("Points");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 16));
		lblNewLabel_1.setBounds(507, 285, 68, 23);
		panel.add(lblNewLabel_1);
		
		lblScore = new JLabel("Points");
		lblScore.setForeground(Color.BLUE);
		lblScore.setFont(new Font("Segoe Script", Font.BOLD, 18));
		lblScore.setBounds(574, 285, 78, 23);
		panel.add(lblScore);
		
		lblScore.setText(""+score);
		
		LableTime = new JLabel("Time");
		LableTime.setForeground(Color.RED);
		LableTime.setFont(new Font("Segoe Script", Font.BOLD, 16));
		LableTime.setBounds(425, 369, 51, 23);
		panel.add(LableTime);
		
		lblTime = new JLabel("");
		lblTime.setForeground(Color.RED);
		lblTime.setFont(new Font("Segoe Script", Font.BOLD, 16));
		lblTime.setBounds(486, 368, 68, 23);
		panel.add(lblTime);
		
		
		
		tm = new Timer (1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				timecounter++;
				if(timecounter%60==0) { //For Seconds
					minutes++;
					timecounter=0;
				}
				lblTime.setText(""+minutes+" : "+timecounter);
				
			}
		});
		
		
		
		
		btnChangeGame.setEnabled(false);
		checkoxHints.setEnabled(false);
		btnFinished.setEnabled(false);
	}
	
	public void btnstartGame(String file) {
		
		tm.start();
		
		btnStartGamne.setEnabled(false);
		btnChangeGame.setEnabled(true);
		checkoxHints.setEnabled(true);
		btnFinished.setEnabled(true);
		String data="";
        try {
       	 int i =0;
            File myObj = new File(file+".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              data += myReader.nextLine();
            }
            myReader.close();
          } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        char ch []= new char[81];
        ch = data.toCharArray();
        for (int i = 0; i < ch.length; i++) {
        	if(ch[i] == '0') {
        		ch[i]= ' ';
        	}
		}
        
        
        
        txt00.setText(""+ch[0]);
        if(!txt00.getText().toString().equals(" "))
        	txt00.setEditable(false);
        else
        	txt00.setEditable(true);
        txt01.setText(""+ch[1]);
        if(!txt01.getText().toString().equals(" "))
        	txt01.setEditable(false);
        else
        	txt01.setEditable(true);
        txt02.setText(""+ch[2]);
        if(!txt02.getText().toString().equals(" "))
        	txt02.setEditable(false);
        else
        	txt02.setEditable(true);
        txt03.setText(""+ch[3]);
        if(!txt03.getText().toString().equals(" "))
        	txt03.setEditable(false);
        else
        	txt03.setEditable(true);
        txt04.setText(""+ch[4]);
        if(!txt04.getText().toString().equals(" "))
        	txt04.setEditable(false);
        else
        	txt04.setEditable(true);
        txt05.setText(""+ch[5]);
        if(!txt05.getText().toString().equals(" "))
        	txt05.setEditable(false);
        else
        	txt05.setEditable(true);
        txt06.setText(""+ch[6]);
        if(!txt06.getText().toString().equals(" "))
        	txt06.setEditable(false);
        else
        	txt06.setEditable(true);
        txt07.setText(""+ch[7]);
        if(!txt07.getText().toString().equals(" "))
        	txt07.setEditable(false);
        else
        	txt07.setEditable(true);
        txt08.setText(""+ch[8]);
        if(!txt08.getText().toString().equals(" "))
        	txt08.setEditable(false);
        else
        	txt08.setEditable(true);
        
        
        txt10.setText(""+ch[9]);
        if(!txt10.getText().toString().equals(" "))
        	txt10.setEditable(false);
        else
        	txt10.setEditable(true);
        txt11.setText(""+ch[10]);
        if(!txt11.getText().toString().equals(" "))
        	txt11.setEditable(false);
        else
        	txt11.setEditable(true);
        txt12.setText(""+ch[11]);
        if(!txt12.getText().toString().equals(" "))
        	txt12.setEditable(false);
        else
        	txt12.setEditable(true);
        txt13.setText(""+ch[12]);
        if(!txt13.getText().toString().equals(" "))
        	txt13.setEditable(false);
        else
        	txt13.setEditable(true);
        txt14.setText(""+ch[13]);
        if(!txt14.getText().toString().equals(" "))
        	txt14.setEditable(false);
        else
        	txt14.setEditable(true);
        txt15.setText(""+ch[14]);
        if(!txt15.getText().toString().equals(" "))
        	txt15.setEditable(false);
        else
        	txt15.setEditable(true);
        txt16.setText(""+ch[15]);
        if(!txt16.getText().toString().equals(" "))
        	txt16.setEditable(false);
        else
        	txt16.setEditable(true);
        txt17.setText(""+ch[16]);
        if(!txt17.getText().toString().equals(" "))
        	txt17.setEditable(false);
        else
        	txt17.setEditable(true);
        txt18.setText(""+ch[17]);
        if(!txt18.getText().toString().equals(" "))
        	txt18.setEditable(false);
        else
        	txt18.setEditable(true);
        
        txt20.setText(""+ch[18]);
        if(!txt20.getText().toString().equals(" "))
        	txt20.setEditable(false);
        else
        	txt20.setEditable(true);
        txt21.setText(""+ch[19]);
        if(!txt21.getText().toString().equals(" "))
        	txt21.setEditable(false);
        else
        	txt21.setEditable(true);
        txt22.setText(""+ch[20]);
        if(!txt22.getText().toString().equals(" "))
        	txt22.setEditable(false);
        else
        	txt22.setEditable(true);
        txt23.setText(""+ch[21]);
        if(!txt23.getText().toString().equals(" "))
        	txt23.setEditable(false);
        else
        	txt23.setEditable(true);
        txt24.setText(""+ch[22]);
        if(!txt24.getText().toString().equals(" "))
        	txt24.setEditable(false);
        else
        	txt24.setEditable(true);
        txt25.setText(""+ch[23]);
        if(!txt25.getText().toString().equals(" "))
        	txt25.setEditable(false);
        else
        	txt25.setEditable(true);
        txt26.setText(""+ch[24]);
        if(!txt26.getText().toString().equals(" "))
        	txt26.setEditable(false);
        else
        	txt26.setEditable(true);
        txt27.setText(""+ch[25]);
        if(!txt27.getText().toString().equals(" "))
        	txt27.setEditable(false);
        else
        	txt27.setEditable(true);
        txt28.setText(""+ch[26]);
        if(!txt28.getText().toString().equals(" "))
        	txt28.setEditable(false);
        else
        	txt28.setEditable(true);
        
        
        txt30.setText(""+ch[27]);
        if(!txt30.getText().toString().equals(" "))
        	txt30.setEditable(false);
        else
        	txt30.setEditable(true);
        txt31.setText(""+ch[28]);
        if(!txt31.getText().toString().equals(" "))
        	txt31.setEditable(false);
        else
        	txt31.setEditable(true);
        txt32.setText(""+ch[29]);
        if(!txt32.getText().toString().equals(" "))
        	txt32.setEditable(false);
        else
        	txt32.setEditable(true);
        txt33.setText(""+ch[30]);
        if(!txt33.getText().toString().equals(" "))
        	txt33.setEditable(false);
        else
        	txt33.setEditable(true);
        txt34.setText(""+ch[31]);
        if(!txt34.getText().toString().equals(" "))
        	txt34.setEditable(false);
        else
        	txt34.setEditable(true);
        txt35.setText(""+ch[32]);
        if(!txt35.getText().toString().equals(" "))
        	txt35.setEditable(false);
        else
        	txt35.setEditable(true);
        txt36.setText(""+ch[33]);
        if(!txt36.getText().toString().equals(" "))
        	txt36.setEditable(false);
        else
        	txt36.setEditable(true);
        txt37.setText(""+ch[34]);
        if(!txt37.getText().toString().equals(" "))
        	txt37.setEditable(false);
        else
        	txt37.setEditable(true);
        txt38.setText(""+ch[35]);
        if(!txt38.getText().toString().equals(" "))
        	txt38.setEditable(false);
        else
        	txt38.setEditable(true);
        
        txt40.setText(""+ch[36]);
        if(!txt40.getText().toString().equals(" "))
        	txt40.setEditable(false);
        else
        	txt40.setEditable(true);
        txt41.setText(""+ch[37]);
        if(!txt41.getText().toString().equals(" "))
        	txt41.setEditable(false);
        else
        	txt41.setEditable(true);
        txt42.setText(""+ch[38]);
        if(!txt42.getText().toString().equals(" "))
        	txt42.setEditable(false);
        else
        	txt42.setEditable(true);
        txt43.setText(""+ch[39]);
        if(!txt43.getText().toString().equals(" "))
        	txt43.setEditable(false);
        else
        	txt43.setEditable(true);
        txt44.setText(""+ch[40]);
        if(!txt44.getText().toString().equals(" "))
        	txt44.setEditable(false);
        else
        	txt44.setEditable(true);
        txt45.setText(""+ch[41]);
        if(!txt45.getText().toString().equals(" "))
        	txt45.setEditable(false);
        else
        	txt45.setEditable(true);
        txt46.setText(""+ch[42]);
        if(!txt46.getText().toString().equals(" "))
        	txt46.setEditable(false);
        else
        	txt46.setEditable(true);
        txt47.setText(""+ch[43]);
        if(!txt47.getText().toString().equals(" "))
        	txt47.setEditable(false);
        else
        	txt47.setEditable(true);
        txt48.setText(""+ch[44]);
        if(!txt48.getText().toString().equals(" "))
        	txt48.setEditable(false);
        else
        	txt48.setEditable(true);
        
        
        txt50.setText(""+ch[45]);
        if(!txt50.getText().toString().equals(" "))
        	txt50.setEditable(false);
        else
        	txt50.setEditable(true);
        txt51.setText(""+ch[46]);
        if(!txt51.getText().toString().equals(" "))
        	txt51.setEditable(false);
        else
        	txt51.setEditable(true);
        txt52.setText(""+ch[47]);
        if(!txt52.getText().toString().equals(" "))
        	txt52.setEditable(false);
        else
        	txt52.setEditable(true);
        txt53.setText(""+ch[48]);
        if(!txt53.getText().toString().equals(" "))
        	txt53.setEditable(false);
        else
        	txt53.setEditable(true);
        txt54.setText(""+ch[49]);
        if(!txt54.getText().toString().equals(" "))
        	txt54.setEditable(false);
        else
        	txt54.setEditable(true);
        txt55.setText(""+ch[50]);
        if(!txt55.getText().toString().equals(" "))
        	txt55.setEditable(false);
        else
        	txt55.setEditable(true);
        txt56.setText(""+ch[51]);
        if(!txt56.getText().toString().equals(" "))
        	txt56.setEditable(false);
        else
        	txt46.setEditable(true);
        txt57.setText(""+ch[52]);
        if(!txt57.getText().toString().equals(" "))
        	txt57.setEditable(false);
        else
        	txt57.setEditable(true);
        txt58.setText(""+ch[53]);
        if(!txt58.getText().toString().equals(" "))
        	txt58.setEditable(false);
        else
        	txt58.setEditable(true);
        
        txt60.setText(""+ch[54]);
        if(!txt60.getText().toString().equals(" "))
        	txt60.setEditable(false);
        else
        	txt60.setEditable(true);
        txt61.setText(""+ch[55]);
        if(!txt61.getText().toString().equals(" "))
        	txt61.setEditable(false);
        else
        	txt61.setEditable(true);
        txt62.setText(""+ch[56]);
        if(!txt62.getText().toString().equals(" "))
        	txt62.setEditable(false);
        else
        	txt62.setEditable(true);
        txt63.setText(""+ch[57]);
        if(!txt63.getText().toString().equals(" "))
        	txt63.setEditable(false);
        else
        	txt63.setEditable(true);
        txt64.setText(""+ch[58]);
        if(!txt64.getText().toString().equals(" "))
        	txt64.setEditable(false);
        else
        	txt64.setEditable(true);
        txt65.setText(""+ch[59]);
        if(!txt65.getText().toString().equals(" "))
        	txt65.setEditable(false);
        else
        	txt65.setEditable(true);
        txt66.setText(""+ch[60]);
        if(!txt66.getText().toString().equals(" "))
        	txt66.setEditable(false);
        else
        	txt66.setEditable(true);
        txt67.setText(""+ch[61]);
        if(!txt67.getText().toString().equals(" "))
        	txt67.setEditable(false);
        else
        	txt67.setEditable(true);
        txt68.setText(""+ch[62]);
        if(!txt68.getText().toString().equals(" "))
        	txt68.setEditable(false);
        else
        	txt68.setEditable(true);
        
        txt70.setText(""+ch[63]);
        if(!txt70.getText().toString().equals(" "))
        	txt70.setEditable(false);
        else
        	txt70.setEditable(true);
        txt71.setText(""+ch[64]);
        if(!txt71.getText().toString().equals(" "))
        	txt71.setEditable(false);
        else
        	txt71.setEditable(true);
        txt72.setText(""+ch[65]);
        if(!txt72.getText().toString().equals(" "))
        	txt72.setEditable(false);
        else
        	txt72.setEditable(true);
        txt73.setText(""+ch[66]);
        if(!txt73.getText().toString().equals(" "))
        	txt73.setEditable(false);
        else
        	txt73.setEditable(true);
        txt74.setText(""+ch[67]);
        if(!txt74.getText().toString().equals(" "))
        	txt74.setEditable(false);
        else
        	txt74.setEditable(true);
        txt75.setText(""+ch[68]);
        if(!txt75.getText().toString().equals(" "))
        	txt75.setEditable(false);
        else
        	txt75.setEditable(true);
        txt76.setText(""+ch[69]);
        if(!txt76.getText().toString().equals(" "))
        	txt76.setEditable(false);
        else
        	txt76.setEditable(true);
        txt77.setText(""+ch[70]);
        if(!txt77.getText().toString().equals(" "))
        	txt77.setEditable(false);
        else
        	txt77.setEditable(true);
        txt78.setText(""+ch[71]);
        if(!txt78.getText().toString().equals(" "))
        	txt78.setEditable(false);
        else
        	txt78.setEditable(true);
        
        txt80.setText(""+ch[72]);
        if(!txt80.getText().toString().equals(" "))
        	txt80.setEditable(false);
        else
        	txt80.setEditable(true);
        txt81.setText(""+ch[73]);
        if(!txt81.getText().toString().equals(" "))
        	txt81.setEditable(false);
        else
        	txt81.setEditable(true);
        txt82.setText(""+ch[74]);
        if(!txt82.getText().toString().equals(" "))
        	txt82.setEditable(false);
        else
        	txt82.setEditable(true);
        txt83.setText(""+ch[75]);
        if(!txt83.getText().toString().equals(" "))
        	txt83.setEditable(false);
        else
        	txt83.setEditable(true);
        txt84.setText(""+ch[76]);
        if(!txt84.getText().toString().equals(" "))
        	txt84.setEditable(false);
        else
        	txt84.setEditable(true);
        txt85.setText(""+ch[77]);
        if(!txt85.getText().toString().equals(" "))
        	txt85.setEditable(false);
        else
        	txt85.setEditable(true);
        txt86.setText(""+ch[78]);
        if(!txt86.getText().toString().equals(" "))
        	txt86.setEditable(false);
        else
        	txt86.setEditable(true);
        
        txt87.setText(""+ch[79]);
        if(!txt87.getText().toString().equals(" "))
        	txt87.setEditable(false);
        else
        	txt87.setEditable(true);
        txt88.setText(""+ch[80]);
        if(!txt80.getText().toString().equals(" "))
        	txt80.setEditable(false);
        else
        	txt88.setEditable(true);

	}

	//For Hints
	public void checkboxActionForHintss() {
		if(checkoxHints.isSelected()) {
			
			// For p2
			if(count == 1) {
				System.out.println("P2 count "+count);
				txt01.setToolTipText("4 or 9 could be Possible Value here");
				txt02.setToolTipText("5 or 4 could be Possible Value here");
				txt11.setToolTipText("2 or 8 could be Possible Value here");
				txt12.setToolTipText("2 or 8 could be Possible Value here");
				txt14.setToolTipText("7 or 4 could be Possible Value here");
				txt23.setToolTipText("4 or & could be Possible Value here");
				txt21.setToolTipText("9 or 3 could be Possible Value here");
				txt22.setToolTipText("3 or 9 coudl be Possible Value here");
				txt05.setToolTipText("6 or 7 could be Possible Value here");
				txt06.setToolTipText("7 or 6 could be Possible Value here");
				txt16.setToolTipText("3 or 1 could be Possible Value here");
				txt26.setToolTipText("1 or 3 could be Possible Value here");
				txt18.setToolTipText("5 or 6");
				txt28.setToolTipText("6 or 5");
				txt31.setToolTipText("1 or 4");
				txt32.setToolTipText("4 or 1");
				txt34.setToolTipText("6 or 5");
				txt35.setToolTipText("5 or 6");
				txt36.setToolTipText("8 or 5");
				txt40.setToolTipText("3 or 7");
				txt41.setToolTipText("5 or 3");
				txt42.setToolTipText("5 or 7");
				txt45.setToolTipText("1 or 2");
				txt46.setToolTipText("2 or 1");
				txt47.setToolTipText("6 or 2");
				
				txt50.setToolTipText("8 or 9");
				txt52.setToolTipText("9 or 8");
				txt53.setToolTipText("7 or 2");
				txt54.setToolTipText("2 or 7");
				txt56.setToolTipText("5 or 2");
				txt57.setToolTipText("1 or 5");
			}
//			else {
//				txt01.setToolTipText("");
//				txt02.setToolTipText("");
//				txt11.setToolTipText("");
//				txt12.setToolTipText("");
//				txt14.setToolTipText("");
//				txt23.setToolTipText("");
//				txt21.setToolTipText("");
//				txt22.setToolTipText("");
//				txt05.setToolTipText("");
//				txt06.setToolTipText("");
//				txt16.setToolTipText("");
//				txt26.setToolTipText("");
//				txt18.setToolTipText("");
//				txt28.setToolTipText("");
//				txt31.setToolTipText("");
//				txt32.setToolTipText("");
//				txt34.setToolTipText("");
//				txt35.setToolTipText("");
//				txt36.setToolTipText("");
//				txt40.setToolTipText("");
//				txt41.setToolTipText("");
//				txt42.setToolTipText("");
//				txt45.setToolTipText("");
//				txt46.setToolTipText("");
//				txt47.setToolTipText("");
//				
//				txt50.setToolTipText("");
//				txt52.setToolTipText("");
//				txt53.setToolTipText("");
//				txt54.setToolTipText("");
//				txt56.setToolTipText("");
//				txt57.setToolTipText("");
//			}
			// For p3
			if (count == 2) {
				System.out.println("P3 "+count );
				txt00.setToolTipText("1 or 4");
				txt01.setToolTipText("4 or 1");
				txt04.setToolTipText("3 or 6");
				txt05.setToolTipText("6 or 1");
				txt07.setToolTipText("8 or 9");
				txt08.setToolTipText("9 or 8");
				
				txt11.setToolTipText("2 or 7");
				txt12.setToolTipText("7 or 2");
				txt15.setToolTipText("3 or 9");
				txt16.setToolTipText("9 or 3");
				
				txt21.setToolTipText("9 or 3");
				txt22.setToolTipText("3 or 9");
				txt25.setToolTipText("7 or 1");
				txt26.setToolTipText("1 or 7");
				txt28.setToolTipText("6 or 1");
				
				txt30.setToolTipText("2 or 1");
				txt31.setToolTipText("1 or 2");
				txt35.setToolTipText("3 or 8");
				txt36.setToolTipText("8 or 9");
				txt37.setToolTipText("9 or 3");
				
				txt41.setToolTipText("5 or 4");
				txt42.setToolTipText("4 or 9");
				txt44.setToolTipText("9 or 8");
				txt45.setToolTipText("8 or 9");
				txt46.setToolTipText("2 or 9");
				
				txt50.setToolTipText("7 or 8");
				txt51.setToolTipText("8 or 7");
				txt54.setToolTipText("1 or 2");
				txt55.setToolTipText("2 or 1");
				txt56.setToolTipText("4 or 2");
				txt58.setToolTipText("3 or 4");
			}			
//			else {
//				System.out.println("P3 "+count );
//				txt00.setToolTipText("");
//				txt01.setToolTipText("");
//				txt04.setToolTipText("");
//				txt05.setToolTipText("");
//				txt07.setToolTipText("");
//				txt08.setToolTipText("");
//				
//				txt11.setToolTipText("");
//				txt12.setToolTipText("");
//				txt15.setToolTipText("");
//				txt16.setToolTipText("");
//				
//				txt21.setToolTipText("");
//				txt22.setToolTipText("");
//				txt25.setToolTipText("");
//				txt26.setToolTipText("");
//				txt28.setToolTipText("");
//				
//				txt30.setToolTipText("");
//				txt31.setToolTipText("");
//				txt35.setToolTipText("");
//				txt36.setToolTipText("");
//				txt37.setToolTipText("");
//				
//				txt41.setToolTipText("");
//				txt42.setToolTipText("");
//				txt44.setToolTipText("");
//				txt45.setToolTipText("");
//				txt46.setToolTipText("");
//				
//				txt50.setToolTipText("");
//				txt51.setToolTipText("");
//				txt54.setToolTipText("");
//				txt55.setToolTipText("");
//				txt56.setToolTipText("");
//				txt58.setToolTipText("");
//			}
			// for p1
			if(count == 0) {
				txt01.setToolTipText("2 or 3");
				txt04.setToolTipText("5 or 6");
				txt05.setToolTipText("6 or 5");
				txt06.setToolTipText("7 or 8");
				txt07.setToolTipText("8 or 9");
				txt08.setToolTipText("9 or 8");
				
				txt10.setToolTipText("4 or 5");
				txt11.setToolTipText("5 or 4");
				txt14.setToolTipText("8 or 9");
				txt15.setToolTipText("9 or 1");
				txt16.setToolTipText("1 or 9");
				
				txt21.setToolTipText("8 or 9");
				txt22.setToolTipText("9 or 8");
				txt24.setToolTipText("2 or 4");
				txt26.setToolTipText("4 or 9");
				
				txt30.setToolTipText("2 or 1");
				txt31.setToolTipText("1 or 2");
				txt33.setToolTipText("3 or 5");
				txt35.setToolTipText("5 or 8");
				txt36.setToolTipText("8 or 9");
				txt37.setToolTipText("9 or 7");
				txt38.setToolTipText("7 or 9");
				
				txt41.setToolTipText("6 or 5");
				txt42.setToolTipText("5 or 8");
				txt43.setToolTipText("8 or 9");
				txt44.setToolTipText("9 or 8");
				txt46.setToolTipText("2 or 4");
				txt48.setToolTipText("4 or 2");
				
				txt51.setToolTipText("9 or 2");
				txt53.setToolTipText("2 or 3");
				txt56.setToolTipText("3 or 6");
				txt57.setToolTipText("6 or 5");
				txt58.setToolTipText("5 or 6");
			}
//			else {
//				txt01.setToolTipText("");
//				txt04.setToolTipText("");
//				txt05.setToolTipText("");
//				txt06.setToolTipText("");
//				txt07.setToolTipText("");
//				txt08.setToolTipText("");
//				
//				txt10.setToolTipText("");
//				txt11.setToolTipText("");
//				txt14.setToolTipText("");
//				txt15.setToolTipText("");
//				txt16.setToolTipText("");
//				
//				txt21.setToolTipText("");
//				txt22.setToolTipText("");
//				txt24.setToolTipText("");
//				txt26.setToolTipText("");
//				
//				txt30.setToolTipText("");
//				txt31.setToolTipText("");
//				txt33.setToolTipText("");
//				txt35.setToolTipText("");
//				txt36.setToolTipText("");
//				txt37.setToolTipText("");
//				txt38.setToolTipText("");
//				
//				txt41.setToolTipText("");
//				txt42.setToolTipText("");
//				txt43.setToolTipText("");
//				txt44.setToolTipText("");
//				txt46.setToolTipText("");
//				txt48.setToolTipText("");
//				
//				txt51.setToolTipText("");
//				txt53.setToolTipText("");
//				txt56.setToolTipText("");
//				txt57.setToolTipText("");
//				txt58.setToolTipText("");
//			}
		}else {
			reset();
		}
	
	}
	public void reset() {
		txt01.setToolTipText("");
		txt02.setToolTipText("");
		txt11.setToolTipText("");
		txt12.setToolTipText("");
		txt14.setToolTipText("");
		txt23.setToolTipText("");
		txt21.setToolTipText("");
		txt22.setToolTipText("");
		txt05.setToolTipText("");
		txt06.setToolTipText("");
		txt16.setToolTipText("");
		txt26.setToolTipText("");
		txt18.setToolTipText("");
		txt28.setToolTipText("");
		txt31.setToolTipText("");
		txt32.setToolTipText("");
		txt34.setToolTipText("");
		txt35.setToolTipText("");
		txt36.setToolTipText("");
		txt40.setToolTipText("");
		txt41.setToolTipText("");
		txt42.setToolTipText("");
		txt45.setToolTipText("");
		txt46.setToolTipText("");
		txt47.setToolTipText("");
		txt50.setToolTipText("");
		txt52.setToolTipText("");
		txt53.setToolTipText("");
		txt54.setToolTipText("");
		txt56.setToolTipText("");
		txt57.setToolTipText("");
		
		txt04.setToolTipText("");
		txt07.setToolTipText("");
		txt08.setToolTipText("");
		
		txt10.setToolTipText("");
		txt11.setToolTipText("");
		txt14.setToolTipText("");
		txt15.setToolTipText("");
		
		txt21.setToolTipText("");
		txt22.setToolTipText("");
		txt24.setToolTipText("");
		
		txt30.setToolTipText("");
		txt31.setToolTipText("");
		txt33.setToolTipText("");
		txt35.setToolTipText("");
		txt36.setToolTipText("");
		txt37.setToolTipText("");
		txt38.setToolTipText("");
		
		txt41.setToolTipText("");
		txt42.setToolTipText("");
		txt43.setToolTipText("");
		txt44.setToolTipText("");
		txt46.setToolTipText("");
		txt48.setToolTipText("");
		
		txt51.setToolTipText("");
		txt53.setToolTipText("");
		txt56.setToolTipText("");
		txt57.setToolTipText("");
		txt58.setToolTipText("");
		
		txt00.setToolTipText("");
		txt01.setToolTipText("");
		txt04.setToolTipText("");
		txt05.setToolTipText("");
		txt07.setToolTipText("");
		txt08.setToolTipText("");
		
		txt11.setToolTipText("");
		txt12.setToolTipText("");
		txt15.setToolTipText("");
		txt16.setToolTipText("");
		
		txt21.setToolTipText("");
		txt22.setToolTipText("");
		txt25.setToolTipText("");
		txt26.setToolTipText("");
		txt28.setToolTipText("");
		
		txt30.setToolTipText("");
		txt31.setToolTipText("");
		txt35.setToolTipText("");
		txt36.setToolTipText("");
		txt37.setToolTipText("");
		
		txt41.setToolTipText("");
		txt42.setToolTipText("");
		txt44.setToolTipText("");
		txt45.setToolTipText("");
		txt46.setToolTipText("");
		
		txt50.setToolTipText("");
		txt51.setToolTipText("");
		txt54.setToolTipText("");
		txt55.setToolTipText("");
		txt56.setToolTipText("");
		txt58.setToolTipText("");

	}
	
	// Check Game is Solved or Not
	 public static boolean validity(int x, int y, int[][] grid) {
	     String temp="";
	     for (int i=0;i<9;i++) {
	         temp+=Integer.toString(grid[i][y]);//horizontal
	         temp+=Integer.toString(grid[x][i]);//verical
	         temp+=Integer.toString(grid[(x/3)*3+i/3][(y/3)*3+i%3]);//square
	     }
	     int count=0, idx=0;
	     while ((idx=temp.indexOf(Integer.toString(grid[x][y]), idx))!=-1)
	     {idx++; count++;}
	     return count==3;
	 }
	 
	 public void newGame() {
		 	timecounter=0;
			count++;
			if (count==1) {
			btnstartGame("p2");
			}else if(count==2) {
				btnstartGame("p3");
			}else {
				btnstartGame("p1");
				count=0;
			}
			checkboxActionForHintss();
	 }
}
