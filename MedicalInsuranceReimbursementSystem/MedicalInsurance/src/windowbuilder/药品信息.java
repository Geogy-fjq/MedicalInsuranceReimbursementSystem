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
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 药品信息 extends JFrame {

	private JPanel contentPane;
	private JTextField textField增药品编码;
	private JTextField textField增医院等级;
	private JTextField textField修后剂量单位;
	private JTextField textField增收费等级;
	private JTextField textField增最高限价;
	private JTextField textField增审批标识;
	private JTextField textField增剂量单位;
	private JTextField textField修后最高限价;
	private JTextField textField修前药品编码;
	private JTextField textField增药品名称;
	private JTextField textField修后药品编码;
	private JTextField textField修后药品名称;
	private JTextField textField修后医院等级;
	private JTextField textField修后收费等级;
	private JTextField textField修后审批标识;
	private JTextField textField查药品编码;
	private JTextField textField删药品编码;
	private JTextField textField查药品名称;
	private JTextField textField1;
	private JTextField textField6;
	private JTextField textField2;
	private JTextField textField7;
	private JTextField textField3;
	private JTextField textField5;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					药品信息 frame = new 药品信息();
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
	public 药品信息() {
		setResizable(false);
		setTitle("药品信息");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 815);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 51, 204));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("药品信息维护");
		label.setBounds(409, 14, 202, 42);
		label.setForeground(new Color(85, 107, 47));
		label.setFont(new Font("宋体", Font.BOLD, 30));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 54, 1050, 2);
		
        /*
         * 改变提示弹窗的文本和按钮的字体大小
         */
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JButton button增 = new JButton("确定");
		/*
		 * 增添药品信息
		 * 从文本框的输入里获取要增添的药品信息
		 * 将信息写入文本药品信息.txt里（使用固定格式，各信息用","隔开）
		 * 排错处理
		 */
		button增.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button增)
				{
					addDrug();
				}
			}
			public void addDrug() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\药品信息.txt",true));	
		    		
					String drugCode=textField增药品编码.getText();
					b.write(drugCode);
					b.write(",");
					
					String drugName=textField增药品名称.getText();
					b.write(drugName);
					b.write(",");
					
					String ceilingPrice=textField增最高限价.getText();
					b.write(ceilingPrice);
					b.write(",");
					
					String doesUnit=textField增剂量单位.getText();
					b.write(doesUnit);
					b.write(",");
					
					String approvalSign=textField增审批标识.getText();
					b.write(approvalSign);
					b.write(",");
					
					String hospitalGrade=textField增医院等级.getText();
					b.write(hospitalGrade);
					b.write(",");
					
					String tollGrade=textField增收费等级.getText();
					b.write(tollGrade);
					b.write("\r\n");//使每条信息组成一行

					b.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button增.setBounds(961, 152, 91, 37);
		button增.setForeground(Color.BLACK);
		button增.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button增.setBackground(new Color(245, 245, 245));
		
		JLabel label_1 = new JLabel("药品信息增添");
		label_1.setBounds(0, 60, 181, 37);
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		
		textField增药品编码 = new JTextField();
		textField增药品编码.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增药品编码.setBounds(110, 113, 145, 30);
		textField增药品编码.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("药品编码");
		lblNewLabel.setBounds(9, 113, 106, 28);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 22));
		
		JLabel label_5 = new JLabel("医院等级");
		label_5.setBounds(9, 156, 106, 28);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(separator);
		contentPane.add(button增);
		contentPane.add(label_1);
		contentPane.add(textField增药品编码);
		contentPane.add(lblNewLabel);
		contentPane.add(label_5);
		
		textField增医院等级 = new JTextField();
		textField增医院等级.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增医院等级.setBounds(110, 156, 145, 30);
		textField增医院等级.setColumns(10);
		contentPane.add(textField增医院等级);
		
		JLabel label_6 = new JLabel("药品名称");
		label_6.setBounds(275, 113, 106, 28);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("收费等级");
		label_7.setBounds(275, 156, 106, 28);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("最高限价");
		label_8.setBounds(541, 113, 106, 28);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_8);
		
		textField修后剂量单位 = new JTextField();
		textField修后剂量单位.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后剂量单位.setBounds(907, 350, 145, 30);
		textField修后剂量单位.setColumns(10);
		contentPane.add(textField修后剂量单位);
		
		textField增收费等级 = new JTextField();
		textField增收费等级.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增收费等级.setBounds(376, 156, 145, 30);
		textField增收费等级.setColumns(10);
		contentPane.add(textField增收费等级);
		
		textField增最高限价 = new JTextField();
		textField增最高限价.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增最高限价.setBounds(642, 113, 145, 30);
		textField增最高限价.setColumns(10);
		contentPane.add(textField增最高限价);
		
		textField增审批标识 = new JTextField();
		textField增审批标识.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增审批标识.setBounds(642, 156, 145, 30);
		textField增审批标识.setColumns(10);
		contentPane.add(textField增审批标识);
		
		JLabel label_9 = new JLabel("审批标识");
		label_9.setBounds(542, 156, 106, 28);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("剂量单位");
		label_10.setBounds(807, 113, 106, 28);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_10);
		
		textField增剂量单位 = new JTextField();
		textField增剂量单位.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增剂量单位.setBounds(907, 113, 145, 30);
		textField增剂量单位.setColumns(10);
		contentPane.add(textField增剂量单位);
		
		JLabel label_11 = new JLabel("药品编码");
		label_11.setBounds(9, 350, 106, 28);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_11);
		
		textField修后最高限价 = new JTextField();
		textField修后最高限价.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后最高限价.setBounds(642, 350, 145, 30);
		textField修后最高限价.setColumns(10);
		contentPane.add(textField修后最高限价);
		
		textField修前药品编码 = new JTextField();
		textField修前药品编码.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修前药品编码.setBounds(110, 280, 145, 30);
		textField修前药品编码.setColumns(10);
		contentPane.add(textField修前药品编码);
		
		textField增药品名称 = new JTextField();
		textField增药品名称.setFont(new Font("宋体", Font.PLAIN, 20));
		textField增药品名称.setBounds(376, 113, 145, 30);
		textField增药品名称.setColumns(10);
		contentPane.add(textField增药品名称);
		
		JLabel label_12 = new JLabel("医院等级");
		label_12.setBounds(9, 393, 106, 28);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_12);
		
		textField修后药品编码 = new JTextField();
		textField修后药品编码.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后药品编码.setBounds(110, 350, 145, 30);
		textField修后药品编码.setColumns(10);
		contentPane.add(textField修后药品编码);
		
		textField修后药品名称 = new JTextField();
		textField修后药品名称.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后药品名称.setBounds(376, 350, 145, 30);
		textField修后药品名称.setColumns(10);
		contentPane.add(textField修后药品名称);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 200, 1050, 1);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("药品信息修改");
		label_2.setBounds(0, 205, 181, 37);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("药品编码");
		label_3.setBounds(9, 280, 106, 28);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("修改前");
		label_4.setBounds(17, 245, 70, 28);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.BOLD, 22));
		contentPane.add(label_4);
		
		JLabel label_13 = new JLabel("修改成");
		label_13.setBounds(17, 315, 70, 28);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("宋体", Font.BOLD, 22));
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("药品名称");
		label_14.setBounds(275, 350, 106, 28);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_14);
		
		textField修后医院等级 = new JTextField();
		textField修后医院等级.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后医院等级.setBounds(110, 393, 145, 30);
		textField修后医院等级.setColumns(10);
		contentPane.add(textField修后医院等级);
		
		textField修后收费等级 = new JTextField();
		textField修后收费等级.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后收费等级.setBounds(376, 393, 145, 30);
		textField修后收费等级.setColumns(10);
		contentPane.add(textField修后收费等级);
		
		textField修后审批标识 = new JTextField();
		textField修后审批标识.setFont(new Font("宋体", Font.PLAIN, 20));
		textField修后审批标识.setBounds(642, 393, 145, 30);
		textField修后审批标识.setColumns(10);
		contentPane.add(textField修后审批标识);
		
		JLabel label_15 = new JLabel("收费等级");
		label_15.setBounds(275, 393, 106, 28);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("最高限价");
		label_16.setBounds(542, 350, 106, 28);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("审批标识");
		label_17.setBounds(542, 393, 106, 28);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("剂量单位");
		label_18.setBounds(807, 350, 106, 28);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_18);
		
		JButton button修 = new JButton("确定");
		/*
		 * 修改药品信息
		 * 先删除，后添加（本类中，删除和添加方法的合并使用）
		 * 详细见删除和添加方法
		 */
		button修.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button修)
				{
					modifyDrug();
				}
			}
			public void modifyDrug(){
				try {
					String code=textField修前药品编码.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\药品信息.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(code.equals(s1))) {
								arr.add(s);
							}
							else {
								k=1;//用于得知需要修改的信息是否存在于文件中，存在弹出"修改成功"，不存在弹出"输入错误"
							}
			            }
			        }
					r.close();
					
					if(k==0) {
						JOptionPane.showMessageDialog(null, "   输入错误");
					}
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\药品信息.txt"));	
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
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\药品信息.txt",true));	
		    		
					String drugCode=textField修后药品编码.getText();
					b.write(drugCode);
					b.write(",");
					
					String drugName=textField修后药品名称.getText();
					b.write(drugName);
					b.write(",");
					
					String ceilingPrice=textField修后最高限价.getText();
					b.write(ceilingPrice);
					b.write(",");
					
					String doesUnit=textField修后剂量单位.getText();
					b.write(doesUnit);
					b.write(",");
					
					String approvalSign=textField修后审批标识.getText();
					b.write(approvalSign);
					b.write(",");
					
					String hospitalGrade=textField修后医院等级.getText();
					b.write(hospitalGrade);
					b.write(",");
					
					String tollGrade=textField修后收费等级.getText();
					b.write(tollGrade);
					b.write("\r\n");

					b.close();
					JOptionPane.showMessageDialog(null, "   修改成功");
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button修.setBounds(961, 389, 91, 37);
		button修.setForeground(Color.BLACK);
		button修.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button修.setBackground(new Color(245, 245, 245));
		contentPane.add(button修);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 440, 1050, 1);
		contentPane.add(separator_2);
		
		JLabel label_20 = new JLabel("药品信息查找");
		label_20.setBounds(0, 442, 181, 37);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(new Color(0, 0, 0));
		label_20.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_20);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 677, 1050, 1);
		contentPane.add(separator_3);
		
		JLabel label_21 = new JLabel("药品编码");
		label_21.setBounds(9, 520, 106, 28);
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_21);
		
		textField查药品编码 = new JTextField();
		textField查药品编码.setFont(new Font("宋体", Font.PLAIN, 20));
		textField查药品编码.setBounds(110, 519, 145, 30);
		textField查药品编码.setColumns(10);
		contentPane.add(textField查药品编码);
		
		JButton button查 = new JButton("确定");
		/*
		 * 查找药品信息
		 * 从文本框的输入中获得查找的药品信息的编码或名称
		 * 使用StringTokenizer获得药品信息.txt中的药品信息的编码、名称等各项信息
		 * 将输入和文件中的编码或名称进行比较
		 * 当编码或名称相等时，将对应的整条药品信息分别显示在设置好的用于显示查找结果的文本框里；若无相等项，则弹出提示信息"输入错误"
		 * 查找完成
		 * 排错处理
		 */
		button查.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button查)
				{
					findDrug();
				}
			}
			public void findDrug(){
				try {
					String code=textField查药品编码.getText();
					String name=textField查药品名称.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\药品信息.txt")));
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
							if(code.equals(s1)||name.equals(s2)) {//信息匹配
								textField1.setText(s1);
								textField2.setText(s2);
								textField3.setText(s3);
								textField4.setText(s4);
								textField5.setText(s5);
								textField6.setText(s6);
								textField7.setText(s7);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						textField6.setText("");
						textField7.setText("");
						JOptionPane.showMessageDialog(null, "   输入错误");//弹出提示框
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
		button查.setBounds(961, 516, 91, 37);
		button查.setForeground(Color.BLACK);
		button查.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button查.setBackground(new Color(245, 245, 245));
		contentPane.add(button查);
		
		JButton button删 = new JButton("确定");
		/*
		 * 删除药品信息
		 * 从文本框的输入中获得要删除的药品信息的编码
		 * 使用StringTokenizer获得药品信息.txt中的编码等各项信息
		 * 将输入和文件中的编码进行比较
		 * 当编码不相等时，将对应的整条药品信息添加到ArrayList数组中；相等时，则不添加
		 * 将ArrayList数组中的信息以重写方式写回到文件里，得到删除指定信息后的文件
		 * 若删除完成，则弹出"删除成功"提示框；若无匹配编码，则弹出"输入错误"提示框
		 * 删除结束
		 * 排错处理
		 */
		button删.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button删)
				{
					removeDrug();
				}
			}
			public void removeDrug(){
				try {
					String code=textField删药品编码.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\药品信息.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(code.equals(s1))) {//ArrayList数组储存不需要删除的信息
								arr.add(s);
							}
							else {
								k=1;//用于得知需要删除的信息是否存在于文件中，存在弹出"删除成功"，不存在弹出"输入错误"
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\药品信息.txt"));	
                    for(int j=0;j<arr.size();j++) {//将ArrayList数组中的不需要删除的信息重新写回到文件里
                    	b1.write(arr.get(j).toString());
                    	b1.write("\r\n");
                    }
                    b1.flush();//将缓冲区的内容强制写出
					b1.close();
					
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
		button删.setBounds(961, 715, 91, 37);
		button删.setForeground(Color.BLACK);
		button删.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button删.setBackground(new Color(245, 245, 245));
		contentPane.add(button删);
		
		JLabel label_22 = new JLabel("药品信息删除");
		label_22.setBounds(0, 677, 181, 37);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(new Color(0, 0, 0));
		label_22.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("药品编码");
		label_23.setBounds(9, 719, 106, 28);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_23);
		
		textField删药品编码 = new JTextField();
		textField删药品编码.setFont(new Font("宋体", Font.PLAIN, 20));
		textField删药品编码.setBounds(110, 718, 145, 30);
		textField删药品编码.setColumns(10);
		contentPane.add(textField删药品编码);
		
		JLabel label_19 = new JLabel("药品名称");
		label_19.setBounds(275, 520, 106, 28);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_19);
		
		textField查药品名称 = new JTextField();
		textField查药品名称.setFont(new Font("宋体", Font.PLAIN, 20));
		textField查药品名称.setBounds(376, 519, 145, 30);
		textField查药品名称.setColumns(10);
		contentPane.add(textField查药品名称);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 760, 1050, 1);
		contentPane.add(separator_4);
		
		JLabel label_24 = new JLabel("查找结果");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("宋体", Font.BOLD, 22));
		label_24.setBounds(15, 556, 98, 28);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("药品编码");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("宋体", Font.PLAIN, 22));
		label_25.setBounds(9, 590, 106, 28);
		contentPane.add(label_25);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setBackground(new Color(255, 255, 255));
		textField1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField1.setColumns(10);
		textField1.setBounds(110, 589, 145, 30);
		contentPane.add(textField1);
		
		JLabel label_26 = new JLabel("医院等级");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("宋体", Font.PLAIN, 22));
		label_26.setBounds(9, 634, 106, 28);
		contentPane.add(label_26);
		
		textField6 = new JTextField();
		textField6.setEditable(false);
		textField6.setBackground(new Color(255, 255, 255));
		textField6.setFont(new Font("宋体", Font.PLAIN, 20));
		textField6.setColumns(10);
		textField6.setBounds(110, 632, 145, 30);
		contentPane.add(textField6);
		
		JLabel label_27 = new JLabel("药品名称");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("宋体", Font.PLAIN, 22));
		label_27.setBounds(275, 590, 106, 28);
		contentPane.add(label_27);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setBackground(new Color(255, 255, 255));
		textField2.setFont(new Font("宋体", Font.PLAIN, 20));
		textField2.setColumns(10);
		textField2.setBounds(376, 588, 145, 30);
		contentPane.add(textField2);
		
		JLabel label_28 = new JLabel("收费等级");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("宋体", Font.PLAIN, 22));
		label_28.setBounds(275, 634, 106, 28);
		contentPane.add(label_28);
		
		textField7 = new JTextField();
		textField7.setEditable(false);
		textField7.setBackground(new Color(255, 255, 255));
		textField7.setFont(new Font("宋体", Font.PLAIN, 20));
		textField7.setColumns(10);
		textField7.setBounds(376, 632, 145, 30);
		contentPane.add(textField7);
		
		JLabel label_29 = new JLabel("最高限价");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("宋体", Font.PLAIN, 22));
		label_29.setBounds(541, 590, 106, 28);
		contentPane.add(label_29);
		
		textField3 = new JTextField();
		textField3.setEditable(false);
		textField3.setBackground(new Color(255, 255, 255));
		textField3.setFont(new Font("宋体", Font.PLAIN, 20));
		textField3.setColumns(10);
		textField3.setBounds(642, 588, 145, 30);
		contentPane.add(textField3);
		
		JLabel label_30 = new JLabel("审批标识");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("宋体", Font.PLAIN, 22));
		label_30.setBounds(541, 634, 106, 28);
		contentPane.add(label_30);
		
		textField5 = new JTextField();
		textField5.setEditable(false);
		textField5.setBackground(new Color(255, 255, 255));
		textField5.setFont(new Font("宋体", Font.PLAIN, 20));
		textField5.setColumns(10);
		textField5.setBounds(642, 632, 145, 30);
		contentPane.add(textField5);
		
		JLabel label_31 = new JLabel("剂量单位");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("宋体", Font.PLAIN, 22));
		label_31.setBounds(807, 590, 106, 28);
		contentPane.add(label_31);
		
		textField4 = new JTextField();
		textField4.setEditable(false);
		textField4.setBackground(new Color(255, 255, 255));
		textField4.setFont(new Font("宋体", Font.PLAIN, 20));
		textField4.setColumns(10);
		textField4.setBounds(907, 588, 145, 30);
		contentPane.add(textField4);
		
		JLabel label_32 = new JLabel("查找对象");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("宋体", Font.BOLD, 22));
		label_32.setBounds(15, 485, 98, 28);
		contentPane.add(label_32);
	}

}
