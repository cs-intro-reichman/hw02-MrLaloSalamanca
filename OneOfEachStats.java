import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);  
		int sum =0;
		double rnd = generator.nextDouble();
		int TwoC = 0;
		int ThreeC = 0;
		int FourC = 0;
		double sumA=0;
		for (int x=0; x<T; x++)
		{
			rnd = generator.nextDouble();
				if (rnd==0){
					sum++;
					for (rnd = generator.nextDouble(); rnd>0.5; rnd = generator.nextDouble()){
						sum++;
					}
				sum++;
				
			
				} else {
					sum++;
					for (rnd = generator.nextDouble(); rnd<0.5; rnd = generator.nextDouble()){
						sum++;
					}	
					sum++;
					}		
			if(sum>=4){
			FourC++;
			sumA += sum;
			sum = 0;
			} 
			if(sum==2){
			TwoC++;
			sumA += sum;
			sum = 0;
			}
			if(sum==3){
			ThreeC++;
			sumA += sum;
			sum = 0;
			}
		}
		int max = Math.max(Math.max(TwoC,ThreeC),FourC);
		
		System.out.println("Average: " + (Double)sumA/T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoC);
		System.out.println("Number of families with 3 children: " + ThreeC);
		System.out.println("Number of families with 4 or more children: " + FourC);
		
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
