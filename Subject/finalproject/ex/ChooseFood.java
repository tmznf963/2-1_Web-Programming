package ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChooseFood extends JFrame { // ����Ŭ����
	
	ChooseFood() {
	//	menu = new MenuClass();
		setTitle("�̻��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);

		ImageIcon lunchtime = new ImageIcon("images/�߽�.jpg");//�̹��� ����
		ImageIcon night = new ImageIcon("images/����.jpg");
		
		ImageIcon rolloverIcon = new ImageIcon("images/�߽�2.jpg");//���콺�� �ö� �� �̹���
		ImageIcon rolloverIcon1 = new ImageIcon("images/����2.jpg");
	
		ImageIcon pressedIcon = new ImageIcon("images/�߽�2.jpg");//���콺�� ���� �� �̹���
		ImageIcon pressedIcon1 = new ImageIcon("images/����2.jpg");
		
		JButton btn_1 = new JButton(lunchtime);  //�߽� ��ư����
		JButton btn_2 = new JButton(night); //���� ��ư����

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
		btn_1.setToolTipText("������ ������� �� ������ ������ �����մϴ�.");
		btn_2.setToolTipText("������ ������� �� ������ ������ �����մϴ�.");
		btn_1.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new LunchFoodClass();
				dispose();
			}
		});
		setSize(1200, 900);
		dispose(); //������ �ϳ�����
		btn_2.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new NightFoodClass();
				dispose();
			}
		});

		setSize(1200, 900);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {//��������
		ImageIcon imageIcon = new ImageIcon("images/���ı���.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}