import java.util.Scanner;
public class nope {
	static int item;
	static int[] amount;
	static String[] names;
	static double[] prices;
	static int discount;
	static double discRate;
	static int[] func;
	static int choice;
	static double[] SubTotal;
	static double sub;
	static double total;
	static double discDollar;
	
	public static void Checkout(double sub, int discount, double discRate) {
		if (sub >= discount) {
			discDollar = sub * discRate;
			total = sub - discDollar;
		}
		System.out.println("Thanks for coming!");
		System.out.println("Subtotal: $" + sub);
		System.out.println("-Discount: $" + discDollar);
		System.out.println("Total: $" + total);
	}
	
	public static double ListItems(int [] amount, String [] names, double [] prices, int item) {
		for (int i = 0; i < item; i++) {
			System.out.println(amount[i] + " count of " + names[i] + " @ " + prices[i] + " = " + (amount[i] * prices[i]));
			SubTotal[i] += amount[i] * prices[i];
			sub = SubTotal[i];
		}
		return sub;
		
	}
	
	public static void Buy(Scanner input, String[] names, int item) {
		for (int i = 0; i < item; i++) {
			System.out.println("Enter the amount of " + names[i] + ":");
			amount [i] = input.nextInt();
		}	
		
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
		choice = input.nextInt();
		
		while (true) {
			if (choice >= 1 && choice <= 4) {
			if (choice == 1) {
			SetupShop(input);
			break;
			}
			
			else if (choice > 1 || choice <= 4) {
				System.out.println("Shop is not set up yet!");
				main(null);
				continue;
		}
		}
			if (choice < 1 || choice > 4) {
				System.out.println("Error: Do not know " + choice);
				main(null);
				continue;
			}
	}
}		
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		intro();
		
		final int max = 100000000;
		func = new int[max];
		
		for (int i = 0; i <= 4; i++) {
		System.out.println("This program supports 4 functions:");
		System.out.println("\t 1. Setup Shop");
		System.out.println("\t 2. Buy");
		System.out.println("\t 3. List Items");
		System.out.println("\t 4. Checkout");
		System.out.println("Please choose the function you want:");
		func[i] = input.nextInt();
	
	while (true) {
			if (func[i] >= 1 && func[i] <= 4){
				
			if (func[i] == 1) {
			SetupShop(input);
			break;
			}
			else if (func[i] > 1 && func[i] <= 4) {
				System.out.println("Shop is not set up yet!");
				main(null);
				continue;
			}
		}
			if (func[i] < 1 || func[i] > 4) {
				System.out.println("Error: Do not know " + func[i]);
				main(null);
				continue;
			}
	}
	
			main(null);
			while (true) {
				if (func[i] >= 1 && func[i] <= 4){
					
				if (func[i] == 1) {
				SetupShop(input);
				main(null);
				continue;
				}
				if (func[i] == 2) {
					Buy(input,names,item);
					break;
				}
				if (func[i] == 3) {
					System.out.println("Try again: You have not bought anything");
					main(null);
					continue;
				}
				if (func[i] == 4) {
					System.out.println("Try again: You have not bought anything");
					main(null);
					continue;
				}
				}
				if (func[i] < 1 || func[i] > 4) {
					System.out.println("Error: Do not know " + func[i]);
					main(null);
					continue;
				}
		}
			main(null);
			while (true) {
				if (func[i] >= 1 && func[i] <= 4){
					
				if (func[i] == 1) {
				SetupShop(input);
				main(null);
				continue;
				}
				if (func[i] == 2) {
					Buy(input,names,item);
					main(null);
					continue;
				}
				if (func[i] == 3) {
					ListItems(amount,names,prices,item);
					break;
				}
				if (func[i] ==4) {
					System.out.println("You have not listed your items yet!");
					main(null);
					continue;
				}
			}
				if (func[i] < 1 || func[i] > 4) {
					System.out.println("Error: Do not know " + func[i]);
					main(null);
					continue;
	}
			
}
			main(null);
			while (true) {
				if (func[i] >= 1 && func[i] <= 4){
					
				if (func[i] == 1) {
				SetupShop(input);
				main(null);
				continue;
				}
				if (func[i] == 2) {
					Buy(input,names,item);
					main(null);
					continue;
				}
				if (func[i] == 3) {
					ListItems(amount,names,prices,item);
					main(null);
					continue;
	}
				if (func[i] == 4) {
					Checkout(sub,discount,discRate);
					break;
				}
	}	
				if (func[i] < 1 || func[i] > 4) {
					System.out.println("Error: Do not know " + func[i]);
					main(null);
					continue;
}
			}
		}
	}
}