package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ManClass extends PlayWorldCup{
	
	ManClass() {

		for (int nn = 0; nn < image16.length; nn++)// �̹���0~15�迭 ������ȣ�̹��� ����
		{
			
			image16[nn] = new ImageIcon("���ڿ�����/" + r[nn] + ".png"); // 0~15.png
			System.out.printf("����" + r[nn] + " ");
		}
		System.out.println();


	}



}

