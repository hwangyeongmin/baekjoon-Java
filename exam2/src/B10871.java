

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10871 {
	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        StringTokenizer st = new StringTokenizer(br.readLine()," ");       
	       
	        int N = Integer.parseInt(st.nextToken());
	        int X = Integer.parseInt(st.nextToken());
	        
	         st = new StringTokenizer(br.readLine()," ");
	        
	        int a ;
	        for(int i=1; i<=N; i++){
	             a = Integer.parseInt(st.nextToken());
	            if(a<X)
	                bw.write(a+" ");                
	        }
	        br.close();
	        bw.flush();
	        bw.close();
	        
/* StringTokenizer ?�� 문자?�� 분리?��?��?��?��.
StringTokenizer st = new StringTokenizer(br.readLine()," ");

?�� 것�? br.readLine() ?���? ?�� 줄을 문자?���? ?��?��?��?�� ?�� " " <- 공백?�� 기�??���? 분리?��겠다?�� ?��미입?��?��.

문제?��?�� 보시�? ?�� ?�� ?��?��?�� ?�� 줄을 ?��?��받습?��?��.
�?, �? 번째 �? ?��?��?�� StringTokenizer st = new StringTokenizer(br.readLine()," "); �? 
?��?��?��?��?�� 분리?�� ?��?��?�� 반환(st.nextToken())?��?�� 각각 N �? X ?�� ?���?.

�? ?��?��?�� N개의 문자?��?�� ?�� 줄로 주어집니?��.
?�� ?��?�� st = new StringTokenizer(br.readLine()," "); ?�� ?��?�� 
?�� 줄을 ?��?��?��?�� 공백?�� 기�??���? 문자?��?�� 분리?�� ?��, for 문을 ?��?�� st.nextToken() ?���? 분리?�� 문자?�� ?��?��?�� 
?��?��?�� 반환?��면서 X 보다 ?��??�? ?���??�� ?��?�� 출력?��주는 것입?��?��.
	*/    
	    }
	}
	       
	        