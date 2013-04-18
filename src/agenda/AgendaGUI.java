/*
 * AgendaGUI.java
 * Author: HeapsOfRam
 */
package agenda;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AgendaGUI extends JFrame{
    ControlPanel controls;
    ViewPanel view;
    TextPanel text;
    
    public AgendaGUI(){
        super("Agenda");
        
        view = new ViewPanel();
        view.setBorder(BorderFactory.createEtchedBorder());
        
        text = new TextPanel();
        text.setBorder(BorderFactory.createEtchedBorder());
        text.setPreferredSize(new Dimension(300, 100));
        
        controls = new ControlPanel(view, text);
        controls.setBorder(BorderFactory.createEtchedBorder());
        controls.setPreferredSize(new Dimension(300, 100));
        
        setLayout(new BorderLayout());
        add(BorderLayout.SOUTH, controls);
        add(BorderLayout.NORTH, text);
        add(BorderLayout.CENTER, view);
    }
        
}
