package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore extends Cart {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate. didnt use while loops and idk where id use ternarys 
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both. yup
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price. supposedly 
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out. everything but checkout
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */
	static Boolean checkout = false;
	Scanner scan = new Scanner(System.in);
	static Cart car = new Cart();
	static Shop<Object> shop = new Shop<Object>();
	static int total = 0;

	public static void main(String[] args) {
		int stipend = 100;

		Mouse mice = new Mouse();
		WaterBottle bottle = new WaterBottle();
		Bucket bucket = new Bucket();
		Bike bike = new Bike();
		Goggles goog = new Goggles();
		shop.add(mice);
		shop.add(goog);
		shop.add(bike);
		shop.add(bucket);
		shop.add(bottle);
		System.out.println("Welcome to Augie's shop of [INSERT CONTENTS HERE]!");
		begin(shop, car, stipend);
	}

	public static void begin(Shop s, Cart c, int stipend) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to manage your cart, or shop?");
		String cartman = scan.nextLine();
		if (cartman.equals("Manage") || cartman.equals("manage")) {
			manage(s, c, stipend);
		} else {
			System.out.println("What would you like to buy?");
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.get(i).name());
			}

			purchase(s, c, stipend);
			scan.close();
		}
	}

	public static void purchase(Shop s, Cart c, int stipend) {
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();

		for (int i = 0; i < s.length(); i++) {

			if (item.equals(s.get(i).name())) {

				System.out.println("You have selected " + s.get(i).name() + ". \n This item costs "
						+ s.get(i).getPrice() + ". \n Continue?");
				String continu = scan.nextLine();
				if (continu.equals("Yes") || continu.equals("yes") || continu.equals("YES")) {
					total = total + s.get(i).getPrice();
					car.add(s.get(i), s.get(i).name());

					spend(s, car, stipend);
				} else {
					begin(s, car, stipend);
				}
			}

		}
		scan.close();
		// TODO Auto-generated method stub
	}

	public static void spend(Shop shop, Cart car, int stipend) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Would you like to continue shopping?");
		String shopping = scan.nextLine();
		if (shopping.equals("Yes") || shopping.equals("yes") || shopping.equals("YES")) {
			begin(shop, car, stipend);
		} else {
			checkout(shop, car, stipend, total);

		}
		scan.close();
	}

	public static void checkout(Shop shop, Cart car, int stipend, int total) {
		// TODO Auto-generated method stub

	}

	public static void manage(Shop shop, Cart car, int stipend) {
		Scanner scan = new Scanner(System.in);
		String exit = scan.nextLine();
		System.out.println("Welcome to your cart management!");
		System.out.println("Type Exit whenever you like to return to shopping.");
		if (car.length() > 0) {

			System.out.println("Your cart's contents are currently:");
			car.showCart();
			System.out.println("Would you like to remove items or checkout? (Exit to return to shopping)");
			 exit = scan.nextLine();
			String rem = scan.nextLine();
			if (rem.equals("remove") || rem.equals("Remove")) {
				System.out.println("What item wold you like to remove?");
				String rItem = scan.nextLine();
				for (int i = 0; i < car.length(); i++) {
					if (rItem.equals(car.get(i).name())) {
						total= total-car.get(i).getPrice();
						car.remove(car.get(i));
						spend(shop,car,stipend);
					}
				}
			}
			if (rem.equals("checkout") || rem.equals("Checkout")) {
				checkout(shop,car,stipend,total);
			}
		} else {
			System.out.println("Your cart is currently empty. Type Exit to return to shopping");
			exit = scan.nextLine();
		}
		if (exit.equals("Exit") || exit.equals("exit")) {
			begin(shop, car, stipend);
		}
		scan.close();
	}
}
