package stack;

public class StackX {
	//popterties
		private char myArr[];
		private int top;
		private int maxSize;
		
		// constructor
		public StackX(int maxSize) {
			this.maxSize =  maxSize;
			top = -1;
			myArr =  new char[maxSize];
		}
		
		// push method
		public void push(char CHAR) {
			if(top==maxSize-1) {
				System.out.println("Stack is full");
			}
			else {
				myArr[++top] = CHAR;
			}
		}
		
		// pop method
		public char pop() {
			if(top==-1) {
				System.out.println("stack is empty");
				return ' ';
			}else {
				return myArr[top--];
			}
		}
		
		// peek method
		public char peek() {
			if(top==-1) {
				System.out.println("stack is empty");
				return ' ';
			}else {
				return myArr[top];
			}
		}
		
		//isEmpty method
		public boolean isEmpty() {
			if(top==-1)
				return true;
			else
				return false;
		}
		
		//isFull method
		public boolean isFull() {
			if(top==maxSize-1)
				return true;
			else
				return false;
		}
		
	
}

