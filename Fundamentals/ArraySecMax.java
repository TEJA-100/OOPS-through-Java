import java.util.Scanner;

public class ArraySecMax
{
 public static void main(String[] args)
 {
  int n;
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter n value");
  n=sc.nextInt();
  int arr[]=new int[n];
  
  System.out.println("Enter array elem");
  for(int i=0;i<n;i++)
  {
   arr[i]=sc.nextInt();
  }
   
  System.out.println("Given array elem");
  for(int i=0;i<n;i++)
  {
   System.out.println(arr[i]);
  }
  

 int max=arr[0], min=arr[0];
 for(int i=0;i<n;i++)
 {
   if(arr[i]> max)
   {
     min=max;
     max=arr[i];
   }
 }


    System.out.println("Second max is "+min);
  
  sc.close();
}}
   
   
  
  