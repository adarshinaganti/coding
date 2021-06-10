import java.awt.event.*;
import javax.swing.*;


public class GUI implements ActionListener{
    private static JFrame frame = new JFrame();
    private static JLabel username = new JLabel();
    private static JLabel password = new JLabel();
    private static JLabel success = new JLabel();
    private static JPanel panel = new JPanel();
    private static JButton button = new JButton();
    private static JTextField usernameText = new JTextField();
    private static JPasswordField passwordText = new JPasswordField();
    
    public static void main(String[] args){
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        username = new JLabel("User");
        username.setBounds(10, 20, 80, 25);
        panel.add(username);
        
        usernameText = new JTextField(20);
        usernameText.setBounds(100, 20, 165, 25);
        panel.add(usernameText);

        password = new JLabel("Password");
        password.setBounds(10, 50, 80, 25);
        panel.add(password);

        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0){
        String user = usernameText.getText();
        String pwd = passwordText.getText();

        if(user.equals("adarsh") && pwd.equals("adarsh")){
            success.setText("Login successful");
        }

        else{
            success.setText("Invalid username or password");
        }
    }
}