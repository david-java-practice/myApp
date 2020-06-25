package guiTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JPannelTest2 extends JFrame implements ActionListener {
	JPanel p1, p2;
	JTextArea ta;

	public JPannelTest2(){
		super("패널테스트");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //정확하게 닫기
		 p1 = new JPanel(); //v패널1
		 p2 = new JPanel(); //패널2
		 ta = new JTextArea(10,20);
		JButton b1 = new JButton("패널2보이기");
		JButton b2 = new JButton("패널2안보이기");
		JButton b3 = new JButton("패널1보이기");
		JButton b4 = new JButton("패널1안보이기");
		
		//패널 1=>b1,b2 / 패널2 =>b3,b4로 묶기 
		p1.add(b1); //button을 패널에 입힘
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		add(p1);
		add(p2);
		add(ta);
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.GREEN);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(300,400);
		setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
		String str= e.getActionCommand();
		ta.append(str+"\n"); //4개 button다 보여주기로,,
		if(str.contentEquals("패널2보이기")){
			p2.setVisible(true);
		
		}else if(str.contentEquals("패널2안보이기")){
			p2.setVisible(false);
		
		}else if(str.contentEquals("패널1보이기")){
			p1.setVisible(true);
		
		}else{
			p1.setVisible(false);
			
		}
		
	}
	public static void main(String[] args) {
		new JPannelTest2();

	}

}
