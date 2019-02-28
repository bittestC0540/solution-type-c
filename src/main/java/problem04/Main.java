package problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws IOException{
			int x, y;
			int c = 0;
			int count_win =0;
			int count_lose=0;
			
			long startTime = System.currentTimeMillis();
			while(c < 18) {
				Random r=new Random();
				c++;
				if(args.length==1){
					x=Integer.valueOf(args[0]).intValue();
					//인수는 String형이므로 정수형int형으로 변환합니다 
				}
				else{
					x=Math.abs(r.nextInt()%9)+ 1;
				}
				y=Math.abs(r.nextInt()%9) + 1;
				int num = x*y;
				System.out.println();
				
				System.out.print(x+"*"+y+"=");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				user = in.readLine();
				//키보드로부터 입력
				
				int inputNum = new Integer(user).intValue();
				if(num==inputNum){
					System.out.print("(O)");
					count_win++;
				}
				else {
					System.out.print("(X)");
					count_lose++;
				}
			}
			long endTime = System.currentTimeMillis();
		
			System.out.println("");
			System.out.println("성공 : " +count_win + ",실패 : "+count_lose);
			System.out.println("경과시간 : " +( endTime - startTime )/1000.0f +"초");
	}
}