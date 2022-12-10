package stack;

public class StackX {
	//popterties
		private int myArr[];
		private int top;
		private int maxSize;
		
		// constructor
		public StackX(int maxSize) {
			this.maxSize =  maxSize;
			top = -1;
			myArr =  new int[maxSize];
		}
		
		// push method
		public void push(int num) {
			if(top==maxSize-1) {
				System.out.println("Stack is full");
			}
			else {
				myArr[++top] = num;
			}
		}
		
		// pop method
		public int pop() {
			if(top==-1) {
				System.out.println("stack is empty");
				return 0;
			}else {
				return myArr[top--];
			}
		}
		
		// peek method
		public int peek() {
			if(top==-1) {
				System.out.println("stack is empty");
				return 0;
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
		
		//getCount
		public int getCount() {
			
			return top+1;
		}
		
	public static void main(String[] args) {
		StackX stack01 =  new StackX(10);
		
		stack01.push(30);
		stack01.push(80);
		System.out.println("count :"+stack01.getCount());
		stack01.push(100);
		stack01.push(25);
		
		while(!stack01.isEmpty()) {
			System.out.println(stack01.pop());
		}
		
		stack01.push(25);
		
		System.out.println("count :"+stack01.getCount());
	}
	
}




