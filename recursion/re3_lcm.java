package recursion;

//5. wap to find lcm of two no.s
import java.util.*;
class re3_lcm
{
    int lcm(int num1,int num2,int lcm)
    {
        if(lcm%num1==0&&lcm%num2==0)
            return lcm;        
        return lcm(num1,num2,++lcm);
    }

    void main(int num1,int num2)
    {
        System.out.println(lcm(num1,num2,Math.max(num1,num2)));
    }
}
