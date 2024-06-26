import java.io.FileInputStream;
import java.util.Scanner;

public class AdjListTest { //리스트로 그래프구조 저장
	
	static class Node{ //현재 정점과 그 정점에 연결된 다른 정점의 정보를 표현하는 객체클래스
		int vertex;
		Node next;
		
		public Node(int vertex, Node next) {
			super(); //생략가능 
			this.vertex = vertex;
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [vertex=" + vertex + ", next=" + next + "]";
		}
		
	}
	
	static Node[] adjList;
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
		
		adjList = new Node[N];
		
		for(int i=0; i<C; i++) {
			int from = sc.nextInt(); //시작정점
			int to = sc.nextInt(); //끝정점
			
			adjList[from] = new Node(to, adjList[from]);
			adjList[to] = new Node(from, adjList[to]);
			
		}	
		print();
		sc.close();
	}//main
	
	//저장 데이터 확인
	private static void print() {
		Node head = null;
		
		for(int i=0; i<N; i++) {
			head = adjList[i];
			System.out.println(i+":"+head);//head = 노드(Node클래스)
		}
		
	}
}
