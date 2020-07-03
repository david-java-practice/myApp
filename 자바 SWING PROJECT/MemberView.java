package swingProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Friend;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MemberView extends JFrame  {
	JTextField[] tf = new JTextField[6];
	MemberDAOImpl dao = new MemberDAOImpl();
	JButton btnInsert, btnCancel, btnUpdate, btnDelete;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfId;
	private JLabel lblNewLabel_1;
	private JTextField tfPwd;
	private JLabel lblNewLabel_2;
	private JTextField tfName;
	private JLabel lblNewLabel_3;
	private JTextField tfTel1;
	private JTextField tfTel2;
	private JTextField tfTel3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField tfAddr;
	private JRadioButton rbMan;
	private JRadioButton rbWoman;
	private JTextField tfEmail;
	private JComboBox jcbJob;
	private JLabel lblNewLabel_9;
	private JTextField tfBirth1;
	private JTextField tfBirth2;
	private JTextField tfBirth3;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_8_1;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_10_1;
	Member m;

	
	ButtonGroup bg = new ButtonGroup();		//라디오버튼 남자여자 통합

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberView frame = new MemberView(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public MemberView(Member m) {
		this.m = m;
		
		
		setTitle("회원정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getTfId());
		contentPane.add(getLabel_2());
		contentPane.add(getTfPwd());
		contentPane.add(getLabel_3());
		contentPane.add(getTfName());
		contentPane.add(getLabel_4());
		contentPane.add(getTfTel1());
		contentPane.add(getLabel_5());
		contentPane.add(getLabel_6());
		contentPane.add(getLabel_7());
		contentPane.add(getLabel_8());
		contentPane.add(getTfAddr());
		contentPane.add(getMrdb());
		contentPane.add(getFrdb());
		contentPane.add(getTfEmail());
		contentPane.add(getJcbJob());
		contentPane.add(getLabel_10());
		contentPane.add(getTfBirth1());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getTfTel2());
		contentPane.add(getTfTel3());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_8_1());
		contentPane.add(getTfBirth2());
		contentPane.add(getTfBirth3());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getLblNewLabel_10_1());
		if(m!=null) {
			tfId.setText(m.getId());
			
			button.setText("수정");
		}
		
	}
	private JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("아이디:");
			lblNewLabel.setBounds(7, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(76, 7, 262, 21);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JLabel getLabel_2() {
		
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("비밀번호:");
			lblNewLabel_1.setBounds(7, 41, 57, 15);
			
		}
		return lblNewLabel_1;
	}
	private JTextField getTfPwd() {
		if (tfPwd == null) {
			tfPwd = new JTextField();
			tfPwd.setBounds(76, 38, 262, 21);
			tfPwd.setColumns(10);
		}
		return tfPwd;
	}
	private JLabel getLabel_3() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("이름:");
			lblNewLabel_2.setBounds(7, 81, 43, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(76, 77, 262, 23);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JLabel getLabel_4() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전화:");
			lblNewLabel_3.setBounds(14, 127, 50, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfTel1() {
		if (tfTel1 == null) {
			tfTel1 = new JTextField();
			tfTel1.setBounds(76, 124, 57, 21);
			tfTel1.setColumns(10);
		}
		return tfTel1;
	}
	private JLabel getLabel_5() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("주소:");
			lblNewLabel_4.setBounds(14, 172, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLabel_6() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("직업:");
			lblNewLabel_5.setBounds(7, 254, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLabel_7() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("성별:");
			lblNewLabel_6.setBounds(7, 292, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLabel_8() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("이메일:");
			lblNewLabel_7.setBounds(7, 332, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JTextField getTfAddr() {
		if (tfAddr == null) {
			tfAddr = new JTextField();
			tfAddr.setBounds(76, 168, 262, 23);
			tfAddr.setColumns(10);
		}
		return tfAddr;
	}
	
	private JRadioButton getMrdb() {				 
			
		if (rbMan == null) {
			rbMan = new JRadioButton("남",true);
			rbMan.setBounds(85, 288, 43, 23);
			bg.add(rbMan);
		}
		return rbMan;
	}
	private JRadioButton getFrdb() {
		if (rbWoman == null) {
			rbWoman = new JRadioButton("여",false);
			rbWoman.setBounds(151, 288, 43, 23);
			bg.add(rbWoman);
		}
		return rbWoman;
	}
	
	
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setBounds(85, 328, 253, 23);
			tfEmail.setColumns(10);
		}
		return tfEmail;
	}
	private JComboBox getJcbJob() {

		if (jcbJob == null) {	
			jcbJob = new JComboBox();
			jcbJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "직장인", "주부", "백수"}));
			jcbJob.setBounds(76, 253, 77, 17);
		}
		return jcbJob;
	}
	private JLabel getLabel_10() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("생일:");
			lblNewLabel_9.setBounds(7, 216, 57, 15);
		}
		return lblNewLabel_9;
	}
	private JTextField getTfBirth1() {
		if (tfBirth1 == null) {
			tfBirth1 = new JTextField();
			tfBirth1.setBounds(76, 212, 57, 23);
			tfBirth1.setColumns(10);
		}
		return tfBirth1;
	}
	//가입
	private JButton getButton() {
		if (button == null) {
			button = new JButton("가입");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Member m = new Member();
					m.setId(tfId.getText());
					m.setPwd(tfPwd.getText());
					m.setName(tfName.getText());
					m.setTel(tfTel1.getText()+"-"+tfTel2.getText()+"-"+tfTel3.getText());
					m.setAddr(tfAddr.getText());
					m.setBirth(tfBirth1.getText()+"/"+tfBirth2.getText()+"/"+tfBirth3.getText());				
					m.setJob((String)jcbJob.getSelectedItem());
					m.setGender(rbMan.getText());
					m.setGender(rbWoman.getText());
					m.setEmail(tfEmail.getText());
					System.out.println("버튼 글자 :"+button.getText());
					if(button.getText().equals("가입")) {
						int r =dao.memberInsert(m);	
						if(r==1) {
							JOptionPane.showMessageDialog(null, "가입성공"); //가입성공시 팝업창을 띄움
						}else {
							JOptionPane.showMessageDialog(null, "가입실패"); //가입실패시 팝업창을 띄움
						}
					}else {
						int r =dao.memberUpdate(m);	
						if(r==1) {
							JOptionPane.showMessageDialog(null, "수정성공"); //수정성공시 팝업창을 띄움
						}else {
							JOptionPane.showMessageDialog(null, "수정실패"); //수정실패시 팝업창을 띄움
						}
					}
					
					
				}
			});
			button.setBounds(85, 386, 88, 23);
		}
		return button;
	}
	
	//취소
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("취소");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(arg0.getSource() == button_1) {
						dispose();
						//system.exit(0)  내가띄운 모든 창이 닫힘
					}
				}
			});
			button_1.setBounds(208, 386, 88, 23);
		}
		return button_1;
	}
	
	//회원 정보 수정
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정하기");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Member m = new Member();
					m.setId(tf[0].getText());
					m.setPwd(tf[1].getText());
					m.setName(tf[2].getText());
					m.setTel(tf[3].getText());
					m.setAddr(tf[4].getText());
					m.setBirth(tf[5].getText());
					m.setJob(tf[6].getText());
					m.setGender(tf[7].getText());
					m.setEmail(tf[8].getText());
					dao.memberUpdate(m);
					
					
					
				}
			});
			btnUpdate.setBounds(12, 328, 97, 23);
		}
		return btnUpdate;
	}
	
	//삭제하기
	

	
	private JTextField getTfTel2() {
		if (tfTel2 == null) {
			tfTel2 = new JTextField();
			tfTel2.setBounds(155, 124, 77, 21);
			tfTel2.setColumns(10);
		}
		return tfTel2;
	}
	private JTextField getTfTel3() {
		if (tfTel3 == null) {
			tfTel3 = new JTextField();
			tfTel3.setBounds(250, 124, 88, 21);
			tfTel3.setColumns(10);
		}
		return tfTel3;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("-");
			lblNewLabel_8.setBounds(145, 127, 28, 15);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_8_1() {
		if (lblNewLabel_8_1 == null) {
			lblNewLabel_8_1 = new JLabel("-");
			lblNewLabel_8_1.setBounds(238, 127, 28, 15);
		}
		return lblNewLabel_8_1;
	}
	private JTextField getTfBirth2() {
		if (tfBirth2 == null) {
			tfBirth2 = new JTextField();
			tfBirth2.setColumns(10);
			tfBirth2.setBounds(161, 213, 71, 23);
		}
		return tfBirth2;
	}
	private JTextField getTfBirth3() {
		if (tfBirth3 == null) {
			tfBirth3 = new JTextField();
			tfBirth3.setColumns(10);
			tfBirth3.setBounds(254, 213, 71, 23);
		}
		return tfBirth3;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("/");
			lblNewLabel_10.setBounds(145, 216, 20, 15);
		}
		return lblNewLabel_10;
	}
	private JLabel getLblNewLabel_10_1() {
		if (lblNewLabel_10_1 == null) {
			lblNewLabel_10_1 = new JLabel("/");
			lblNewLabel_10_1.setBounds(238, 216, 20, 15);
		}
		return lblNewLabel_10_1;
	}
}
