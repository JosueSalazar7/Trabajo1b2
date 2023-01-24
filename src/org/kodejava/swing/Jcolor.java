package org.kodejava.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Jcolor extends JFrame implements ChangeListener {
    private JColorChooser colorChooser = null;

    public Jcolor() throws HeadlessException {
        initUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new Jcolor().setVisible(true));
    }

    private void initUI() {
        // Set title and default close operation of this JFrame.
        setTitle("JColor");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Creates an instance of JColorChooser component and
        // adds it to the frame's content.
        colorChooser = new JColorChooser();
        getContentPane().add(colorChooser, BorderLayout.PAGE_END);

        // Add a change listener to get the selected color in this
        // JColorChooser component.
        colorChooser.getSelectionModel().addChangeListener(this);
        this.pack();
    }

    /**
     * Handles color selection in the JColorChooser component.
     *
     * @param e the ChangeEvent
     */
    public void stateChanged(ChangeEvent e) {
        // Get the selected color in the JColorChooser component
        // and print the color in RGB format to the console.
        Color color = colorChooser.getColor();
        System.out.println("color = " + color);
    }
}