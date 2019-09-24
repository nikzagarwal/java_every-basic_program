package strings;
//1. wap to enter a word and replace each vowel by next character
import java.util.*;
class S1_vowel_character
{
    Scanner sc=new Scanner(System.in);
    void d()
    {
        System.out.println("ENTER A WORD");
        String str=sc.next();
        StringBuffer stb=new StringBuffer(str);
        for(int i=0;i<stb.length();i++)
        {
            char ch=stb.charAt(i);
            if("aeiouAEIOU".indexOf(ch)>=0)
            {
                stb.setCharAt(i,++ch);            }
        }
        System.out.println(stb);        
    }
}