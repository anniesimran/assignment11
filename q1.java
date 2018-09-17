import java.util.*;
public class Availability {
	public static int arraytraversel(int arr[],int size,int num, int i)
	{
		if(i==size)
		{
			return  0;
		}
		else if(arr[i]==num)
		{
			return num;
		}
		 i++;
		 return arraytraversel(arr,size,num,i);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size,num;
		System.out.print("Enter the size: ");
		size=sc.nextInt();
		int arr[]=new int[100];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number to search: ");
		num=sc.nextInt();
		int flag = arraytraversel(arr,size,num,0);
		if(flag==0)
		{
			System.out.println("Doesnot exist");
		}
		else
		{
			System.out.println(flag + " is found");
		}
	}

}




