package projects;
//11. wap to make pattern 1 square matrix
import java.util.*;
class dda_2_pattern1_square_matrix
{
    Scanner sc=new Scanner(System.in);
    int row=0,col=0,c,r,a[][],data;
    void getter()
    {
        System.out.println("enter no. of row");
        r=sc.nextInt();
        System.out.println("enter no. of col");
        c=sc.nextInt();
        a=new int[r][c];
    }

    void right(int col)
    {
        for(;col<c;col++)
            if(a[row][col]==0)
                a[row][col]=data++;

    }

    void down(int row)
    {
        for(;row<r;row++)
            if(a[row][col]==0)
                a[row][col]=data++;

    }

    void left(int col)
    {
        for(;col>=0;col--)
            if(a[row][col]==0)
                a[row][col]=data++;

    }

    void up(int row)
    {
        for(;row>=0;row--)
            if(a[row][col]==0)
                a[row][col]=data++;

    }

    void setter()
    {
        data=1;
        for(int row1=0,col1=0;row1<r&&col1<c;row1++,col1++)
        {
            col=col1;
            row=row1;
                right(col);
            col=c-(col1+1);
                down(row);
            row=r-(row1+1);
                left(col);
            col=col1;
                up(row);
        }   
        
    }

    void main()
    {
        getter();
        setter();
        for(int row1=0;row1<r;row1++)
        {
            for(int col1=0;col1<c;col1++)
                System.out.print(a[row1][col1]+"\t");
            System.out.println();
        }

    }
}   
