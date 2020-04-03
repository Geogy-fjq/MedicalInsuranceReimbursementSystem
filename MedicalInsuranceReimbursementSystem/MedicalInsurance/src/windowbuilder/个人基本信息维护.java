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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
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

public class 个人基本信息维护 extends JFrame {

	private JPanel contentPane;
	private JTextField textField11;
	private JTextField textField15;
	private JTextField textField25;
	private JTextField textField16;
	private JTextField textField17;
	private JTextField textField14;
	private JTextField textField21;
	private JTextField textField12;
	private JTextField textField22;
	private JTextField textField23;
	private JTextField textField26;
	private JTextField textField27;
	private JTextField textField28;
	private JTextField textField31;
	private JTextField textField41;
	private JTextField textField32;
	private JTextField textField33;
	private JTextField textField37;
	private JTextField textField34;
	private JTextField textField38;
	private JTextField textField35;
	private JTextField textField36;
	private JTextField textField39;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					个人基本信息维护 frame = new 个人基本信息维护();
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
	public 个人基本信息维护() {
		setResizable(false);
		setTitle("个人基本信息维护");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1216, 804);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 51, 204));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("个人基本信息维护");
		label.setBounds(448, 11, 256, 42);
		label.setForeground(new Color(85, 107, 47));
		label.setFont(new Font("宋体", Font.BOLD, 30));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 54, 1166, 2);
		
		JComboBox comboBox13 = new JComboBox();
		comboBox13.setModel(new DefaultComboBoxModel(new String[] {"男", "女"}));
		comboBox13.setMaximumRowCount(2);
		comboBox13.setFont(new Font("宋体", Font.PLAIN, 20));
		comboBox13.setBackground(Color.WHITE);
		comboBox13.setBounds(642, 100, 145, 28);
		contentPane.add(comboBox13);
		
		JComboBox comboBox24 = new JComboBox();
		comboBox24.setModel(new DefaultComboBoxModel(new String[] {"男", "女"}));
		comboBox24.setMaximumRowCount(2);
		comboBox24.setFont(new Font("宋体", Font.PLAIN, 20));
		comboBox24.setBackground(Color.WHITE);
		comboBox24.setBounds(642, 321, 145, 28);
		contentPane.add(comboBox24);
		
		/*
         * 改变提示弹窗的文本和按钮的字体大小
         */
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JButton button = new JButton("确定");
		/*
		 * 增添个人基本信息
		 * 从文本框的输入里获取要增添的个人基本信息
		 * 将信息写入文本个人基本信息.txt里（使用固定格式，各信息用","隔开）
		 * 排错处理
		 */
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					add个人基本信息();
				}
			}
			public void add个人基本信息() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\个人基本信息.txt",true));	
		    		
					String s1=textField11.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField12.getText();
					b.write(s2);
					b.write(",");
					
					String s3=comboBox13.getSelectedItem().toString();
					b.write(s3);
					b.write(",");
					
					String s4=textField14.getText();
					b.write(s4);
					b.write(",");
					
					String s5=textField15.getText();
					b.write(s5);
					b.write(",");
					
					String s6=textField16.getText();
					b.write(s6);
					b.write(",");
					
					String s7=textField17.getText();
					b.write(s7);
					b.write("\r\n");//使每条信息组成一行

					b.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button.setBounds(1090, 141, 91, 37);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button.setBackground(new Color(245, 245, 245));
		
		JLabel label_1 = new JLabel("个人基本信息增添");
		label_1.setBounds(0, 56, 225, 37);
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		
		textField11 = new JTextField();
		textField11.setFont(new Font("宋体", Font.PLAIN, 20));
		textField11.setBounds(110, 100, 145, 30);
		textField11.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(36, 100, 79, 28);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 22));
		
		JLabel label_5 = new JLabel("出生日期");
		label_5.setBounds(15, 145, 100, 28);
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
		
		textField15 = new JTextField();
		textField15.setFont(new Font("宋体", Font.PLAIN, 20));
		textField15.setBounds(110, 145, 145, 30);
		textField15.setColumns(10);
		contentPane.add(textField15);
		
		JLabel label_6 = new JLabel("姓名");
		label_6.setBounds(291, 99, 90, 28);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("证件类型");
		label_7.setBounds(284, 145, 92, 28);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("性别");
		label_8.setBounds(557, 99, 91, 28);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_8);
		
		textField25 = new JTextField();
		textField25.setFont(new Font("宋体", Font.PLAIN, 20));
		textField25.setBounds(907, 320, 145, 30);
		textField25.setColumns(10);
		contentPane.add(textField25);
		
		textField16 = new JTextField();
		textField16.setFont(new Font("宋体", Font.PLAIN, 20));
		textField16.setBounds(376, 146, 145, 30);
		textField16.setColumns(10);
		contentPane.add(textField16);
		
		textField17 = new JTextField();
		textField17.setFont(new Font("宋体", Font.PLAIN, 20));
		textField17.setBounds(642, 146, 410, 30);
		textField17.setColumns(10);
		contentPane.add(textField17);
		
		JLabel label_9 = new JLabel("证件编号");
		label_9.setBounds(549, 145, 99, 28);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("人员类别");
		label_10.setBounds(808, 99, 105, 28);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_10);
		
		textField14 = new JTextField();
		textField14.setFont(new Font("宋体", Font.PLAIN, 20));
		textField14.setBounds(907, 100, 145, 30);
		textField14.setColumns(10);
		contentPane.add(textField14);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setBounds(42, 319, 79, 28);
		lblId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_1.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(lblId_1);
		
		textField21 = new JTextField();
		textField21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField21.setBounds(110, 258, 145, 30);
		textField21.setColumns(10);
		contentPane.add(textField21);
		
		textField12 = new JTextField();
		textField12.setFont(new Font("宋体", Font.PLAIN, 20));
		textField12.setBounds(376, 100, 145, 30);
		textField12.setColumns(10);
		contentPane.add(textField12);
		
		JLabel label_12 = new JLabel("出生日期");
		label_12.setBounds(17, 362, 98, 28);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_12);
		
		textField22 = new JTextField();
		textField22.setFont(new Font("宋体", Font.PLAIN, 20));
		textField22.setBounds(110, 320, 145, 30);
		textField22.setColumns(10);
		contentPane.add(textField22);
		
		textField23 = new JTextField();
		textField23.setFont(new Font("宋体", Font.PLAIN, 20));
		textField23.setBounds(376, 320, 145, 30);
		textField23.setColumns(10);
		contentPane.add(textField23);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 189, 1166, 1);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("个人基本信息修改");
		label_2.setBounds(0, 188, 225, 37);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_2);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(41, 257, 80, 28);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(lblId);
		
		JLabel label_4 = new JLabel("修改前");
		label_4.setBounds(15, 225, 70, 28);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.BOLD, 22));
		contentPane.add(label_4);
		
		JLabel label_13 = new JLabel("修改后");
		label_13.setBounds(15, 289, 70, 28);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("宋体", Font.BOLD, 22));
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("姓名");
		label_14.setBounds(290, 319, 91, 28);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_14);
		
		textField26 = new JTextField();
		textField26.setFont(new Font("宋体", Font.PLAIN, 20));
		textField26.setBounds(110, 362, 145, 30);
		textField26.setColumns(10);
		contentPane.add(textField26);
		
		textField27 = new JTextField();
		textField27.setFont(new Font("宋体", Font.PLAIN, 20));
		textField27.setBounds(376, 365, 145, 30);
		textField27.setColumns(10);
		contentPane.add(textField27);
		
		textField28 = new JTextField();
		textField28.setFont(new Font("宋体", Font.PLAIN, 20));
		textField28.setBounds(642, 365, 410, 30);
		textField28.setColumns(10);
		contentPane.add(textField28);
		
		JLabel label_15 = new JLabel("证件类型");
		label_15.setBounds(284, 367, 97, 28);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("性别");
		label_16.setBounds(560, 319, 88, 28);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("证件编号");
		label_17.setBounds(548, 365, 100, 28);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("人员类别");
		label_18.setBounds(812, 319, 101, 28);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_18);
		
		JButton button_1 = new JButton("确定");
		/*
		 * 修改个人基本信息
		 * 先删除，后添加（本类中，删除和添加方法的合并使用）
		 * 详细见删除和添加方法
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					modify个人基本信息();
				}
			}
			public void modify个人基本信息(){
				try {
					String ID=textField21.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\个人基本信息.txt"))); 
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
								k=1;//用于得知需要修改的信息是否存在于文件中，存在弹出"修改成功"，不存在弹出"输入错误"
							}
			            }
			        }
					r.close();
					
					if(k==0) {
						JOptionPane.showMessageDialog(null, "   输入错误");
					}
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\个人基本信息.txt"));	
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
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\个人基本信息.txt",true));	
		    		
					String s1=textField22.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField23.getText();
					b.write(s2);
					b.write(",");
					
					String s3=comboBox13.getSelectedItem().toString();
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
					b.write(",");
					
					String s7=textField28.getText();
					b.write(s7);
					b.write("\r\n");

					b.close();
					JOptionPane.showMessageDialog(null, "   修改成功");
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button_1.setBounds(1090, 358, 91, 37);
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_1.setBackground(new Color(245, 245, 245));
		contentPane.add(button_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 405, 1166, 1);
		contentPane.add(separator_2);
		
		JLabel label_20 = new JLabel("个人基本信息查找");
		label_20.setBounds(0, 405, 225, 37);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(new Color(0, 0, 0));
		label_20.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_20);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 635, 1166, 1);
		contentPane.add(separator_3);
		
		JLabel lblId_2 = new JLabel("ID");
		lblId_2.setBounds(32, 478, 89, 28);
		lblId_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_2.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(lblId_2);
		
		textField31 = new JTextField();
		textField31.setFont(new Font("宋体", Font.PLAIN, 20));
		textField31.setBounds(110, 479, 145, 30);
		textField31.setColumns(10);
		contentPane.add(textField31);
		
		JButton button_2 = new JButton("确定");
		/*
		 * 查找个人基本信息
		 * 从文本框的输入中获得查找的个人基本信息的ID
		 * 使用StringTokenizer获得个人基本信息.txt中的ID、姓名等各项信息
		 * 将输入和文件中的ID或姓名进行比较
		 * 当ID或姓名相等时，将对应的整条个人基本信息分别显示在设置好的用于显示查找结果的文本框里；若无相等项，则弹出提示信息"输入错误"
		 * 查找完成
		 * 排错处理
		 */
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2)
				{
					find个人基本信息();
				}
			}
			public void find个人基本信息(){
				try {
					String ID=textField31.getText();
					String name=textField32.getText();
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
							if(ID.equals(s1)||name.equals(s2)) {//信息匹配
								textField33.setText(s1);
								textField34.setText(s2);
								textField35.setText(s3);
								textField36.setText(s4);
								textField37.setText(s5);
								textField38.setText(s6);
								textField39.setText(s7);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField33.setText("");
						textField34.setText("");
						textField35.setText("");
						textField36.setText("");
						textField37.setText("");
						textField38.setText("");
						textField39.setText("");
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
		button_2.setBounds(1090, 474, 91, 37);
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_2.setBackground(new Color(245, 245, 245));
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("确定");
		/*
		 * 删除个人基本信息
		 * 从文本框的输入中获得要删除的个人ID
		 * 使用StringTokenizer获得药品信息.txt中的ID等各项信息
		 * 将输入和文件中的ID进行比较
		 * 当ID不相等时，将对应的整条个人基本信息添加到ArrayList数组中；相等时，则不添加
		 * 将ArrayList数组中的信息以重写方式写回到文件里，得到删除指定信息后的文件
		 * 若删除完成，则弹出"删除成功"提示框；若无匹配编码，则弹出"输入错误"提示框
		 * 删除结束
		 * 排错处理
		 */
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_3)
				{
					remove个人基本信息();
				}
			}
			public void remove个人基本信息(){
				try {
					String ID=textField41.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\个人基本信息.txt"))); 
			        ArrayList<String> arr=new ArrayList<String>();
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							if(!(ID.equals(s1))) {//ArrayList数组储存不需要删除的信息
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\个人基本信息.txt"));	
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
		button_3.setBounds(1090, 677, 91, 37);
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_3.setBackground(new Color(245, 245, 245));
		contentPane.add(button_3);
		
		JLabel label_22 = new JLabel("个人基本信息删除");
		label_22.setBounds(0, 635, 225, 37);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(new Color(0, 0, 0));
		label_22.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		contentPane.add(label_22);
		
		JLabel lblId_3 = new JLabel("ID");
		lblId_3.setBounds(37, 681, 84, 28);
		lblId_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_3.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(lblId_3);
		
		textField41 = new JTextField();
		textField41.setFont(new Font("宋体", Font.PLAIN, 20));
		textField41.setBounds(110, 682, 145, 30);
		textField41.setColumns(10);
		contentPane.add(textField41);
		
		JLabel label_19 = new JLabel("姓名");
		label_19.setBounds(299, 478, 82, 28);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_19);
		
		textField32 = new JTextField();
		textField32.setFont(new Font("宋体", Font.PLAIN, 20));
		textField32.setBounds(376, 479, 145, 30);
		textField32.setColumns(10);
		contentPane.add(textField32);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 724, 1166, 1);
		contentPane.add(separator_4);
		
		JLabel label_3 = new JLabel("查找对象");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.BOLD, 22));
		label_3.setBounds(15, 443, 98, 28);
		contentPane.add(label_3);
		
		JLabel label_11 = new JLabel("ID");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		label_11.setBounds(36, 542, 85, 28);
		contentPane.add(label_11);
		
		JLabel label_21 = new JLabel("查找结果");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("宋体", Font.BOLD, 22));
		label_21.setBounds(15, 510, 98, 28);
		contentPane.add(label_21);
		
		textField33 = new JTextField();
		textField33.setFont(new Font("宋体", Font.PLAIN, 20));
		textField33.setBackground(Color.WHITE);
		textField33.setEditable(false);
		textField33.setColumns(10);
		textField33.setBounds(110, 544, 145, 30);
		contentPane.add(textField33);
		
		textField37 = new JTextField();
		textField37.setFont(new Font("宋体", Font.PLAIN, 20));
		textField37.setBackground(Color.WHITE);
		textField37.setEditable(false);
		textField37.setColumns(10);
		textField37.setBounds(110, 590, 145, 30);
		contentPane.add(textField37);
		
		JLabel label_23 = new JLabel("出生日期");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		label_23.setBounds(18, 592, 97, 28);
		contentPane.add(label_23);
		
		textField34 = new JTextField();
		textField34.setFont(new Font("宋体", Font.PLAIN, 20));
		textField34.setBackground(Color.WHITE);
		textField34.setEditable(false);
		textField34.setColumns(10);
		textField34.setBounds(376, 544, 145, 30);
		contentPane.add(textField34);
		
		textField38 = new JTextField();
		textField38.setFont(new Font("宋体", Font.PLAIN, 20));
		textField38.setBackground(Color.WHITE);
		textField38.setEditable(false);
		textField38.setColumns(10);
		textField38.setBounds(376, 590, 145, 30);
		contentPane.add(textField38);
		
		textField35 = new JTextField();
		textField35.setFont(new Font("宋体", Font.PLAIN, 20));
		textField35.setBackground(Color.WHITE);
		textField35.setEditable(false);
		textField35.setColumns(10);
		textField35.setBounds(642, 544, 145, 30);
		contentPane.add(textField35);
		
		textField36 = new JTextField();
		textField36.setFont(new Font("宋体", Font.PLAIN, 20));
		textField36.setBackground(Color.WHITE);
		textField36.setEditable(false);
		textField36.setColumns(10);
		textField36.setBounds(907, 540, 145, 30);
		contentPane.add(textField36);
		
		textField39 = new JTextField();
		textField39.setFont(new Font("宋体", Font.PLAIN, 20));
		textField39.setBackground(Color.WHITE);
		textField39.setEditable(false);
		textField39.setColumns(10);
		textField39.setBounds(642, 591, 410, 30);
		contentPane.add(textField39);
		
		JLabel label_24 = new JLabel("姓名");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("宋体", Font.PLAIN, 22));
		label_24.setBounds(298, 547, 83, 28);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("证件类型");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("宋体", Font.PLAIN, 22));
		label_25.setBounds(280, 592, 101, 28);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("性别");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("宋体", Font.PLAIN, 22));
		label_26.setBounds(569, 547, 79, 28);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("证件编号");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("宋体", Font.PLAIN, 22));
		label_27.setBounds(550, 592, 98, 28);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("人员类别");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("宋体", Font.PLAIN, 22));
		label_28.setBounds(811, 542, 102, 28);
		contentPane.add(label_28);
		
	}
}
