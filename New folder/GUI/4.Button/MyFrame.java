import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.AttributeSet.ColorAttribute;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){
        // ImageIcon icon = new ImageIcon("blue.png");
        ImageIcon icon2 = new ImageIcon("face.png");


        button = new JButton();
        button.setBounds(200, 100, 200, 50);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        // button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);
        button.setFont(new Font("Cosmic sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(200,150,400,300);
        label.setVisible(false);

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Click");
            // button.setEnabled(false);
            label.setVisible(true);
        }
        
    }
}
// public class MyFrame extends JFrame {
//     JButton button;
//     MyFrame(){
//         button = new JButton();
//         button.setBounds(200, 100, 100, 50);
//         button.addActionListener(e->System.out.println("Click"));

//         this.setSize(500,500);
//         this.setVisible(true);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(null);
//         this.add(button);
//         }
//     }

