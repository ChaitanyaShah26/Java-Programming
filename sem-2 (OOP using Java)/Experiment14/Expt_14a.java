/*
	Write java program to create a registration form. 
	Take Login id and Password from the user and 
	display it on the third Text Field which appears only on clicking OK button and clear both the Text Fields on clicking RESET button.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Expt14_a extends JFrame implements ActionListener
{
	JFrame registartion;
	JLabel login,password;
	JButton ok,reset;
	JTextField id,user;
	JPasswordField pwd;

	Expt14_a()
	{
		registartion=new JFrame("Registration Form");
		login=new JLabel("Login ID: ");
		password=new JLabel("Password: ");
		ok=new JButton("OK");
		reset=new JButton("RESET");
		id=new JTextField(10);
		pwd=new JPasswordField(8);
		user=new JTextField(50);

		registartion.setLayout(new FlowLayout());
		registartion.add(login);
		registartion.add(id);
		registartion.add(password);
		registartion.add(pwd);
		registartion.add(ok);
		registartion.add(reset);
		registartion.add(user);

		ok.addActionListener(this);
		reset.addActionListener(this);

		registartion.setSize(500,200);
		registartion.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ok)
		{
			String login_id=id.getText();
			String login_pwd=String.valueOf(pwd.getPassword());

			user.setText("Login ID: "+login_id+"    Password: "+login_pwd);
		}
		else if(ae.getSource()==reset)
		{
			id.setText("");
			pwd.setText("");
			user.setText("");
		}
	}

	public static void main(String args[])
	{
		Expt14_a form=new Expt14_a();
	}
}