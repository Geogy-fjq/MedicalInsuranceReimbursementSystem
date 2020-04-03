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
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
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

public class 特检特治审批 extends JFrame {

	private JPanel contentPane;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField15;
	private JTextField textField13;
	private JTextField textField16;
	private JTextField textField14;
	private JTextField textField17;
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
					特检特治审批 frame = new 特检特治审批();
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
	public 特检特治审批() {
		setResizable(false);
		setTitle("特检特治审批");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 721);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("特检特治审批");
		label.setForeground(new Color(220, 20, 60));
		label.setFont(new Font("宋体", Font.BOLD, 30));
		label.setBounds(340, 15, 202, 42);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 60, 905, 2);
		contentPane.add(separator);
		
		/*
         * 改变提示弹窗的文本和按钮的字体大小
         */
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JLabel label_1 = new JLabel("查询审批信息");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(15, 63, 150, 37);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("增添审批信息");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(15, 240, 150, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("修改审批信息");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(15, 363, 150, 37);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("删除审批信息");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(15, 570, 150, 37);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("请输入人员ID：");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("宋体", Font.PLAIN, 22));
		label_5.setBounds(15, 103, 157, 28);
		contentPane.add(label_5);
		
		textField11 = new JTextField();
		textField11.setFont(new Font("宋体", Font.PLAIN, 20));
		textField11.setColumns(10);
		textField11.setBackground(Color.WHITE);
		textField11.setBounds(160, 105, 145, 30);
		contentPane.add(textField11);
		
		JLabel label_6 = new JLabel("查询结果");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.BOLD, 22));
		label_6.setBounds(15, 135, 98, 28);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("人员ID：");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("宋体", Font.PLAIN, 22));
		label_7.setBounds(15, 163, 115, 28);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("药品编码：");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("宋体", Font.PLAIN, 22));
		label_8.setBounds(287, 163, 112, 28);
		contentPane.add(label_8);
		
		textField12 = new JTextField();
		textField12.setEditable(false);
		textField12.setFont(new Font("宋体", Font.PLAIN, 20));
		textField12.setColumns(10);
		textField12.setBackground(Color.WHITE);
		textField12.setBounds(120, 165, 145, 30);
		contentPane.add(textField12);
		
		textField15 = new JTextField();
		textField15.setEditable(false);
		textField15.setFont(new Font("宋体", Font.PLAIN, 20));
		textField15.setColumns(10);
		textField15.setBackground(Color.WHITE);
		textField15.setBounds(120, 203, 145, 30);
		contentPane.add(textField15);
		
		textField13 = new JTextField();
		textField13.setEditable(false);
		textField13.setFont(new Font("宋体", Font.PLAIN, 20));
		textField13.setColumns(10);
		textField13.setBackground(Color.WHITE);
		textField13.setBounds(385, 165, 145, 30);
		contentPane.add(textField13);
		
		textField16 = new JTextField();
		textField16.setEditable(false);
		textField16.setFont(new Font("宋体", Font.PLAIN, 20));
		textField16.setColumns(10);
		textField16.setBackground(Color.WHITE);
		textField16.setBounds(385, 203, 145, 30);
		contentPane.add(textField16);
		
		JLabel label_9 = new JLabel("开始日期：");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		label_9.setBounds(15, 203, 115, 28);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("终止日期：");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("宋体", Font.PLAIN, 22));
		label_10.setBounds(284, 203, 115, 28);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("审批编号：");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		label_11.setBounds(553, 163, 112, 28);
		contentPane.add(label_11);
		
		textField14 = new JTextField();
		textField14.setEditable(false);
		textField14.setFont(new Font("宋体", Font.PLAIN, 20));
		textField14.setColumns(10);
		textField14.setBackground(Color.WHITE);
		textField14.setBounds(655, 165, 145, 30);
		contentPane.add(textField14);
		
		textField17 = new JTextField();
		textField17.setEditable(false);
		textField17.setFont(new Font("宋体", Font.PLAIN, 20));
		textField17.setColumns(10);
		textField17.setBackground(Color.WHITE);
		textField17.setBounds(655, 203, 145, 30);
		contentPane.add(textField17);
		
		JLabel label_12 = new JLabel("审批标识：");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		label_12.setBounds(553, 203, 112, 28);
		contentPane.add(label_12);
		
		JButton button = new JButton("确定");
		/*
		 * 查询特检特治审批信息
		 */
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					find特检特治审批信息();
				}
			}
			public void find特检特治审批信息(){
				try {
					String ID=textField11.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt")));
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
								textField12.setText(s1);
								textField13.setText(s2);
								textField14.setText(s3);
								textField15.setText(s4);
								textField16.setText(s5);
								textField17.setText(s6);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField12.setText("");
						textField13.setText("");
						textField14.setText("");
						textField15.setText("");
						textField16.setText("");
						textField17.setText("");
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
		button.setBounds(829, 104, 91, 37);
		contentPane.add(button);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 240, 905, 2);
		contentPane.add(separator_1);
		
		JLabel label_13 = new JLabel("人员ID：");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("宋体", Font.PLAIN, 22));
		label_13.setBounds(15, 282, 115, 28);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("开始日期：");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		label_14.setBounds(15, 320, 115, 28);
		contentPane.add(label_14);
		
		textField21 = new JTextField();
		textField21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField21.setColumns(10);
		textField21.setBackground(Color.WHITE);
		textField21.setBounds(120, 282, 145, 30);
		contentPane.add(textField21);
		
		textField24 = new JTextField();
		textField24.setFont(new Font("宋体", Font.PLAIN, 20));
		textField24.setColumns(10);
		textField24.setBackground(Color.WHITE);
		textField24.setBounds(120, 320, 145, 30);
		contentPane.add(textField24);
		
		JLabel label_15 = new JLabel("药品编码：");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		label_15.setBounds(287, 282, 112, 28);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("终止日期：");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("宋体", Font.PLAIN, 22));
		label_16.setBounds(287, 320, 112, 28);
		contentPane.add(label_16);
		
		textField22 = new JTextField();
		textField22.setFont(new Font("宋体", Font.PLAIN, 20));
		textField22.setColumns(10);
		textField22.setBackground(Color.WHITE);
		textField22.setBounds(385, 282, 145, 30);
		contentPane.add(textField22);
		
		textField25 = new JTextField();
		textField25.setFont(new Font("宋体", Font.PLAIN, 20));
		textField25.setColumns(10);
		textField25.setBackground(Color.WHITE);
		textField25.setBounds(385, 320, 145, 30);
		contentPane.add(textField25);
		
		JLabel label_17 = new JLabel("审批编号：");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("宋体", Font.PLAIN, 22));
		label_17.setBounds(553, 282, 112, 28);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("审批标识：");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("宋体", Font.PLAIN, 22));
		label_18.setBounds(553, 320, 112, 28);
		contentPane.add(label_18);
		
		textField23 = new JTextField();
		textField23.setFont(new Font("宋体", Font.PLAIN, 20));
		textField23.setColumns(10);
		textField23.setBackground(Color.WHITE);
		textField23.setBounds(655, 282, 145, 30);
		contentPane.add(textField23);
		
		textField26 = new JTextField();
		textField26.setFont(new Font("宋体", Font.PLAIN, 20));
		textField26.setColumns(10);
		textField26.setBackground(Color.WHITE);
		textField26.setBounds(655, 320, 145, 30);
		contentPane.add(textField26);
		
		JButton button_1 = new JButton("确定");
		/*
		 * 增添特检特治审批信息
		 * 从文本框的输入里获取要增添的特检特治审批信息
		 * 将信息写入文本特检特治审批信息.txt里（使用固定格式，各信息用","隔开）
		 * 排错处理
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					add特检特治审批信息();
				}
			}
			public void add特检特治审批信息() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt",true));	
		    		
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
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_1.setBackground(new Color(245, 245, 245));
		button_1.setBounds(829, 316, 91, 37);
		contentPane.add(button_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 363, 905, 2);
		contentPane.add(separator_2);
		
		JLabel label_19 = new JLabel("修改前");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("宋体", Font.BOLD, 22));
		label_19.setBounds(15, 398, 70, 28);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("人员ID：");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("宋体", Font.PLAIN, 22));
		label_20.setBounds(15, 427, 115, 28);
		contentPane.add(label_20);
		
		textField31 = new JTextField();
		textField31.setFont(new Font("宋体", Font.PLAIN, 20));
		textField31.setColumns(10);
		textField31.setBackground(Color.WHITE);
		textField31.setBounds(120, 429, 145, 30);
		contentPane.add(textField31);
		
		JLabel label_21 = new JLabel("修改成");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("宋体", Font.BOLD, 22));
		label_21.setBounds(15, 459, 70, 28);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("人员ID：");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("宋体", Font.PLAIN, 22));
		label_22.setBounds(15, 488, 115, 28);
		contentPane.add(label_22);
		
		textField32 = new JTextField();
		textField32.setFont(new Font("宋体", Font.PLAIN, 20));
		textField32.setColumns(10);
		textField32.setBackground(Color.WHITE);
		textField32.setBounds(120, 490, 145, 30);
		contentPane.add(textField32);
		
		textField35 = new JTextField();
		textField35.setFont(new Font("宋体", Font.PLAIN, 20));
		textField35.setColumns(10);
		textField35.setBackground(Color.WHITE);
		textField35.setBounds(120, 528, 145, 30);
		contentPane.add(textField35);
		
		JLabel label_23 = new JLabel("开始日期：");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		label_23.setBounds(15, 527, 115, 28);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("药品编码：");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setFont(new Font("宋体", Font.PLAIN, 22));
		label_24.setBounds(287, 491, 112, 28);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("终止日期：");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setFont(new Font("宋体", Font.PLAIN, 22));
		label_25.setBounds(287, 528, 112, 28);
		contentPane.add(label_25);
		
		textField33 = new JTextField();
		textField33.setFont(new Font("宋体", Font.PLAIN, 20));
		textField33.setColumns(10);
		textField33.setBackground(Color.WHITE);
		textField33.setBounds(385, 490, 145, 30);
		contentPane.add(textField33);
		
		textField36 = new JTextField();
		textField36.setFont(new Font("宋体", Font.PLAIN, 20));
		textField36.setColumns(10);
		textField36.setBackground(Color.WHITE);
		textField36.setBounds(385, 528, 145, 30);
		contentPane.add(textField36);
		
		JLabel label_26 = new JLabel("审批编号：");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setFont(new Font("宋体", Font.PLAIN, 22));
		label_26.setBounds(553, 488, 112, 28);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("审批标识：");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setFont(new Font("宋体", Font.PLAIN, 22));
		label_27.setBounds(553, 528, 112, 28);
		contentPane.add(label_27);
		
		textField34 = new JTextField();
		textField34.setFont(new Font("宋体", Font.PLAIN, 20));
		textField34.setColumns(10);
		textField34.setBackground(Color.WHITE);
		textField34.setBounds(655, 490, 145, 30);
		contentPane.add(textField34);
		
		textField37 = new JTextField();
		textField37.setFont(new Font("宋体", Font.PLAIN, 20));
		textField37.setColumns(10);
		textField37.setBackground(Color.WHITE);
		textField37.setBounds(655, 528, 145, 30);
		contentPane.add(textField37);
		
		JButton button_2 = new JButton("确定");
		/*
		 * 修改特检特治审批信息
		 */
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2)
				{
					modify特检特治审批信息();
				}
			}
			public void modify特检特治审批信息(){
				try {
					String ID=textField31.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt"))); 
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt"));	
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
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt",true));	
		    		
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
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_2.setBackground(new Color(245, 245, 245));
		button_2.setBounds(829, 521, 91, 37);
		contentPane.add(button_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 568, 905, 2);
		contentPane.add(separator_3);
		
		JLabel label_28 = new JLabel("人员ID：");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setFont(new Font("宋体", Font.PLAIN, 22));
		label_28.setBounds(15, 610, 115, 28);
		contentPane.add(label_28);
		
		textField41 = new JTextField();
		textField41.setFont(new Font("宋体", Font.PLAIN, 20));
		textField41.setColumns(10);
		textField41.setBackground(Color.WHITE);
		textField41.setBounds(120, 610, 145, 30);
		contentPane.add(textField41);
		
		JButton button_3 = new JButton("确定");
		/*
		 * 删除特检特治审批信息
		 */
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_3)
				{
					remove特检特治审批信息();
				}
			}
			public void remove特检特治审批信息(){
				try {
					String ID=textField41.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt"))); 
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\特检特治审批信息.txt"));	
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
		button_3.setBounds(829, 606, 91, 37);
		contentPane.add(button_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 653, 905, 2);
		contentPane.add(separator_4);
	}
}
