package strings;
import java.util.*;
class S3_delete2
{
    Scanner sc=new Scanner(System.in);
    void d()
    {
        System.out.println("ENTER A WORD");
        String str=sc.next();
        StringBuffer stb=new StringBuffer(str);
        stb.delete(2,5);
        System.out.println(stb);
    }
}