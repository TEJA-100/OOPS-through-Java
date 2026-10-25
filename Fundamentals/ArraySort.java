import java.util.Scanner;

public class ArraySort
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
  

  for(int i=0;i<n-1;i++)
  {
   for(int j=0;j<n-1-i;j++)
    {
     if(arr[j]>arr[j+1])
     { 

      int temp = arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;

     }
   }}
    System.out.println("Sorted");
    for(int i=0;i<n;i++)
  {
   System.out.print(arr[i]+" ");
  }
  sc.close();
}}
   
   
  
  