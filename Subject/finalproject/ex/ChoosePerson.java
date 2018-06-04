package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class ChoosePerson extends JFrame { // 이상형 클래스
	
	ChoosePerson(){
		System.out.println("person()실행");
		setTitle("이상형 월드컵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);
		//panel.add(menu.mb);
		ImageIcon boy = new ImageIcon("images/남자.jpg");//이미지 저장
		ImageIcon girl = new ImageIcon("images/여자.jpg");
		
		ImageIcon rolloverIcon = new ImageIcon("images/남자2.jpg");//마우스가 올라갈 때 이미지
		ImageIcon rolloverIcon1 = new ImageIcon("images/여자2.jpg");
		
		ImageIcon pressedIcon = new ImageIcon("images/남자2.jpg");//마우스가 눌릴 때 이미지
		ImageIcon pressedIcon1 = new ImageIcon("images/여자2.jpg");
		
		JButton btn_1 = new JButton(boy);  //남 버튼생성
		JButton btn_2 = new JButton(girl); //여 버튼생성	

		btn_1.setRolloverIcon(rolloverIcon);
		btn_2.setRolloverIcon(rolloverIcon1); //마우스가 올라갈 때
		btn_1.setPressedIcon(pressedIcon);
		btn_2.setPressedIcon(pressedIcon1); //마우스에 눌릴 때
		
		panel.setLayout(null);
		panel.add(btn_1);
		panel.add(btn_2);
		btn_1.setLocation(85, 335);
		btn_1.setSize(500, 500);
		btn_2.setLocation(600, 335);
		btn_2.setSize(500, 500);
		btn_1.setToolTipText("여자연예인 이상형월드컵 게임을 시작합니다.");
		btn_2.setToolTipText("남자연예인 이상형월드컵 게임을 시작합니다.");

		btn_1.addActionListener(new ActionListener() { // 남자
			public void actionPerformed(ActionEvent e) {
				new ManClass();
				dispose();
			}
		});
		
		setSize(1200, 900);
		setVisible(true);

		btn_2.addActionListener(new ActionListener() { // 남자
			public void actionPerformed(ActionEvent e) {
				new WoManClass();
				dispose();
			}
		});
		setSize(1200, 900);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {//성별바탕
		ImageIcon imageIcon = new ImageIcon("images/성별구분.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}