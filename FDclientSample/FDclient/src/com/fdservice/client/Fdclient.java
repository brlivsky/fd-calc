package com.fdservice.client;



import java.util.Scanner;
import javax.swing.*;

import org.apache.axis.AxisFault;

import java.awt.event.*;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

import com.fdservice.service.FdserviceSoapBindingStub;

public class Fdclient {
	
	/*JTextField t1,t2,t3,t5;
	JButton b2,b4;
	JLabel l1,l2,l3,l5;
	Fdclient(){
		JFrame f = new JFrame();
		f.setBounds(100, 100, 667, 471);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		
		JButton b2 = new JButton("FD");
		b2.setBounds(470, 159, 85, 21);
		f.getContentPane().add(b2);
		
		
		final JButton b4 = new JButton("Submit");
		b4.setBounds(47, 328, 85, 21);
		f.getContentPane().add(b4);
		
		t1 = new JTextField();//Text Field For Amount
		t1.setBounds(47, 77, 288, 19);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		t1.setVisible(false);
		
		final JLabel l1 = new JLabel("Enter amount:");
		l1.setBounds(47, 43, 130, 13);
		f.getContentPane().add(l1);
		l1.setVisible(false);
		
		final JLabel l2 = new JLabel("Enter age:");
		l2.setBounds(47, 126, 100, 13);
		f.getContentPane().add(l2);
		l2.setVisible(false);
		
		t2 = new JTextField();//Text field for the age of Account Holder
		t2.setBounds(47, 160, 288, 19);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		t2.setVisible(false);
		
		final JLabel l3 = new JLabel("Enter number of days:");
		l3.setBounds(47, 212, 147, 13);
		f.getContentPane().add(l3);
		l3.setVisible(false);
		
		t3 = new JTextField();//Text Field for the number of days
		t3.setBounds(47, 246, 288, 19);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		t3.setVisible(false);
		
		t5 = new JTextField();
		t5.setBounds(47, 246, 288, 19);
		f.getContentPane().add(t5);
		t5.setColumns(10);
		t5.setVisible(false);
		
		final JLabel l5 = new JLabel("Interest Gained:");
		l5.setBounds(239, 299, 96, 13);
		f.getContentPane().add(l5);
		f.setVisible(false);
		
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					l1.setVisible(true);
					t1.setVisible(true);
					l2.setVisible(true);
					t2.setVisible(true);
					l3.setVisible(true);
					t3.setVisible(true);
					l5.setVisible(true);
					t5.setVisible(true);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t5.setText("");
					b4.setActionCommand("fd");
				
			}
		});
		
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		java.net.URL enpointUrl;
		try {
			enpointUrl = new java.net.URL("http://localhost:8080/FDcalc/services/Fdservice");
			org.apache.axis.client.Service service=new org.apache.axis.client.Service();
			  FdserviceSoapBindingStub stub;
			  stub = new FdserviceSoapBindingStub(enpointUrl,service);
			  if("fd".equals(e.getActionCommand()))
				{
					
					String s1=t1.getText();
					String s2=t2.getText();
					int age=Integer.parseInt(s2);
					String s3=t3.getText();
					int noOfDays=Integer.parseInt(s3);
					if(s1==null)
					{
						JOptionPane.showMessageDialog(null, "Reenter Amount");
						t1.setText("");
						if( noOfDays<0)
						{
							JOptionPane.showMessageDialog(null, "Invalid Number of days. Please enter non - negative values.");
							t3.setText("");
							if(age<0)
							{
								JOptionPane.showMessageDialog(null, "Invalid age. Please enter non - negative values.");
								t2.setText("");
							}
						}
					}
					else
					{  
					
						double amt=Double.parseDouble(s1);
						double i;
						try {
							i = stub.calculateFD(amt, noOfDays, age);
							String f="Interest gained: Rs. ";
							f+=String.valueOf(i);
							t5.setText(f);
						} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				}
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (AxisFault e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		  
		}*/
	

	public static void main(String[] args)  throws Exception{
		
	new Fdclient();
		
java.net.URL enpointUrl=new java.net.URL("http://localhost:8080/FDcalc/services/Fdservice");
  org.apache.axis.client.Service service=new org.apache.axis.client.Service();
   FdserviceSoapBindingStub stub=new FdserviceSoapBindingStub(enpointUrl,service);
   
 
   
   Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
   System.out.print("------Enter Amount------ ");  
   double a= sc.nextDouble();  
   System.out.print("----------Enter Number of Days of Amount Store--------");  
   int b= sc.nextInt();  
   System.out.print("----------Enter Age of the Acount Holder------- ");  
   int c= sc.nextInt();
   
   
  double result=stub.calculateFD(a, b, c);
	 System.out.print("-----------TOTAL FIXED DEPOSIT AMOUNT---------- " +result);
	
	}
	

}
