package windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class 人员就诊机构审批 extends JFrame {

	private JPanel contentPane;
	private JTextField textField11;
	private JTextField textField111;
	private JTextField textField115;
	private JTextField textField116;
	private JTextField textField112;
	private JTextField textField113;
	private JTextField textField114;
	private JTextField textField117;
	private JTextField textField121;
	private JTextField textField124;
	private JTextField textField122;
	private JTextField textField125;
	private JTextField textField123;
	private JTextField textField126;
	private JTextField textField21;
	private JTextField textField24;
	private JTextField textField22;
	private JTextField textField25;
	private JTextField textField23;
	private JTextField textField26;
	private JTextField textField31;
	private JTextField textField32;
	private JTextField textField35;
	private JTextField textField33;
	private JTextField textField36;
	private JTextField textField34;
	private JTextField textField37;
	private JTextField textField41;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					人员就诊机构审批 frame = new 人员就诊机构审批();
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
	public 人员就诊机构审批() {
		setResizable(false);
		setTitle("人员就诊机构审批");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 813);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("人员就诊机构审批");
		label.setForeground(new Color(220, 20, 60));
		label.setFont(new Font("宋体", Font.BOLD, 30));
		label.setBounds(375, 15, 263, 42);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 59, 1028, 2);
		contentPane.add(separator);
		
		JLabel label_1 = new JLabel("查询信息");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(14, 62, 113, 37);
		contentPane.add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 350, 1028, 2);
		contentPane.add(separator_1);
		
		/*
         * 改变提示弹窗的文本和按钮的字体大小
         */
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JLabel label_4 = new JLabel("人员信息");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.BOLD, 22));
		label_4.setBounds(15, 135, 101, 28);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("机构编码：");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("宋体", Font.PLAIN, 22));
		label_5.setBounds(275, 268, 112, 28);
		contentPane.add(label_5);
		
		JLabel lblid = new JLabel("请输入人员ID：");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblid.setFont(new Font("宋体", Font.PLAIN, 22));
		lblid.setBounds(15, 102, 157, 28);
		contentPane.add(lblid);
		
		textField11 = new JTextField();
		textField11.setFont(new Font("宋体", Font.PLAIN, 20));
		textField11.setColumns(10);
		textField11.setBackground(Color.WHITE);
		textField11.setBounds(161, 101, 145, 30);
		contentPane.add(textField11);
		
		textField111 = new JTextField();
		textField111.setBackground(Color.WHITE);
		textField111.setEditable(false);
		textField111.setFont(new Font("宋体", Font.PLAIN, 20));
		textField111.setColumns(10);
		textField111.setBounds(115, 164, 145, 30);
		contentPane.add(textField111);
		
		textField115 = new JTextField();
		textField115.setBackground(Color.WHITE);
		textField115.setEditable(false);
		textField115.setFont(new Font("宋体", Font.PLAIN, 20));
		textField115.setColumns(10);
		textField115.setBounds(115, 200, 145, 30);
		contentPane.add(textField115);
		
		textField116 = new JTextField();
		textField116.setBackground(Color.WHITE);
		textField116.setEditable(false);
		textField116.setFont(new Font("宋体", Font.PLAIN, 20));
		textField116.setColumns(10);
		textField116.setBounds(374, 200, 145, 30);
		contentPane.add(textField116);
		
		JLabel label_2 = new JLabel("ID：");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("宋体", Font.PLAIN, 22));
		label_2.setBounds(78, 164, 49, 28);
		contentPane.add(label_2);
		
		JLabel label_6 = new JLabel("出生日期：");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("宋体", Font.PLAIN, 22));
		label_6.setBounds(12, 200, 115, 28);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("姓名：");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.PLAIN, 22));
		label_7.setBounds(313, 164, 76, 28);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("证件类型：");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("宋体", Font.PLAIN, 22));
		label_8.setBounds(269, 200, 115, 28);
		contentPane.add(label_8);
		
		textField112 = new JTextField();
		textField112.setEditable(false);
		textField112.setBackground(Color.WHITE);
		textField112.setFont(new Font("宋体", Font.PLAIN, 20));
		textField112.setColumns(10);
		textField112.setBounds(374, 164, 145, 30);
		contentPane.add(textField112);
		
		textField113 = new JTextField();
		textField113.setBackground(Color.WHITE);
		textField113.setEditable(false);
		textField113.setFont(new Font("宋体", Font.PLAIN, 20));
		textField113.setColumns(10);
		textField113.setBounds(643, 164, 145, 30);
		contentPane.add(textField113);
		
		JLabel label_9 = new JLabel("性别：");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		label_9.setBounds(580, 164, 76, 28);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("证件编号：");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("宋体", Font.PLAIN, 22));
		label_10.setBounds(538, 200, 115, 28);
		contentPane.add(label_10);
		
		textField114 = new JTextField();
		textField114.setFont(new Font("宋体", Font.PLAIN, 20));
		textField114.setEditable(false);
		textField114.setColumns(10);
		textField114.setBackground(Color.WHITE);
		textField114.setBounds(885, 164, 145, 30);
		contentPane.add(textField114);
		
		JLabel label_11 = new JLabel("人员类别：");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		label_11.setBounds(788, 164, 115, 28);
		contentPane.add(label_11);
		
		textField117 = new JTextField();
		textField117.setFont(new Font("宋体", Font.PLAIN, 20));
		textField117.setEditable(false);
		textField117.setColumns(10);
		textField117.setBackground(Color.WHITE);
		textField117.setBounds(643, 202, 387, 30);
		contentPane.add(textField117);
		
		JLabel label_12 = new JLabel("人员就诊机构审批信息");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.BOLD, 22));
		label_12.setBounds(18, 235, 230, 28);
		contentPane.add(label_12);
		
		JLabel lblid_1 = new JLabel("人员ID：");
		lblid_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblid_1.setFont(new Font("宋体", Font.PLAIN, 22));
		lblid_1.setBounds(15, 268, 115, 28);
		contentPane.add(lblid_1);
		
		JLabel label_3 = new JLabel("审批编号：");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("宋体", Font.PLAIN, 22));
		label_3.setBounds(544, 268, 112, 28);
		contentPane.add(label_3);
		
		JLabel label_13 = new JLabel("开始日期：");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("宋体", Font.PLAIN, 22));
		label_13.setBounds(15, 307, 115, 28);
		contentPane.add(label_13);
		
		textField121 = new JTextField();
		textField121.setBackground(Color.WHITE);
		textField121.setEditable(false);
		textField121.setFont(new Font("宋体", Font.PLAIN, 20));
		textField121.setColumns(10);
		textField121.setBounds(115, 268, 145, 30);
		contentPane.add(textField121);
		
		textField124 = new JTextField();
		textField124.setBackground(Color.WHITE);
		textField124.setEditable(false);
		textField124.setFont(new Font("宋体", Font.PLAIN, 20));
		textField124.setColumns(10);
		textField124.setBounds(115, 305, 145, 30);
		contentPane.add(textField124);
		
		JLabel label_14 = new JLabel("终止日期：");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		label_14.setBounds(275, 307, 115, 28);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("审批标识：");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		label_15.setBounds(544, 307, 112, 28);
		contentPane.add(label_15);
		
		textField122 = new JTextField();
		textField122.setEditable(false);
		textField122.setBackground(Color.WHITE);
		textField122.setFont(new Font("宋体", Font.PLAIN, 20));
		textField122.setColumns(10);
		textField122.setBounds(374, 268, 145, 30);
		contentPane.add(textField122);
		
		textField125 = new JTextField();
		textField125.setEditable(false);
		textField125.setBackground(Color.WHITE);
		textField125.setFont(new Font("宋体", Font.PLAIN, 20));
		textField125.setColumns(10);
		textField125.setBounds(374, 305, 145, 30);
		contentPane.add(textField125);
		
		textField123 = new JTextField();
		textField123.setEditable(false);
		textField123.setBackground(Color.WHITE);
		textField123.setFont(new Font("宋体", Font.PLAIN, 20));
		textField123.setColumns(10);
		textField123.setBounds(643, 268, 145, 30);
		contentPane.add(textField123);
		
		textField126 = new JTextField();
		textField126.setBackground(Color.WHITE);
		textField126.setEditable(false);
		textField126.setFont(new Font("宋体", Font.PLAIN, 20));
		textField126.setColumns(10);
		textField126.setBounds(643, 305, 145, 30);
		contentPane.add(textField126);
		
		JLabel label_16 = new JLabel("增添人员就诊机构审批信息");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(15, 349, 306, 37);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("删除人员就诊机构审批信息");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(15, 676, 306, 37);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("修改人员就诊机构审批信息");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.BLACK);
		label_18.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(15, 468, 306, 37);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("人员ID：");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("宋体", Font.PLAIN, 22));
		label_19.setBounds(15, 390, 115, 28);
		contentPane.add(label_19);
		
		textField21 = new JTextField();
		textField21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField21.setEditable(false);
		textField21.setColumns(10);
		textField21.setBackground(Color.WHITE);
		textField21.setBounds(115, 388, 145, 30);
		contentPane.add(textField21);
		
		JLabel label_20 = new JLabel("开始日期：");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("宋体", Font.PLAIN, 22));
		label_20.setBounds(15, 425, 115, 28);
		contentPane.add(label_20);
		
		textField24 = new JTextField();
		textField24.setFont(new Font("宋体", Font.PLAIN, 20));
		textField24.setEditable(false);
		textField24.setColumns(10);
		textField24.setBackground(Color.WHITE);
		textField24.setBounds(115, 425, 145, 30);
		contentPane.add(textField24);
		
		JLabel label_21 = new JLabel("机构编码：");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("宋体", Font.PLAIN, 22));
		label_21.setBounds(277, 390, 112, 28);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("终止日期：");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("宋体", Font.PLAIN, 22));
		label_22.setBounds(275, 425, 115, 28);
		contentPane.add(label_22);
		
		textField22 = new JTextField();
		textField22.setFont(new Font("宋体", Font.PLAIN, 20));
		textField22.setEditable(false);
		textField22.setColumns(10);
		textField22.setBackground(Color.WHITE);
		textField22.setBounds(374, 388, 145, 30);
		contentPane.add(textField22);
		
		textField25 = new JTextField();
		textField25.setFont(new Font("宋体", Font.PLAIN, 20));
		textField25.setEditable(false);
		textField25.setColumns(10);
		textField25.setBackground(Color.WHITE);
		textField25.setBounds(374, 425, 145, 30);
		contentPane.add(textField25);
		
		JLabel label_23 = new JLabel("审批编号：");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		label_23.setBounds(544, 390, 112, 28);
		contentPane.add(label_23);
		
		textField23 = new JTextField();
		textField23.setFont(new Font("宋体", Font.PLAIN, 20));
		textField23.setEditable(false);
		textField23.setColumns(10);
		textField23.setBackground(Color.WHITE);
		textField23.setBounds(643, 388, 145, 30);
		contentPane.add(textField23);
		
		textField26 = new JTextField();
		textField26.setFont(new Font("宋体", Font.PLAIN, 20));
		textField26.setEditable(false);
		textField26.setColumns(10);
		textField26.setBackground(Color.WHITE);
		textField26.setBounds(643, 425, 145, 30);
		contentPane.add(textField26);
		
		JLabel label_24 = new JLabel("审批标识：");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setFont(new Font("宋体", Font.PLAIN, 22));
		label_24.setBounds(544, 425, 112, 28);
		contentPane.add(label_24);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 465, 1028, 2);
		contentPane.add(separator_2);
		
		JLabel label_25 = new JLabel("人员ID：");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setFont(new Font("宋体", Font.PLAIN, 22));
		label_25.setBounds(15, 538, 115, 28);
		contentPane.add(label_25);
		
		textField31 = new JTextField();
		textField31.setFont(new Font("宋体", Font.PLAIN, 20));
		textField31.setEditable(false);
		textField31.setColumns(10);
		textField31.setBackground(Color.WHITE);
		textField31.setBounds(115, 538, 145, 30);
		contentPane.add(textField31);
		
		JLabel label_26 = new JLabel("修改前");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("宋体", Font.BOLD, 22));
		label_26.setBounds(18, 506, 70, 28);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("修改成");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("宋体", Font.BOLD, 22));
		label_27.setBounds(18, 568, 70, 28);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("人员ID：");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setFont(new Font("宋体", Font.PLAIN, 22));
		label_28.setBounds(15, 596, 115, 28);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("开始日期：");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("宋体", Font.PLAIN, 22));
		label_29.setBounds(15, 633, 115, 28);
		contentPane.add(label_29);
		
		textField32 = new JTextField();
		textField32.setFont(new Font("宋体", Font.PLAIN, 20));
		textField32.setEditable(false);
		textField32.setColumns(10);
		textField32.setBackground(Color.WHITE);
		textField32.setBounds(115, 596, 145, 30);
		contentPane.add(textField32);
		
		textField35 = new JTextField();
		textField35.setFont(new Font("宋体", Font.PLAIN, 20));
		textField35.setEditable(false);
		textField35.setColumns(10);
		textField35.setBackground(Color.WHITE);
		textField35.setBounds(115, 633, 145, 30);
		contentPane.add(textField35);
		
		textField33 = new JTextField();
		textField33.setFont(new Font("宋体", Font.PLAIN, 20));
		textField33.setEditable(false);
		textField33.setColumns(10);
		textField33.setBackground(Color.WHITE);
		textField33.setBounds(374, 598, 145, 30);
		contentPane.add(textField33);
		
		textField36 = new JTextField();
		textField36.setFont(new Font("宋体", Font.PLAIN, 20));
		textField36.setEditable(false);
		textField36.setColumns(10);
		textField36.setBackground(Color.WHITE);
		textField36.setBounds(374, 635, 145, 30);
		contentPane.add(textField36);
		
		JLabel label_30 = new JLabel("机构编码：");
		label_30.setHorizontalAlignment(SwingConstants.RIGHT);
		label_30.setFont(new Font("宋体", Font.PLAIN, 22));
		label_30.setBounds(275, 601, 112, 28);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("终止日期：");
		label_31.setHorizontalAlignment(SwingConstants.RIGHT);
		label_31.setFont(new Font("宋体", Font.PLAIN, 22));
		label_31.setBounds(272, 638, 115, 28);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("审批编号：");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setFont(new Font("宋体", Font.PLAIN, 22));
		label_32.setBounds(544, 596, 112, 28);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("审批标识：");
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setFont(new Font("宋体", Font.PLAIN, 22));
		label_33.setBounds(544, 633, 112, 28);
		contentPane.add(label_33);
		
		textField34 = new JTextField();
		textField34.setFont(new Font("宋体", Font.PLAIN, 20));
		textField34.setEditable(false);
		textField34.setColumns(10);
		textField34.setBackground(Color.WHITE);
		textField34.setBounds(643, 594, 145, 30);
		contentPane.add(textField34);
		
		textField37 = new JTextField();
		textField37.setFont(new Font("宋体", Font.PLAIN, 20));
		textField37.setEditable(false);
		textField37.setColumns(10);
		textField37.setBackground(Color.WHITE);
		textField37.setBounds(643, 635, 145, 30);
		contentPane.add(textField37);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 676, 1028, 2);
		contentPane.add(separator_3);
		
		JLabel label_34 = new JLabel("人员ID：");
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setFont(new Font("宋体", Font.PLAIN, 22));
		label_34.setBounds(15, 716, 115, 28);
		contentPane.add(label_34);
		
		textField41 = new JTextField();
		textField41.setFont(new Font("宋体", Font.PLAIN, 20));
		textField41.setEditable(false);
		textField41.setColumns(10);
		textField41.setBackground(Color.WHITE);
		textField41.setBounds(115, 716, 145, 30);
		contentPane.add(textField41);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 755, 1028, 2);
		contentPane.add(separator_4);
		
		JButton button = new JButton("确定");
		/*
		 * 查询人员基本信息和就诊机构审批信息
		 */
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					find人员信息();
					find人员就诊机构审批信息();
				}
			}
			public void find人员信息(){
				try {
					String ID=textField11.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\个人基本信息.txt")));
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割			
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							String s2=st.nextToken();
							String s3=st.nextToken();
							String s4=st.nextToken();
							String s5=st.nextToken();
							String s6=st.nextToken();
							String s7=st.nextToken();
							if(ID.equals(s1)) {//信息匹配
								textField111.setText(s1);
								textField112.setText(s2);
								textField113.setText(s3);
								textField114.setText(s4);
								textField115.setText(s5);
								textField116.setText(s6);
								textField117.setText(s7);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField111.setText("");
						textField112.setText("");
						textField113.setText("");
						textField114.setText("");
						textField115.setText("");
						textField116.setText("");
						textField117.setText("");
						JOptionPane.showMessageDialog(null, "   该ID不存在");//弹出提示框
					}
					r.close();
				}
				//排错
				catch(FileNotFoundException e)
			    {
					e.printStackTrace();
			    }
			    catch(IOException e) {
			    	e.printStackTrace();        
			    }  
			}
				public void find人员就诊机构审批信息(){
					try {
						String ID=textField11.getText();
				        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt")));
				        int k=0;
				        
						while (r.ready()) {
							String s=r.readLine();
							StringTokenizer st=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割			
							if(st.hasMoreTokens()) {
								String s1=st.nextToken();
								String s2=st.nextToken();
								String s3=st.nextToken();
								String s4=st.nextToken();
								String s5=st.nextToken();
								String s6=st.nextToken();
								if(ID.equals(s1)) {//信息匹配
									textField121.setText(s1);
									textField122.setText(s2);
									textField123.setText(s3);
									textField124.setText(s4);
									textField125.setText(s5);
									textField126.setText(s6);
									k=1;
								}
				            }
				        }
						if(k==0) {//重置显示查找结果的文本框
							textField121.setText("");
							textField122.setText("");
							textField123.setText("");
							textField124.setText("");
							textField125.setText("");
							textField126.setText("");
							JOptionPane.showMessageDialog(null, "   该ID不存在");//弹出提示框
						}
						r.close();
					}
					//排错
					catch(FileNotFoundException e)
				    {
						e.printStackTrace();
				    }
				    catch(IOException e) {
				    	e.printStackTrace();        
				    }  
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button.setBackground(new Color(245, 245, 245));
		button.setBounds(939, 98, 91, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("确定");
		/*
		 * 修改人员就诊机构审批信息
		 * 先删除，后添加（本类中，删除和添加方法的合并使用）
		 * 详细见删除和添加方法
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					modify人员就诊机构审批信息();
				}
			}
			public void modify人员就诊机构审批信息(){
				try {
					String ID=textField31.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(ID.equals(s1))) {
								arr.add(s);
							}
							else {
								k=1;
							}
			            }
			        }
					r.close();
					
					if(k==0) {
						JOptionPane.showMessageDialog(null, "   输入错误");
					}
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt"));	
                    for(int j=0;j<arr.size();j++) {
                    	b1.write(arr.get(j).toString());
                    	b1.write("\r\n");
                    }
                    b1.flush();//将缓冲区的内容强制写出
					b1.close();
					
				}
				catch(FileNotFoundException e)
			    {
					e.printStackTrace();
			    }
			    catch(IOException e) {
			    	e.printStackTrace();        
			    }  
				try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt",true));	
		    		
					String s1=textField32.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField33.getText();
					b.write(s2);
					b.write(",");
					
					String s3=textField34.getText();
					b.write(s3);
					b.write(",");
					
					String s4=textField35.getText();
					b.write(s4);
					b.write(",");
					
					String s5=textField36.getText();
					b.write(s5);
					b.write(",");
					
					String s6=textField37.getText();
					b.write(s6);
					b.write("\r\n");

					b.close();
					JOptionPane.showMessageDialog(null, "   修改成功");
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_1.setBackground(new Color(245, 245, 245));
		button_1.setBounds(939, 624, 91, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("确定");
		/*
		 * 增添人员就诊机构审批信息
		 * 从文本框的输入里获取要增添的人员就诊机构审批信息
		 * 将信息写入文本人员就诊机构审批信息.txt里（使用固定格式，各信息用","隔开）
		 * 排错处理
		 */
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2)
				{
					add人员就诊机构审批信息();
				}
			}
			public void add人员就诊机构审批信息() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt",true));	
		    		
					String s1=textField21.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField22.getText();
					b.write(s2);
					b.write(",");
					
					String s3=textField23.getText();
					b.write(s3);
					b.write(",");
					
					String s4=textField24.getText();
					b.write(s4);
					b.write(",");
					
					String s5=textField25.getText();
					b.write(s5);
					b.write(",");
					
					String s6=textField26.getText();
					b.write(s6);
					b.write("\r\n");//使每条信息组成一行

					b.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_2.setBackground(new Color(245, 245, 245));
		button_2.setBounds(939, 416, 91, 37);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("确定");
		/*
		 * 删除人员就诊机构审批信息
		 */
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_3)
				{
					remove人员就诊机构审批信息();
				}
			}
			public void remove人员就诊机构审批信息(){
				try {
					String ID=textField41.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(ID.equals(s1))) {
								arr.add(s);
							}
							else {
								k=1;
							}
			            }
			        }
					r.close();
					
					if(k==0) {
						JOptionPane.showMessageDialog(null, "   输入错误");
					}
					else {
						JOptionPane.showMessageDialog(null, "   删除成功");
					}
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\人员就诊机构审批信息.txt"));	
                    for(int j=0;j<arr.size();j++) {
                    	b1.write(arr.get(j).toString());
                    	b1.write("\r\n");
                    }
                    b1.flush();//将缓冲区的内容强制写出
					b1.close();
					
				}
				catch(FileNotFoundException e)
			    {
					e.printStackTrace();
			    }
			    catch(IOException e) {
			    	e.printStackTrace();        
			    }  
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_3.setBackground(new Color(245, 245, 245));
		button_3.setBounds(939, 707, 91, 37);
		contentPane.add(button_3);
	}
}
