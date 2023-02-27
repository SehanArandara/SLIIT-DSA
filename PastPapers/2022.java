package Pack01;

public class StackX {
	private int myArr[];
	private int top;
	private int maxSize;

	private int noOfItems;

	public StackX(int m) {
		maxSize = m;
		myArr = new int[m];
		top = -1;
		noOfItems = 0;
	}

	public void push(int no) {
		if (top == maxSize - 1) {
			System.out.println("STACK IS FULL");
		} else {
			myArr[++top] = no;
			noOfItems++;
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("STACK IS EMPTY");
			return -999;
		} else {
			noOfItems--;
			return myArr[top--];
		}
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1100;
		} else {
			return myArr[top];
		}
	}

	// method to check stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public void deleteMiddle() {
		StackX st02 = new StackX(maxSize);
		int t = noOfItems;
		int m = noOfItems / 2;

		while (!isEmpty()) {
			st02.push(pop());
		}

		for (int i = 0; i < t; i++) {
			if (i == m) {
				st02.pop();
				continue;
			}
			push(st02.pop());
		}

	}

	public static void main(String[] args) {
		StackX st01 = new StackX(6);

		st01.push(1);
		st01.push(2);
		st01.push(3);
		st01.push(4);
		st01.push(5);
		st01.push(6);

		st01.deleteMiddle();
		while (!st01.isEmpty()) {
			System.out.println(st01.pop());
		}

	}

}
