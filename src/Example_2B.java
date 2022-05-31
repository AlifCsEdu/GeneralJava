import javax.swing.*;
public class Example_2B
{
    public static void main(String[] args){
        String str;
        double length;
        double width;
        double perimeter;
        double area;

        str = JOptionPane.showInputDialog("Enter the lenght of the Rectangle: ");

        length = Double.parseDouble(str);

        str = JOptionPane.showInputDialog("Enter the width of the rectangle: ");

        width = Double.parseDouble(str);

        area = length * width;
        perimeter = 2 * (length + width);

        JOptionPane.showMessageDialog(null,"Area: " + area +"\nPerimeter:" + perimeter);

        System.exit(0);
    }
}
