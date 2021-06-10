import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Label {
    public static void main(String[] args){
        // JLabel = A display area for text, images or both
        
        ImageIcon image = new ImageIcon("/home/adarshinaganti/Downloads/hak.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text left, center or right to image
        label.setVerticalTextPosition(JLabel.TOP); // Set text top, bottom or right to image
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Inter", Font.PLAIN, 20));
        label.setIconTextGap(-25); // Set gap between text and image
        label.setBackground(Color.black); // Sets background color
        label.setOpaque(true); // Label should be opaque for background color
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
