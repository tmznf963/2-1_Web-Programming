package ex;

import javax.swing.ImageIcon;

public class PlaceClass extends PlayWorldCup{
PlaceClass(){
	for (int nn = 0; nn < image16.length; nn++)// 이미지0~15배열 랜덤번호이미지 저장
	{
		image16[nn] = new ImageIcon("풍경/" + r[nn] + ".png"); // 0~15.png
	}

}
}
