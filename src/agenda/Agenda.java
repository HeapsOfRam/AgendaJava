/*
 * Agenda.java
 * Author: HeapsOfRam
 * A GUI Agenda to keep track of work
 */
package agenda;

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Agenda {
    
    public static void main(String[] args) {
        //Frame for the GUI
        final JFrame jFrame = new AgendaGUI();
        //Exits program when X is clicked

        jFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
	//Sets size of the window to 600x500
        jFrame.setSize(600,600);
	//Allow visibility of the frame
        jFrame.setVisible(true); // Show frame
    }
}
