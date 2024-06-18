import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine()); //사탕갯수
		int count = 0; //캔디 나눠주기
		int person = 1; //사람ID
		
		queue.add(person++);
		
		while(count<N) {
			int current = queue.poll();
			count++;
			
			if(count==N) {
				System.out.println(current);
				break;
			}
			queue.add(current);
			queue.add(person++);
		}
	}
}

//##문제##

//<Queue 를 이용한 다시줘 캔디~♬ 시뮬레이션을 해 보자>
// 1번이 줄을 선다.
// 1번이  한 개의 캔디를받는다.
//========================
// 1번이 다시 줄을선다.
// 새로 2번이 들어와 줄을선다.
//========================
// 1번이 두 개의 캔디를 받는다.
// 1번 다시 줄을 선다.
// 새로 3번이 들어와 줄을 선다.
//========================
// 2번이 한 개의 캔디를 받는다.
// 2번이 다시 줄을선다.
// 새로 4번이 들어와줄을선다.
//========================
// 1번이 세 개의 캔디를받는다.
// 1번이 다시 줄을 선다
// 새로 5번이 들어와 줄을선다.
//========================
// 3번이 한 개의 캔디를 받는다.
// …..
//========================
//20개의  캔디가 있을때 마지막 것을누가
//가져갈까?