package stack;

public class MyApp {

	public static void main(String[] args) {
		
		StackX st01 =  new StackX(12);
		
		st01.push('3');
		st01.push('+');
		st01.push('(');
		st01.push('(');           // + (( 6 * 2) – 3)
		st01.push('6');
		st01.push('*');
		st01.push('2');
		st01.push(')');
		st01.push('-');
		st01.push('3');
		st01.push(')');
		
		char test;
		int count1=0,count2=0;
		while(!st01.isEmpty()) {
			test =  st01.pop();
			if(test=='(')
				count1++;
			if(test==')')
				count2++;
		}
		
		if(count1==count2)
			System.out.println("Valid");
		else
			System.out.println("invalid");
	}

}

/*
  X
C
E
D
A*/
