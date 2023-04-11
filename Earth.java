package read;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Earth {
	
	static int width = 900;
	static int height = 600;
	
	static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    private final static int PIXEL_SIZE = 30;
    
    static Color green = new Color(169,206,92);
    static Color blue = new Color(13,145,170);
    static Color purple = new Color(93,45,93);
    static Color gray = new Color(167,168,166);
    

    public static void paint() {
    	drawHorizontalLine(4, 9, 0, purple);
    	drawHorizontalLine(5, 11, 1, purple);
    	drawHorizontalLine(7, 13, 2, purple);
    	drawHorizontalLine(8, 15, 3, purple);
    	drawHorizontalLine(10, 18, 4, purple);
    	drawHorizontalLine(13, 20, 5, purple);
    	drawHorizontalLine(15, 22, 6, purple);
    	drawHorizontalLine(17, 24, 7, purple);
    	drawHorizontalLine(19, 27, 8, purple);
    	drawHorizontalLine(24, 28, 9, purple);
    	drawHorizontalLine(26, 29, 10, purple);
    	drawHorizontalLine(28, 29, 11, purple);
    	
    	g.setColor(blue);
    	g.fillOval(8*PIXEL_SIZE, 3*PIXEL_SIZE, 14*PIXEL_SIZE, 14*PIXEL_SIZE);
    	
    	drawHorizontalLine(10, 13, 6, green);
    	drawHorizontalLine(9, 14, 7, green);
    	drawHorizontalLine(8, 13, 8, green);
    	drawHorizontalLine(8, 12, 9, green);
    	drawHorizontalLine(9, 12, 10, green);
    	paintPixel(10, 11, green);
    	drawHorizontalLine(12, 13, 11, green);
    	drawHorizontalLine(12, 14, 12, green);
    	drawHorizontalLine(13, 15, 13, green);
    	drawHorizontalLine(14, 15, 14, green);
    	paintPixel(14, 15, green);
    	paintPixel(17, 4, green);
    	drawHorizontalLine(16, 18, 5, green);
    	drawHorizontalLine(16, 20, 6, green);
    	drawHorizontalLine(17, 20, 7, green);
    	drawHorizontalLine(20, 21, 8, green);
    	drawHorizontalLine(18, 21, 9, green);
    	drawHorizontalLine(17, 21, 10, green);
    	drawHorizontalLine(17, 20, 11, green);
    	drawHorizontalLine(18, 20, 12, green);
    	drawHorizontalLine(18, 19, 13, green);
    	drawHorizontalLine(14, 15, 3, Color.white);
    	paintPixel(15, 16, Color.white);
    	
    	paintPixel(25, 1, gray);
    	paintPixel(28, 4, gray);
    	paintPixel(5, 12, gray);
    	paintPixel(1, 17, gray);
    	paintPixel(9, 1, gray);
    	paintPixel(27, 9, gray);
    	
    	paintPixel(3, 4, gray);
    	paintPixel(2, 5, gray);
    	paintPixel(3, 5, Color.white);
    	paintPixel(4, 5, gray);
    	paintPixel(3, 6, gray);
    	
    	paintPixel(25, 15, gray);
    	paintPixel(24, 16, gray);
    	paintPixel(25, 16, Color.white);
    	paintPixel(26, 16, gray);
    	paintPixel(25, 17, gray);
    	
    	try {       
            ImageIO.write(image, "jpg", new File("Earth.jpg"));
            System.out.println("Imagen creada :)");
        } catch (Exception e) {
            e.printStackTrace();
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
    
    ///MAIN///
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }

}
