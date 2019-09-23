package DoubleDimension;
//13. wap to make pattern3 square matrix
import java.util.*;
class dda_4_pattern3_square_matrix
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
        int c=1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=c++;
            }
        }
    }

    void display()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i>=j&&(i+j)<=a.length-1)
                    System.out.print(a[i][j]+"\t");
                else if(i<=j&&(i+j)>=a.length-1)
                    System.out.print(a[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    void main()
    {
        getter();
        setter();
        display();
    }
}
