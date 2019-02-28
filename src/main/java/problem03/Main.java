package problem03;

public class Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");

		stack.printStack();
		
		while (stack.isEmpty() == false) {
			String s = stack.pop();
			System.out.println(s);
			break;
		}

		System.out.println("======================================");

		stack = new MyStack(3);
		stack.push("Hello");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}