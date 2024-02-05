
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int sum =0;
		int a = (int)((Math.random()*2));
		if (a==0){
			System.out.print("b");
			sum++;
			for (a=(int)((Math.random()*2));a==0;a=(int)((Math.random()*2))){
				System.out.print(" b");
				sum++;
			}
			sum++;
			System.out.print(" g");
			System.out.println();
			System.out.println("you made it... and you now have " + sum + " children.");
			
		} else {
			System.out.print("g");
			sum++;
			for (a=(int)((Math.random()*2));a==1;a=(int)((Math.random()*2))){
				System.out.print(" g");
				sum++;
			}
			sum++;
			System.out.print(" b");
			System.out.println();
			System.out.println("you made it... and you now have " + sum + " children.");
		}	

	}
}
