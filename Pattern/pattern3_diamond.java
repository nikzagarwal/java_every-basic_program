class pattern3_diamond
{
    void d(int n)
    {
        for(int i=1;i<=n;i+=2)
        {
            for(int k=0;k<(n-i);k+=2)
            {
                System.out.print(" ");
            }
            for(int j=0;j<((i*2)-1);j+=2)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=n;i+=2)
        {
            for(int k=0;k<i;k+=2)
            {
                System.out.print(" ");
            }
            for(int j=2;j<=(n-i);j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
