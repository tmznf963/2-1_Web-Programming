package ex;

import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.event.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


class TimerRunnable extends Thread{	//Thread Ŭ���� ���
	JLabel timerLabel;				//Ÿ�̸� �󺧻���
	
	boolean flag = false;			
	 int time=60;					//�ð��� ����
	JFrame j=new JFrame();
	public TimerRunnable(JLabel timerLabel){		//������
		this.timerLabel=timerLabel;
	}	
	public void run(){							//run() �޼ҵ� �������̵�
		synchronized(this){			//�� �����尡 ���������� �����ؾ� �ϴ� �κ�(����ȭ �ڵ�)�� ǥ���ϴ�Ű����
									//���� ������ �����尡 ����� ����
			while(true){
				timerLabel.setText(Integer.toString(time));
				time--;
				try{
					if(!flag){
						Thread.sleep(1000);		//1�� ���� ������ �����.
						if(time<10){
							timerLabel.setForeground(Color.red);
							timerLabel.setFont(new Font("Gothic", Font.BOLD, 150));							
						}														
							}					
					if(time==0){		
					}
					if(time<0){
						System.out.println("Ÿ�ӿ���");
						flag=true;
						timerLabel.setFont(new Font("Gothic",Font.PLAIN,24));
						timerLabel.setText("Ÿ�� ����");						
						new TimeOverClass();
						j.dispose();
						wait();	//������ ����			
							}
					}
				catch(InterruptedException e){	//���ܸ� �ް� ������ �����Ͽ� ����
					return;
				}
					}
						}
					}
}
public class PlayWorldCup extends JFrame{
		Container c;

		InputStream In1;
		AudioStream BGM1;
		AudioPlayer MGP1 = AudioPlayer.player;

		ImageIcon[] image1 = new ImageIcon[1];// 1��
		ImageIcon[] image2 = new ImageIcon[2];// 2��
		ImageIcon[] image4 = new ImageIcon[4];// 4��
		ImageIcon[] image8 = new ImageIcon[8];// 8��
		ImageIcon[] image16 = new ImageIcon[16];// 16�� �迭

		int ll = 0;// ���� �迭 ��
		int rr = 1;// ������ �迭 ��
		int r[];

		int count = 0; // ī��Ʈ ��
		
		static InputStream In;
		static AudioStream BGM;
		static AudioPlayer MGP = AudioPlayer.player;

