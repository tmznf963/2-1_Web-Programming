package ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TimeOverClass extends JFrame{		//���ӿ��� Ŭ����
	TimeOverClass(){
		setTitle("�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c;
		c = getContentPane();
		GameOverPanel panel1 = new GameOverPanel();		

		c.add(panel1, BorderLayout.CENTER);
		ImageIcon reButton = new ImageIcon("images/ó������.png");
		ImageIcon exitButton = new ImageIcon("images/�����ϱ�.png");
		
		JButton btn = new JButton(reButton);// ó������
		JButton btn1 = new JButton(exitButton); // ����

		panel1.setLayout(null);

		btn.setLocation(150, 600);// ��ġ
		btn.setSize(336,90);// ��ưũ�� = ����ũ��
		panel1.add(btn);
		btn.setToolTipText("�ʱ�ȭ������ ���ư��ϴ�.");
		btn1.setToolTipText("������ �����մϴ�.");

		btn1.setLocation(700, 600);
		btn1.setSize(334,87);
		panel1.add(btn1);
		setSize(1200, 900);
		setVisible(true);
		btn.addActionListener(new ActionListener() { // ó��
			public void actionPerformed(ActionEvent e) {
				new MainClass();					//�ʱ�ȭ��
				dispose();
			}
		});
		btn1.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});	
	}
}