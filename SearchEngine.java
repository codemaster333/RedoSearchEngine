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
import java.awt.*;

public class SearchEngine1 extends JFrame {

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
        //frame.setBackground(new Color(53, 56, 64));
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
        
        JPanel bottom = new JPanel();
        
        
        JButton newWindow = new JButton("Maintenance");
        
        bottom.setLayout(new BorderLayout());
        bottom.add(newWindow, BorderLayout.LINE_START);
        frame.add(bottom, BorderLayout.PAGE_END);
        //anonymous inner classes to define button listener
        newWindow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createMaintenanceWindow();
              }
          });
        
        
        
        
        frame.setVisible(true);
        
        
    }
    
    public static void createMaintenanceWindow()
    {
        JFrame main = new JFrame();
        main.setSize(720, 360);
        main.setTitle("Search Engine Maintenance");
        JPanel header = new JPanel();
        header.setBackground(new Color(255, 255, 255));
        JLabel title = new JLabel("SEARCH ENGINE - Index Maintenance");
        header.add(title);
        //grid layout for two columns of results
        JPanel columnKey = new JPanel();
        //GridLayout cKey = new GridLayout(1, 2);
        columnKey.setLayout(new GridLayout(1, 2));
        JLabel fileName = new JLabel("File Name");
        JLabel status = new JLabel("Status");
        columnKey.add(fileName);
        columnKey.add(status);
        fileName.setHorizontalAlignment(JLabel.CENTER);
        status.setHorizontalAlignment(JLabel.CENTER);
        main.add(columnKey);
        main.add(header, BorderLayout.NORTH);
        
        main.setVisible(true);
    }
}
