// Write a program to create a basic calculator.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Expt14_b extends JFrame implements ActionListener
{	
	double num1=0,num2=0,ans=0;
	char op;
	JFrame calculator;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_add,b_sub,b_mul,b_div,b_dec,b_eq,b_clr;
	JTextField tf;

	Expt14_b()
	{
		calculator=new JFrame("Calculator");
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b_add=new JButton("+");
		b_sub=new JButton("-");
		b_mul=new JButton("*");
		b_div=new JButton("/");
		b_dec=new JButton(".");
		b_eq=new JButton("=");
		b_clr=new JButton("C");

		tf=new JTextField(10);

		JPanel calci=new JPanel();

		calci.add(tf);
		calci.add(b_clr);
		calci.add(b_div);
		calci.add(b_mul);
		calci.add(b_add);
		calci.add(b_sub);
		calci.add(b1);
		calci.add(b2);
		calci.add(b3);
		calci.add(b4);
		calci.add(b5);
		calci.add(b6);
		calci.add(b7);
		calci.add(b8);
		calci.add(b9);
		calci.add(b0);
		calci.add(b_dec);
		calci.add(b_eq);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b_add.addActionListener(this);
		b_sub.addActionListener(this);
		b_mul.addActionListener(this);
		b_div.addActionListener(this);
		b_clr.addActionListener(this);
		b_dec.addActionListener(this);
		b_eq.addActionListener(this);

		calculator.add(calci);
		calculator.setSize(200,220);
		calculator.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b0)
		{
			tf.setText(tf.getText().concat("0"));
		}
		if(ae.getSource()==b1)
		{
			tf.setText(tf.getText().concat("1"));
		}
		if(ae.getSource()==b2)
		{
			tf.setText(tf.getText().concat("2"));
		}
		if(ae.getSource()==b3)
		{
			tf.setText(tf.getText().concat("3"));
		}
		if(ae.getSource()==b4)
		{
			tf.setText(tf.getText().concat("4"));
		}
		if(ae.getSource()==b5)
		{
			tf.setText(tf.getText().concat("5"));
		}
		if(ae.getSource()==b6)
		{
			tf.setText(tf.getText().concat("6"));
		}
		if(ae.getSource()==b7)
		{
			tf.setText(tf.getText().concat("7"));
		}
		if(ae.getSource()==b8)
		{
			tf.setText(tf.getText().concat("8"));
		}
		if(ae.getSource()==b9)
		{
			tf.setText(tf.getText().concat("9"));
		}
		if(ae.getSource()==b_dec)
		{
			tf.setText(tf.getText().concat("."));
		}


		if(ae.getSource()==b_add)
		{
			num1=Double.parseDouble(tf.getText());
			op='+';
			tf.setText("");
		}
		if(ae.getSource()==b_sub)
		{
			num1=Double.parseDouble(tf.getText());
			op='-';
			tf.setText("");
		}
		if(ae.getSource()==b_mul)
		{
			num1=Double.parseDouble(tf.getText());
			op='*';
			tf.setText("");
		}
		if(ae.getSource()==b_div)
		{
			num1=Double.parseDouble(tf.getText());
			op='/';
			tf.setText("");
		}
		if(ae.getSource()==b_eq)
		{
			num2=Double.parseDouble(tf.getText());
			switch(op)
			{
				case '+':
					ans=num1+num2;
					break;
				case '-':
					ans=num1-num2;
					break;
				case '*':
					ans=num1*num2;
					break;
				case '/':
					ans=num1/num2;
					break;
				default :
					ans=0;					
			}
			tf.setText(""+ans);
		}

		if(ae.getSource()==b_clr)
		{
			tf.setText("");
		}
	}

	public static void main(String args[])
	{
		Expt14_b calc=new Expt14_b();
	}
}