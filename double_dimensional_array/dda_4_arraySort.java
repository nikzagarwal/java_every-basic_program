package DoubleDimension;
//program to sort the complete dda
import java.util.*;
class dda_4_arraySort
{
    Scanner sc=new Scanner(System.in);
    int irow;
    int a[][];
    void getter()
    {
        System.out.println("enter no. of row");
        irow=sc.nextInt();        
        a=new int[irow][irow];
    }

    void setter()
    {
        System.out.println("enter values");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    void sort()
    {
        for(int row=0;row<a.length;row++)
        {
            for(int col=0;col<a[0].length;col++)
                sortrow(row,col);
        }
    }

    void sortrow(int row,int col)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[row][col]<a[i][j])
                {
                    int t=a[row][col];
                    a[row][col]=a[i][j];
                    a[i][j]=t;
                }
            }
        }
    }

    void display()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void main()
    {
        getter();
        setter();
        display();
        System.out.println();        
        System.out.println();
        sort();
        display();
    }
}