class patter
{
    void d(int n)
    {
        int c=0,cn=n-1,cnn=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                System.out.print(j);
            while(c>0)
            {
                System.out.print(" ");
                c--;
            }
            n=cn;
            for(int k=n;k>=1;k--)
            {
                System.out.print(k);
            }
            if(cn<cnn)
            {   cn++;
                n++;
            }
            c++;
            cn--;
            n--;
            cnn--;
            System.out.println();
        }
    }
}