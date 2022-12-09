public class StackX {
	// properties of tack
	private double stackArr[];
	private int maxSize;
	private int top;
	
	// overload constructor
	public StackX(int maxSize) {
		this.maxSize= maxSize;
		stackArr =  new double[maxSize];
		top =-1;
	}
	
	// push method implementation
	public void push(double num) {
		if(top== maxSize-1)
			System.out.println("stack is full");
		else
			stackArr[++top]= num;
	}
	
	// pop method implementation
	public double pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return 0.00;
		}
		else {
			return stackArr[top--];
		}
	}
	
	// peek method implementation
	public double peek() {
		if(top==-1) {
			System.out.println("stack is empty");
			return 0.0;
		}
		else {
			return stackArr[top];
		}
	}  
	// method to check stack is empty
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	//  method to check stack is full
	public boolean isFull() {
		if(top==maxSize-1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		StackX stack01 =  new StackX(10);
		
		stack01.push(30);
		stack01.push(80);
		stack01.push(100);
		stack01.push(25);
		
		while(!stack01.isEmpty()) {
			System.out.println(stack01.pop());
		}
	}
	
}


/* prints
25.0
100.0
80.0
30.0
*/

