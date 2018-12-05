import java.util.Scanner;

public class shop {

	static int item;
	static int[] amount;
	static String[] names;
	static double[] prices;
	static int discount;
	static double discRate;
	static int func;
	static int choice;
	static double sub;
	static double total;
	static double discDollar;

	public static void Checkout(double sub, int discount, double discRate) {
		if (sub >= discount) {
			discDollar = sub * discRate;
			total = sub - discDollar;
		}
		else total = sub;
		System.out.println("Thanks for coming!");
		System.out.println("Subtotal: $" + sub);
		System.out.println("-Discount: $" + discDollar);
		System.out.println("Total: $" + total);
	}

	public static double ListItems(int [] amount, String [] names, double [] prices, int item) {
		for (int i = 0; i < item; i++) {
			System.out.println(amount[i] + " count of " + names[i] + " @ " + prices[i] + " = " + (amount[i] * prices[i]));
			sub += amount[i] * prices[i];
			
		}
		intro();
		return sub;

	}

	public static void Buy(Scanner input, String[] names, int item) {
		for (int i = 0; i < item; i++) {
			System.out.println("Enter the amount of " + names[i] + ":");
			amount [i] = input.nextInt();
		}	
		intro();
	}


	public static int SetupShop(Scanner input) {
		System.out.println("Please enter the number of items: ");
		item = input.nextInt();

		amount = new int[item];
		names = new String[item];
		prices = new double[item];

		for(int i = 0; i < item; i++) {
			System.out.println("Enter name of product " + i + ":" );
			names[i] = input.next();
			System.out.println("Enter price of product " + i + ":");
			prices[i] = input.nextDouble();
		}

		System.out.println("Please enter the amount to qualify for discount: ");
		discount = input.nextInt();

		System.out.println("Please enter the discount rate (0.1 for 10%): ");
		discRate = input.nextDouble();

		intro();
		return item;

	}

	public static void intro() {
		Scanner input = new Scanner(System.in);

		System.out.println("This program supports 4 functions:");
		System.out.println("\t 1. Setup Shop");
		System.out.println("\t 2. Buy");
		System.out.println("\t 3. List Items");
		System.out.println("\t 4. Checkout");
		System.out.println("Please choose the function you want:");
		func = input.nextInt();
	}

	public static void Legend(Scanner input) {
		while (true) {
			if (func >= 1 || func <= 4) {

				if (func == 1) {
					SetupShop(input);
					break;
				}

				else if (func > 1 && func <= 4){
					System.out.println("You have not set up shop yet!");
					intro();
					continue;
				}
			}
			if (func < 1 || func > 4){
				System.out.println("Do not know " + func);
				intro();
				continue;
			}
		}


		while (true) {

			if (func >= 1 && func <= 4) {

				if (func == 1) {
					SetupShop(input);
					intro();
					continue;
				}
				if (func == 2) {
					Buy(input,names,item);
					break;
				}

				if (func == 3) {
					System.out.println("You have not bought anything yet!");
					intro();
					continue;
				}

				if (func == 4) {
					System.out.println("You have not bought anything yet!");
					intro();
					continue;
				}
			}
			if (func < 1 || func > 4) {
				System.out.println("Do not know " + func);
				intro();
				continue;
			}
		}




		while (true) {

			if (func >= 1 || func <= 4) {
				if (func == 1) {
					SetupShop(input);
					intro();
					continue;
				}
				if (func == 2) {
					Buy(input,names,item);
					intro();
					continue;
				}

				if (func == 3) {
					ListItems(amount,names,prices,item);
					break;
				}

				if (func == 4) {
					System.out.println("You have not listed anything yet!");
					intro();
					continue;
				}

			}

			if (func < 0 || func > 4) {
				System.out.println("Do not know " + func);
				intro();
				continue;
			}
		}



		while (true) {

			if (func >= 1 || func <= 4) {
				if (func == 1) {
					SetupShop(input);
					intro();
					continue;
				}
				if (func == 2) {
					Buy(input,names,item);
					intro();
					continue;
				}

				if (func == 3) {
					ListItems(amount,names,prices,item);
					intro();
					continue;
				}

				if (func == 4) {

					Checkout(sub,discount,discRate); 
					break;
				}

			}

			if (func < 0 || func > 4) {
				System.out.println("Do not know " + func);
				intro();
				continue;
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		intro();
		Legend(input);
	}
}

