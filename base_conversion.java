class base_cvonversion
{
    int convert(int num,int bs1,int bs2)
    {
        int res=0,tens=1;
        while(num>0)
        {
            int rem=num%bs2;
            res+=rem*tens;
            num/=bs2;
            tens*=bs1;
        }
        return res;
    }
}
