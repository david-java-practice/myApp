package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PannelTest extends Frame implements ActionListener {

	TextField tf1;
	public PannelTest() {
		//컨테이너에 컴포넌트를 부착
		//컨테이너 (프레임, J Fream,,)
		
		super("GUI Test"); //-> 제목 
		//setTitle("GUI Test"); super = setTitle 똑같다 ,, 
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		tf1 = new TextField(20); //(txt적는 크기)
		// 배치관리자 : flowlayout, boardLayout ... 여러가지 有
		//차례대로 layout : flowlayout 
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(tf1);
		b1.addActionListener(this); //actionperform이 있는 위치 : this 
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(300,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.contentEquals("버튼1")) {
			System.out.println("버튼1 이벤트 발생");
			setBackground(Color.YELLOW);
			System.out.println(tf1.getText()); //getText : 내가 입력한 내용 가져오는 함수 
		}else if (str.contentEquals("버튼2")){
			System.out.println("버튼2 이벤트 발생");
			setBackground(Color.BLUE);
		}else{
			System.out.println("버튼3 이벤트 발생");
			setBackground(Color.PINK);
		}
		//ActionListener와 actionPerformed는 짝지형태
		//ActionListner 를 임포트하고,, 이케 만들어준다. 
		 //-> 이케만 하면 오류, ,,라서 버튼1과 이벤트발생을 연결 
		//-> b1.addActionListener(있는 위치 );이케 해준당.
	}
	public static void main(String[] args) {
		
		new PannelTest();
		
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}*/// -> 이케 오버라이드도 됨.

}
