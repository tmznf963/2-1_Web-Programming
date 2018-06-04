package ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChoosePlace extends JFrame { // 장소클래스

	ChoosePlace() {
		setTitle("어디가지?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);
		//panel.add(menu.mb);
		ImageIcon lunchtime = new ImageIcon("images/고.jpg");//이미지 저장			
		ImageIcon rolloverIcon = new ImageIcon("images/고2.jpg");//마우스가 올라갈 때 이미지		
		ImageIcon pressedIcon = new ImageIcon("images/고2.jpg");//마우스가 눌릴 때 이미지
		
		
		JButton btn_1 = new JButton(lunchtime);  //중식 버튼생성				

		btn_1.setRolloverIcon(rolloverIcon);
		
		btn_1.setPressedIcon(pressedIcon);
		
		panel.setLayout(null);
		panel.add(btn_1);
		
		btn_1.setLocation(85, 335);
		btn_1.setSize(1017, 500);
		btn_1.setToolTipText("장소를 대상으로 한 월드컵 게임을 시작합니다.");

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