
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int l = s.length();
			for (int i = s.length(); i>0 ; i--){
				System.out.print(s.charAt(i-1));
		}	
		System.out.println();
			if(l%2==0){
				System.out.println("The middle character is " + s.charAt(l/2-1));
			}else {
				System.out.println("The middle character is " + s.charAt(l/2));
		}
	}		
}
