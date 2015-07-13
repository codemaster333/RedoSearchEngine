import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.*;
import java.util.prefs.Preferences;

public class SearchEngine extends JFrame {

	public static void main ( String [] args)
	{
		initialize();
	}
	
	
	public static void initialize(){
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Search Engine");
		frame.setSize(600, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar= new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JMenu optionMenu = new JMenu("Option");
		menuBar.add(optionMenu);
		
		JMenu helpMenu = new JMenu("help");
		menuBar.add(helpMenu);
		
		
		frame.setLayout(new BorderLayout());
		
		
		JPanel searchBarPanel = new JPanel();
		frame.add(searchBarPanel, BorderLayout.NORTH);
		
		JLabel search = new JLabel();
		searchBarPanel.add(search);
		
		
		

		
		
		
		
		frame.setVisible(true);
		
		
	}
}
