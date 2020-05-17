import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import static java.nio.file.Files.size;
import java.util.Scanner;

public class lingkaran1 extends JFrame {
    private static Object input;
    
    int sizeRecA = 0;
    int sizeRecB = 0;
    int sizeRecC = 0;
    int sizeRecD = 0;
    
    public lingkaran1(int A, int B, int C, int D){
        super ("DrawingRect");
        setSize (500,600);
        setVisible (true);
        
        size();
    }
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
    super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillRect(20, 100, 220, 50); 
        g.setColor(Color.blue);
        g.fillOval(25, 300, 220, 50);
    }
    
    
public static void main (String[] args){
    Lingkaran2 frame = new Lingkaran2();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Masukkan panjang");
    int p = input.nextInt();
    System.out.print("Masukkan lebar");
    int l = input.nextInt();
    System.out.println("Masukkan jari-jari");
    int l = input.nextInt();

    System.out.print(String.format("Area of Square = %d", a));

}

}
