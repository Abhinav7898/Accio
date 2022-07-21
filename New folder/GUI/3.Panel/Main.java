import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main{
    public static void main(String[] args) {

        // Jpanel = a GUI component that functions a container to hold other components
        JPanel saffronPanel = new JPanel();
        saffronPanel.setBackground(new Color(255, 153, 51));
        saffronPanel.setBounds(0, 0, 500,150);

        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("chakra.png");
        
        label.setIcon(icon);
        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(0,151, 500,150);
        label.setBounds(0, 0, 50, 50);
        

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(19, 136, 8));
        greenPanel.setBounds(0, 302, 500,150);


        JFrame frame = new JFrame();
        frame.setSize(501,455);
        frame.setLayout(null);
        frame.setVisible(true);
        // frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(saffronPanel);
        frame.add(whitePanel);
        whitePanel.add(label);
        frame.add(greenPanel);
    }
}