import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
		frame.setSize(720, 720);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar= new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JMenuItem option = new JMenuItem("Option");
		fileMenu.add(option);
		
		JMenuItem help = new JMenuItem("Help");
		fileMenu.add(help);
		
		
		
		frame.setLayout(new BorderLayout());
		
		
		JPanel searchBarPanel = new JPanel();
		//searchBarPanel.setLayout(new FlowLayout());
		frame.add(searchBarPanel, BorderLayout.NORTH);
		
		
		JLabel searchTerms = new JLabel("Search Terms:   ");
		searchBarPanel.add(searchTerms);
		
		JTextField search = new JTextField("", 45);
		searchBarPanel.add(search);
		
		JButton searchButton = new JButton("Search");
		searchBarPanel.add(searchButton);
		
		
		JTextArea resultArea = new JTextArea();
		resultArea.setEditable(false);
		frame.add(resultArea, BorderLayout.CENTER);
		
		
		
		
		frame.setVisible(true);
		
		
	}
}
