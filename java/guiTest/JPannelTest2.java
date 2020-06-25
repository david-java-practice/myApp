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
		super("�г��׽�Ʈ");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��Ȯ�ϰ� �ݱ�
		 p1 = new JPanel(); //v�г�1
		 p2 = new JPanel(); //�г�2
		 ta = new JTextArea(10,20);
		JButton b1 = new JButton("�г�2���̱�");
		JButton b2 = new JButton("�г�2�Ⱥ��̱�");
		JButton b3 = new JButton("�г�1���̱�");
		JButton b4 = new JButton("�г�1�Ⱥ��̱�");
		
		//�г� 1=>b1,b2 / �г�2 =>b3,b4�� ���� 
		p1.add(b1); //button�� �гο� ����
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
		ta.append(str+"\n"); //4�� button�� �����ֱ��,,
		if(str.contentEquals("�г�2���̱�")){
			p2.setVisible(true);
		
		}else if(str.contentEquals("�г�2�Ⱥ��̱�")){
			p2.setVisible(false);
		
		}else if(str.contentEquals("�г�1���̱�")){
			p1.setVisible(true);
		
		}else{
			p1.setVisible(false);
			
		}
		
	}
	public static void main(String[] args) {
		new JPannelTest2();

	}

}
