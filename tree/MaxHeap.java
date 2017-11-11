class MaxHeap {
	int[] heap;
	public MaxHeap(int[] arr) {
		heap = arr;
		heapify();
	}
	public void heapify() {
		int size = heap.length;
		for(int i=size/2-1;i>=0;i--) {
			max_heapify(i, size);
		}
	}

	public void max_heapify(int i, int size) {
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = i;

		if(left < size && heap[left] > heap[i]) {
			largest = left;
		}
		if(right < size && heap[right] > heap[largest]) {
			largest = right;
		}

		if(largest!=i) {
			int swap=heap[i];
			heap[i] = heap[largest];
			heap[largest] = swap;
			max_heapify(largest, size);
		}
	}

	public void print() {
		for(int i=0;i<heap.length;i++) {
			System.out.print(heap[i]+" ");
		}
	}

	public int peek() {
		return heap[0];
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		MaxHeap hip = new MaxHeap(arr);
		System.out.println(hip.peek());
		hip.print();
	}
}
