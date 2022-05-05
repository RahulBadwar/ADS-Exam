import java.util.Scanner;

class Q1{
	static void insertionSort(int a[],int n){
		int temp=a[n-1];
		
			for(int j=n-2;j>=0;j--){
				if(temp>a[j]){
					a[j+1]=temp;
					for(int val:a){
				System.out.print(val+" ");
			}
			break;
				}
				else{
					a[j+1]=a[j];
					for(int val:a){
				System.out.print(val+" ");
			}
			}
			System.out.println();
			}
			System.out.println();
	}
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		insertionSort(a,n);
		
	}
}