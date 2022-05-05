import java.util.Scanner;

class Node{
	int val;
	Node next;
	Node(int a){
		val=a;
	}
}
class mylist{
	Node head;
	void insertAtlast(int a){
		Node n=new Node(a);
		if(head==null){
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n;
	}
	void print(){
		if(head==null){
			System.out.print("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	
}



class Q2{
	static Node reverse(Node head){
		if(head==null){
			
			return head;
		}
		Node prev=null;
		Node current=head;
		Node after=current.next;
		while(current!=null){
			current.next=prev;
			prev=current;
			current=after;
			if(after!=null)
			after=after.next;
		}
		return prev;
	}
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
	mylist L=new mylist();
	int testcase=sc.nextInt();
	for(int i=0;i<testcase;i++){
		int elenum=sc.nextInt();
		for(int j=0;j<elenum;j++){
			int ele=sc.nextInt();
			L.insertAtlast(ele);
		}
		
	}
	 L.head=reverse(L.head);
	L.print();
	
	
	
	
	}
}