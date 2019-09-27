class pattern_1
{
    void d()
    {
        int a=5;
        for(;a>0;a--)
        {
            for(int g=1;g<=5;g++)
            {
                if(a%2==g%2)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
