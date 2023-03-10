package org.kodejava.swing;


import javax.swing.*;
import java.net.URL;

public class StillText extends JFrame {

    JEditorPane editor = new JEditorPane();

    public StillText() {

        URL url = getClass().getResource("/img/SMILE.jpg");

        setLayout(null); //Layout absoluto

        JEditorPane editor = new JEditorPane(); //Incilaizamos el editorPane
        editor.setContentType("text/html"); // Marcamos el editor para que use HTML

        // Insertamos un trozo de HTML
        editor.setText(
                "<b>hola</b><br>" +
                        "<i>adios</i><br>" +
                        "<font face='arial'>fuente arial</font><br>" +
                        "<font face='courier'>fuente courier</font><br>" +
                        "<font size='24'>fuente grande</font><br>" +
                        "<font color='red'>color rojo</font><br>" +
                        "<img src=" + url + " width=250 height=250></img>"
        );

        //Si sólo queremos mostrar texto HTML, debemos deshabilitar la edición del editor
        editor.setEditable(false);

        //Incializamos el scrollPane y le añadimos el editor
        JScrollPane scrollPane = new JScrollPane(editor);
        scrollPane.setBounds(50,50,300,300);
        add(scrollPane);

        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("StiloTexto"); //Título del JFrame
        setSize(400, 400); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new StillText();
    }
}
