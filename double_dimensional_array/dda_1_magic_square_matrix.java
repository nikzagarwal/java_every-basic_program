package DoubleDimension;
//10. wap to make magic square matrix
import java.util.*;
class dda_1_magic_square_matrix
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        System.out.println("enter odd no. of row");
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int row=0,col=a.length/2,data=1;data<=r*r;data++)
        {
            a[row][col]=data;
            row--;
            col++;        
            if(row<0&&col>=r)
            {
                row+=2;
                col--;
            }
            else if(row<0)
                row=r-1;
            else if(col>=r)
                col=0;

            else if(a[row][col]!=0)
            {
                row+=2;
                col--;
            }          

        }
        for(int row1=0;row1<r;row1++)
        {
            for(int col1=0;col1<r;col1++)
                System.out.print(a[row1][col1]+"\t");
            System.out.println();
        }
    }
}

