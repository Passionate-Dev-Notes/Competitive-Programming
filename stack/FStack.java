package stack;

public class FStack {
	int stack[] = new int[5];
	int top =0;
	
	public void push(int data) {
		if(size()==5) {
			System.out.println("It's overflow condition");
			
		}
		else {
			stack[top] = data;
			top++;
		}
		
	}
	
	public int pop() {
		int data = 0;
		top--;
		if(!isEmpty()) {
			data = stack[top];
			stack[top] = 0;
		}
		else {
			System.out.println("It's Underflow Conditon");
		}
		return data;
	}
	
	public int peak() {
		int data;
		data = stack[top];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	public void show() {
		for(int n : stack) 
			System.out.print(n+" ");
	}
	

}
