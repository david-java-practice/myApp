package guiTest;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBoxTest  extends JFrame
 implements ItemListener{
	private JTextArea ta;
	private JCheckBox cb1, cb2;
	public CheckBoxTest() {
		setTitle("CheckboxTest");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1= new JPanel();
		 ta = new JTextArea();
		 cb1 = new JCheckBox("바나나");
		 cb2 = new JCheckBox("오렌지");
		 JScrollPane jsp = new JScrollPane(ta);
		p1.add(cb1);		p1.add(cb2);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		add(BorderLayout.NORTH, p1);
		add(BorderLayout.CENTER,jsp);
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxTest();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
	   //어떤체크박스가 선택되었는지 구분
		// 선택된 체크박스의 체크가 체크인지 아닌지 구분
		JCheckBox cb = (JCheckBox)e.getSource();
		if(cb.isSelected()) {
			ta.append(cb.getText()+" 선택\n");
		}else {
			ta.append(cb.getText()+" 선택해제\n");
		}
	/*	if(cb==cb1) {
			if(cb.isSelected()) {
				ta.append("바나나 선택\n");
			}else {
				ta.append("바나나 선택해제\n");
			}
			
		}else if(cb==cb2) {
			if(cb.isSelected()) {
				ta.append("오렌지 선택\n");
			}else {
				ta.append("오렌지 선택해제\n");
			}
		}*/
		
	}

}
