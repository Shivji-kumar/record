
import java.util.*;

public class Arraysearch {
	public static void main(String[] args) {
		int arr[ ];
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter elemnets in array");
		for(i=0;i<n; i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("Enter number to be search");
		int num=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				flag=1;
			}
		}
		if(flag==1)
		System.out.println("Number found ");
		else
		{
			System.out.println("Number not found");	
		}
	}

}
