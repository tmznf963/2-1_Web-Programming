package ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChooseFood extends JFrame { // 점심클래스
	
	ChooseFood() {
	//	menu = new MenuClass();
		setTitle("이상형 월드컵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);

		ImageIcon lunchtime = new ImageIcon("images/중식.jpg");//이미지 저장
		ImageIcon night = new ImageIcon("images/석식.jpg");
		
		ImageIcon rolloverIcon = new ImageIcon("images/중식2.jpg");//마우스가 올라갈 때 이미지
		ImageIcon rolloverIcon1 = new ImageIcon("images/석식2.jpg");
	
		ImageIcon pressedIcon = new ImageIcon("images/중식2.jpg");//마우스가 눌릴 때 이미지
		ImageIcon pressedIcon1 = new ImageIcon("images/석식2.jpg");
		
		JButton btn_1 = new JButton(lunchtime);  //중식 버튼생성
		JButton btn_2 = new JButton(night); //저녁 버튼생성

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
		btn_1.setToolTipText("점심을 대상으로 한 월드컵 게임을 시작합니다.");
		btn_2.setToolTipText("저녁을 대상으로 한 월드컵 게임을 시작합니다.");
		btn_1.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new LunchFoodClass();
				dispose();
			}
		});
		setSize(1200, 900);
		dispose(); //프레임 하나종료
		btn_2.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new NightFoodClass();
				dispose();
			}
		});

		setSize(1200, 900);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {//성별바탕
		ImageIcon imageIcon = new ImageIcon("images/음식구별.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}