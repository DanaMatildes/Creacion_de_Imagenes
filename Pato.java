package read;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Pato {
	static int width = 800;
	static int height = 1000;
	
	static Color darkYellow = new Color(209, 148, 63);
	static Color yellow = new Color(241, 200, 74);
	static Color orange = new Color(235, 130, 49);
	static Color bone = new Color(253, 248, 226);
	static Color brick = new Color(202, 121, 55);
	static Color brightOrange = new Color(216, 101, 46);
	
	
	static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    private final static int PIXEL_SIZE = 40;
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white); 
    	drawSquareGrid(PIXEL_SIZE, Color.black);
    	paintSquare(9, 18, 0, 7, Color.black);
    	paintSquare(7, 20, 6, 3, Color.black);
    	drawHorizontalLine(9, 17, 8, Color.black);
    	drawHorizontalLine(8, 17, 9, Color.black);
    	paintSquare(8, 19, 10, 4, Color.black);
    	drawHorizontalLine(6, 18, 13, Color.black);
    	drawHorizontalLine(5, 17, 14, Color.black);
    	drawHorizontalLine(4, 16, 15, Color.black);
    	drawHorizontalLine(1, 18, 16, Color.black);
    	paintSquare(0, 19, 17, 3, Color.black);
    	drawHorizontalLine(1, 18, 19, Color.black);
    	drawHorizontalLine(2, 17, 20, Color.black);
    	drawHorizontalLine(3, 16, 21, Color.black);
    	drawHorizontalLine(5, 14, 22, Color.black);
    	drawHorizontalLine(5, 7, 23, Color.black);
    	drawHorizontalLine(12, 14, 23, Color.black);
    	paintPixel(10, 8, darkYellow);
    	drawHorizontalLine(11, 16, 8, yellow);
    	paintPixel(9, 9, darkYellow);
    	drawHorizontalLine(10, 16, 9, yellow);
    	paintPixel(9, 10, darkYellow);
    	drawHorizontalLine(10, 17, 10, yellow);
    	drawHorizontalLine(9, 10, 11, yellow);
    	drawHorizontalLine(13, 16, 11, yellow);
    	drawHorizontalLine(9, 10, 12, yellow);
    	drawHorizontalLine(13, 16, 12, orange);
    	drawHorizontalLine(9, 12, 13, yellow);
    	paintPixel(13, 13, darkYellow);
    	drawHorizontalLine(14, 16, 13, brightOrange);
    	paintPixel(17, 13, brick);
    	drawHorizontalLine(6, 13, 14, yellow);
    	drawHorizontalLine(14, 15, 14, darkYellow);
    	paintPixel(16, 14, brick);
    	drawHorizontalLine(5, 11, 15, yellow);
    	paintPixel(8, 13, bone);
    	paintPixel(9, 14, bone);
    	paintPixel(10, 15, bone);
    	paintPixel(14, 15, darkYellow);
    	drawHorizontalLine(4, 10, 16, yellow);
    	paintPixel(11, 16, bone);
    	drawVerticalLine(16, 19, 17, darkYellow);
    	paintPixel(1, 17, brick);
    	drawHorizontalLine(2, 3, 17, darkYellow);
    	drawHorizontalLine(4, 11, 17, yellow);
    	paintPixel(9, 17, darkYellow);
    	paintPixel(14, 17, darkYellow);
    	drawHorizontalLine(1, 2, 18, darkYellow);
    	paintPixel(3, 18, yellow);
    	drawHorizontalLine(6, 11, 18, yellow);
    	drawHorizontalLine(12, 17, 18, darkYellow);
    	paintPixel(8, 18, brick);
    	drawHorizontalLine(2, 5, 19, yellow);
    	drawHorizontalLine(8, 10, 19, yellow);
    	drawHorizontalLine(11, 17, 19, darkYellow);
    	drawHorizontalLine(3, 8, 20, yellow);
    	drawHorizontalLine(9, 15, 20, darkYellow);
    	paintPixel(16, 20, brick);
    	drawHorizontalLine(6, 7, 21, yellow);
    	drawHorizontalLine(8, 12, 21, darkYellow);
    	drawHorizontalLine(13, 14, 21, brick);
    
    	try {       
            ImageIO.write(image, "jpg", new File("pato.jpg"));
            System.out.println("Imagen creada :)!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
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
    private static void paintSquare(int a, int b, int x, int y, Color c) {
    	for(int j=0; j<y; j++) {
    	for(int i=a; i<b; i++) {
    		 g.setColor(c);
             g.fillRect(i*PIXEL_SIZE, x*PIXEL_SIZE, PIXEL_SIZE, j*PIXEL_SIZE);
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
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }

}
