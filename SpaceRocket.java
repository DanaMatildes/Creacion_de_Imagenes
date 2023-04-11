package read;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class SpaceRocket {
	static int width = 600;
	static int height = 780;
	
	static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    private final static int PIXEL_SIZE = 30;
    
    static Color blue = new Color(30, 63, 112);
    static Color gray = new Color(103,110,105);
    static Color darkGray = new Color(177,176,182);
    static Color lightGray = new Color(215,215,217);
    static Color white = new Color(251,253,254);
    static Color red = new Color(221,7,18);
    static Color cream = new Color(255,249,211);
    static Color yellow = new Color(246,197,17);
    static Color orange = new Color(229,80,47);
    static Color lightPink = new Color(254,205,203);
    static Color blueBoy = new Color(122,190,218);
    static Color babyBlue = new Color(189,235,249);
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);
    	drawSquareGrid(PIXEL_SIZE, Color.white);
    	
    	drawHorizontalLine(9, 10, 0, Color.black);
    	drawVerticalLine(1, 2, 8, Color.black);
    	drawVerticalLine(1, 2, 11, Color.black);
    	drawVerticalLine(2, 3, 7, Color.black);
    	drawVerticalLine(2, 3, 12, Color.black);
    	drawVerticalLine(3, 4, 6, Color.black);
    	drawVerticalLine(3, 4, 13, Color.black);
    	drawVerticalLine(4, 6, 5, Color.black);
    	drawVerticalLine(4, 6, 14, Color.black);
    	drawVerticalLine(7, 14, 4, Color.black);
    	drawVerticalLine(7, 14, 15, Color.black);
    	drawVerticalLine(14, 15, 5, Color.black);
    	drawVerticalLine(14, 15, 14, Color.black);
    	drawVerticalLine(15, 17, 6, Color.black);
    	drawVerticalLine(15, 17, 13, Color.black);
    	drawVerticalLine(17, 18, 7, Color.black);
    	drawVerticalLine(17, 18, 12, Color.black);
    	drawVerticalLine(18, 19, 8, Color.black);
    	drawVerticalLine(18, 19, 11, Color.black);
    	drawHorizontalLine(8, 11, 19, Color.black);
    	drawVerticalLine(16, 20, 2, Color.black);
    	drawVerticalLine(16, 20, 17, Color.black);
    	paintPixel(3, 15, Color.black);
    	paintPixel(16, 15, Color.black);
    	paintPixel(6, 19, Color.black);
    	paintPixel(13, 19, Color.black);
    	drawVerticalLine(21, 22, 3, Color.black);
    	drawVerticalLine(21, 22, 16, Color.black);
    	drawVerticalLine(20, 22, 5, Color.black);
    	drawVerticalLine(20, 22, 14, Color.black);
    	drawVerticalLine(22, 23, 4, Color.black);
    	drawVerticalLine(22, 23, 15, Color.black);
    	drawHorizontalLine(12, 13, 5, gray);
    	drawVerticalLine(5, 7, 13, gray);
    	drawVerticalLine(7, 13, 14, gray);
    	paintPixel(13, 14, gray);
    	drawVerticalLine(15, 16, 12, gray);
    	paintPixel(11, 17, gray);
    	paintPixel(10, 18, gray);//
    	drawVerticalLine(6, 8, 12, darkGray);
    	drawVerticalLine(8, 13, 13, darkGray);
    	paintPixel(12, 14, darkGray);
    	drawVerticalLine(15, 16, 11, darkGray);
    	paintPixel(10, 17, darkGray);
    	paintPixel(9, 18, darkGray);
    	drawVerticalLine(7, 13, 5, lightGray);
    	drawVerticalLine(5, 14, 6, lightGray);
    	drawVerticalLine(5, 9, 7, lightGray);
    	drawVerticalLine(12, 16, 7, lightGray);
    	drawVerticalLine(6, 8, 8, lightGray);
    	drawVerticalLine(13, 17, 8, lightGray);
    	drawVerticalLine(6, 7, 9, lightGray);
    	drawVerticalLine(14, 17, 9, lightGray);
    	drawVerticalLine(6, 7, 10, lightGray);
    	drawVerticalLine(14, 16, 10, lightGray);
    	drawVerticalLine(6, 8, 11, lightGray);
    	drawVerticalLine(13, 14, 11, lightGray);
    	paintPixel(12, 9, lightGray);
    	drawVerticalLine(12, 13, 12, lightGray);
    	drawVerticalLine(10, 11, 7, red);
    	drawVerticalLine(10, 11, 12, red);
    	drawHorizontalLine(9, 10, 8, red);
    	drawHorizontalLine(9, 10, 13, red);
    	paintPixel(8, 9, red);
    	paintPixel(11, 9, red);
    	paintPixel(8, 12, red);
    	paintPixel(11, 12, red);
    	drawHorizontalLine(9, 10, 13, red);
    	drawHorizontalLine(9, 10, 1, red);
    	drawHorizontalLine(10, 11, 3, red);
    	drawHorizontalLine(9, 12, 4, red);
    	drawHorizontalLine(8, 11, 5, red);
    	paintPixel(10, 2, red);
    	paintPixel(8, 3, red);
    	paintPixel(7, 4, red);
    	drawVerticalLine(16, 20, 3, red);
    	drawVerticalLine(15, 22, 4, red);
    	drawVerticalLine(16, 19, 5, red);
    	paintPixel(6, 18, red);
    	drawVerticalLine(16, 20, 16, red);
    	drawVerticalLine(15, 22, 15, red);
    	drawVerticalLine(16, 19, 14, red);
    	paintPixel(13, 18, red);
    	drawHorizontalLine(9, 10, 20, cream);
    	drawHorizontalLine(9, 10, 21, cream);
    	drawVerticalLine(20, 22, 8, yellow);
    	drawVerticalLine(20, 22, 11, yellow);
    	drawVerticalLine(22, 23, 9, yellow);
    	drawVerticalLine(22, 23, 10, yellow);
    	paintPixel(8, 23, orange);
    	paintPixel(11, 23, orange);
    	drawHorizontalLine(9, 10, 24, orange);
    	drawVerticalLine(2, 3, 9, lightPink);
    	paintPixel(8, 4, lightPink);
    	drawVerticalLine(10, 11, 8, blueBoy);
    	paintPixel(9, 9, blueBoy);
    	drawVerticalLine(10, 12, 9, babyBlue);
    	drawVerticalLine(9, 11, 10, babyBlue);
    	paintPixel(11, 10, babyBlue);
    	
    	
    	try {       
            ImageIO.write(image, "jpg", new File("Space Rocket.jpg"));
            System.out.println("Imagen creada :)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    ////MÉTODOS////
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
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
    private static void paintPixel(int x, int y, Color c) {
    	g.setColor(c);
    	g.fillRect(x* PIXEL_SIZE, y* PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
    }
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    
    ////MAIN////
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }

}
