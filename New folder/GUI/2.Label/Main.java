import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Main{
    public static void main(String[] args) {

        JLabel label = new JLabel(); // import javax.swing.JLabel;
        // Border border = BorderFactory.createLineBorder(Color.yellow,3);

        // Image
        // ImageIcon image = new ImageIcon("mario.png");
        // label.setIcon(image);

        // Label
        label.setText("Mario"); // set the text
        // label.setHorizontalTextPosition(JLabel.RIGHT); // set text Horizontal Left, Right and Center of ImageIcon
        // label.setVerticalTextPosition(JLabel.TOP); // set text Vertical to Top, Bottom and Center of ImageIcon

        label.setForeground(Color.BLACK);// set the font color of text 
        label.setFont(new Font("MS Arial",Font.BOLD,50)); // set the font of text 
        // label.setIconTextGap(5);// set the gap of text to image

        label.setBackground(Color.BLUE); // set background color
        label.setOpaque(true); // display the background color

        // label.setBorder(border); // sets border of lable (not image + text)
        label.setVerticalAlignment(JLabel.TOP); // set vertical position of icon+text with in label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal positon of icon+text with in label
        // label.setBounds(100,100,250,250); // set x,y postion with in frame as well

        // Frame
        JFrame frame = new JFrame();
        // frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        frame.add(label); // add label to frame
        // frame.pack(); // set frame according to component
    }
}