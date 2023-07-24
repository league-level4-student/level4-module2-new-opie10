package _06_Console_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;






public class Cart<T extends Object> {
    private T[] cart;

    public Cart() {
        cart = (T[]) new Cart[5];
    }

    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
			if (cart[i]==null) {
				cart[i]=item;
				System.out.println("Added "+item+" to your cart.");
				return;
			}
		}
    }
    public void remove(T item) {
        for (int i = 0; i < cart.length; i++) {
			if (cart[i]==item) {
				cart[i]=null;
				System.out.println("Removed "+item+" from your cart.");
				return;
			}
		}
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

