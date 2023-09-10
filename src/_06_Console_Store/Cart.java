package _06_Console_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;






public class Cart {
    private Products[] cart;

    @SuppressWarnings("unchecked")
	public Cart() {
        cart = (Products[]) new Products[5];
    }

    // Adds an item to the cart
    public void add(Products item, String name) {
        for (int i = 0; i < cart.length; i++) {
			if (cart[i]==null) {
				cart[i]=item;
				System.out.println("Added "+name+" to your cart.");
				return;
			}
		}
    }
    public void remove(Products item) {
        for (int i = 0; i < cart.length; i++) {
			if (cart[i]==item) {
				cart[i]=null;
				System.out.println("Removed item from your cart.");
				return;
			}
		}
    }
public String getName(int i) {
	 if (cart[i] != null) {
	        return cart[i].name();
	    }
	    return null;
    	
    }
public Products get(int i) {
    
	
	return cart[i];
	
}
    // Displays everything currently in the cart
    public void showCart() {
    	   JFrame frame = new JFrame();
           JPanel panel = new JPanel();
           frame.add(panel);
           frame.setVisible(true);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           for (int i = 0; i < cart.length; i++) {
               if (cart[i] != null) {
                   panel.add(((Products) cart[i]).getItem());
               }
           }
           frame.pack();

       

    }
   

    public int length() {
        return cart.length;
    }
}