		JLabel timerLabel=new JLabel();
		TimerRunnable runnable =new TimerRunnable(timerLabel);	//������ �ִ� Ŭ���� ��ü ����
		Thread th;		//Thread ��ü�����ϴºκ��� �Ϻ� (Thread th=new Thread();�� �����尴ü����)
		PlayWorldCup() {
			System.out.println("playworld����");
			timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
			timerLabel.setForeground(Color.black);
			setTitle("���� �̻���");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c = getContentPane();
			GameStart panel = new GameStart();

			c.add(panel, BorderLayout.CENTER);// FlowLayout,

			r=new int[16];
			for (int i = 0; i < r.length; i++) {
				r[i] = i; // �����迭 [0]~[15]���� ����, 0~15 ����
			}
			for (int i = 0; i < 16; i++) {
				int temp;
				int n = (int) (Math.random() * 16);// 0~15 ���� ��
				temp = r[i]; // t���� i�� ����
				r[i] = r[n]; // r[i]�� r[����] ����
				r[n] = temp; // r[����]�� t�� ����
				// 0~15�� �迭 �� �ڸ����� �������� �ٲ�
			}
			for (int i = 0; i < 16; i++) {
				System.out.print(r[i] + " "); // �������� �ٲ� �迭 0~15���� �� 16���� ���� �̱�

			}
			panel.addMouseListener(new MyMouseListener());

			setSize(1200, 900);
			setVisible(true);
			
		}
		class MyMouseListener extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 1) {

					new boy16r();
					dispose();


			}
			}
		}
		class boy16r extends JFrame { // ���ڷ� ������

			boy16r() {

				count = count + 1; // ī��Ʈ ����

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel2 panel = new MyPanel2();
				c.add(panel, BorderLayout.CENTER);// FlowLayout,

				JButton btn = new JButton(image16[ll]);// ���ʻ���
				JButton btn1 = new JButton("��������");// ����
				JButton btn2 = new JButton(image16[rr]);// �����ʻ���

				panel.setLayout(null);

				btn.setLocation(75, 155);
				btn.setSize(425, 635);
				panel.add(btn);

				btn1.setFont(new Font("HY�︪��M", Font.PLAIN, 16));
				btn1.setLocation(543, 490);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(685, 155);
				btn2.setSize(425, 635);
				panel.add(btn2);

				th=new Thread(runnable);		//�����尴ü����
				timerLabel.setLocation(550,50);
				timerLabel.setSize(300,300);
				panel.add(timerLabel);
				th.start();//start()�޼ҵ� ȣ��,������ �۵�����
				timerLabel.setToolTipText("���� �ð��Դϴ�. 0�ʰ� �Ǹ� Game Over �˴ϴ�.");
				btn.addActionListener(new ActionListener() { // ����
					
					public void actionPerformed(ActionEvent e) { //
						if (count < 8) {
							image8[count-1] = image16[ll];
							ll += 2;
							rr += 2;
							new boy16r();
							dispose();
						} else if (count == 8) {
							image8[count-1] = image16[ll];
							ll = 0;
							rr = 1;
							count = 0;
							
							new boy8r();
							dispose();
						}
						
						

					}
			
					
				});

				btn1.addActionListener(new ActionListener() { // ��������
					public void actionPerformed(ActionEvent e) {
						if (count == 8) {// ī����Ƚ��,�迭[7]
							int k = (int) (Math.random() * 2) + 1;

							if (k == 1) {// ��������
								image8[count-1] = image16[ll];
								ll = 0;
								rr = 1;
								count = 0;
								
								new boy8r();
								dispose();

							} else if (k == 2) {//// ��������
								image8[count-1] = image16[rr];
								ll = 0;
								rr = 1;
								count = 0;
							
								new boy8r();
								dispose();
							}
						} else if (count < 8) {

							int n = (int) (Math.random() * 2) + 1;

							if (n == 1) {// ��������
								image8[count-1] = image16[ll];
								ll += 2;
								rr += 2;
								new boy16r();
								dispose();
							} else if (n == 2) {//// ��������
								image8[count-1] = image16[rr];
								ll += 2;
								rr += 2;
								new boy16r();
								dispose();
							}
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // ������
					public void actionPerformed(ActionEvent e) {
						if (count < 8) {
							image8[count-1] =image16[rr];
							ll += 2;
							rr += 2;
							new boy16r();
							dispose();
						} else if (count == 8) {
							image8[count-1] = image16[rr];
							ll = 0;
							rr = 1;
							count = 0;
							
							new boy8r();
							dispose();
						}

					}
				});

				setSize(1200, 900);
				setVisible(true);
			}

		}// class boy16r

		class boy8r extends JFrame { // ���ڷ� ������

			
			boy8r() {

				count = count + 1; // ī��Ʈ ����


				setTitle("���� �̻���");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel3 panel = new MyPanel3();
				c.add(panel, BorderLayout.CENTER);// FlowLayout,

				JButton btn = new JButton(image8[ll]);// ���ʻ���
				JButton btn1 = new JButton("��������");// ����
				JButton btn2 = new JButton(image8[rr]);// �����ʻ���

				panel.setLayout(null);

				btn.setLocation(75, 155);
				btn.setSize(425, 635);
				panel.add(btn);

				btn1.setFont(new Font("HY�︪��M", Font.PLAIN, 16));
				btn1.setLocation(543, 490);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(685, 155);
				btn2.setSize(425, 635);
				panel.add(btn2);

				th=new Thread(runnable);
				timerLabel.setLocation(550,50);
				timerLabel.setSize(300,300);
				panel.add(timerLabel);
				th.start();//start()�޼ҵ� ȣ��,������ �۵�����
				timerLabel.setToolTipText("���� �ð��Դϴ�. 0�ʰ� �Ǹ� Game Over �˴ϴ�.");
				btn.addActionListener(new ActionListener() { // ����
					public void actionPerformed(ActionEvent e) { //
						if (count < 4) {
							image4[count - 1] = image8[ll];
							ll += 2;
							rr += 2;
							new boy8r();
							dispose();
						} else if (count == 4) {
							image4[count - 1] = image8[ll];
							ll = 0;
							rr = 1;
							count = 0;
							new boy4r();// 4r
							dispose();
						}
					}
				});

				btn1.addActionListener(new ActionListener() { // ��������
					public void actionPerformed(ActionEvent e) {
						if (count == 4) {// ī����Ƚ��,�迭[3]
							int k = (int) (Math.random() * 2) + 1;

							if (k == 1) {// ��������
								image4[count - 1] = image8[ll];
								ll = 0;
								rr = 1;
								count = 0;
								new boy4r();//
								dispose();

							} else if (k == 2) {//// ��������
								image4[count - 1] = image8[rr];
								ll = 0;
								rr = 1;
								count = 0;
								new boy4r();// 4r
								dispose();
							}
						} else if (count < 4) {

							int n = (int) (Math.random() * 2) + 1;

							if (n == 1) {// ��������
								image4[count - 1] = image8[ll];
								ll += 2;
								rr += 2;
								new boy8r();
								dispose();
							} else if (n == 2) {//// ��������
								image4[count - 1] = image8[rr];
								ll += 2;
								rr += 2;
								new boy8r();
								dispose();
							}
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // ������
					public void actionPerformed(ActionEvent e) {
						if (count < 4) {
							image4[count - 1] = image8[rr];
							ll += 2;
							rr += 2;
							new boy8r();
							dispose();
						} else if (count == 4) {
							image4[count - 1] = image8[rr];
							ll = 0;
							rr = 1;
							count = 0;
							new boy4r();// 4r
							dispose();
						}
					}
				});

				setSize(1200, 900);
				setVisible(true);
			}
		}// 8r

		class boy4r extends JFrame { // ���ڷ� ������

			boy4r() {

				count = count + 1; // ī��Ʈ ����

				setTitle("���� �̻���");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel4 panel = new MyPanel4();
				c.add(panel, BorderLayout.CENTER);// FlowLayout,

				JButton btn = new JButton(image4[ll]);// ���ʻ���
				JButton btn1 = new JButton("��������");// ����
				JButton btn2 = new JButton(image4[rr]);// �����ʻ���

				panel.setLayout(null);

				btn.setLocation(75, 155);
				btn.setSize(425, 635);
				panel.add(btn);

				btn1.setFont(new Font("HY�︪��M", Font.PLAIN, 16));
				btn1.setLocation(543, 490);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(685, 155);
				btn2.setSize(425, 635);
				panel.add(btn2);
				
				th=new Thread(runnable);
				timerLabel.setLocation(550,50);
				timerLabel.setSize(300,300);
				panel.add(timerLabel);
				th.start();//start()�޼ҵ� ȣ��,������ �۵�����
				timerLabel.setToolTipText("���� �ð��Դϴ�. 0�ʰ� �Ǹ� Game Over �˴ϴ�.");
				btn.addActionListener(new ActionListener() { // ����
					public void actionPerformed(ActionEvent e) { //
						if (count < 2) {
							image2[count - 1] = image4[ll];
							ll += 2;
							rr += 2;
							new boy4r();
							dispose();
						} else if (count == 2) {
							image2[count - 1] = image4[ll];
							ll = 0;
							rr = 1;
							count = 0;
							new boy2r();// 2r
							dispose();
						}
					}
				});

				btn1.addActionListener(new ActionListener() { // ��������
					public void actionPerformed(ActionEvent e) {
						if (count == 2) {// ī����Ƚ��,�迭[3]
							int k = (int) (Math.random() * 2) + 1;

							if (k == 1) {// ��������
								image2[count - 1] = image4[ll];
								ll = 0;
								rr = 1;
								count = 0;
								new boy2r();// 2r
								dispose();

							} else if (k == 2) {//// ��������
								image2[count - 1] = image4[rr];
								ll = 0;
								rr = 1;
								count = 0;
								new boy2r();// 2r
								dispose();
							}
						} else if (count < 2) {

							int n = (int) (Math.random() * 2) + 1;

							if (n == 1) {// ��������

								image2[count - 1] = image4[ll];
								ll += 2;
								rr += 2;
								new boy4r();
								dispose();
							} else if (n == 2) {//// ��������
								image2[count - 1] = image4[rr];
								ll += 2;
								rr += 2;
								new boy4r();
								dispose();
							}
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // ������
					public void actionPerformed(ActionEvent e) {
						if (count < 2) {
							image2[count - 1] = image4[rr];
							ll += 2;
							rr += 2;
							new boy4r();
							dispose();
						} else if (count == 2) {
							image2[count - 1] = image4[rr];
							ll = 0;
							rr = 1;
							count = 0;
							new boy2r();// 2r
							dispose();
						}
					}
				});

				setSize(1200, 900);
				setVisible(true);
			}
		}// 4r

		class boy2r extends JFrame { // 2r ���ڷ� ������

			boy2r() {

				count = count + 1; // ī��Ʈ ����

				setTitle("���� �̻���");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				c = getContentPane();
				MyPanel5 panel = new MyPanel5();

				c.add(panel, BorderLayout.CENTER); // FlowLayout

				JButton btn = new JButton(image2[ll]);// ���ʻ���
				JButton btn1 = new JButton("��������");// ����
				JButton btn2 = new JButton(image2[rr]);// �����ʻ���

				panel.setLayout(null);

				btn.setLocation(75, 155);
				btn.setSize(425, 635);
				panel.add(btn);

				btn1.setFont(new Font("HY�︪��M", Font.PLAIN, 16));
				btn1.setLocation(543, 490);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(685, 155);
				btn2.setSize(425, 635);
				panel.add(btn2);

				th=new Thread(runnable);
				timerLabel.setLocation(550,50);
				timerLabel.setSize(300,300);
				panel.add(timerLabel);
				th.start();//start()�޼ҵ� ȣ��,������ �۵�����
				timerLabel.setToolTipText("���� �ð��Դϴ�. 0�ʰ� �Ǹ� Game Over �˴ϴ�.");
				btn.addActionListener(new ActionListener() { // ����
					public void actionPerformed(ActionEvent e) {

						image1[0] = image2[ll];

						ll = 0;
						rr = 0;
						count = 0;

						new winner();
						// new boy1r();//1r
						dispose();

					}
				});

				btn1.addActionListener(new ActionListener() { // ��������
					public void actionPerformed(ActionEvent e) {

						int n = (int) (Math.random() * 2) + 1;

						if (n == 1) {// ��������
							image1[0] = image2[ll];
							ll = 0;
							rr = 0;
							count = 0;
							new winner();
							// new boy1r();//1r
							dispose();
						}

						else if (n == 2) {//// ��������
							image1[0] = image2[rr];
							ll = 0;
							rr = 0;
							count = 0;
							new winner();
							// new boy1r();//1r
							dispose();
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // ������
					public void actionPerformed(ActionEvent e) {

						image1[0] = image2[rr];
						ll = 0;
						rr = 0;
						count = 0;

						new winner();
						// new boy1r();//1r

						dispose();
					}
				});

				setSize(1200, 900);
				setVisible(true);
			}
		}// 2r

		class boy1r extends JFrame { // ��³��ڷ� ������

			boy1r() {

				count = count + 1; // ī��Ʈ ����
				setTitle("���� �̻���");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				c = getContentPane();
				MyPanel6 panel = new MyPanel6();

				c.add(panel, BorderLayout.CENTER); // FlowLayout

				JButton btn = new JButton(image1[ll]);// ���ʻ���
				JButton btn1 = new JButton("��������");// ����
				JButton btn2 = new JButton("<<���");// �����ʻ���

				panel.setLayout(null);

				btn.setLocation(75, 155);
				btn.setSize(425, 635);
				panel.add(btn);

				btn1.setFont(new Font("HY�︪��M", Font.PLAIN, 16));
				btn1.setLocation(543, 490);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(685, 155);
				btn2.setSize(425, 635);
				panel.add(btn2);

				btn.addActionListener(new ActionListener() { // ����
					public void actionPerformed(ActionEvent e) {
						new boy2r();// 1r
						dispose();
					}
				});

				btn1.addActionListener(new ActionListener() { // ��������
					public void actionPerformed(ActionEvent e) {
						new boy2r();
						dispose();
					}
				});

				btn2.addActionListener(new ActionListener() { // ������
					public void actionPerformed(ActionEvent e) {
						new boy2r();// 1r
						dispose();
					}
				});

				setSize(1200, 900);
				setVisible(true);
			}

		}

		class winner extends JFrame {
			winner() {
				runnable.interrupt();
				th.interrupt();
				
				System.out.println("���"+image1[ll]);
				setTitle("�����");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel7 panel = new MyPanel7();

				c.add(panel, BorderLayout.CENTER);

				// JLabel textLabel = new JLabel("���");
				// c.add(textLabel);

				ImageIcon startButton = new ImageIcon("images/ó������.jpg");
				ImageIcon reButton = new ImageIcon("images/�ٽ��ϱ�.jpg");
				ImageIcon exitButton = new ImageIcon("images/�����ϱ�.jpg");

				JButton btn2 = new JButton(image1[ll]);// ��������

				JButton btn = new JButton(startButton);// ó������
				JButton btn1 = new JButton(exitButton); // ����
				JButton btn3 = new JButton(reButton);// �ٽ��ϱ�

				panel.setLayout(null);

				btn2.setLocation(370, 190);// ��ġ
				btn2.setSize(430, 530);// ��ưũ�� = ����ũ��
				panel.add(btn2);

				btn.setLocation(280, 750);
				btn.setSize(200, 100);
				panel.add(btn);

				btn3.setLocation(490, 750);
				btn3.setSize(200, 100);
				panel.add(btn3);

				btn1.setLocation(700, 750);
				btn1.setSize(200, 100);
				panel.add(btn1);

				btn.addActionListener(new ActionListener() { // ó��
					public void actionPerformed(ActionEvent e) {
						new MainClass();
						dispose();
					}
				});
				btn1.addActionListener(new ActionListener() { // ����
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				});

				btn3.addActionListener(new ActionListener() { // �ٽ�
					public void actionPerformed(ActionEvent e) {
	
						new PlayWorldCup();
						dispose();
					}
				});

				setSize(1200, 900);
				setVisible(true);
			}
		}// 1r
	}
