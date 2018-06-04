package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ManClass extends PlayWorldCup{
	
	ManClass() {

		for (int nn = 0; nn < image16.length; nn++)// 이미지0~15배열 랜덤번호이미지 저장
		{
			
			image16[nn] = new ImageIcon("여자연예인/" + r[nn] + ".png"); // 0~15.png
			System.out.printf("여자" + r[nn] + " ");
		}
		System.out.println();


	}



}

