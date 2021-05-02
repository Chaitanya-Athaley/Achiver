package swingDemo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mywindow extends JFrame{

	private JLabel heading;
	Font font = new Font("",Font.BOLD,30);
	private JPanel mainPanel;
	private JLabel name,password;
	private JTextField nameTextField;
	private JPasswordField passwordField;
	private JButton button1,button2;
	
	
	public Mywindow() {
		super.setTitle("My First Form");
		super.setSize(500,500);
		super.setLocation(100,100);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.createGUI();
		
		
		
		super.setVisible(true);
		System.out.println("This is construnctor");
		
	}
	
	public void createGUI() {
	this.setLayout(new BorderLayout());	
	heading = new JLabel("My First Form...");
	heading.setFont(font);
	heading.setHorizontalAlignment(JLabel.CENTER);
	
	this.add(heading,BorderLayout.NORTH);
	
	mainPanel = new JPanel();
	mainPanel.setLayout(new GridLayout(3,2));
	
	name = new JLabel("Enter Name");
	name.setFont(font);
	
	password = new JLabel("Enter Password");
	password.setFont(font);
	
	nameTextField = new JTextField();
	nameTextField.setFont(font);
	passwordField = new JPasswordField();
	passwordField.setFont(font);
	button1 = new JButton("Submit");
	button1.setFont(font);
	button2 = new JButton("Reset");
	button2.setFont(font);
	
	mainPanel.add(name);
	mainPanel.add(nameTextField);
	mainPanel.add(password);
	mainPanel.add(passwordField);
	mainPanel.add(button1);
	mainPanel.add(button2);
	this.add(mainPanel,BorderLayout.CENTER);
	
	
	}
}
