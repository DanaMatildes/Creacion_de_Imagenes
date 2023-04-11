package read;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Sandia {
	static int width = 600;
	static int height = 600;
	
	static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    private final static int PIXEL_SIZE = 40;
    
    static Color green = new Color(10,143,54);
    static Color pink = new Color(244,171,178);
    static Color lightGreen = new Color(145,194,31);
    
    public static void paint() {
    	
    	drawBackground(PIXEL_SIZE, Color.white);
    	paintPixel(1, 11, green);
    	paintPixel(2, 12, green);
    	paintPixel(11, 1, green);
    	paintPixel(12, 2, green);
    	paintPixel(12, 9, green);
    	drawHorizontalLine(3, 8, 13, green);
    	drawHorizontalLine(9, 10, 12, green);
    	drawHorizontalLine(10, 11, 11, green);
    	drawHorizontalLine(11, 12, 10, green);
    	drawVerticalLine(3, 8, 13, green);
    	drawHorizontalLine(2, 3, 10, pink);
    	drawHorizontalLine(3, 8, 11, pink);
    	drawHorizontalLine(8, 9, 10, pink);
    	drawVerticalLine(8, 9, 10, pink);
    	drawVerticalLine(2, 3, 10, pink);
    	drawVerticalLine(3, 8, 11, pink);
    	drawHorizontalLine(3, 8, 12, lightGreen);
    	paintPixel(1, 10, lightGreen);
    	paintPixel(2, 11, lightGreen);
    	paintPixel(9, 11, lightGreen);
    	paintPixel(10, 10, lightGreen);
    	paintPixel(11, 9, lightGreen);
    	paintPixel(10, 1, lightGreen);
    	paintPixel(11, 2, lightGreen);
    	drawVerticalLine(3, 8, 12, lightGreen);
    	drawHorizontalLine(4, 7, 10, Color.red);
    	drawHorizontalLine(2, 3, 9, Color.red);
    	drawHorizontalLine(5, 9, 9, Color.red);
    	drawHorizontalLine(3, 5, 8, Color.red);
    	drawHorizontalLine(7, 9, 8, Color.red);
    	drawHorizontalLine(4, 10, 7, Color.red);
    	drawHorizontalLine(5, 7, 6, Color.red);
    	drawHorizontalLine(9, 10, 6, Color.red);
    	drawHorizontalLine(6, 10, 5, Color.red);
    	drawHorizontalLine(7, 8, 4, Color.red);
    	paintPixel(10, 4, Color.red);
    	drawHorizontalLine(8, 9, 3, Color.red);
    	paintPixel(9, 2, Color.red);
    	paintPixel(4, 9, Color.black);
    	paintPixel(6, 8, Color.black);
    	paintPixel(8, 6, Color.black);
    	paintPixel(9, 4, Color.black);
    	
    	try {       
            ImageIO.write(image, "jpg", new File("watermelon.jpg"));
            System.out.println("Imagen creada :)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    private static void paintPixel(int x, int y, Color c) {
    	g.setColor(c);
    	g.fillRect(x* PIXEL_SIZE, y* PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
    }
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    private static void drawVerticalLine(int a, int b, int y, Color c){ //height en el q inicia, term, width
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(y * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}
