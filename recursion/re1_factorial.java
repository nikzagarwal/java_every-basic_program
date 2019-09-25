package recursion;

//3. wap to find factorial of no.using recursion 
import java.util.*;
class re1_factorial
{
    int factorial(int num)
    {
        if(num==1)
            return 1;
        return num*factorial(--num);
    }
}

