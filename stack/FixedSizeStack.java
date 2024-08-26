package stack;

public class FixedSizeStack {

	public static void main(String[] args) {
		FStack stack = new FStack();
		stack.push(9);
		stack.push(10);
		stack.push(21);
		stack.push(32);
		stack.push(32);
		stack.push(22);
		stack.push(33);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

	}

}
