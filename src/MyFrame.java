import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("My Ugly Frame");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        MyFrame ntah = new MyFrame();
    }
}
