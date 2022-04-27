import java.util.*;
class miles{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double km,miles;
		System.out.print("Enter distance in Kilometers : ");
		km = scan.nextDouble();
		miles = km*0.6;
		System.out.println(km + "KM is "+miles+" miles");
	}
}