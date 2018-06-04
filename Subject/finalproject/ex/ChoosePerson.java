package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class ChoosePerson extends JFrame { // �̻��� Ŭ����
	
	ChoosePerson(){
		System.out.println("person()����");
		setTitle("�̻��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);
		//panel.add(menu.mb);
		ImageIcon boy = new ImageIcon("images/����.jpg");//�̹��� ����
		ImageIcon girl = new ImageIcon("images/����.jpg");
		
		ImageIcon rolloverIcon = new ImageIcon("images/����2.jpg");//���콺�� �ö� �� �̹���
		ImageIcon rolloverIcon1 = new ImageIcon("images/����2.jpg");
		
		ImageIcon pressedIcon = new ImageIcon("images/����2.jpg");//���콺�� ���� �� �̹���
		ImageIcon pressedIcon1 = new ImageIcon("images/����2.jpg");
		
		JButton btn_1 = new JButton(boy);  //�� ��ư����
		JButton btn_2 = new JButton(girl); //�� ��ư����	

		btn_1.setRolloverIcon(rolloverIcon);
		btn_2.setRolloverIcon(rolloverIcon1); //���콺�� �ö� ��
		btn_1.setPressedIcon(pressedIcon);
		btn_2.setPressedIcon(pressedIcon1); //���콺�� ���� ��
		
		panel.setLayout(null);
		panel.add(btn_1);
		panel.add(btn_2);
		btn_1.setLocation(85, 335);
		btn_1.setSize(500, 500);
		btn_2.setLocation(600, 335);
		btn_2.setSize(500, 500);
		btn_1.setToolTipText("���ڿ����� �̻��������� ������ �����մϴ�.");
		btn_2.setToolTipText("���ڿ����� �̻��������� ������ �����մϴ�.");

		btn_1.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				new ManClass();
				dispose();
			}
		});
		
		setSize(1200, 900);
		setVisible(true);

		btn_2.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				new WoManClass();
				dispose();
			}
		});
		setSize(1200, 900);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {//��������
		ImageIcon imageIcon = new ImageIcon("images/��������.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}