

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
	 public static void main(String[] args)throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        int i, j;
	       for(i=1; i<=N; i++){
	           for(j=1; j<=i; j++){
	               System.out.print("*");	             
	           }
	           System.out.println();
	       }
	    
	    }
	}

