/*
 * ControlPanel.java
 * Author: HeapsOfRam
 */
package agenda;

import java.io.*;
import java.text.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;

public class ControlPanel extends JPanel{
    private ViewPanel view;
    private TextPanel text;
    private JPanel buttonPanel;
    
    private JButton addButton, deleteButton, displayButton, helpButton, endButton;
    private ButtonHandler buttonListener;
    
    private String filename = "agenda.txt";
    
    public ControlPanel(ViewPanel view, TextPanel text){
        this.view = view;
        this.text = text;
        
        buttonPanel = new JPanel();
        buttonListener = new ButtonHandler();
        
        addButton = new JButton("ADD");
        addButton.setToolTipText("Add to agenda");
        addButton.setMargin(new Insets(5, 5, 10, 5));
        addButton.addActionListener(buttonListener);
        
        deleteButton = new JButton("DELETE");
        deleteButton.setToolTipText("Remove from agenda");
        deleteButton.setMargin(new Insets(5, 5, 10, 5));
        deleteButton.addActionListener(buttonListener);
        
        displayButton = new JButton("DISPLAY");
        displayButton.setToolTipText("Displays dates tasks");
        displayButton.setMargin(new Insets(5, 5, 10, 5));
        displayButton.addActionListener(buttonListener);
        
        helpButton = new JButton("HELP");
        helpButton.setToolTipText("Display help menu");
        helpButton.setMargin(new Insets(5, 5, 10, 5));
        helpButton.addActionListener(buttonListener);
        
        endButton = new JButton("END");
        endButton.setToolTipText("Exits session");
        endButton.setMargin(new Insets(5, 5, 10, 5));
        endButton.addActionListener(buttonListener);
        
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(helpButton);
        buttonPanel.add(endButton);
        
        add(BorderLayout.CENTER, buttonPanel);
    }
    
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("ADD")){
                
            }
            if(e.getActionCommand().equals("DELETE")){
                
            }
            if(e.getActionCommand().equals("DISPLAY")){
                
            }
            if(e.getActionCommand().equals("HELP")){
                
            }
            if(e.getActionCommand().equals("END")){
                writeOut();
                System.exit(0);
            }
        }
    }
    
    public void readIn(){
        try{
            Scanner scan = new Scanner(new File(filename));
            
        }
        catch(FileNotFoundException e){
            
        }
    }
    
    public void writeOut(){
        try{
            File file = new File(filename);
        
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("");
            bw.close();
        }
        catch(IOException e){
            
        }
    }
}
