import java.util.*;
class selectionsort
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

    void selectionsort()
    {
        int min,minpos;
        for(int i=0;i<ar.length-1;i++)
        {
            min=ar[i];
            minpos=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[j]<min)
                {
                    min=ar[j];
                    minpos=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[minpos];
            ar[minpos]=temp;
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
        selectionsort();
        display();
    }
}