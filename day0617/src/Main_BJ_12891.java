import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_12891 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer (br.readLine()," ");
		int S = Integer.parseInt(tokens.nextToken());
		int P = Integer.parseInt(tokens.nextToken());
		
		int pw[] = new int[4];
		int myArr[] = new int[4];
		int check = 0;
		
		for(int i=0; i<4; i++) {
			pw[i] = Integer.parseInt(tokens.nextToken());
			if(pw[i]==0)
				check++;
		}
		
		for(int i =0; i<P; i++) {
			
		}
		
	}
}
