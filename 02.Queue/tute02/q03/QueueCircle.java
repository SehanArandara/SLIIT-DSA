

public class QueueCircle {
	private char myArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noOfItems;
	
	public QueueCircle(int maxSize) {
		this.maxSize =maxSize;
		myArr =  new char[maxSize];
		rear =  -1;
		front =0;
		noOfItems = 0;
	}
	
	public void insert(char c) {
		if(noOfItems==maxSize) {
			System.out.println("The queue is full");
		}
		else {
			if(rear== maxSize-1)
				rear = -1;
			myArr[++rear] = c;
			noOfItems++;
		}
	}
	
	public char remove() {
		if(noOfItems==0) {
			System.out.println("queue is empty");
			return 'o';
		}
		else {
			noOfItems--;
			char temp = myArr[front++];
			if(front==maxSize)
				front =0;
			return temp;
		}
	}
	
	public char peekFront() {
		if(noOfItems==0) {
			System.out.println("Queue is empty");
			return 'c';
		}
		else {
			return myArr[front];
		}
	}
	
	public boolean isEmpty() {
		return(noOfItems==0);
	}
	
	public boolean isFull() {
		return (noOfItems==maxSize);
	}
	

	public static void main(String[] args) {
		QueueCircle myQueue =  new  QueueCircle(4);
		
		myQueue.insert('l');
		myQueue.insert('m');
		myQueue.insert('n');
		myQueue.insert('o');
		
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.remove());
		}

	}

}


/*
 * l
 * m
 * n
 * o
 *  */
