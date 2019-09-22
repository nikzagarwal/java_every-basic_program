import java.util.*;
class linearsort
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

    void linearsort()
    {
        for(int i=0;i<=ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
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
        linearsort();
        display();
    }
}