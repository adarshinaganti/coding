import java.awt.*; // AWT is also required
import javax.swing.*; // Importing Swing

public class Frame{
    private static JFrame frame = new JFrame(); // Creates frame
    public static void main(String[] args){
        // JFrame = A GUI window to add components to
        frame.setTitle("Sample"); // Sets title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits on hitting close button
        frame.setResizable(false); // Prevents frame from being resized
        frame.setSize(420, 420); // Syntax: frame.setSize(x, y);
        frame.setVisible(true); // Makes frame visible

        ImageIcon image = new ImageIcon("vscode.jpeg"); // Create an Image Icon
        frame.setIconImage(image.getImage()); // Change icon
        frame.getContentPane().setBackground(new Color(123, 50, 250)); // Syntax: frame.getContentPane().setBackground(new Color(r, g, b)); or new Color(0xhex);
    }
}