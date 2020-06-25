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
		super("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�� �ι�°�� ���α� 
		setLayout(new FlowLayout());
		tf = new JTextField(10);
		JButton b1 = new JButton("������");
		ta = new JTextArea(15,20);
		tf.addActionListener(this); //tfĭ���� enter�ĵ� �� �����Բ� ,,
		add(tf);
		add(b1);
		add(ta);
		b1.addActionListener(this);
		setSize(300,400);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		ta.setText(""); //�ʱ�ȭ 
		//����ó�� 
		try{
			for(int i=1; i<=9; i++) {
				int v = Integer.parseInt(tf.getText()); //����ȯ ,, 
					ta.append(v+"*"+i+"="+v*i+"\n");
		
			}
		}catch(NumberFormatException n) { //n ���� �ϰų� ����������,,
			//int�ƴ� string�� �Է� �� ���ڸ� �Է��ϼ���
			ta.append("���ڸ� �Է��ϼ���."); 
		}
	}
	public static void main(String[] args) {
		new JGugudan();

	}

}
