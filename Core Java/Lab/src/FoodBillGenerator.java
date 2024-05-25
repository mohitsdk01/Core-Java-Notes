import java.util.*;
class FoodBillGenerator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int price = 0;
			int quantity = 0;
			int count = 0;
			System.out.println("Welcome To Cafeteria... ");
			while(true){
				System.out.println("Enter Following Numbers for Food: \n Dosa: 1=> 50 \n Samosa: 2=> 20 \n Idli: 3=> 50 \n Maggi: 4=> 40 \n Kachori: 5=> 20 \n Wadapav: 6=> 20 \n Pizza: 7=> 150 \n Pasta: 8=> 80 \n Dhokla: 9=> 60");
				System.out.println("Enter Menu choice: ");
				int choice = sc.nextInt();
				do{
					switch(choice){
						case 1:
							System.out.println("You entered Dosa.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 50 * quantity;
							break;
						case 2:
							System.out.println("You entered Samosa.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 20 * quantity;
							break;
						case 3:
							System.out.println("You entered Idli.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 50 * quantity;
							break;
						case 4:
							System.out.println("You entered Maggi.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 40 * quantity;
							break;
						case 5:
							System.out.println("You entered Kachori.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 20 * quantity;
							break;
						case 6:
							System.out.println("You entered Wadapav.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 20 * quantity;
							break;
						case 7:
							System.out.println("You entered Pizza.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 150 * quantity;
							break;
						case 8:
							System.out.println("You entered Pasta.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 80 * quantity;
							break;
						case 9:
							System.out.println("You entered Dhokla.");
							System.out.print("Enter Quantity: ");
							quantity = sc.nextInt();
							price += 60 * quantity;
							break;
						case 10:
							System.out.println("You entered Exit.");
							System.out.println("Your Bill Amount is: " + price);
							System.exit(1);
							break;
						default:
							System.out.println("You entered Wrong Choice!");
							++count;
							if(count == 4){
								System.out.println("Your Bill Amount is: " + price);
								System.exit(1);
							}
							break;
					}
				} while(false);
			}
	}
}