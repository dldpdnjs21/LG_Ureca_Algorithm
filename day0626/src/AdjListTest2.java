import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjListTest2 { //리스트로 그래프구조 저장
	
	static ArrayList<Integer>[] adjList;
	static int N;
	
	//adjList[0]번지의 의미?  		 0번 노드(정점)에 연결(인접)된 노드의 정보를 저장
	//0과 1의 표현 : 없음 / 있음		 null과 new Node()의 표현 : 없음 / 있음
	//adjList[0] = null;
	//adjList[0] = (1, null)
	//adjList[0] = (2,1) - (1,null)
	//adjList[0] = (5,2) - (2,1) - (1,null)
	//adjList[0] = (6,5) - (5,2) - (2,1) - (1,null)
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input1.txt"));
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//정점 수
		int C = sc.nextInt();//주어진 입력 간선정보의 수
		
		adjList = new ArrayList[N];
		
		//배열 각 번지에 List바구니 생성
		//각 List는 배열 인덱스에 인접한 노드(정점)의 번호가 저장
		for(int i=0; i<adjList.length; i++) {
			adjList[i] = new ArrayList<Integer>();	
		}
		
		for(int i=0; i<C; i++) {
			int from = sc.nextInt(); //시작정점
			int to = sc.nextInt(); //끝정점
			
			//양방향
			adjList[from].add(to); //==> 의미:ArrayList.add(인접 정점 번호);
			adjList[to].add(from); //==> 의미:ArrayList.add(인접 정점 번호);
		}	
		print();
		sc.close();
	}//main
	
	//저장 데이터 확인
	private static void print() {
//		for(ArrayList<Integer> list : adjList) {
//		System.out.println(list);
//	}
		for(int i=0; i<adjList.length; i++) {
			System.out.println(i+":"+adjList[i]);
		}
	}
}
