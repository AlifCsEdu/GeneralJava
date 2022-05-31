import javax.swing.*;

public class RectangleProgramone extends JFrame{
    private static final int width = 800;
    private static final int height = 600;

    public RectangleProgramone()
    {
        setTitle("Area and Perimeter of a Rectangle");
        setSize(width, height);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        RectangleProgramone test = new RectangleProgramone();
    }
}
