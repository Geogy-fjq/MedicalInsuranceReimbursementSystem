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
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 中心报销 extends JFrame {

	private JPanel contentPane;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField24;
	private JTextField textField25;
	private JTextField textField26;
	private JTextField textField4;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField6;
	private JTextField textField13;
	private JTextField textField14;
	private JTextField textField16;
	private JTextField textField17;
	private JTextField textField18;
	private JTextField textField19;
	private JTextField textField15;
	private JTextField textField22;
	private JTextField textField21;
	private JTextField textField5;
	private JTextField textField51;
	private JTextField textField55;
	private JTextField textField52;
	private JTextField textField56;
	private JTextField textField53;
	private JTextField textField57;
	private JTextField textField54;
	private JTextField textField41;
	private JTextField textField44;
	private JTextField textField42;
	private JTextField textField45;
	private JTextField textField43;
	private JTextField textField46;
	private JTextField textField411;
	private JTextField textField414;
	private JTextField textField415;
	private JTextField textField412;
	private JTextField textField413;
	private JTextField textField416;
	private JTextField textField421;
	private JTextField textField40;
	private JTextField textField402;
	private JTextField textField401;
	private JTextField textField3;
	private JTextField textFielda;
	private JTextField textFieldb;
	private JTextField textFieldc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					中心报销 frame = new 中心报销();
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
	public 中心报销() {
		setResizable(false);
		setTitle("医保中心报销");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 1012);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("医保中心报销");
		label.setForeground(new Color(0, 51, 204));
		label.setFont(new Font("宋体", Font.BOLD, 38));
		label.setBackground(Color.WHITE);
		label.setBounds(490, 3, 240, 65);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\代码\\2018年暑期实验课\\医保图片小.png"));
		lblNewLabel.setBounds(415, 8, 64, 56);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 70, 1150, 2);
		contentPane.add(separator);
		
		/*
         * 改变提示弹窗的文本和按钮的字体大小
         */
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));
		
		JLabel label_1 = new JLabel("查询个人信息");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_1.setBounds(13, 72, 171, 37);
		contentPane.add(label_1);
		
		JLabel lblId = new JLabel("ID：");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("宋体", Font.PLAIN, 22));
		lblId.setBounds(83, 110, 49, 28);
		contentPane.add(lblId);
		
		textField11 = new JTextField();
		textField11.setBackground(Color.WHITE);
		textField11.setFont(new Font("宋体", Font.PLAIN, 20));
		textField11.setColumns(10);
		textField11.setBounds(131, 110, 145, 30);
		contentPane.add(textField11);
		
		JLabel label_3 = new JLabel("姓名：");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 22));
		label_3.setBounds(349, 110, 76, 28);
		contentPane.add(label_3);
		
		textField12 = new JTextField();
		textField12.setBackground(Color.WHITE);
		textField12.setFont(new Font("宋体", Font.PLAIN, 20));
		textField12.setColumns(10);
		textField12.setBounds(420, 110, 145, 30);
		contentPane.add(textField12);
		
		JButton button1 = new JButton("确定");
		/*
		 * 查找人员信息
		 * 从文本框的输入中获得查找的人员的ID或姓名
		 * 使用StringTokenizer获得个人基本信息.txt中的ID、姓名等各项信息
		 * 将输入和文件中的ID和姓名进行比较
		 * 当ID相等时（ID唯一，姓名可能有重复），将对应的整条人员信息分别显示在设置好的用于显示查找结果的文本框里；若无相等项，则弹出提示信息"输入错误"
		 * 查找完成
		 * 排错处理
		 */
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button1)
				{
					findPerson();
				}
			}
			public void findPerson(){
				try {
					String ID=textField11.getText();
					String name=textField12.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\个人基本信息.txt")));
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割			
						if(st.hasMoreTokens()) {
							String Id=st.nextToken();
							String Name=st.nextToken();
							String sex=st.nextToken();
							String nation=st.nextToken();
							String birthDay=st.nextToken();
							String DType=st.nextToken();
							String DCode=st.nextToken();
							if(ID.equals(Id)) {//信息匹配
								textField13.setText(Id);
								textField14.setText(Name);
								textField15.setText(sex);
								textField16.setText(nation);
								textField17.setText(birthDay);
								textField18.setText(DType);
								textField19.setText(DCode);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField13.setText("");
						textField14.setText("");
						textField15.setText("");
						textField16.setText("");
						textField17.setText("");
						textField18.setText("");
						textField19.setText("");
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
		button1.setForeground(Color.BLACK);
		button1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button1.setBackground(new Color(245, 245, 245));
		button1.setBounds(1069, 100, 91, 37);
		contentPane.add(button1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(18, 248, 1150, 2);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("录入个人就诊信息");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_2.setBounds(12, 250, 213, 37);
		contentPane.add(label_2);
		
		JLabel label_5 = new JLabel("机构名称：");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("宋体", Font.PLAIN, 22));
		label_5.setBounds(630, 327, 112, 28);
		contentPane.add(label_5);
		
		textField24 = new JTextField();
		textField24.setFont(new Font("宋体", Font.PLAIN, 20));
		textField24.setColumns(10);
		textField24.setBounds(131, 327, 145, 30);
		contentPane.add(textField24);
		
		JLabel label_6 = new JLabel("疾病编码：");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("宋体", Font.PLAIN, 22));
		label_6.setBounds(30, 290, 112, 28);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("疾病名称：");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("宋体", Font.PLAIN, 22));
		label_7.setBounds(313, 290, 112, 28);
		contentPane.add(label_7);
		
		textField25 = new JTextField();
		textField25.setFont(new Font("宋体", Font.PLAIN, 20));
		textField25.setColumns(10);
		textField25.setBounds(420, 327, 145, 30);
		contentPane.add(textField25);
		
		JLabel label_8 = new JLabel("入院日期：");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("宋体", Font.PLAIN, 22));
		label_8.setBounds(30, 327, 112, 28);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("出院日期：");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("宋体", Font.PLAIN, 22));
		label_9.setBounds(313, 327, 112, 28);
		contentPane.add(label_9);
		
		textField26 = new JTextField();
		textField26.setFont(new Font("宋体", Font.PLAIN, 20));
		textField26.setColumns(10);
		textField26.setBounds(733, 327, 326, 30);
		contentPane.add(textField26);
		
		JComboBox comboBox23 = new JComboBox();
		comboBox23.setFont(new Font("宋体", Font.PLAIN, 20));
		comboBox23.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBox23.setMaximumRowCount(2);
		comboBox23.setBackground(Color.WHITE);
		comboBox23.setBounds(733, 290, 145, 28);
		contentPane.add(comboBox23);
		
		JButton button2 = new JButton("确定");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button2)
				{
					addDiagnosis();
				}
			}
			public void addDiagnosis() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\人员就诊信息.txt",true));	
		    		
					String diseaseCode=textField21.getText();
					b.write(diseaseCode);
					b.write(",");
					
					String diseasename=textField22.getText();
					b.write(diseasename);
					b.write(",");
					
					String institutionCode=comboBox23.getSelectedItem().toString();
					b.write(institutionCode);
					b.write(",");
					
					String in=textField24.getText();
					b.write(in);
					b.write(",");
					
					String out=textField25.getText();
					b.write(out);
					b.write(",");
					
					String institutionName=textField26.getText();
					b.write(institutionName);
					b.write("\r\n");//使每条信息单独成行

					b.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button2.setForeground(Color.BLACK);
		button2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button2.setBackground(new Color(245, 245, 245));
		button2.setBounds(1069, 323, 91, 37);
		contentPane.add(button2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(18, 481, 1150, 1);
		contentPane.add(separator_2);
		
		JLabel label_11 = new JLabel("录入处方明细信息");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_11.setBounds(15, 368, 207, 37);
		contentPane.add(label_11);
		
		JLabel lblSh = new JLabel("收费等级：");
		lblSh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSh.setFont(new Font("宋体", Font.PLAIN, 22));
		lblSh.setBounds(28, 443, 112, 28);
		contentPane.add(lblSh);
		
		textField4 = new JTextField();
		textField4.setFont(new Font("宋体", Font.PLAIN, 20));
		textField4.setColumns(10);
		textField4.setBounds(131, 405, 145, 30);
		contentPane.add(textField4);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField1.setColumns(10);
		textField1.setBounds(131, 443, 145, 30);
		contentPane.add(textField1);
		
		JLabel label_13 = new JLabel("项目类别：");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("宋体", Font.PLAIN, 22));
		label_13.setBounds(313, 443, 112, 28);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("单价：");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("宋体", Font.PLAIN, 22));
		label_14.setBounds(63, 405, 76, 28);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("金额：");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("宋体", Font.PLAIN, 22));
		label_15.setBounds(676, 405, 66, 28);
		contentPane.add(label_15);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("宋体", Font.PLAIN, 20));
		textField2.setColumns(10);
		textField2.setBounds(420, 443, 146, 30);
		contentPane.add(textField2);
		
		textField6 = new JTextField();
		textField6.setFont(new Font("宋体", Font.PLAIN, 20));
		textField6.setColumns(10);
		textField6.setBounds(733, 405, 145, 30);
		contentPane.add(textField6);
		
		JLabel label_16 = new JLabel("数量：");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("宋体", Font.PLAIN, 22));
		label_16.setBounds(349, 405, 76, 28);
		contentPane.add(label_16);
		
		JButton button3 = new JButton("确定");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button3)
				{
					addPrescription();
				}
			}
			public void addPrescription() {
		    	try{
		    		BufferedWriter b = new BufferedWriter(new FileWriter("D:\\代码\\2018年暑期实验课\\处方明细信息.txt",true));	
		    		
					String unitPrice=textField1.getText();
					b.write(unitPrice);
					b.write(",");
					
					String number=textField2.getText();
					b.write(number);
					b.write(",");
					
					String totalPrice=textField3.getText();
					b.write(totalPrice);
					b.write(",");
					
					String chargeCategory=textField4.getText();
					b.write(chargeCategory);
					b.write(",");
					
					String projectCategory=textField5.getText();
					b.write(projectCategory);
					b.write(",");
					
					String projectName=textField6.getText();
					b.write(projectName);
					
					b.write("\r\n");//使每条信息组成一行

					b.close();
					JOptionPane.showMessageDialog(null, "   增添成功");//弹出提示框
				   }
				catch(IOException ew){
					System.out.println(ew);
				}
			}
		});
		button3.setForeground(Color.BLACK);
		button3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button3.setBackground(new Color(245, 245, 245));
		button3.setBounds(1069, 439, 91, 37);
		contentPane.add(button3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(18, 365, 1150, 1);
		contentPane.add(separator_3);
		
		JLabel label_17 = new JLabel("审核报销资格");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		label_17.setBounds(15, 481, 162, 37);
		contentPane.add(label_17);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(15, 785, 1150, 1);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(15, 908, 1150, 1);
		contentPane.add(separator_5);
		
		JButton buttonA = new JButton("预结算\r\n");
		/*
		 * 预结算
		 */
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttonA)
				{
					Budget();
				}
			}
			public void Budget() {
				try {
					double 费用总额=0;
					double 报销金额=0;
					double 自费金额=0;
					double 乙类自费=0;
					double 分段自费=0;
					double 特检特治自费=0;
					
					//从处方明细信息.txt里获取所需信息
					BufferedReader r1=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\处方明细信息.txt")));
					int i=0;
					while (r1.ready()) {
						String s=r1.readLine();
						StringTokenizer st1=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割	
						i+=1;
						if(st1.hasMoreTokens()) {
							String 收费等级=st1.nextToken();
							String 项目类别=st1.nextToken();
							String 项目名称=st1.nextToken();
							String 单价=st1.nextToken();
							String 数量=st1.nextToken();
							String 金额=st1.nextToken();
   
							if(i>1) {
								//计算费用总额
								费用总额+=Double.parseDouble(金额);
								//当项目类别为：药品
							    if(项目类别.equals("Drug")) {
							    	BufferedReader r3=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\药品信息.txt")));
							    	while (r3.ready()) {		
										String s3=r3.readLine();
										StringTokenizer st3=new StringTokenizer(s3,",");//使用StringTokenizer将文件读取的字符串以","进行分割
										
										if(st3.hasMoreTokens()) {
											String 药品编码=st3.nextToken();
											String 药品名称=st3.nextToken();
											String 最高限价=st3.nextToken();
											String 剂量单位=st3.nextToken();
											String 审批标识=st3.nextToken();
											String 医院等级=st3.nextToken();
											String 收费等级1=st3.nextToken();
											if(项目名称.equals(药品名称)) {
												if(Double.parseDouble(最高限价)<Double.parseDouble(单价)) {
													单价=最高限价;
													
												}
												System.out.println(单价);
											}
										}
										
							    	}
							    	if(收费等级.equals("1")){
										报销金额+=Double.parseDouble(单价)*Double.parseDouble(数量);
									}
								    if(收费等级.equals("2")) {
								    	报销金额+=0.5*Double.parseDouble(单价)*Double.parseDouble(数量);
								    	乙类自费+=0.5*Double.parseDouble(单价)*Double.parseDouble(数量);
								    }
								    if(收费等级.equals("3")) {
								    	报销金额+=0;
								    }
								    r3.close();
							    }
							    
							    //当项目类别为：诊疗
							    if(项目类别.equals("Traet")) {
							    	if(收费等级.equals("1")){
										报销金额+=Double.parseDouble(金额);
									}
								    if(收费等级.equals("2")) {
								    	报销金额+=0.5*Double.parseDouble(金额);
								    	乙类自费+=0.5*Double.parseDouble(金额);
								    }
								    if(收费等级.equals("3")) {
								    	报销金额+=0;
								    }
							    }
							    
							    //当项目类别为：服务
							    if(项目类别.equals("Service")) {
							    	报销金额+=Double.parseDouble(金额);
							    }
							}
			            }	    
			        }
					r1.close();
			       
					//从个人基本信息.txt里获取所需信息
					BufferedReader r5=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\个人基本信息.txt")));
					while (r5.ready()) {
						String s=r5.readLine();
						StringTokenizer st5=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割			
						if(st5.hasMoreTokens()) {
							String ID=st5.nextToken();
							String 姓名=st5.nextToken();
							String 性别=st5.nextToken();
							String 人员类别=st5.nextToken();
							String 出生日期=st5.nextToken();
							String 证件类型=st5.nextToken();
							String 证件编号=st5.nextToken();
							if(费用总额>100) {
								if(人员类别.equals(40)) {
									报销金额=报销金额*0.95-100;
									分段自费=报销金额*0.05+100;
								报销金额=0;
								}
								if(人员类别.equals(21)) {
									报销金额=报销金额*0.9-100;
									分段自费=报销金额*0.1;
								}
								if(人员类别.equals(11)) {
									报销金额=报销金额*0.8-100;
									分段自费=报销金额*0.2;
								}
							}
							else {
								报销金额=0;
							}
			            }	
			        } 
					自费金额=费用总额-报销金额;
					
					//double转String
					String c1=""+费用总额;
					String c2=""+报销金额;
					String c3=""+自费金额;
					String c5=""+乙类自费;
					String c6=""+分段自费;
					String c7=""+特检特治自费;
							
				    //文本框显示预结算结果
					textField51.setText(c1);
					textField52.setText(c2);
					textField53.setText(c3);
					textField54.setText("100");
					textField55.setText(c5);
					textField56.setText(c6);
					textField57.setText(c7);
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
		buttonA.setForeground(Color.BLACK);
		buttonA.setFont(new Font("宋体", Font.PLAIN, 23));
		buttonA.setBackground(new Color(245, 245, 245));
		buttonA.setBounds(23, 792, 133, 35);
		contentPane.add(buttonA);
		
		JButton buttonB = new JButton("结算");
		/*
		 * 结算
		 */
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFielda.setText(textField51.getText());
				textFieldb.setText(textField52.getText());
				textFieldc.setText(textField53.getText());
				
			}
		});
		buttonB.setForeground(Color.BLACK);
		buttonB.setFont(new Font("宋体", Font.PLAIN, 23));
		buttonB.setBackground(new Color(245, 245, 245));
		buttonB.setBounds(23, 917, 133, 35);
		contentPane.add(buttonB);
		
		JButton buttonC = new JButton("打印单据");
		buttonC.setForeground(Color.BLACK);
		buttonC.setFont(new Font("宋体", Font.PLAIN, 23));
		buttonC.setBackground(new Color(245, 245, 245));
		buttonC.setBounds(1024, 917, 145, 35);
		contentPane.add(buttonC);
		
		JLabel label_18 = new JLabel("查询结果");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("宋体", Font.BOLD, 22));
		label_18.setBounds(20, 143, 101, 28);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("ID：");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("宋体", Font.PLAIN, 22));
		label_19.setBounds(83, 175, 49, 28);
		contentPane.add(label_19);
		
		textField13 = new JTextField();
		textField13.setEditable(false);
		textField13.setBackground(new Color(255, 255, 255));
		textField13.setFont(new Font("宋体", Font.PLAIN, 20));
		textField13.setColumns(10);
		textField13.setBounds(131, 175, 145, 30);
		contentPane.add(textField13);
		
		JLabel label_20 = new JLabel("姓名：");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("宋体", Font.PLAIN, 22));
		label_20.setBounds(349, 175, 76, 28);
		contentPane.add(label_20);
		
		textField14 = new JTextField();
		textField14.setEditable(false);
		textField14.setBackground(new Color(255, 255, 255));
		textField14.setFont(new Font("宋体", Font.PLAIN, 20));
		textField14.setColumns(10);
		textField14.setBounds(420, 175, 145, 30);
		contentPane.add(textField14);
		
		JLabel label_21 = new JLabel("性别：");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("宋体", Font.PLAIN, 22));
		label_21.setBounds(666, 175, 76, 28);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("人员类别：");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("宋体", Font.PLAIN, 22));
		label_22.setBounds(912, 175, 122, 28);
		contentPane.add(label_22);
		
		textField16 = new JTextField();
		textField16.setEditable(false);
		textField16.setBackground(new Color(255, 255, 255));
		textField16.setFont(new Font("宋体", Font.PLAIN, 20));
		textField16.setColumns(10);
		textField16.setBounds(1020, 175, 145, 30);
		contentPane.add(textField16);
		
		JLabel label_23 = new JLabel("出生日期：");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("宋体", Font.PLAIN, 22));
		label_23.setBounds(17, 212, 115, 28);
		contentPane.add(label_23);
		
		textField17 = new JTextField();
		textField17.setEditable(false);
		textField17.setBackground(new Color(255, 255, 255));
		textField17.setFont(new Font("宋体", Font.PLAIN, 20));
		textField17.setColumns(10);
		textField17.setBounds(131, 212, 145, 30);
		contentPane.add(textField17);
		
		JLabel label_24 = new JLabel("证件类型：");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setFont(new Font("宋体", Font.PLAIN, 22));
		label_24.setBounds(306, 212, 115, 28);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("证件编号：");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setFont(new Font("宋体", Font.PLAIN, 22));
		label_25.setBounds(622, 212, 115, 28);
		contentPane.add(label_25);
		
		textField18 = new JTextField();
		textField18.setEditable(false);
		textField18.setBackground(new Color(255, 255, 255));
		textField18.setFont(new Font("宋体", Font.PLAIN, 20));
		textField18.setColumns(10);
		textField18.setBounds(420, 212, 145, 30);
		contentPane.add(textField18);
		
		textField19 = new JTextField();
		textField19.setEditable(false);
		textField19.setBackground(new Color(255, 255, 255));
		textField19.setFont(new Font("宋体", Font.PLAIN, 20));
		textField19.setColumns(10);
		textField19.setBounds(733, 212, 432, 30);
		contentPane.add(textField19);
		
		textField15 = new JTextField();
		textField15.setEditable(false);
		textField15.setBackground(new Color(255, 255, 255));
		textField15.setFont(new Font("宋体", Font.PLAIN, 20));
		textField15.setColumns(10);
		textField15.setBounds(733, 175, 145, 30);
		contentPane.add(textField15);
		
		textField22 = new JTextField();
		textField22.setFont(new Font("宋体", Font.PLAIN, 20));
		textField22.setColumns(10);
		textField22.setBounds(420, 290, 145, 30);
		contentPane.add(textField22);
		
		textField21 = new JTextField();
		textField21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField21.setColumns(10);
		textField21.setBounds(131, 290, 145, 30);
		contentPane.add(textField21);
		
		JLabel label_10 = new JLabel("机构编码：");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("宋体", Font.PLAIN, 22));
		label_10.setBounds(630, 290, 112, 28);
		contentPane.add(label_10);
		
		textField5 = new JTextField();
		textField5.setFont(new Font("宋体", Font.PLAIN, 20));
		textField5.setColumns(10);
		textField5.setBounds(420, 405, 145, 30);
		contentPane.add(textField5);
		
		JLabel label_27 = new JLabel("费用总额：");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setFont(new Font("宋体", Font.PLAIN, 22));
		label_27.setBounds(20, 832, 112, 28);
		contentPane.add(label_27);
		
		textField51 = new JTextField();
		textField51.setEditable(false);
		textField51.setBackground(new Color(255, 255, 255));
		textField51.setFont(new Font("宋体", Font.PLAIN, 20));
		textField51.setColumns(10);
		textField51.setBounds(131, 832, 145, 30);
		contentPane.add(textField51);
		
		textField55 = new JTextField();
		textField55.setEditable(false);
		textField55.setBackground(new Color(255, 255, 255));
		textField55.setFont(new Font("宋体", Font.PLAIN, 20));
		textField55.setColumns(10);
		textField55.setBounds(131, 870, 145, 30);
		contentPane.add(textField55);
		
		textField52 = new JTextField();
		textField52.setEditable(false);
		textField52.setBackground(new Color(255, 255, 255));
		textField52.setFont(new Font("宋体", Font.PLAIN, 20));
		textField52.setColumns(10);
		textField52.setBounds(415, 830, 145, 30);
		contentPane.add(textField52);
		
		textField56 = new JTextField();
		textField56.setEditable(false);
		textField56.setBackground(new Color(255, 255, 255));
		textField56.setFont(new Font("宋体", Font.PLAIN, 20));
		textField56.setColumns(10);
		textField56.setBounds(415, 870, 145, 30);
		contentPane.add(textField56);
		
		textField53 = new JTextField();
		textField53.setEditable(false);
		textField53.setBackground(new Color(255, 255, 255));
		textField53.setFont(new Font("宋体", Font.PLAIN, 20));
		textField53.setColumns(10);
		textField53.setBounds(733, 830, 145, 30);
		contentPane.add(textField53);
		
		textField57 = new JTextField();
		textField57.setEditable(false);
		textField57.setBackground(new Color(255, 255, 255));
		textField57.setFont(new Font("宋体", Font.PLAIN, 20));
		textField57.setColumns(10);
		textField57.setBounds(733, 870, 145, 30);
		contentPane.add(textField57);
		
		textField54 = new JTextField();
		textField54.setEditable(false);
		textField54.setBackground(new Color(255, 255, 255));
		textField54.setFont(new Font("宋体", Font.PLAIN, 20));
		textField54.setColumns(10);
		textField54.setBounds(1009, 832, 145, 30);
		contentPane.add(textField54);
		
		JLabel label_4 = new JLabel("乙类自费：");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("宋体", Font.PLAIN, 22));
		label_4.setBounds(20, 870, 112, 28);
		contentPane.add(label_4);
		
		JLabel label_26 = new JLabel("报销金额：");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setFont(new Font("宋体", Font.PLAIN, 22));
		label_26.setBounds(313, 832, 112, 28);
		contentPane.add(label_26);
		
		JLabel label_28 = new JLabel("分段自费：");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setFont(new Font("宋体", Font.PLAIN, 22));
		label_28.setBounds(313, 870, 112, 28);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("自费金额：");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("宋体", Font.PLAIN, 22));
		label_29.setBounds(630, 832, 112, 28);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("特检特治自费：");
		label_30.setHorizontalAlignment(SwingConstants.RIGHT);
		label_30.setFont(new Font("宋体", Font.PLAIN, 22));
		label_30.setBounds(580, 865, 162, 28);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("起付标准：");
		label_31.setHorizontalAlignment(SwingConstants.RIGHT);
		label_31.setFont(new Font("宋体", Font.PLAIN, 22));
		label_31.setBounds(907, 832, 112, 28);
		contentPane.add(label_31);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(15, 960, 1150, 1);
		contentPane.add(separator_6);
		
		JLabel label_34 = new JLabel("人员ID：");
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setFont(new Font("宋体", Font.PLAIN, 22));
		label_34.setBounds(313, 521, 112, 28);
		contentPane.add(label_34);
		
		textField41 = new JTextField();
		textField41.setBackground(new Color(255, 255, 255));
		textField41.setEditable(false);
		textField41.setFont(new Font("宋体", Font.PLAIN, 20));
		textField41.setColumns(10);
		textField41.setBounds(420, 521, 145, 30);
		contentPane.add(textField41);
		
		JLabel label_35 = new JLabel("开始日期：");
		label_35.setHorizontalAlignment(SwingConstants.RIGHT);
		label_35.setFont(new Font("宋体", Font.PLAIN, 22));
		label_35.setBounds(313, 560, 115, 28);
		contentPane.add(label_35);
		
		textField44 = new JTextField();
		textField44.setBackground(new Color(255, 255, 255));
		textField44.setEditable(false);
		textField44.setFont(new Font("宋体", Font.PLAIN, 20));
		textField44.setColumns(10);
		textField44.setBounds(420, 560, 145, 30);
		contentPane.add(textField44);
		
		JLabel label_36 = new JLabel("机构编码：");
		label_36.setHorizontalAlignment(SwingConstants.RIGHT);
		label_36.setFont(new Font("宋体", Font.PLAIN, 22));
		label_36.setBounds(625, 521, 117, 28);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel("终止日期：");
		label_37.setHorizontalAlignment(SwingConstants.RIGHT);
		label_37.setFont(new Font("宋体", Font.PLAIN, 22));
		label_37.setBounds(630, 560, 115, 28);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("审批编号：");
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setFont(new Font("宋体", Font.PLAIN, 22));
		label_38.setBounds(907, 521, 112, 28);
		contentPane.add(label_38);
		
		textField42 = new JTextField();
		textField42.setEditable(false);
		textField42.setBackground(new Color(255, 255, 255));
		textField42.setFont(new Font("宋体", Font.PLAIN, 20));
		textField42.setColumns(10);
		textField42.setBounds(733, 521, 145, 30);
		contentPane.add(textField42);
		
		textField45 = new JTextField();
		textField45.setBackground(new Color(255, 255, 255));
		textField45.setEditable(false);
		textField45.setFont(new Font("宋体", Font.PLAIN, 20));
		textField45.setColumns(10);
		textField45.setBounds(733, 560, 145, 30);
		contentPane.add(textField45);
		
		JLabel label_39 = new JLabel("审批标识：");
		label_39.setHorizontalAlignment(SwingConstants.RIGHT);
		label_39.setFont(new Font("宋体", Font.PLAIN, 22));
		label_39.setBounds(907, 560, 112, 28);
		contentPane.add(label_39);
		
		textField43 = new JTextField();
		textField43.setBackground(new Color(255, 255, 255));
		textField43.setEditable(false);
		textField43.setFont(new Font("宋体", Font.PLAIN, 20));
		textField43.setColumns(10);
		textField43.setBounds(1009, 521, 145, 30);
		contentPane.add(textField43);
		
		textField46 = new JTextField();
		textField46.setEditable(false);
		textField46.setBackground(new Color(255, 255, 255));
		textField46.setFont(new Font("宋体", Font.PLAIN, 20));
		textField46.setColumns(10);
		textField46.setBounds(1009, 560, 145, 30);
		contentPane.add(textField46);
		
		JLabel label_40 = new JLabel("人员ID：");
		label_40.setHorizontalAlignment(SwingConstants.RIGHT);
		label_40.setFont(new Font("宋体", Font.PLAIN, 22));
		label_40.setBounds(313, 619, 112, 28);
		contentPane.add(label_40);
		
		textField411 = new JTextField();
		textField411.setEditable(false);
		textField411.setBackground(new Color(255, 255, 255));
		textField411.setFont(new Font("宋体", Font.PLAIN, 20));
		textField411.setColumns(10);
		textField411.setBounds(420, 619, 145, 30);
		contentPane.add(textField411);
		
		JLabel label_41 = new JLabel("开始日期：");
		label_41.setHorizontalAlignment(SwingConstants.RIGHT);
		label_41.setFont(new Font("宋体", Font.PLAIN, 22));
		label_41.setBounds(313, 658, 115, 28);
		contentPane.add(label_41);
		
		textField414 = new JTextField();
		textField414.setBackground(new Color(255, 255, 255));
		textField414.setEditable(false);
		textField414.setFont(new Font("宋体", Font.PLAIN, 20));
		textField414.setColumns(10);
		textField414.setBounds(420, 658, 145, 30);
		contentPane.add(textField414);
		
		JLabel label_42 = new JLabel("药品编码：");
		label_42.setHorizontalAlignment(SwingConstants.RIGHT);
		label_42.setFont(new Font("宋体", Font.PLAIN, 22));
		label_42.setBounds(630, 619, 117, 28);
		contentPane.add(label_42);
		
		JLabel label_43 = new JLabel("终止日期：");
		label_43.setHorizontalAlignment(SwingConstants.RIGHT);
		label_43.setFont(new Font("宋体", Font.PLAIN, 22));
		label_43.setBounds(630, 658, 115, 28);
		contentPane.add(label_43);
		
		textField415 = new JTextField();
		textField415.setBackground(new Color(255, 255, 255));
		textField415.setEditable(false);
		textField415.setFont(new Font("宋体", Font.PLAIN, 20));
		textField415.setColumns(10);
		textField415.setBounds(733, 658, 145, 30);
		contentPane.add(textField415);
		
		textField412 = new JTextField();
		textField412.setEditable(false);
		textField412.setBackground(new Color(255, 255, 255));
		textField412.setFont(new Font("宋体", Font.PLAIN, 20));
		textField412.setColumns(10);
		textField412.setBounds(733, 619, 145, 30);
		contentPane.add(textField412);
		
		JLabel label_44 = new JLabel("审批编号：");
		label_44.setHorizontalAlignment(SwingConstants.RIGHT);
		label_44.setFont(new Font("宋体", Font.PLAIN, 22));
		label_44.setBounds(907, 619, 112, 28);
		contentPane.add(label_44);
		
		JLabel label_45 = new JLabel("审批标识：");
		label_45.setHorizontalAlignment(SwingConstants.RIGHT);
		label_45.setFont(new Font("宋体", Font.PLAIN, 22));
		label_45.setBounds(907, 658, 112, 28);
		contentPane.add(label_45);
		
		textField413 = new JTextField();
		textField413.setBackground(new Color(255, 255, 255));
		textField413.setEditable(false);
		textField413.setFont(new Font("宋体", Font.PLAIN, 20));
		textField413.setColumns(10);
		textField413.setBounds(1009, 619, 145, 30);
		contentPane.add(textField413);
		
		textField416 = new JTextField();
		textField416.setBackground(new Color(255, 255, 255));
		textField416.setEditable(false);
		textField416.setFont(new Font("宋体", Font.PLAIN, 20));
		textField416.setColumns(10);
		textField416.setBounds(1009, 658, 145, 30);
		contentPane.add(textField416);
		
		/*
		 * 人员就诊机构审批记录查询
		 */
		JButton button = new JButton("人员就诊机构审批查询");
		button.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				    if(e.getSource()==button)
				    {
					    find人员就诊机构审批();
				    }
			    }
				public void find人员就诊机构审批(){
					try {
						String ID=textField40.getText();
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
									textField41.setText(s1);
									textField42.setText(s2);
									textField43.setText(s3);
									textField44.setText(s4);
									textField45.setText(s5);
									textField46.setText(s6);
									k=1;
								}
				            }
				        }
						if(k==0) {//重置显示查找结果的文本框
							textField41.setText("");
							textField42.setText("");
							textField43.setText("");
							textField44.setText("");
							textField45.setText("");
							textField46.setText("");
							JOptionPane.showMessageDialog(null, "   无审批记录");//弹出提示框
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
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBackground(new Color(245, 245, 245));
		button.setBounds(23, 550, 253, 40);
		contentPane.add(button);
		
		JButton button_1 = new JButton("特检特治审批查询");
		/*
		 * 特检特治审批查询
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					find特检特治审批查询();
				}
			}
			public void find特检特治审批查询(){
				try {
					String ID=textField401.getText();
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
								textField411.setText(s1);
								textField412.setText(s2);
								textField413.setText(s3);
								textField414.setText(s4);
								textField415.setText(s5);
								textField416.setText(s6);
								k=1;
							}
			            }
			        }
					if(k==0) {//重置显示查找结果的文本框
						textField411.setText("");
						textField412.setText("");
						textField413.setText("");
						textField414.setText("");
						textField415.setText("");
						textField416.setText("");
						JOptionPane.showMessageDialog(null, "   无审批记录");//弹出提示框
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
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBackground(new Color(245, 245, 245));
		button_1.setBounds(23, 648, 253, 40);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("病种是否可报销查询");
		/*
		 * 病重是否可报销查询
		 * 在病种信息.txt中找到该病种，检验该病种的报销审批是否为"是"
		 * 为"是"则在文本框显示"可报销",为"否"在文本框里显示"不可报销"
		 */
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2)
				{
					find病种可报销();
				}
			}
			public void find病种可报销(){
				try {
					String code=textField402.getText();
			        BufferedReader r=new BufferedReader( new InputStreamReader(new FileInputStream( "D:\\代码\\2018年暑期实验课\\病种信息.txt")));
			        int k=0;
			        
					while (r.ready()) {
						String s=r.readLine();
						StringTokenizer st=new StringTokenizer(s,",");//使用StringTokenizer将文件读取的字符串以","进行分割			
						if(st.hasMoreTokens()) {
							String s1=st.nextToken();
							String s2=st.nextToken();
							String s3=st.nextToken();
							String s4=st.nextToken();
							if(code.equals(s1)) {//信息匹配
								System.out.println(s1);
								if("否".equals(s4)) {
									textField421.setText("不可报销");
								}
								else {
									textField421.setText("可报销");
								}
								k=1;
							}
			            }
					    
				}
					if(k==0) {//重置显示查找结果的文本框
					    textField421.setText("");
					JOptionPane.showMessageDialog(null, "   该病种不存在");//弹出提示框
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
		button_2.setFont(new Font("宋体", Font.PLAIN, 20));
		button_2.setBackground(new Color(245, 245, 245));
		button_2.setBounds(23, 744, 253, 40);
		contentPane.add(button_2);
		
		textField421 = new JTextField();
		textField421.setEditable(false);
		textField421.setBackground(new Color(255, 255, 255));
		textField421.setFont(new Font("宋体", Font.PLAIN, 20));
		textField421.setColumns(10);
		textField421.setBounds(420, 746, 145, 30);
		contentPane.add(textField421);
		
		JLabel label_32 = new JLabel("查询结果：");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setFont(new Font("宋体", Font.PLAIN, 22));
		label_32.setBounds(313, 746, 115, 28);
		contentPane.add(label_32);
		
		JLabel lblid = new JLabel("请输入ID：");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblid.setFont(new Font("宋体", Font.PLAIN, 22));
		lblid.setBounds(20, 521, 112, 28);
		contentPane.add(lblid);
		
		textField40 = new JTextField();
		textField40.setFont(new Font("宋体", Font.PLAIN, 20));
		textField40.setColumns(10);
		textField40.setBounds(131, 521, 145, 30);
		contentPane.add(textField40);
		
		JLabel label_33 = new JLabel("输入疾病编码：");
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setFont(new Font("宋体", Font.PLAIN, 22));
		label_33.setBounds(18, 716, 156, 28);
		contentPane.add(label_33);
		
		textField402 = new JTextField();
		textField402.setFont(new Font("宋体", Font.PLAIN, 20));
		textField402.setColumns(10);
		textField402.setBounds(161, 714, 115, 30);
		contentPane.add(textField402);
		
		JLabel label_46 = new JLabel("请输入ID：");
		label_46.setHorizontalAlignment(SwingConstants.RIGHT);
		label_46.setFont(new Font("宋体", Font.PLAIN, 22));
		label_46.setBounds(20, 619, 112, 28);
		contentPane.add(label_46);
		
		textField401 = new JTextField();
		textField401.setFont(new Font("宋体", Font.PLAIN, 20));
		textField401.setColumns(10);
		textField401.setBounds(131, 619, 145, 30);
		contentPane.add(textField401);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("宋体", Font.PLAIN, 20));
		textField3.setColumns(10);
		textField3.setBounds(733, 442, 145, 30);
		contentPane.add(textField3);
		
		JLabel label_12 = new JLabel("项目名称：");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		label_12.setBounds(630, 443, 112, 28);
		contentPane.add(label_12);
		
		JLabel label_47 = new JLabel("费用总额：");
		label_47.setHorizontalAlignment(SwingConstants.RIGHT);
		label_47.setFont(new Font("宋体", Font.PLAIN, 22));
		label_47.setBounds(164, 924, 112, 28);
		contentPane.add(label_47);
		
		textFielda = new JTextField();
		textFielda.setFont(new Font("宋体", Font.PLAIN, 20));
		textFielda.setEditable(false);
		textFielda.setColumns(10);
		textFielda.setBackground(Color.WHITE);
		textFielda.setBounds(263, 924, 145, 30);
		contentPane.add(textFielda);
		
		JLabel label_48 = new JLabel("报销金额：");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setFont(new Font("宋体", Font.PLAIN, 22));
		label_48.setBounds(431, 924, 112, 28);
		contentPane.add(label_48);
		
		textFieldb = new JTextField();
		textFieldb.setFont(new Font("宋体", Font.PLAIN, 20));
		textFieldb.setEditable(false);
		textFieldb.setColumns(10);
		textFieldb.setBackground(Color.WHITE);
		textFieldb.setBounds(533, 923, 145, 30);
		contentPane.add(textFieldb);
		
		JLabel label_49 = new JLabel("自费金额：");
		label_49.setHorizontalAlignment(SwingConstants.RIGHT);
		label_49.setFont(new Font("宋体", Font.PLAIN, 22));
		label_49.setBounds(706, 924, 112, 28);
		contentPane.add(label_49);
		
		textFieldc = new JTextField();
		textFieldc.setFont(new Font("宋体", Font.PLAIN, 20));
		textFieldc.setEditable(false);
		textFieldc.setColumns(10);
		textFieldc.setBackground(Color.WHITE);
		textFieldc.setBounds(803, 923, 145, 30);
		contentPane.add(textFieldc);
	}
}
