import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.*;
import java.util.prefs.Preferences;
import java.awt.*;
import java.awt.event.*;

public class SearchEngine extends Frame {
    private MenuBar menuBar;
    private TextField search;
    private Button newWindow;
    public static void main ( String [] args)
    {
        SearchEngine A = new SearchEngine("File Search");
        A.addWindowListener(new WindowAdapter()
        {
          public void windowClosing(WindowEvent e)
          {
              System.exit(0);
          }
        }
        );
        A.initialize();
    }
    
    public SearchEngine(String title)
    {
        super(title);
        setSize(600,600);
        setLayout(new BorderLayout());
        menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        menuBar.add(fileMenu);
        Menu optionMenu = new Menu("Options");
        menuBar.add(optionMenu);
        Menu helpMenu = new Menu("Help");
        menuBar.add(helpMenu);
        Panel searchBarPanel = new Panel();
        searchBarPanel.setLayout(new FlowLayout());
        add(searchBarPanel);
        searchBarPanel.add(new Label("Enter a query"));
        search = new TextField("", 30);
        searchBarPanel.add(search);
        newWindow = new Button("Click me");
        
    }
    
    public void initialize(){
        setVisible(true);
        setMenuBar(menuBar);
        
        
        
    }
}
