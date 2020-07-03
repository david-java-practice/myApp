package swingProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MemberListView extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	ArrayList<Member> arr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberListView frame = new MemberListView();
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
	public MemberListView() {
		setTitle("회원정보 v0.1");
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getTabbedPane_1(), BorderLayout.CENTER);
		
	}
	private JTabbedPane getTabbedPane_1() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBackground(Color.PINK);
			tabbedPane.addTab("New tab", null, getPanel(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getScrollPane(), BorderLayout.CENTER);
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			
			MemberDAOImpl dao = new MemberDAOImpl();
			 arr = dao.MemberView();
			String[] cols = {"아이디","비밀번호","이름","전화번호","주소","생년월일",
					"직업","성별","이메일"};
			DefaultTableModel dt = new DefaultTableModel(cols, arr.size());
			table.setModel(dt);
			for(int i=0; i<arr.size(); i++) {
				dt.setValueAt(arr.get(i).getId(), i, 0);
				dt.setValueAt(arr.get(i).getPwd(), i, 1);
				dt.setValueAt(arr.get(i).getName(), i, 2);
				dt.setValueAt(arr.get(i).getTel(), i, 3);
				dt.setValueAt(arr.get(i).getAddr(), i, 4);
				dt.setValueAt(arr.get(i).getBirth(), i, 5);
				dt.setValueAt(arr.get(i).getJob(), i, 6);
				dt.setValueAt(arr.get(i).getGender(), i, 7);
				dt.setValueAt(arr.get(i).getEmail(), i, 8);
			}
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int r = table.getSelectedRow();
					Member m = arr.get(r);
					MemberView view = new MemberView(m);
					view.setVisible(true);
					
					//String id = (String) table.getValueAt(r,  0);
					//MemberView mv = new MemberView(id, this);
					
				}
			});
		}
		return table;
	}
}
