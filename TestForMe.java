import java.util.Random;

public class TestForMe {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
	    Random generator = new Random(seed); 
		
		int TwoC = 0;
		int ThreeC = 0;
		int FourC = 0;
		
		double sumA=0;
		
		for (int x=0; x<T; x++){
			boolean b = false;
			boolean g = true;
			int count = 0;
			while (!(b && g)){
			 double rnd = generator.nextDouble();
				if (rnd < 0.5){
					b = true;
					
				} else {
					g = true;
				}	
				count++;
			}	
					
			sumA += count;
					
			if(count>=4){
			FourC++;
			} 
			
			if(count==2){
			TwoC++;
			}
			
			if(count==3){
			ThreeC++;

			}
		}
		double avg = sumA / T;
		
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoC);
		System.out.println("Number of families with 3 children: " + ThreeC);
		System.out.println("Number of families with 4 or more children: " + FourC);
		
		int max = Math.max(Math.max(TwoC,ThreeC),FourC);
		
		if (max == TwoC){
			System.out.println("The most common number of children is 2.");
		}
		if (max == ThreeC){
			System.out.println("The most common number of children is 3.");
		}
		if (max == FourC){
			System.out.println("The most common number of children is 4 or more.");
		}
		
		    
	}
}
