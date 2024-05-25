import java.util.*;
class AverageDouble{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double d1=0;
		if(sc.hasNextDouble()) {
			d1 = sc.nextDouble();
		}else {
			System.out.println("Not a double value!");
			System.exit(1);
		}
		System.out.println("Enter Second number: ");
		double d2=0;
		if(sc.hasNextDouble()) {
			d2 = sc.nextDouble();
		}else {
			System.out.println("Not a double value!");
			System.exit(1);
		}
		
		double avg = (d1+d2)/2;
		System.out.println("Average is: " + avg);
		
		
	}
}