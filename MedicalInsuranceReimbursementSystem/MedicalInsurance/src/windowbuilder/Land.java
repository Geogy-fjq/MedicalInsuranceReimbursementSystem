package windowbuilder;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Land extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private final String name="20174989";
	private final String password="123456";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Land frame = new Land();
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
	public Land() {
		setResizable(false);
		setTitle("医疗保险报销系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 431);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("医疗保险报销系统");
		label.setBounds(145, 15, 335, 77);
		label.setForeground(new Color(0, 51, 204));
		label.setBackground(new Color(255, 255, 255));
		label.setFont(new Font("宋体", Font.BOLD, 38));
		
		JLabel label_1 = new JLabel("用户登录");
		label_1.setBounds(206, 107, 108, 47);
		label_1.setFont(new Font("宋体", Font.BOLD, 26));
		label_1.setForeground(new Color(51, 51, 51));
		
		JLabel label_2 = new JLabel("用户名");
		label_2.setBounds(205, 174, 60, 21);
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel label_3 = new JLabel("密码");
		label_3.setBounds(206, 239, 40, 21);
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 22));
		textField.setBounds(291, 167, 192, 37);
		textField.setBackground(new Color(255, 255, 204));
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("                     ");
		label_4.setForeground(new Color(255, 0, 0));
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		label_4.setBackground(new Color(240, 248, 255));
		label_4.setBounds(337, 123, 217, 21);
		contentPane.add(label_4);
		
		/*
		 * 限制用户名输入为8位数字
		 * 
		 */
		textField.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){//正则表达式限制输入为数字
					
				}else{
					e.consume(); //屏蔽非法输入
				}
				String s=textField.getText();
				if(s.length() >= 8) {
					e.consume();//销毁大于8位的输入
				}
			 }
		});
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 22));
		passwordField.setBounds(291, 232, 192, 37);
		passwordField.setBackground(new Color(255, 255, 204));
		passwordField.setForeground(new Color(0, 0, 0));
		/*
		 * 限制密码输入为6位数字
		 * 
		 */
		passwordField.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){//正则表达式限制输入为数字
					
				}else{
					e.consume(); //屏蔽非法输入
				}
				String a=passwordField.getText();
				if(a.length() >= 6) {
					e.consume();//销毁大于6位的输入
				}
			 }
		});
		
		JButton btnNewButton = new JButton("登陆");
		btnNewButton.setBounds(405, 297, 78, 37);
		/*
		 * 当点击“登录”时，切换到Main界面
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton){//登录按钮 
		            if(textField.getText().equals(name)&&passwordField.getText().equals(password)){
		            	Main landwindow=new Main();
						landwindow.setVisible(true);
		            }
		            if(!(textField.getText().equals(name))&&passwordField.getText().equals(password)){
		            	label_4.setText("用户名错误！");
		            }
		            if(textField.getText().equals(name)&&!(passwordField.getText().equals(password))){
		            	label_4.setText("密码错误!");
		            }
		            if(!(textField.getText().equals(name))&&!(passwordField.getText().equals(password))){
		            	label_4.setText("用户名和密码错误!");
		            }
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(245, 245, 245));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(textField);
		contentPane.add(passwordField);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\代码\\2018年暑期实验课\\医保图片大.png"));
		lblNewLabel.setBounds(45, 130, 138, 130);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("退出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					System.exit(0);
				}
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button.setBackground(new Color(245, 245, 245));
		button.setBounds(291, 297, 78, 37);
		contentPane.add(button);

	}
}
