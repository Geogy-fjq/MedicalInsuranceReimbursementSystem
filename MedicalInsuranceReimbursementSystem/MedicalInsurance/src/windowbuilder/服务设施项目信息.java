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

public class 服务设施项目信息 extends JFrame {

	private JPanel contentPane;
	private JTextField textField11;
	private JTextField textField21;
	private JTextField textField12;
	private JTextField textField22;
	private JTextField textField23;
	private JTextField textField31;
	private JTextField textField41;
	private JTextField textField32;
	private JTextField textField33;
	private JTextField textField34;
	private JTextField textField13;
	private JTextField textField24;
	private JTextField textField35;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					服务设施项目信息 frame = new 服务设施项目信息();
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
	public 服务设施项目信息() {
		setTitle("服务设施项目信息");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("服务设施项目信息维护");
		label.setBounds(192, 15, 329, 42);
		label.setForeground(new Color(85, 107, 47));
		label.setFont(new Font("宋体", Font.BOLD, 30));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 54, 855, 2);
		
		/*
         * 改变提示弹窗的文本和按钮的字体大小
         */
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JButton button = new JButton("确定");
		/*
		 * 增添服务设施项目信息
		 * 从文本框的输入里获取要增添的服务设施项目信息
		 * 将信息写入文本服务设施项目信息.txt里（使用固定格式，各信息用","隔开）
		 * 排错处理
		 */
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					add服务设施项目();
				}
			}
			public void add服务设施项目() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt",true));	
		    		
					String s1=textField11.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField12.getText();
					b.write(s2);	
					b.write(",");
					
					String s3=textField13.getText();
					b.write(s3);
					b.write("\r\n");//使每条信息组成一行

					b.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button.setBounds(779, 109, 91, 37);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button.setBackground(new Color(245, 245, 245));
		
		JLabel label_1 = new JLabel("服务设施项目信息增添");
		label_1.setBounds(10, 60, 265, 37);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		
		textField11 = new JTextField();
		textField11.setFont(new Font("宋体", Font.PLAIN, 20));
		textField11.setBounds(110, 113, 145, 30);
		textField11.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("项目编码");
		lblNewLabel.setBounds(9, 113, 106, 28);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(separator);
		contentPane.add(button);
		contentPane.add(label_1);
		contentPane.add(textField11);
		contentPane.add(lblNewLabel);
		
		JLabel label_6 = new JLabel("项目名称");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.PLAIN, 22));
		label_6.setBounds(270, 113, 106, 28);
		contentPane.add(label_6);
		
		JLabel label_11 = new JLabel("项目编码");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		label_11.setBounds(9, 286, 106, 28);
		contentPane.add(label_11);
		
		textField21 = new JTextField();
		textField21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField21.setColumns(10);
		textField21.setBounds(110, 224, 145, 30);
		contentPane.add(textField21);
		
		textField12 = new JTextField();
		textField12.setFont(new Font("宋体", Font.PLAIN, 20));
		textField12.setColumns(10);
		textField12.setBounds(376, 113, 145, 30);
		contentPane.add(textField12);
		
		textField22 = new JTextField();
		textField22.setFont(new Font("宋体", Font.PLAIN, 20));
		textField22.setColumns(10);
		textField22.setBounds(110, 286, 145, 30);
		contentPane.add(textField22);
		
		textField23 = new JTextField();
		textField23.setFont(new Font("宋体", Font.PLAIN, 20));
		textField23.setColumns(10);
		textField23.setBounds(376, 286, 145, 30);
		contentPane.add(textField23);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 152, 855, 1);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("服务设施项目信息修改");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_2.setBounds(15, 155, 260, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("项目编码");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 22));
		label_3.setBounds(9, 224, 106, 28);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("修改前");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.BOLD, 22));
		label_4.setBounds(17, 193, 70, 28);
		contentPane.add(label_4);
		
		JLabel label_13 = new JLabel("修改成");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("宋体", Font.BOLD, 22));
		label_13.setBounds(17, 255, 70, 28);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("项目名称");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		label_14.setBounds(275, 286, 106, 28);
		contentPane.add(label_14);
		
		JButton button_1 = new JButton("确定");
		/*
		 * 修改服务设施项目信息
		 * 先删除，后添加（本类中，删除和添加方法的合并使用）
		 * 详细见删除和添加方法
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					modify服务设施项目();
				}
			}
			public void modify服务设施项目(){
				try {
					String code=textField21.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt"))); 
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt"));	
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
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt",true));	
		    		
					String s1=textField22.getText();
					b.write(s1);
					b.write(",");
					
					String s2=textField23.getText();
					b.write(s2);
					b.write(",");
					
					String s3=textField24.getText();
					b.write(s3);
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
		button_1.setBounds(779, 282, 91, 37);
		contentPane.add(button_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 325, 855, 1);
		contentPane.add(separator_2);
		
		JLabel label_20 = new JLabel("服务设施项目信息查找");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(Color.BLACK);
		label_20.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_20.setBounds(15, 329, 260, 37);
		contentPane.add(label_20);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(15, 506, 855, 1);
		contentPane.add(separator_3);
		
		JLabel label_21 = new JLabel("项目编码");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("宋体", Font.PLAIN, 22));
		label_21.setBounds(9, 403, 106, 28);
		contentPane.add(label_21);
		
		textField31 = new JTextField();
		textField31.setFont(new Font("宋体", Font.PLAIN, 20));
		textField31.setColumns(10);
		textField31.setBounds(110, 401, 145, 30);
		contentPane.add(textField31);
		
		JButton button_2 = new JButton("确定");
		/*
		 * 查找服务设施项目信息
		 * 从文本框的输入中获得查找的服务设施项目的编码或名称
		 * 使用StringTokenizer获得服务设施项目信息.txt中的服务设施项目信息的编码、名称等各项信息
		 * 将输入和文件中的编码或名称进行比较
		 * 当编码或名称相等时，将对应的整条服务设施项目信息分别显示在设置好的用于显示查找结果的文本框里；若无相等项，则弹出提示信息"输入错误"
		 * 查找完成
		 * 排错处理
		 */
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2)
				{
					find服务设施项目();
				}
			}
			public void find服务设施项目(){
				try {
					String code=textField31.getText();
					String name=textField32.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt")));
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割			
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							String s2=st.nextToken();
							String s3=st.nextToken();
							if(code.equals(s1)||name.equals(s2)) {//信息匹配
								textField33.setText(s1);
								textField34.setText(s2);
								textField35.setText(s3);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField33.setText("");
						textField34.setText("");
						textField35.setText("");
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
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_2.setBackground(new Color(245, 245, 245));
		button_2.setBounds(779, 454, 91, 37);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("确定");
		/*
		 * 删除服务设施项目信息
		 * 从文本框的输入中获得要删除的服务设施项目的编码
		 * 使用StringTokenizer获得服务设施项目信息.txt中的编码等各项信息
		 * 将输入和文件中的编码进行比较
		 * 当编码不相等时，将对应的整条服务设施项目信息添加到ArrayList数组中；相等时，则不添加
		 * 将ArrayList数组中的信息以重写方式写回到文件里，得到删除指定信息后的文件
		 * 若删除完成，则弹出"删除成功"提示框；若无匹配编码，则弹出"输入错误"提示框
		 * 删除结束
		 * 排错处理
		 */
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_3)
				{
					remove服务设施项目();
				}
			}
			public void remove服务设施项目(){
				try {
					String code=textField41.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt"))); 
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
					BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\服务设施项目信息.txt"));	
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
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_3.setBackground(new Color(245, 245, 245));
		button_3.setBounds(779, 540, 91, 37);
		contentPane.add(button_3);
		
		JLabel label_22 = new JLabel("服务设施项目信息删除");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.BLACK);
		label_22.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_22.setBounds(15, 506, 260, 37);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("项目编码");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		label_23.setBounds(10, 544, 106, 28);
		contentPane.add(label_23);
		
		textField41 = new JTextField();
		textField41.setFont(new Font("宋体", Font.PLAIN, 20));
		textField41.setColumns(10);
		textField41.setBounds(110, 545, 145, 30);
		contentPane.add(textField41);
		
		JLabel label_19 = new JLabel("项目名称");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("宋体", Font.PLAIN, 22));
		label_19.setBounds(275, 400, 106, 28);
		contentPane.add(label_19);
		
		textField32 = new JTextField();
		textField32.setFont(new Font("宋体", Font.PLAIN, 20));
		textField32.setColumns(10);
		textField32.setBounds(376, 401, 145, 30);
		contentPane.add(textField32);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 585, 855, 1);
		contentPane.add(separator_4);
		
		JLabel label_5 = new JLabel("查找对象");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("宋体", Font.BOLD, 22));
		label_5.setBounds(15, 370, 98, 28);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("查找结果");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.BOLD, 22));
		label_7.setBounds(15, 434, 98, 28);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("项目编码");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("宋体", Font.PLAIN, 22));
		label_8.setBounds(9, 463, 106, 28);
		contentPane.add(label_8);
		
		textField33 = new JTextField();
		textField33.setFont(new Font("宋体", Font.PLAIN, 20));
		textField33.setBackground(Color.WHITE);
		textField33.setEditable(false);
		textField33.setColumns(10);
		textField33.setBounds(110, 465, 145, 30);
		contentPane.add(textField33);
		
		textField34 = new JTextField();
		textField34.setFont(new Font("宋体", Font.PLAIN, 20));
		textField34.setBackground(Color.WHITE);
		textField34.setEditable(false);
		textField34.setColumns(10);
		textField34.setBounds(376, 465, 145, 30);
		contentPane.add(textField34);
		
		JLabel label_9 = new JLabel("项目名称");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		label_9.setBounds(275, 468, 106, 28);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("收费等级");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("宋体", Font.PLAIN, 22));
		label_10.setBounds(529, 113, 106, 28);
		contentPane.add(label_10);
		
		textField13 = new JTextField();
		textField13.setFont(new Font("宋体", Font.PLAIN, 20));
		textField13.setColumns(10);
		textField13.setBounds(629, 113, 145, 30);
		contentPane.add(textField13);
		
		JLabel label_12 = new JLabel("收费等级");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		label_12.setBounds(529, 282, 106, 28);
		contentPane.add(label_12);
		
		textField24 = new JTextField();
		textField24.setFont(new Font("宋体", Font.PLAIN, 20));
		textField24.setColumns(10);
		textField24.setBounds(629, 282, 145, 30);
		contentPane.add(textField24);
		
		JLabel label_15 = new JLabel("收费等级");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		label_15.setBounds(529, 463, 106, 28);
		contentPane.add(label_15);
		
		textField35 = new JTextField();
		textField35.setBackground(Color.WHITE);
		textField35.setEditable(false);
		textField35.setFont(new Font("宋体", Font.PLAIN, 20));
		textField35.setColumns(10);
		textField35.setBounds(629, 461, 145, 30);
		contentPane.add(textField35);
	}
}
