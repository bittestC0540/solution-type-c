package problem03;

public class MyStack {
	int top;
	String[] stack;
	int size;
	
	private String[] buffer;
	
	public MyStack( int size ) {
		top = -1;
		stack = new String[size];
		this.size = size;
	}
	
	public void push(String item) {
		stack[++top] = item;
	}

	public String pop() {
		return stack[top--];
	}

	public boolean isEmpty() {
		return false;
	}
	
	public int size() {
	
		return 0;
	}
	
	public void printStack() {
		for(int i= top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
}