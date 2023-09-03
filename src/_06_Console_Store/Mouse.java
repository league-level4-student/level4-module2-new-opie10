package _06_Console_Store;

import javax.swing.JLabel;

public class Mouse extends Products {
	
	@Override
	public JLabel getItem() {
		this.item = "images.jpg";
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Mouse";
	}

}
