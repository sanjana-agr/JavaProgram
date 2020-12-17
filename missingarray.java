import java.util.Scanner;
class Demo
{
  public static void main(String[] arg)
  {
    
    Scanner sc=new Scanner(System.in);
int sumofall, sumofar=0, missing_no;
int n;
    System.out.println("enter n");
    n=sc.nextInt();
    sumofall=(n*(n+1))/2;
    int ar[]=new int[n];
    for(int i=0;i<=n-2;i++)//we want a array with a missing no. so we want n-1 no.s
    {
       ar[i]=sc.nextInt();
    }
    
    for(int i=0;i<=n-2;i++)
    {
      sumofar=sumofar+ar[i];
    }
    System.out.println("sum of array="+sumofar);

    missing_no=sumofall-sumofar;
    System.out.println("missing no="+missing_no);
  }
}