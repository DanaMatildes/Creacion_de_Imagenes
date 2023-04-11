package read;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Sunset {
	static int width = 450;
	static int height = 750;
	
	static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    private final static int PIXEL_SIZE = 30;
    
    static Color sand = new Color(133,115,76);
    static Color darkBlue = new Color(92,95,104);
    static Color sea = new Color(83,98,131);
    static Color sunsetOrange = new Color(223,113,38);
    static Color orangeTwo = new Color (197,108,52);
    static Color orangeThree = new Color(182,107,65);
    static Color orangeFour = new Color(162,105,76);
    static Color orangeFive = new Color(144,104,94);
    static Color orangeSix = new Color(127,102,106);
    static Color skyOne = new Color(112,101,118);
    static Color skyTwo = new Color(107,111,138);
    static Color skyThree = new Color(101,106,138);
    static Color sky = new Color(91,100,139);
    static Color reflection = new Color(235,174,78);
    static Color darkSea = new Color(70,82,108);
    static Color darkBrown = new Color(130,100,74);
    
    public static void paint() {
    	
    	paintSquare(0, 13, 15, 21, sea);
    	paintSquare(0, 20, 15, 24, sand);
    	drawHorizontalLine(4, 8, 22, darkBlue);
    	drawHorizontalLine(2, 3, 21, darkBlue);
    	drawHorizontalLine(11, 14, 20, darkBlue);
    	paintPixel(0, 19, darkBlue);
    	paintPixel(1, 20, darkBlue);
    	paintPixel(9, 21, darkBlue);
    	paintPixel(10, 21, darkBlue);
    	paintPixel(10, 20, darkBlue);
    	
    	drawHorizontalLine(2, 9, 20, sea);
    	drawHorizontalLine(4, 8, 21, sea);
    	drawHorizontalLine(0, 15, 12, sea);
    	drawHorizontalLine(1, 15, 11, sea);
    	
    	drawHorizontalLine(3, 9, 12, sunsetOrange);
    	drawHorizontalLine(0, 11, 11, sunsetOrange);
    	drawHorizontalLine(0, 14, 10, orangeTwo);
    	drawHorizontalLine(0, 14, 9, orangeTwo);
    	drawHorizontalLine(0, 14, 8, orangeThree);
    	drawHorizontalLine(0, 14, 7, orangeFour);
    	drawHorizontalLine(0, 14, 6, orangeFive);
    	drawHorizontalLine(0, 14, 5, orangeSix);
    	drawHorizontalLine(0, 14, 4, skyOne);
    	drawHorizontalLine(0, 14, 3, skyTwo);
    	drawHorizontalLine(0, 14, 2, skyThree);
    	paintSquare(0, 0, 15, 3, sky);
    	g.setColor(new Color(250,187,80));
    	g.fillOval(4*PIXEL_SIZE, 10*PIXEL_SIZE, 3*PIXEL_SIZE, 3*PIXEL_SIZE);
    	paintPixel(1, 14, darkSea);
    	drawHorizontalLine(2, 3, 15, darkSea);
    	drawHorizontalLine(13, 14, 16, darkSea);
    	paintPixel(14, 14, darkSea);
    	paintPixel(4, 16, darkSea);
    	paintPixel(4, 19, darkSea);
    	drawHorizontalLine(5, 7, 20, darkSea);
    	paintPixel(9, 18, darkSea);
    	drawHorizontalLine(10, 11, 17, darkSea);
    	drawHorizontalLine(11, 12, 13, darkSea);
    	paintPixel(13, 12, darkSea);
    	paintPixel(14, 12, darkSea);
    	drawHorizontalLine(1, 2, 18, darkSea);
    	paintPixel(0, 17, darkSea);
    	drawHorizontalLine(7, 8, 15, darkSea);
    	paintPixel(9, 14, darkSea);
    	
    	paintPixel(0, 22, darkBrown);
    	paintPixel(1, 23, darkBrown);
    	paintPixel(10, 23, darkBrown);
    	paintPixel(12, 24, darkBrown);
    	paintPixel(14, 21, darkBrown);
    	drawHorizontalLine(12, 13, 21, darkBrown);
    	drawHorizontalLine(3, 4, 24, darkBrown);
    	paintPixel(6, 23, darkBrown);
    	
    	try {       
            ImageIO.write(image, "jpg", new File("sunset.jpg"));
            System.out.println("Imagen creada :)!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
   ///MÉTODOS///
    private static void paintSquare(int a, int x, int b, int y, Color c) {
    	for(int j=x; j<y; j++) {
    	for(int i=a; i<b; i++) {
    		 g.setColor(c);
             g.fillRect(i*PIXEL_SIZE, x*PIXEL_SIZE, PIXEL_SIZE, j*PIXEL_SIZE);
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
    
    ///MAIN///
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}
