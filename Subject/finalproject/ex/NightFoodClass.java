package ex;

import javax.swing.ImageIcon;

public class NightFoodClass extends PlayWorldCup{
	NightFoodClass(){
	for (int nn = 0; nn < image16.length; nn++)// �̹���0~15�迭 ������ȣ�̹��� ����
	{
		image16[nn] = new ImageIcon("����/" + r[nn] + ".png"); // 0~15.png
	}
	}
}
