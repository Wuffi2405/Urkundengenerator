import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RessourceLoader {
	
private static BufferedImage image;
	
	public static BufferedImage loadImage(String path){
		try {
			image = ImageIO.read(RessourceLoader.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	
}
