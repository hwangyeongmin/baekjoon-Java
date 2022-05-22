import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10951 {
	//EOF(End Of File)에 대해 알아보자
	//Scanner 에서는 hasNext() 메서드를 이용하면 간단하게 해결 가능하다.
	//hasNext() 메서드는 입력된 토큰이 있으면 true를 반환, 그렇지 않으면 false를 반환한다.
	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * while(sc.hasNext()){
	 * 		System.out.println(sc.nextLine());
	 * }
	 */
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String str="";
		
		while((str = br.readLine())!= null) {
			st = new StringTokenizer(str," ");
			
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			
			bw.write((A+B)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
