package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
//		Cart<Candy> canCar = new Cart<Candy>();
//		// 3. Create another Cart object of type Cereal
//		Cart<Cereal> cerCar = new Cart<Cereal>();
//		// 4. Add a few items to EACH cart
//		Cereal c1 = new Cereal();
//		Cereal c2 = new Cereal();
//		Cereal c3 = new Cereal();
//		Candy can1 = new Candy();
//		Candy can2 = new Candy();
//		Candy can3 = new Candy();
//		
//		canCar.add(can1);
//		canCar.add(can2);
//		canCar.add(can3);
//		cerCar.add(c1);
//		cerCar.add(c2);
//		cerCar.add(c3);
//		cerCar.showCart();
//		canCar.showCart();
		
		
		// 5. Call the showCart() method on EACH cart
		
		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		Cart<Clothing> gc= new Cart <Clothing>();
		Cart<Toy> tc = new Cart <Toy>();
		Clothing clo1 = new Clothing();
		Clothing clo2 = new Clothing();
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		tc.add(t1);
		tc.add(t2);
		gc.add(clo1);
		gc.add(clo2);
		tc.showCart();
		gc.showCart();
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
