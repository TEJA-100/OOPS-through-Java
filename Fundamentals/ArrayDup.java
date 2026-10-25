import java.util.Scanner;

public class ArrayDup
{
 public static void main(String[] args)
 {
  int n;
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter n value");
  n=sc.nextInt();
  int arr[]=new int[n];
  int brr[]=new int[n];
  
  System.out.println("Enter array elem");
  for(int i=0;i<n;i++)
  {
   arr[i]=sc.nextInt();
  }
   
  System.out.println("Given array elem");
  for(int i=0;i<n;i++)
  {
   System.out.print(arr[i]+" ");
  }
  
int nsize=0;
for(int i=0;i<n;i++)
{
    boolean isdup=false;
    for(int j=0;j<nsize;j++)
    {
        if(arr[i]==brr[j])
        {
            isdup=true;
            break;

        }
        

        
    }

    if(!isdup)
        {
            brr[nsize]=arr[i];
            nsize++;
        }
}
    System.out.println("\nArray after removing duplicates");
    for(int i=0;i<nsize;i++)
    {
        System.out.print(brr[i]+" ");
    }
  
  sc.close();
}}
   
   
  
  