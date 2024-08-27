package stack;

public class DStack {
	int capacity =2;
	int stack[] = new int[capacity];
	int top = 0;
	public void push(int data) {
		if(size()==capacity)
			expand();
		stack[top] = data;
		top++;
		
	}
	private void expand() {
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity =capacity+2;
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("No element present");
		}
		else {
			
			top--;
			data = stack[top];
			stack[top] =0;
		}
		return data;
	}
	
	private boolean isEmpty() {
		return top<=0;
	}
	
	private int size() {
		
		return top;
	}
    public void show() {
    	for(int n : stack) {
    		System.out.print(n+" ");
    	}
    }

}
