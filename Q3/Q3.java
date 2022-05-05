

class Q3{
	static int top1=-1;
	static int top2=-1;
	static int size=100;
	static int a[]=new int[size];
	
	static void push1(int x){
		if(top1==-1){
			a[++top1]=x;
			return;
		}
		a[++top1]=x;
	}
	static void push2(int x){
		if(top2==-1){
			top2=(size/2)-1;
			a[++top2]=x;
			return;
		}
		a[++top2]=x;
	}
	static void pop1(){
		if(top1==-1){
		System.out.println("Stack is empty");
		return;

		}
		int c=a[top1--];
		System.out.println("Popped element from stack1 is "+c);
		
	}
	static void pop2(){
		if(top2==-1){
	System.out.println("Stack is empty");
	return;

		}
		int c=a[top2--];
		System.out.println("Popped element from stack1 is "+c);
		
	}
	
	
	public static void main(String... args){
			push1(5);
			push2(10);
			push2(15);
			push1(11);
			push2(7);
			push2(40);
			pop1();
			pop2();
			
	}
}