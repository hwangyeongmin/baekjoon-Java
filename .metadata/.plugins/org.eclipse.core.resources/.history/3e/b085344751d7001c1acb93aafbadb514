package exam1;

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
	        
/* StringTokenizer 는 문자열 분리자입니다.
StringTokenizer st = new StringTokenizer(br.readLine()," ");

이 것은 br.readLine() 으로 한 줄을 문자열로 읽어들인 뒤 " " <- 공백을 기준으로 분리하겠다는 의미입니다.

문제에서 보시면 알 수 있듯이 두 줄을 입력받습니다.
즉, 첫 번째 줄 입력을 StringTokenizer st = new StringTokenizer(br.readLine()," "); 로 
읽어들인뒤 분리된 토큰을 반환(st.nextToken())하여 각각 N 과 X 에 담죠.

그 다음에 N개의 문자열이 한 줄로 주어집니다.
이 또한 st = new StringTokenizer(br.readLine()," "); 을 통해 
한 줄을 읽어들여 공백을 기준으로 문자열을 분리한 뒤, for 문을 통해 st.nextToken() 으로 분리된 문자열 토큰을 
하나씩 반환하면서 X 보다 작은지 여부에 따라 출력해주는 것입니다.
	*/    
	    }
	}
	       
	        