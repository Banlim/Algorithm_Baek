import java.util.Scanner;

public class P2751 {
	
	void min_heap(int index, int [] heap) {
		int left_index = (index*2) + 1;
		int right_index = (index*2) + 2;
		int temp = 0;
		if(left_index >= heap.length || right_index >= heap.length) {
			return;
		}
		System.out.println("min_heap left : " + heap[left_index]);
		System.out.println("min_heap right : " + heap[right_index]);
		if(heap[index] > heap[left_index]) {
			temp = heap[index];
			heap[index] = heap[left_index];
			heap[left_index] = temp;
		}
		min_heap(left_index, heap);
		if(heap[index] > heap[right_index]) {
			temp = heap[index];
			heap[index] = heap[right_index];
			heap[right_index] = temp;
		}
		min_heap(right_index, heap);
		if(heap[left_index] > heap[right_index]) {
			temp = heap[left_index];
			heap[left_index] = heap[right_index];
			heap[right_index] = temp;
		}
		
	}
	int delete_min_heap(int index, int[] heap) {
		int temp = heap[index];
		int left_index = (index*2) + 1;
		int right_index = (index*2) + 2;
		heap[index] = heap[left_index];
		return temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCnt = scan.nextInt();
		int [] heap = new int[nCnt];
		int [] sortArr = new int[nCnt];
		P2751 problem = new P2751();
		for(int i = 0; i < nCnt; i++) {
			heap[i] = scan.nextInt();
		}
		problem.min_heap(0, heap);
		for(int i = 0; i < nCnt; i++) {
			sortArr[i] = problem.delete_min_heap(0, heap);
		}
		
		scan.close();
	}

}
