import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jcolor extends  JFrame implements ActionListener {
    JButton btn;
    JLabel label;
    private JPanel panel1;

    Jcolor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        label = new JLabel("Eliga el color del texto");
        label.setFont(new Font("Consolas",Font.BOLD,18));
        label.setBackground(Color.white);
        label.setOpaque(true);

        btn= new JButton("Cambie el color");

        this.add(btn);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            JColorChooser colorChooser = new JColorChooser();
            Color mi_color= JColorChooser.showDialog(null,"Cambie el color",Color.white);

            label.setForeground(mi_color);
        }
    }
}
