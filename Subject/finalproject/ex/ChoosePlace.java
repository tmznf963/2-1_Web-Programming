package ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChoosePlace extends JFrame { // ���Ŭ����

	ChoosePlace() {
		setTitle("�����?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);
		//panel.add(menu.mb);
		ImageIcon lunchtime = new ImageIcon("images/��.jpg");//�̹��� ����			
		ImageIcon rolloverIcon = new ImageIcon("images/��2.jpg");//���콺�� �ö� �� �̹���		
		ImageIcon pressedIcon = new ImageIcon("images/��2.jpg");//���콺�� ���� �� �̹���
		
		
		JButton btn_1 = new JButton(lunchtime);  //�߽� ��ư����				

		btn_1.setRolloverIcon(rolloverIcon);
		
		btn_1.setPressedIcon(pressedIcon);
		
		panel.setLayout(null);
		panel.add(btn_1);
		
		btn_1.setLocation(85, 335);
		btn_1.setSize(1017, 500);
		btn_1.setToolTipText("��Ҹ� ������� �� ������ ������ �����մϴ�.");

		btn_1.addActionListener(new ActionListener() { //
			public void actionPerformed(ActionEvent e) {
				new PlaceClass();
				dispose();
			}
		});
		setSize(1200, 900);
		setVisible(true);
	}
}