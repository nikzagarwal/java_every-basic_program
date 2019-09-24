package strings;
import java.util.*;
class S2_delete
{
    Scanner sc=new Scanner(System.in);
    void d()
    {
        System.out.println("ENTER A WORD");
        String str=sc.next();
        StringBuffer stb=new StringBuffer(str);
        stb.deleteCharAt(2);
        System.out.println(stb);
    }
}