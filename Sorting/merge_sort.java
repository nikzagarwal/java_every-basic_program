
/* 17.
 * Program to merge two sorted arrays
 * 
 */
import java.util.*;
class merge_sort
{
    Scanner sc=new Scanner(System.in);
    int a[];
    int b[];
    int c[];
    int ptra=0,ptrb=0,ptrc=0;
    void inputandstore()
    {
        System.out.println("enter no. of elements of array a in sorted form");
        int l=sc.nextInt();
        a=new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.println("enter no.");
            a[i]=sc.nextInt();
        }
        System.out.println("enter no. elements of array b in sorted form");
        int m=sc.nextInt();
        b=new int[m];
        for(int i=0;i<m;i++)
        {
            System.out.println("enter no.");
            b[i]=sc.nextInt();
        }
        c=new int[m+l];
    }

    void arrange()
    {
        try
        {
            for(;;)
            {
                if(a[ptra]<b[ptrb])
                {
                    c[ptrc++]=a[ptra++];
                }
                else
                {
                    c[ptrc++]=b[ptrb++];
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            if(ptrb>=b.length)
                System.arraycopy(a,ptra,c,ptrc,c.length-ptrc);
            else
                System.arraycopy(b,ptrb,c,ptrc,c.length-ptrc);
        }
    }

    void display()
    {
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);          
        }    
    }

    void main()
    {
        inputandstore();
        arrange();
        display();
    }
}