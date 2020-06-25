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
	//JFrame : x �ݱ� ��� ���� 
	JTextField tf1;
	public JPannelTest() {
		
		super("���θ� �׽�Ʈ");
		tf1 = new JTextField(20);
		
		JTextArea ta = new JTextArea(5,20); //5�� 20��ŭ ������ �ؽ�Ʈ �����ִ� ,, 
		TextArea tta= new TextArea(5,10); //��ũ���� �����.
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		Container con = getContentPane();
		add(b1);
		add(b2);
		add(tf1);
		add(ta);
		add(tta);
		b1.addActionListener(this);
		b2.addActionListener(this); //button�� actionperformed����
		setSize(300,400);
		setVisible(true);
		setLayout(new FlowLayout());
	
		
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		Container con = getContentPane();
		if(str.equals("��ư1")) {
			System.out.println("��ư1 Ŭ��");
			//JFrame : ���������� �� ���ٲ� ,,  -> container�� getContentPane �̿��ؼ� ���ٲ�
			getContentPane().setBackground(Color.blue); 
			//con.setBackground(Color.blue); 
			System.out.println(tf1.getText());
		}else {
			System.out.println("��ư2 Ŭ��");
			 //���� ���ٷ� ǥ���ϰų� getContentPane()�ϰų� ,, 
			con.setBackground(Color.CYAN);
			tf1.setText(""); //set�� ������ �ǹ� -> ��ȣ��ó�� ��������� ������.
			//get�� �������°� ,, 
		}
	}
	
	
	public static void main(String[] args) {
		new JPannelTest();

	}

}
