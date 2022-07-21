import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame(){
    // Frame --> import javax.swing.JFrame;
    // creates a frame
    this.setSize(420,420); // sets the size of frame
    this.setVisible(true); // make frame  visibile
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    this.setResizable(true);// prevent the frame from being resized
    this.setTitle("Frame"); // sets tittle of frame

    // // Image Icon -> import javax.swing.ImageIcon;
    ImageIcon image = new ImageIcon("New Folder/mario.png"); // create the imageIcon
    this.setIconImage(image.getImage()); // change icon of frame

    // // background -> import java.awt.Color;
    this.getContentPane().setBackground(Color.black); // change color of background
    // this.getContentPane().setBackground(new Color(123,50,250)); //other way to change color of background
    }
}
