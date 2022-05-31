import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame implements ActionListener
{
    private JLabel lblNum1, lblNum2, lblTotal;
    private JTextField txtNum1, txtNum2, txtTotal;
    private JButton btnCalc, btnExt;
    private Container cont;
    private FlowLayout layout;

    public FlowLayoutDemo(){
        super ("ADDITION");
        layout = new FlowLayout();

        cont = getContentPane();
        cont.setLayout(layout);

        lblNum1 = new JLabel ("Enter first number :");
        lblNum2 = new JLabel ("Enter second number:");
        lblTotal = new JLabel ("Total :");

        txtNum1 = new JTextField(7);
        txtNum2 = new JTextField(7);
        txtTotal = new JTextField(7);

        btnCalc = new JButton ("CALCULATE");
        btnExt = new JButton ("EXIT");

        cont.add (lblNum1);
        cont.add (txtNum1);
        cont.add (lblNum2);
        cont.add (txtNum2);
        cont.add (lblTotal);
        cont.add (txtTotal);
        cont.add(btnCalc);
        cont.add(btnExt);

        btnCalc.addActionListener (this);
        btnExt.addActionListener (this);
        setSize (250, 175);
        setVisible (true);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent e)
    {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt (txtNum2.getText());

        if (e.getSource() == btnCalc)
        {
            int total = num1 + num2;
            txtTotal.setText (" " + total);
        }
        else
            System.exit(0);
    }
    public static void main (String args[])
    {
        FlowLayoutDemo demo = new FlowLayoutDemo();
    }
}

