import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Generator {
	
	private int imageWidth = 2480;
	private int imageHeight = 3508;
	
	private BufferedImage sidebar;
	
	
	public Generator() {
		System.out.println("[Generator-Constructor] start");
		
		sidebar = RessourceLoader.loadImage("side.png");
		
		System.out.println("[Generator-Constructor] end");
	}
	
	public void generateUrkunde() {
		
		/**
		 * Image und Editorebene initialisieren
		 */
		BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D editImage = image.createGraphics();
		
		editImage.setColor(Color.RED);
		editImage.fillRect(0, 0, imageWidth, imageHeight);
		
		editImage.setColor(Color.WHITE);
		editImage.fillRect(10, 10, imageWidth-20, imageHeight-20);
		
		editImage.drawImage(sidebar, 0, 0, sidebar.getWidth(), sidebar.getHeight(), null);
		
		editImage.dispose();
		
		//draw iamge
		File output = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\pic.png");
		try {
			ImageIO.write(image, "png", output);
			System.out.println("File created sucessfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
