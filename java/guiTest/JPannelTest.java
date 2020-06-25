package guiTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JPannelTest extends JFrame implements ActionListener {
	//JFrame : x 닫기 기능 있음 
	JTextField tf1;
	public JPannelTest() {
		
		super("예로리 테스트");
		tf1 = new JTextField(20);
		
		JTextArea ta = new JTextArea(5,20); //5행 20만큼 여러개 텍스트 쓸수있다 ,, 
		TextArea tta= new TextArea(5,10); //스크롤이 생긴다.
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		Container con = getContentPane();
		add(b1);
		add(b2);
		add(tf1);
		add(ta);
		add(tta);
		b1.addActionListener(this);
		b2.addActionListener(this); //button과 actionperformed연결
		setSize(300,400);
		setVisible(true);
		setLayout(new FlowLayout());
	
		
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		Container con = getContentPane();
		if(str.equals("버튼1")) {
			System.out.println("버튼1 클릭");
			//JFrame : 직접적으로 색 못바꿈 ,,  -> container나 getContentPane 이용해서 색바꿈
			getContentPane().setBackground(Color.blue); 
			//con.setBackground(Color.blue); 
			System.out.println(tf1.getText());
		}else {
			System.out.println("버튼2 클릭");
			 //이케 두줄로 표현하거나 getContentPane()하거나 ,, 
			con.setBackground(Color.CYAN);
			tf1.setText(""); //set은 설정의 의미 -> 괄호안처럼 빈공간으로 만들어라.
			//get은 가져오는것 ,, 
		}
	}
	
	
	public static void main(String[] args) {
		new JPannelTest();

	}

}
