import javax.swing.*;

public class Example_1B {
    public static void main(String[] args)
    {
        String str; String name; int id; double cgpa;

        str = JOptionPane.showInputDialog("Enter Your Name : ");
        name = str;

        str = JOptionPane.showInputDialog("Enter Your ID Number (Without COV) : ");
        id = Integer.parseInt(str);

        str = JOptionPane.showInputDialog("Enter your cgpa for this sem : ");
        cgpa = Double.parseDouble(str);

        JOptionPane.showMessageDialog(null, "My name: "+name+"\nMy ID Number :" +id+"\nMy CGPA :" +cgpa);
        System.exit(0);

    }
}
