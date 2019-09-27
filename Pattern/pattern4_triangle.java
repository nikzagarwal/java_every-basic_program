class pattern4_triangle
{
    void d(int n)
    {
        int c=0,l=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
            System.out.print("*");
            if(i!=1)
            {    for(int k=1;k<=l;k++)
                {
                    if(i!=n)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                    c++;
                }
                l+=2;
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
