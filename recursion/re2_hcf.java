package recursion;

//4. wap to find hcf of two no.s
import java.util.*;
class re2_hcf
{
    int hcf(int num1,int num2,int gcd)
    {
        if(num1%gcd==0&&num2%gcd==0)
            return gcd;
        return hcf(num1,num2,--gcd );
    }

    void main(int num1,int num2)
    {
        System.out.println(hcf(num1,num2,Math.min(num1,num2)));
    }
}	

