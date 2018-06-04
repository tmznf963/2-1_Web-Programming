package ex;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.event.*;

import javax.swing.*;
import sun.audio.*;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;


public class MainClass extends JFrame{//메인
	Container c;
	static InputStream In;
//	static AudioStream BGM;
//	static AudioPlayer MGP = AudioPlayer.player;
	MenuClass menu=new MenuClass();
  
	MainClass() {
		setTitle("골라골라 내 맘대로~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		MyPanel panel = new MyPanel();
		c.add(panel, BorderLayout.CENTER);// FlowLayout,
		
		panel.add(menu.mb);


		ImageIcon normalIcon = new ImageIcon("images/이상형.jpg");//기본이미지
		ImageIcon normalIcon1 = new ImageIcon("images/음식.jpg");
		ImageIcon normalIcon2 = new ImageIcon("images/장소.jpg");

		ImageIcon rolloverIcon = new ImageIcon("images/이상형1.jpg");//마우스가 올라갈 때 이미지
		ImageIcon rolloverIcon1 = new ImageIcon("images/음식1.jpg");
		ImageIcon rolloverIcon2 = new ImageIcon("images/장소1.jpg");

		ImageIcon pressedIcon = new ImageIcon("images/이상형1.jpg");//마우스가 눌릴 때 이미지
		ImageIcon pressedIcon1 = new ImageIcon("images/음식1.jpg");
		ImageIcon pressedIcon2 = new ImageIcon("images/장소1.jpg");

		JButton btn = new JButton(normalIcon);// 이상형
		JButton btn1 = new JButton(normalIcon1);// 음식
		JButton btn2 = new JButton(normalIcon2);// 장소


		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);

		btn1.setRolloverIcon(rolloverIcon1);
		btn1.setPressedIcon(pressedIcon1);

		btn2.setRolloverIcon(rolloverIcon2);
		btn2.setPressedIcon(pressedIcon2);

		panel.setLayout(null);

		btn.setLocation(100, 330);
		btn.setSize(300, 500);
		panel.add(btn);

		btn1.setLocation(440, 330);
		btn1.setSize(300, 500);
		panel.add(btn1);

		btn2.setLocation(780, 330);
		btn2.setSize(300, 500);
		panel.add(btn2);
		
		btn.setToolTipText("이상형 월드컵으로 들어갑니다.");
		btn1.setToolTipText("점심이나저녁 월드컵으로 들어갑니다.");
		btn2.setToolTipText("장소 월드컵으로 들어갑니다.");
		btn.addActionListener(new ActionListener() { // 이상형
			public void actionPerformed(ActionEvent e) { //
				dispose();
				new ChoosePerson();
				//dispose();
			}
		});

		btn1.addActionListener(new ActionListener() { // 점심
			public void actionPerformed(ActionEvent e) {
				new ChooseFood();
				dispose();
			}
		});

		btn2.addActionListener(new ActionListener() { // 장소
			public void actionPerformed(ActionEvent e) {
				new ChoosePlace();
				dispose();
			}
		});

		setSize(1200, 900);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
/*		try{
			File music = new File("res_sound/Airship.mid");
			In = new FileInputStream(music);
		//	BGM = new AudioStream(In);
		//	AudioPlayer.player.start(BGM);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		
		new MainClass();
	}
}//MainGUI