package queue;

public class CircularQueue {
	// properties
	private int myArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noOfItems;
	
	public CircularQueue(int maxSize) {
		this.maxSize =  maxSize;
		myArr = new int[maxSize];
		rear = -1 ;
		front = 0;
		noOfItems = 0;
	}
	
	public void insert(int num) {
		if(noOfItems==maxSize) {
			System.out.println("Queue is FULL");
		}
		else {
			if(rear==maxSize-1)
				rear = -1;
			
			myArr[++rear] = num;
			noOfItems++;
		}
	}
	
	public int remove() {
		if(noOfItems==0) {
			System.out.println("Queue is EMPTY");
			return -999;
		}
		else {
			noOfItems--;
			int temp = myArr[front++];
			if(front== maxSize)
				front =0;
			
			return  temp;
		}
	}
	
	public int PeekFront() {
		if(noOfItems==0) {
			System.out.println("Queue is empty");
			return -999;
		}
		else {
			return myArr[front];
		}
	}
	
	public boolean isFull() {
		return (noOfItems==maxSize);
	}
	
	public boolean isEmpty() {
		return(noOfItems==0);
	}
}
