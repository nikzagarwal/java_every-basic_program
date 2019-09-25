package recursion;

import java.util.*;
class re4_hcf_2
{
    int hcf(int divd,int div)
    {
        if(divd%div==0)
        return div;
        return hcf(div,divd%div);
    }
}

