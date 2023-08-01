package _06_Console_Store;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;






public class Shop<T extends Object> {
	private ArrayList<Object> shop ;

    @SuppressWarnings("unchecked")
	public Shop() {
        shop = new ArrayList<Object>();
    }

    // Adds an item to the shop
    public void add(T item) {
        	
				shop.add(item);
				
				
			
		
    }
    public Products get(int i) {
    
    	
		return (Products) shop.get(i);
    	
    }
    // Displays everything currently in the shop
   

    public int length() {
        return shop.size();
    }
}

