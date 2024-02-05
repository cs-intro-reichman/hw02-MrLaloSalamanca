
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = 1;
		while (i<num){
			if ((num%i)==0){
				System.out.println(i);
			}
			i++;
		}
		System.out.println(num);
				
	}
}
