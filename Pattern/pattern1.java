class pattern1
{
    void d(int n)
    {
        for(int i=n;i>=0;i--)
        {
            for(int j=i;j>0;j--)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
    }
}