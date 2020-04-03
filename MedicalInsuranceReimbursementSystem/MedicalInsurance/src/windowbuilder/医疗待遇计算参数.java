package windowbuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

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

public class 医疗待遇计算参数 extends JFrame {

	private JPanel contentPane;
	private JTextField textField11;
	private JTextField textField13;
	private JTextField textField16;
	private JTextField textField14;
	private JTextField textField15;
	private JTextField textField21;
	private JTextField textField12;
	private JTextField textField22;
	private JTextField textField23;
	private JTextField textField24;
	private JTextField textField25;
	private JTextField textField26;
	private JTextField textField31;
	private JTextField textField41;
	private JTextField textField27;
	private JTextField textField32;
	private JTextField textField33;
	private JTextField textField34;
	private JTextField textField35;
	private JTextField textField36;
	private JTextField textField37;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					医疗待遇计算参数 frame = new 医疗待遇计算参数();
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
	public 医疗待遇计算参数() {
		setResizable(false);
		setTitle("医疗待遇参数");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1216, 797);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 51, 204));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("医疗待遇计算参数维护");
		label.setBounds(448, 11, 325, 42);
		label.setForeground(new Color(85, 107, 47));
		label.setFont(new Font("宋体", Font.BOLD, 30));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 54, 1166, 2);
		
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JButton button = new JButton("确定");
		/*
		 * 增添医疗待遇参数信息
		 * 从文本框的输入里获取要增添的医疗待遇参数信息
		 * 将信息写入文本医疗待遇参数.txt里（使用固定格式，各信息用","隔开）
		 * 排错处理
		 */
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					add医疗待遇计算参数();
				}
			}
			public void add医疗待遇计算参数() {
		    	try{
                    BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\医疗待遇计算参数1.txt",true));	
                    BufferedWriter b2 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\医疗待遇计算参数2.txt",true));	
                    
                    b1.write("封顶线");
                	b1.write(",");
                    String staff=textField11.getText();
					b1.write(staff);
					b1.write(",");		
					String highest=textField12.getText();
					b1.write(highest);
					b1.write("\r\n");
					
					String start=textField21.getText();
					b2.write(start);
					b2.write(",");
					String over=textField22.getText();
					b2.write(over);
					b2.write(",");
					String down=textField23.getText();
					b2.write(down);
					b2.write(",");	
					String rate=textField24.getText();
					b2.write(rate);
					b2.write("\r\n");//使每条信息组成一行

					b1.close();
					b2.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button.setBounds(1090, 152, 91, 37);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button.setBackground(new Color(245, 245, 245));
		
		JLabel label_1 = new JLabel("医疗待遇计算参数增添");
		label_1.setBounds(0, 60, 281, 37);
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		
		textField11 = new JTextField();
		textField11.setFont(new Font("宋体", Font.PLAIN, 20));
		textField11.setBounds(155, 113, 100, 30);
		textField11.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("医疗人员类别");
		lblNewLabel.setBounds(15, 113, 137, 28);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 22));
		
		JLabel label_5 = new JLabel("起付标准");
		label_5.setBounds(9, 156, 106, 28);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(separator);
		contentPane.add(button);
		contentPane.add(label_1);
		contentPane.add(textField11);
		contentPane.add(lblNewLabel);
		contentPane.add(label_5);
		
		textField13 = new JTextField();
		textField13.setFont(new Font("宋体", Font.PLAIN, 20));
		textField13.setBounds(110, 156, 145, 30);
		textField13.setColumns(10);
		contentPane.add(textField13);
		
		JLabel label_6 = new JLabel("最高限价");
		label_6.setBounds(275, 112, 106, 28);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("上限金额");
		label_7.setBounds(275, 156, 106, 28);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_7);
		
		textField16 = new JTextField();
		textField16.setFont(new Font("宋体", Font.PLAIN, 20));
		textField16.setBounds(938, 157, 145, 30);
		textField16.setColumns(10);
		contentPane.add(textField16);
		
		textField14 = new JTextField();
		textField14.setFont(new Font("宋体", Font.PLAIN, 20));
		textField14.setBounds(376, 156, 145, 30);
		textField14.setColumns(10);
		contentPane.add(textField14);
		
		textField15 = new JTextField();
		textField15.setFont(new Font("宋体", Font.PLAIN, 20));
		textField15.setBounds(642, 156, 145, 30);
		textField15.setColumns(10);
		contentPane.add(textField15);
		
		JLabel label_9 = new JLabel("下限金额");
		label_9.setBounds(542, 156, 106, 28);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_9);
		
		JLabel label_11 = new JLabel("医疗人员类别");
		label_11.setBounds(15, 350, 137, 28);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_11);
		
		textField21 = new JTextField();
		textField21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField21.setBounds(155, 280, 100, 30);
		textField21.setColumns(10);
		contentPane.add(textField21);
		
		textField12 = new JTextField();
		textField12.setFont(new Font("宋体", Font.PLAIN, 20));
		textField12.setBounds(376, 113, 145, 30);
		textField12.setColumns(10);
		contentPane.add(textField12);
		
		JLabel label_12 = new JLabel("起付标准");
		label_12.setBounds(9, 393, 106, 28);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_12);
		
		textField22 = new JTextField();
		textField22.setFont(new Font("宋体", Font.PLAIN, 20));
		textField22.setBounds(155, 350, 100, 30);
		textField22.setColumns(10);
		contentPane.add(textField22);
		
		textField23 = new JTextField();
		textField23.setFont(new Font("宋体", Font.PLAIN, 20));
		textField23.setBounds(376, 350, 145, 30);
		textField23.setColumns(10);
		contentPane.add(textField23);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 200, 1166, 1);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("医疗待遇计算参数修改");
		label_2.setBounds(0, 205, 281, 37);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("医疗人员类别");
		label_3.setBounds(20, 280, 132, 28);
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
		
		JLabel label_14 = new JLabel("最高限价");
		label_14.setBounds(275, 350, 106, 28);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_14);
		
		textField24 = new JTextField();
		textField24.setFont(new Font("宋体", Font.PLAIN, 20));
		textField24.setBounds(110, 393, 145, 30);
		textField24.setColumns(10);
		contentPane.add(textField24);
		
		textField25 = new JTextField();
		textField25.setFont(new Font("宋体", Font.PLAIN, 20));
		textField25.setBounds(376, 393, 145, 30);
		textField25.setColumns(10);
		contentPane.add(textField25);
		
		textField26 = new JTextField();
		textField26.setFont(new Font("宋体", Font.PLAIN, 20));
		textField26.setBounds(642, 393, 145, 30);
		textField26.setColumns(10);
		contentPane.add(textField26);
		
		JLabel label_15 = new JLabel("上限金额");
		label_15.setBounds(275, 393, 106, 28);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_15);
		
		JLabel label_17 = new JLabel("下限金额");
		label_17.setBounds(542, 393, 106, 28);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("报销比例");
		label_18.setBounds(842, 156, 91, 28);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_18);
		
		JButton button_1 = new JButton("确定");
		/*
		 * 修改医疗待遇计算参数信息
		 * 先删除，后添加（本类中，删除和添加方法的合并使用）
		 * 详细见删除和添加方法
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					modify医疗待遇计算参数();
				}
			}
			public void modify医疗待遇计算参数(){
				try {
					String staff=textField21.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\医疗待遇计算参数.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(staff.equals(s1))) {
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\医疗待遇计算参数.txt"));	
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
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\医疗待遇计算参数.txt",true));	
		    		
					String s1=textField22.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField23.getText();
					b.write(s2);
					b.write(",");
					
					String s3=textField24.getText();
					b.write(s3);
					b.write(",");
					
					String s4=textField25.getText();
					b.write(s4);
					b.write(",");
					
					String s5=textField26.getText();
					b.write(s5);
					b.write(",");
					
					String s6=textField27.getText();
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
		button_1.setBounds(1090, 389, 91, 37);
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_1.setBackground(new Color(245, 245, 245));
		contentPane.add(button_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 440, 1166, 1);
		contentPane.add(separator_2);
		
		JLabel label_20 = new JLabel("医疗待遇计算参数查找");
		label_20.setBounds(0, 442, 281, 37);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(new Color(0, 0, 0));
		label_20.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_20);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 662, 1166, 1);
		contentPane.add(separator_3);
		
		JLabel label_21 = new JLabel("医疗人员类别");
		label_21.setBounds(15, 514, 137, 28);
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_21);
		
		textField31 = new JTextField();
		textField31.setFont(new Font("宋体", Font.PLAIN, 20));
		textField31.setBounds(155, 514, 100, 30);
		textField31.setColumns(10);
		contentPane.add(textField31);
		
		JButton button_2 = new JButton("确定");
		/*
		 * 查找医疗待遇参数信息
		 * 从文本框的输入中获得要查找的医疗待遇计算参数对应的医疗人员类别
		 * 使用StringTokenizer获得医疗待遇计算参数信息.txt中的医疗人员类别等各项信息
		 * 将输入和文件中的医疗人员类别进行比较
		 * 当医疗人员类别相等时，将对应的整条医疗待遇计算参数信息信息分别显示在设置好的用于显示查找结果的文本框里；若无相等项，则弹出提示信息"输入错误"
		 * 查找完成
		 * 排错处理
		 */
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2)
				{
					find医疗待遇计算参数();
				}
			}
			public void find医疗待遇计算参数(){
				try {
					String staff=textField31.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\医疗待遇计算参数.txt")));
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");			
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							String s2=st.nextToken();
							String s3=st.nextToken();
							String s4=st.nextToken();
							String s5=st.nextToken();
							String s6=st.nextToken();
							if(staff.equals(s1)) {
								textField32.setText(s1);
								textField33.setText(s2);
								textField34.setText(s3);
								textField35.setText(s4);
								textField36.setText(s5);
								textField37.setText(s6);
								k=1;
							}
			            }
			        }
					if(k==0) {
						textField32.setText("");
						textField33.setText("");
						textField34.setText("");
						textField35.setText("");
						textField36.setText("");
						textField37.setText("");
						JOptionPane.showMessageDialog(null, "   输入错误");
					}
					r.close();
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
		button_2.setBounds(1090, 510, 91, 37);
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_2.setBackground(new Color(245, 245, 245));
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("确定");
		/*
		 * 删除医疗待遇参数计算参数信息
		 * 从文本框的输入中获得要删除的医疗待遇参数计算参数对应的医疗人员类别
		 * 使用StringTokenizer获得医疗待遇参数计算参数.txt中的医疗人员类别等各项信息
		 * 将输入和文件中的医疗人员类别进行比较
		 * 当医疗人员类别不相等时，将对应的整条医疗待遇参数计算参数信息添加到ArrayList数组中；相等时，则不添加
		 * 将ArrayList数组中的信息以重写方式写回到文件里，得到删除指定信息后的文件
		 * 若删除完成，则弹出"删除成功"提示框；若无匹配编码，则弹出"输入错误"提示框
		 * 删除结束
		 * 排错处理
		 */
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_3)
				{
					remove医疗待遇计算参数();
				}
			}
			public void remove医疗待遇计算参数(){
				try {
					String staff=textField41.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\医疗待遇计算参数.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(staff.equals(s1))) {
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\医疗待遇计算参数.txt"));	
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
		button_3.setBounds(1090, 699, 91, 37);
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_3.setBackground(new Color(245, 245, 245));
		contentPane.add(button_3);
		
		JLabel label_22 = new JLabel("医疗待遇计算参数删除");
		label_22.setBounds(0, 662, 281, 37);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(new Color(0, 0, 0));
		label_22.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("医疗人员类别");
		label_23.setBounds(20, 703, 132, 28);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_23);
		
		textField41 = new JTextField();
		textField41.setFont(new Font("宋体", Font.PLAIN, 20));
		textField41.setBounds(155, 703, 100, 30);
		textField41.setColumns(10);
		contentPane.add(textField41);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 746, 1166, 1);
		contentPane.add(separator_4);
		
		JLabel label_25 = new JLabel("报销比例");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("宋体", Font.PLAIN, 22));
		label_25.setBounds(825, 393, 132, 28);
		contentPane.add(label_25);
		
		textField27 = new JTextField();
		textField27.setFont(new Font("宋体", Font.PLAIN, 20));
		textField27.setColumns(10);
		textField27.setBounds(938, 393, 145, 30);
		contentPane.add(textField27);
		
		JLabel label_8 = new JLabel("查找对象");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("宋体", Font.BOLD, 22));
		label_8.setBounds(10, 485, 100, 28);
		contentPane.add(label_8);
		
		JLabel label_10 = new JLabel("查找结果");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("宋体", Font.BOLD, 22));
		label_10.setBounds(10, 545, 100, 28);
		contentPane.add(label_10);
		
		JLabel label_16 = new JLabel("医疗人员类别");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("宋体", Font.PLAIN, 22));
		label_16.setBounds(15, 576, 137, 28);
		contentPane.add(label_16);
		
		textField32 = new JTextField();
		textField32.setEditable(false);
		textField32.setBackground(new Color(255, 255, 255));
		textField32.setFont(new Font("宋体", Font.PLAIN, 20));
		textField32.setColumns(10);
		textField32.setBounds(155, 574, 100, 30);
		contentPane.add(textField32);
		
		JLabel label_19 = new JLabel("起付标准");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("宋体", Font.PLAIN, 22));
		label_19.setBounds(10, 619, 106, 28);
		contentPane.add(label_19);
		
		textField33 = new JTextField();
		textField33.setEditable(false);
		textField33.setBackground(new Color(255, 255, 255));
		textField33.setFont(new Font("宋体", Font.PLAIN, 20));
		textField33.setColumns(10);
		textField33.setBounds(376, 574, 145, 30);
		contentPane.add(textField33);
		
		textField34 = new JTextField();
		textField34.setEditable(false);
		textField34.setBackground(new Color(255, 255, 255));
		textField34.setFont(new Font("宋体", Font.PLAIN, 20));
		textField34.setColumns(10);
		textField34.setBounds(110, 619, 145, 30);
		contentPane.add(textField34);
		
		textField35 = new JTextField();
		textField35.setEditable(false);
		textField35.setBackground(new Color(255, 255, 255));
		textField35.setFont(new Font("宋体", Font.PLAIN, 20));
		textField35.setColumns(10);
		textField35.setBounds(376, 621, 145, 30);
		contentPane.add(textField35);
		
		textField36 = new JTextField();
		textField36.setEditable(false);
		textField36.setBackground(new Color(255, 255, 255));
		textField36.setFont(new Font("宋体", Font.PLAIN, 20));
		textField36.setColumns(10);
		textField36.setBounds(642, 619, 145, 30);
		contentPane.add(textField36);
		
		textField37 = new JTextField();
		textField37.setEditable(false);
		textField37.setBackground(new Color(255, 255, 255));
		textField37.setFont(new Font("宋体", Font.PLAIN, 20));
		textField37.setColumns(10);
		textField37.setBounds(938, 619, 145, 30);
		contentPane.add(textField37);
		
		JLabel label_24 = new JLabel("报销比例");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("宋体", Font.PLAIN, 22));
		label_24.setBounds(825, 619, 132, 28);
		contentPane.add(label_24);
		
		JLabel label_26 = new JLabel("下限金额");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("宋体", Font.PLAIN, 22));
		label_26.setBounds(542, 619, 106, 28);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("上限金额");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("宋体", Font.PLAIN, 22));
		label_27.setBounds(275, 621, 106, 28);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("最高限价");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("宋体", Font.PLAIN, 22));
		label_28.setBounds(275, 576, 106, 28);
		contentPane.add(label_28);
	}
}
