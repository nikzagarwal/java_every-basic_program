class patter1
{
    void d(int n)
    {
        int cn=1,j=1,a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            j=b;
            for(;j>=cn;j--)
            {
                System.out.print(j);
                a++;
            }
            for(;a>1;a--)
            {
               System.out.print(a);
            }   
            b++;
            a=0;
            System.out.println();
        }
    }
}