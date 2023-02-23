import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.net.URI;
import java.util.regex.*;

public class Action implements ActionListener
{
	Frame mf;
	KruskalsAlgorithm kf;
	
	Action(Frame m){
		this.mf = m;
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(this.mf.btnSubmit))
		{
			KruskalsAlgorithm project = new KruskalsAlgorithm();
			project.setVisible(true);
			mf.setVisible(false);
		}
	}
}