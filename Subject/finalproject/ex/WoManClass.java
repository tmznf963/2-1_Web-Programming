package ex;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class WoManClass extends PlayWorldCup {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8608054380813709450L;

	WoManClass() {
		for (int nn = 0; nn < image16.length; nn++)// �̹���0~15�迭 ������ȣ�̹��� ����
		{
			image16[nn] = new ImageIcon("���ڿ�����/" + r[nn] + ".png"); // 0~15.png
			System.out.printf("����" + r[nn] + " ");
		}
		System.out.println();
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
}
