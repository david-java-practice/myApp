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
		//�����̳ʿ� ������Ʈ�� ����
		//�����̳� (������, J Fream,,)
		
		super("GUI Test"); //-> ���� 
		//setTitle("GUI Test"); super = setTitle �Ȱ��� ,, 
		Button b1 = new Button("��ư1");
		Button b2 = new Button("��ư2");
		Button b3 = new Button("��ư3");
		tf1 = new TextField(20); //(txt���� ũ��)
		// ��ġ������ : flowlayout, boardLayout ... �������� ��
		//���ʴ�� layout : flowlayout 
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(tf1);
		b1.addActionListener(this); //actionperform�� �ִ� ��ġ : this 
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(300,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.contentEquals("��ư1")) {
			System.out.println("��ư1 �̺�Ʈ �߻�");
			setBackground(Color.YELLOW);
			System.out.println(tf1.getText()); //getText : ���� �Է��� ���� �������� �Լ� 
		}else if (str.contentEquals("��ư2")){
			System.out.println("��ư2 �̺�Ʈ �߻�");
			setBackground(Color.BLUE);
		}else{
			System.out.println("��ư3 �̺�Ʈ �߻�");
			setBackground(Color.PINK);
		}
		//ActionListener�� actionPerformed�� ¦������
		//ActionListner �� ����Ʈ�ϰ�,, ���� ������ش�. 
		 //-> ���ɸ� �ϸ� ����, ,,�� ��ư1�� �̺�Ʈ�߻��� ���� 
		//-> b1.addActionListener(�ִ� ��ġ );���� ���ش�.
	}
	public static void main(String[] args) {
		
		new PannelTest();
		
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}*/// -> ���� �������̵嵵 ��.

}
