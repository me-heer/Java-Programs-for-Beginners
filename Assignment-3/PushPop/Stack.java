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
		Stack s = new Stack(5);
		s.push(1);
		int a = s.pop();
		a = s.pop();
		s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);
	}
}