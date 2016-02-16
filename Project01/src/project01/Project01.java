package project01;

import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Project01 extends JFrame implements ActionListener{
		private JPanel 		_panel;
	private JButton 	_button;
	
	
	public static void main(String[] args) {
		
		Project01 frame = new Project01();
		frame.setSize(400,200);
		frame.setTitle("Project01: Carlos / Rishaad   'JavaSE 1.8'");
		frame.setLocation(200,300);
		frame.setResizable(false);
		frame.createGUI();
		frame.show();
		
	}
	
	private void createGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		_panel = new JPanel();
		_panel.setPreferredSize(new Dimension(500,400));
		_panel.setBackground(Color.GRAY);
		window.add(_panel);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent event){
		
	}

}
