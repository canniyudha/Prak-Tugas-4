/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.awt.*;
import javax.swing.*;

class ObjekGUI {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame {
   JLabel judul = new JLabel(" BIODATA DIRI ");
   
   JLabel gambar = new JLabel (new ImageIcon(new ImageIcon(getClass().getResource("gambar.jpg")).getImage().getScaledInstance(150, 175, Image.SCALE_SMOOTH)));
   
   JLabel nama = new JLabel(" CANNIGIA YUDHAYANA ");
   JLabel tgl = new JLabel(" Yogyakarta, 29 Januari 2000 ");
   
   JRadioButton lk = new JRadioButton(" L ");
   JRadioButton pr = new JRadioButton(" P ");
   
   String[] list =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox agama = new JComboBox(list);
 
   
   JLabel lalamat = new JLabel(" Alamat "); 
   JTextArea falamat = new JTextArea();
   JScrollPane area = new JScrollPane(falamat);
   JButton save = new JButton("Save");
   JButton edit = new JButton("Edit");

   public GUI() {
        
	setTitle("Biodata");
	setDefaultCloseOperation(3);
	setSize(350,600);
        setLocation(500,100);
        
	ButtonGroup group = new ButtonGroup();
	group.add(lk);
	group.add(pr);

	setLayout(null);
	add(judul);
        add(gambar);
        add(nama);
        add(tgl);
	add(agama);
	add(lk);
	add(pr);
        add(lalamat);
        add(area);
	add(save);
        add(edit);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        
	judul.setBounds(90,10,200,30);
        judul.setFont(new Font("", Font.BOLD, 20));
        gambar.setBounds(65,30,200,200);
        nama.setBounds(80,230,200,20);
        nama.setFont(new Font("", Font.BOLD, 14));
        tgl.setBounds(60,250,300,20);
        tgl.setFont(new Font("Monospaced",Font.CENTER_BASELINE, 12));
	agama.setBounds(30,300,280,20);
	lk.setBounds(70,340,100,20);
	pr.setBounds(210,340,100,20);
        lalamat.setBounds(135,360,100,20);
        area.setBounds(20,390, 300, 100);
        area.setAutoscrolls(true);
        area.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        area.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        edit.setBounds(30,500,80,20);
	save.setBounds(230,500,80,20);
	setVisible(true);
   }
}