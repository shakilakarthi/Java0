import java.util.Arrays;
import java.util.Scanner;


public class Aa {
	
   public static void main(String[] args) {
        
		int[] a=new int[5];
		
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n :");
       int n=in.nextInt();
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
        {
        	a[i]=in.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
        	if(a[i]==i)
        	{
        		System.out.println(i);
        	}
        }
	
	}

}