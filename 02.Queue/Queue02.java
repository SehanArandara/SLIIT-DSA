package queue;

public class Queue01 {
	//properties of queue
	private int[] myArr;
	private int maxSize;
	private int front;
	private int rare;
	private int noItems;
	
	public Queue01(int maxSize) {
		this.maxSize =maxSize;
		myArr =  new int[maxSize];
		front = 0 ;   // if you want to starts the queue in 1 index front = 1 rare =0
		rare =-1;  
		noItems=0;
	}
	
	public void insert(int n) {
		if(rare==maxSize-1)
			System.out.println("Queue is full");
		else {
			myArr[++rare] = n;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems==0) {
			System.out.println("Queue is empty");
			return -999;
		}
		else {
			noItems--;
			return myArr[front++];
		}
	}
	
	public int PeekFront() {
		if(noItems==0) {
			System.out.println("Queue is empty");
			return -999;
		}
		else {
			return myArr[front];
		}
	}
	
	public boolean isFull() {
		return (rare==maxSize-1);
	}
	
	public boolean isEmpty() {
		return(noItems==0);
	}
	
	public static void main(String[] args) {
		Queue01 q1 = new Queue01(4);
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



/*
 * Array is full
10
25
85
98
Queue is empty
-999
 * 
 * */
