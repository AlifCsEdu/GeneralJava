import javax.swing.*;
import java.awt.*;
class FrameDemo1 extends JFrame{

    FrameDemo1(String title){

        super(title);

        Container pane = getContentPane();

        JButton b = new JButton("Hello");
        pane.add(b, BorderLayout.WEST);

        b = new JButton("Goodbye");
        pane.add (b, BorderLayout.EAST);

        setSize(200,100);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String[] args) {
        FrameDemo1 lah = new FrameDemo1("Greetings");
    }
}
