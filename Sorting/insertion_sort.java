/* 10.
 * insertion sorting
 */
import java.util.*;
class insertion_sort
{
    Scanner sc=new Scanner(System.in);
    int ar[];
    void inputandstore()
    {
        System.out.println("enter no.of inputs");
        int r=sc.nextInt();
        ar=new int[r];
        for(int i=0;i<r;i++)
        {
            System.out.println("enter no.");
            ar[i]=sc.nextInt();
        }
    }

    void sort()
    {
        for(int i=1;i<ar.length;i++)
        {
            int t=ar[i],j=i-1;
            try
            {
                while(ar[j]>t)
                {
                    ar[j+1]=ar[j];
                    j--;
                }
                ar[j+1]=t;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                ar[j+1]=t;                
            }
            
        }
    }

    void display()
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }

    void main()
    {
        inputandstore();
        display();
        sort();
        System.out.println("after sort");
        display();
    }
}