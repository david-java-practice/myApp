package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener {
	
	JTextField tf;
	JTextArea ta;
	public JGugudan() {
		super("구구단");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //꼭 두번째에 놔두기 
		setLayout(new FlowLayout());
		tf = new JTextField(10);
		JButton b1 = new JButton("구구단");
		ta = new JTextArea(15,20);
		tf.addActionListener(this); //tf칸에서 enter쳐도 답 나오게끔 ,,
		add(tf);
		add(b1);
		add(ta);
		b1.addActionListener(this);
		setSize(300,400);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		ta.setText(""); //초기화 
		//예외처리 
		try{
			for(int i=1; i<=9; i++) {
				int v = Integer.parseInt(tf.getText()); //형변환 ,, 
					ta.append(v+"*"+i+"="+v*i+"\n");
		
			}
		}catch(NumberFormatException n) { //n 변수 암거나 지정ㅎㅐ서,,
			//int아닌 string형 입력 시 숫자를 입력하세요
			ta.append("숫자를 입력하세요."); 
		}
	}
	public static void main(String[] args) {
		new JGugudan();

	}

}
