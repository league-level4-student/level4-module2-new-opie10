package _06_Console_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public abstract class Products {
	 String item;
	 	public abstract int getPrice();
	    public abstract JLabel getItem();
	    public abstract String name();
	    @SuppressWarnings("rawtypes")
	    public static ImageIcon loadImage(String fileName) {
	        try {
	            return new ImageIcon(ImageIO.read(new Cart().getClass().getResourceAsStream("images/"+fileName)));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}
