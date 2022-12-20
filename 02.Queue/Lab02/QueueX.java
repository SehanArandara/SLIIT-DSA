

import java.util.Scanner;

public class QueueX {
	
	private int myArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noOfItems;
	
	public QueueX(int maxSize) {
		this.maxSize =  maxSize;
		myArr =  new int[maxSize];
		rear = -1 ;
		front = 0;
		noOfItems = 0;
	}
	
	public void insert(int no) {
		if(noOfItems==maxSize) 
			System.out.println("Queue is Full");
		else {
			if(rear==maxSize-1) {
				rear = -1;
			}
			myArr[++rear] = no;
			noOfItems++;
		}
	}
	
	public int remove() {
		if(noOfItems==0) {
			System.out.println("Queue is Empty");
			return 10000;
		}
		else {
			noOfItems--;
			int temp = myArr[front++];
			if(front==maxSize) 
				front = 0;
			
			return temp;
		}
	}
	
	public int peekFront() {
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
		
		QueueX mainQueue =  new QueueX(5);
		QueueX evenQueue =  new QueueX(5);
		QueueX oddQueue =  new  QueueX(5);
		
		int i=1;
		int Temp;
		Scanner scn =  new Scanner(System.in);
		
		while(!mainQueue.isFull()) {
			System.out.print("Enter transaction ID"+ i++ +": ");
			Temp= scn.nextInt();
			mainQueue.insert(Temp);
			if(Temp%2==0)
				evenQueue.insert(Temp);
			else
				oddQueue.insert(Temp);
		}
		
		System.out.println("PC 1");
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction "+evenQueue.remove());
		}
		
		System.out.println("PC 2");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transactio "+oddQueue.remove());
		}
		
	}
	
	
}
