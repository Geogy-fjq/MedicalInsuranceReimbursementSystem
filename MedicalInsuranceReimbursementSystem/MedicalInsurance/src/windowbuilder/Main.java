package windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setResizable(false);
		setTitle("医疗保险报销系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 512);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("医疗保险报销系统");
		label.setBounds(270, 25, 335, 50);
		label.setForeground(new Color(0, 51, 204));
		label.setFont(new Font("宋体", Font.BOLD, 38));
		label.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("宋体", Font.BOLD, 20));
		textField.setBackground(new Color(240, 248, 255));
		textField.setText("医疗基本信息维护");
		textField.setBounds(16, 97, 198, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setText("医疗待遇审批");
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("宋体", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(240, 248, 255));
		textField_1.setBounds(16, 295, 198, 43);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setText("公共业务");
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("宋体", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(240, 248, 255));
		textField_2.setBounds(16, 223, 198, 43);
		contentPane.add(textField_2);
		
		JButton button = new JButton("诊疗项目信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				诊疗项目信息 landwindow=new 诊疗项目信息();
				landwindow.setVisible(true);
			}
		});
		button.setBackground(new Color(224, 255, 255));
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("宋体", Font.PLAIN, 21));
		button.setBounds(452, 97, 212, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("服务设施项目信息");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				服务设施项目信息 landwindow=new 服务设施项目信息();
				landwindow.setVisible(true);
			}
		});
		button_1.setBackground(new Color(224, 255, 255));
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setFont(new Font("宋体", Font.PLAIN, 21));
		button_1.setBounds(679, 97, 212, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("药品信息");
		button_2.setBackground(new Color(224, 255, 255));
		button_2.setForeground(new Color(0, 0, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				药品信息 landwindow=new 药品信息();
				landwindow.setVisible(true);
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 21));
		button_2.setBounds(227, 97, 212, 41);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("定点医疗机构信息");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				定点医疗机构信息 landwindow=new 定点医疗机构信息();
				landwindow.setVisible(true);
			}
		});
		button_3.setBackground(new Color(224, 255, 255));
		button_3.setForeground(new Color(0, 0, 0));
		button_3.setFont(new Font("宋体", Font.PLAIN, 21));
		button_3.setBounds(227, 153, 212, 41);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("病种信息");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				病种信息 landwindow=new 病种信息();
				landwindow.setVisible(true);
			}
		});
		button_4.setBackground(new Color(224, 255, 255));
		button_4.setForeground(new Color(0, 0, 0));
		button_4.setFont(new Font("宋体", Font.PLAIN, 21));
		button_4.setBounds(452, 153, 212, 41);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("医疗待遇计算参数");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				医疗待遇计算参数 landwindow=new 医疗待遇计算参数();
				landwindow.setVisible(true);
			}
		});
		button_5.setBackground(new Color(224, 255, 255));
		button_5.setForeground(new Color(0, 0, 0));
		button_5.setFont(new Font("宋体", Font.PLAIN, 21));
		button_5.setBounds(679, 153, 212, 41);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("人员就诊机构审批");
		button_6.setBackground(new Color(224, 255, 255));
		button_6.setForeground(new Color(0, 0, 0));
		button_6.setFont(new Font("宋体", Font.PLAIN, 21));
		button_6.setBounds(227, 295, 212, 41);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("特检特治审批");
		button_7.setBackground(new Color(224, 255, 255));
		button_7.setForeground(new Color(0, 0, 0));
		button_7.setFont(new Font("宋体", Font.PLAIN, 21));
		button_7.setBounds(452, 295, 212, 41);
		contentPane.add(button_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 85, 880, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 206, 880, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 278, 880, 2);
		contentPane.add(separator_2);
		
		JButton button_8 = new JButton("单位基本信息维护");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				单位基本信息维护 landwindow=new 单位基本信息维护();
				landwindow.setVisible(true);
			}
		});
		button_8.setBackground(new Color(224, 255, 255));
		button_8.setForeground(new Color(0, 0, 0));
		button_8.setFont(new Font("宋体", Font.PLAIN, 21));
		button_8.setBounds(227, 223, 212, 41);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("个人基本信息维护");
		button_9.setBackground(new Color(224, 255, 255));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				个人基本信息维护 landwindow=new 个人基本信息维护();
				landwindow.setVisible(true);
			}
		});
		button_9.setForeground(new Color(0, 0, 0));
		button_9.setFont(new Font("宋体", Font.PLAIN, 21));
		button_9.setBounds(452, 222, 212, 42);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("医疗人员费用查询");
		button_10.setBackground(new Color(224, 255, 255));
		button_10.setForeground(new Color(0, 0, 0));
		button_10.setFont(new Font("宋体", Font.PLAIN, 21));
		button_10.setBounds(679, 223, 212, 41);
		contentPane.add(button_10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 349, 880, 2);
		contentPane.add(separator_3);
		
		JButton button_11 = new JButton("中心报销");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				中心报销 landwindow=new 中心报销();
				landwindow.setVisible(true);
			}
		});
		button_11.setBackground(new Color(224, 255, 255));
		button_11.setForeground(new Color(0, 0, 0));
		button_11.setFont(new Font("宋体", Font.PLAIN, 21));
		button_11.setBounds(227, 366, 212, 41);
		contentPane.add(button_11);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("医保中心报销");
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setFont(new Font("宋体", Font.BOLD, 20));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(240, 248, 255));
		textField_3.setBounds(16, 366, 198, 43);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\代码\\2018年暑期实验课\\医保图片小.png"));
		lblNewLabel.setBounds(200, 23, 64, 54);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(11, 419, 880, 2);
		contentPane.add(separator_4);
		
		JButton button_12 = new JButton("返回");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_12)
				{
					Land landwindow=new Land();
				    landwindow.setVisible(true);
				}				
			}
		});
		button_12.setForeground(Color.BLACK);
		button_12.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_12.setBackground(new Color(245, 245, 245));
		button_12.setBounds(813, 425, 78, 37);
		contentPane.add(button_12);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
