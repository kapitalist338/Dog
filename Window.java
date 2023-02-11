import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JTextField tf;
    JTextField TF;
    JTextField pass;
    private static String text;
    private static String dogAge;
    private static String MasterName;
    private static final String textField1 = "Dog name";
    private static final String tf1 = "Dog age";
    private static final  String TF1 = "Your name";
    private static final String password = "britain";
    private static final String password1 = "Britain";
    private static String word;
    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Enter your name: ");
        this.pack();
        Label label = new Label("Enter your dog's name and age and ur name!");
        this.setBounds(200,200,300,200);
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,20));
        textField.setForeground(new Color(23, 188, 23));
        // 34 239 34
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setCaretColor(new Color(23,188,23));
        textField.setText(textField1);
        tf = new JTextField();
        tf.setForeground(new Color(34,139,34));
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setCaretColor(new Color(34,139,34));
        tf.setText(tf1);
        TF = new JTextField();
        TF.setForeground(new Color(34,139,34));
        TF.setBackground(Color.LIGHT_GRAY);
        TF.setCaretColor(new Color(34,139,34));
        TF.setText(TF1);
        pass = new JPasswordField();
        pass.setCaretColor(Color.BLACK);
        pass.setForeground(Color.PINK);
        pass.setPreferredSize(new Dimension(250,20));
        button = new JButton("Submit");
        button.setBounds(300, 100, 100,50);
        button.addActionListener(this);
        this.add(label);
        this.add(textField);
        this.add(tf);
        this.add(TF);
        this.add(pass);
        tf.setPreferredSize(new Dimension(250,20));
        TF.setPreferredSize(new Dimension(250,20));
        this.add(button);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            word = pass.getText();
            if(word.equals(password) || word.equals(password1)) {
                System.out.println("Its working!");
                text = textField.getText();
                dogAge = tf.getText();
                MasterName = TF.getText();
                JLabel lab2 = new JLabel("Your name is: " + MasterName);
                JLabel DogLab = new JLabel("YOUR DOG!!!");
                DogLab.setSize(280, 280);
                lab2.setSize(280, 280);
                System.out.println(text);
                JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setTitle("Doggy");
                JLabel lab = new JLabel("\t\t\t Your doggy is: " + text);
                JLabel lab1 = new JLabel("Your dos age are:" + dogAge);
                lab.setSize(250, 250);
                lab1.setSize(250, 250);
                frame.setSize(200, 300);
                frame.setLayout(new FlowLayout());
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.add(DogLab);
                frame.add(lab2);
                frame.add(lab);
                frame.add(lab1);
            } else{
                JFrame f = new JFrame();
                f.setSize(500,300);
                f.getContentPane().setBackground(Color.BLACK);
                JLabel errorLab = new JLabel("Error incorrect password!");
                errorLab.setBounds(100,100,500,300);
                errorLab.setFont(new Font("Arial", Font.PLAIN, 40));
                errorLab.setVerticalTextPosition(JLabel.TOP);
                errorLab.setHorizontalTextPosition(JLabel.CENTER);
                errorLab.setForeground(Color.RED);
                f.add(errorLab);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                f.setVisible(true);
            }
        }
    }
}
