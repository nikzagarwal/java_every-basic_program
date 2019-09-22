import java.util.*;
class bubblesort_alternate
{
    Scanner sc=new Scanner(System.in);
    int ar[];
    void input()
    {
        System.out.println("enter no. of terms.");
        ar=new int[sc.nextInt()];
        System.out.println("enter no.");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
    }

    void bubblesort()
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }

    void display()
    {
        System.out.println("no. in arranged manner");     
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);
    }

    void main()
    {
        input();
        bubblesort();
        display();
    }
}