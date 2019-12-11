class Stack{
	int size;
	static int top = -1;
	int[] array;
	Stack(int size){
		this.size = size;
		array = new int[size];
	}
	void push(int element){
		if(top==size - 1)
			System.out.println("Stack overflow.");
		else
		{
			array[++top] = element;
			System.out.println("Pushed: " + element);
			System.out.println("Size: " + top);
		}
	}
	int pop(){
		if(top == -1)
		{
			System.out.println("Stack Underflow.");
			return 0;
		}
		else
		{
			System.out.println("Popped.");
			return array[top--];
		}
	}
}

class mainClass{
	public static void main(String args[]){
		System.out.println("Implementing Stack.");
		System.out.println("Stack size: 3");
		Stack s = new Stack(3);
		System.out.println("Pushing 1...");
		s.push(1);
		System.out.println("Pushed.");
		System.out.println("Popping the stack...");
		int a = s.pop();
		System.out.println("Popped off value: " + a);
		a = s.pop();
		System.out.println("Pushing 1...");
		s.push(1);
		System.out.println("Pushing 2...");
		s.push(2);
		System.out.println("Pushing 3...");
		s.push(3);
		System.out.println("Pushing 4...");
		s.push(4);

	}
}