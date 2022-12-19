package queue;

public class Queuex {
	//properties of queue
	private int[] arr;
	private int front;
	private int rare;
	private int maxSize;
	
	
	public Queuex(int maxSize) {
		this.maxSize = maxSize;
		arr =  new int[maxSize];
		front = -1;
		rare = -1;
	}
	
	public void insert(int num) {
		if(rare==maxSize-1) {
			System.out.println("Queue is full");
		}
		else {
			arr[++rare] = num;
			if(rare==0)
				front++;
		}
	}
	
	public int remove() {
		if(front>rare) {
			System.out.println("Queue is empty");
			return 100000;
		}
		else {
			return arr[front++];
		}
	}
	
	public int PeekFron() {
		if(front>rare) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			return arr[front];
		}
	}
	
	public static void main(String[] args) {
		Queuex q1 = new Queuex(4);
		/*test for peekFront and remove*/
		
	//	System.out.println(q1.remove());
	//	System.out.println(q1.PeekFron());
		
		// test cases to insert
		q1.insert(10);
		q1.insert(25);
		q1.insert(85);
		q1.insert(98);
		
		/*code to check the queue is full*/
		q1.insert(100);
		
		//System.out.println(q1.front);
		
		
		for(int i=0;i<4;i++) {
			System.out.println(q1.remove());
		}
		
		System.out.println(q1.remove());
		
		
	}
}


//
//Array is full
//10
//25
//85
//98
//Queue is empty
//-999
