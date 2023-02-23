import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class Frame extends JFrame
{
	JButton btnSubmit;
	Action ml = new Action(this);
	
	Frame()
	{
		super("KruskalsAlgorithm");
		setLayout(null);
		setSize(new Dimension(2400,1100));
		
		Icon icon = new ImageIcon("MST-removebg-preview.png");
		btnSubmit=new JButton(icon);
		
		add(btnSubmit);
		
		btnSubmit.setBounds(750,450,450,200);
		
		btnSubmit.addActionListener(ml);
		
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("image.png"));
		add(background);
		background.setLayout(new FlowLayout());
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			Frame mf = new Frame();
			mf.setVisible(true);
	}
}
