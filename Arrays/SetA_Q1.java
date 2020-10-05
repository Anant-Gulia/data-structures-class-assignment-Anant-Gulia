//Arrays SET-A Q.1


import java.util.*;
public class LargestSmallest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter in an array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            i++;
            System.out.println("Enter the number at position "+i);
            i--;
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i <n; i++)
	{
      
		if(arr[i] > max)
			max = arr[i];
		else if(arr[i] < min)
			min = arr[i];
    }
    int result=max-min;
    System.out.println("Difference of largest and smallest element in your array= "+result);
    }
    
}
