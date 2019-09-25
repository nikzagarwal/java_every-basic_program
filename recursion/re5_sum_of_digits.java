package recursion;
//6. wap to find sum of digits using recursion
import java.util.*;
class re5_sum_of_digits
{
    int add(int num)
    {
        if(num==0)
            return 0;
        return num%10+add(num/10);
    }
}

