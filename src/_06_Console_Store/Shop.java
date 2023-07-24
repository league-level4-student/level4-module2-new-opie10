package _06_Console_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;






public class Shop<Products extends Object> {
    private Products[] shelf;

    public Shop() {
    	shelf = (Products[]) new Shop[10];
    }

    // Adds an item to the cart
    public void add(Products item) {
        for (int i = 0; i < shelf.length; i++) {
			if (shelf[i]==null) {
				shelf[i]=item;
				System.out.println("Added "+item+" to your cart.");
				return;
			}
		}
    }
    public Products get(int i) {
		return shelf[i];
    	
    }
   

    public int length() {
        return shelf.length;
    }
}

