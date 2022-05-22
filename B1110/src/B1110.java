import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 0;
		int copy = N;
		//새로운 수 : A = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10)
		// 68 = 14 -> 84
		while(true) {
			N = ((N%10)*10)+(((N/10)+(N%10))%10);
			count++;
			
			if(copy==N) {
				break;
			}
		}
		System.out.println(count);
	}
}
