package ex;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelClass {
/*	String[] manPath = null;
	String[] shePath = null;
	String[] lunchPath = null;
	String[] dinerPath = null;
	
	public void manPicture() {
		for(int i = 0 ; i< 4 ; i++){
			System.out.println("i" + i);
			manPath[i] = "/images/s" + i + ".jpg";
		}
		//panel = new JPanel(manPath)
	}
	public void shePicture() {
		for(int i = 0 ; i< 4 ; i++){
			System.out.println("i" + i);
			shePath[i] = "/images/m" + i + ".jpg";
		}
	}
	public void lunchPicture() {
		for(int i = 0 ; i< 4 ; i++){
			System.out.println("i" + i);
			lunchPath[i] = "/images/l" + i + ".jpg";
		}
	}
	public void dinerPicture() {
		for(int i = 0 ; i< 4 ; i++){
			System.out.println("i" + i);
			dinerPath[i] = "/images/d" + i + ".jpg";
		}
	}
	*/
	
}
class GameStart extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/����_16.png");
	Image image = imageIcon.getImage();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class MyPanel extends JPanel {//���ι���
	ImageIcon imageIcon = new ImageIcon("images/����.png");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class MyPanel1 extends JPanel {//��������
	ImageIcon imageIcon = new ImageIcon("images/��ұ���.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class MyPanel2 extends JPanel {// 16������
	ImageIcon imageIcon = new ImageIcon("images/16��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel3 extends JPanel {// 8������
	ImageIcon imageIcon = new ImageIcon("images/8��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel4 extends JPanel {// 4������
	ImageIcon imageIcon = new ImageIcon("images/4��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel5 extends JPanel {// 2������
	ImageIcon imageIcon = new ImageIcon("images/2��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel6 extends JPanel {// ��� ����
	ImageIcon imageIcon = new ImageIcon("images/���.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel7 extends JPanel {// ��� ����
	ImageIcon imageIcon = new ImageIcon("images/�����.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class GameOverPanel extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/GameOver.png");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}