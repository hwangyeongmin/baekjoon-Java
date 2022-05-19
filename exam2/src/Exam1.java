

public class Exam1 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {			
			for(int j=1; j<=5; j++) {					
				if(i==j) 
					System.out.print("O");
				else System.out.print("o");				
			}			
			System.out.println();		
		}
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				if(5-i==j) 
					System.out.print("O");
				else System.out.print("o");
							
			}
			System.out.println();
		}
				
	}
}