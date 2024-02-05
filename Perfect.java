/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		String total = args[0] + " = 1";
		int sum = 1;
		for (int i = 2 ; i < num; i++){
			if ( num % i == 0){
				sum += i;
				total +=" + " + i;
			}
		}
		if ((num%sum==0) && (sum!=1)){
			System.out.println(num + " is a perfect number since " + total);
		} else{
			System.out.println(num + " is not a perfect number");
			
		}
	}
}
