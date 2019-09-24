package strings;
// 1.wap to enter a word and character and delete the inputted character from word 
import java.util.*;
class S4_character_delete
{
    Scanner sc=new Scanner(System.in);
    void d(char ch)
    {
        System.out.println("ENTER A WORD");
        String str=sc.next();
        StringBuffer stb=new StringBuffer(str);
        for(int i=0;i<stb.length();i++)
        {
            char ich=stb.charAt(i);
            ich=Character.toUpperCase(ich);
            ch=Character.toUpperCase(ch);
            if(ich==ch)
            {
                stb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(stb);
    }
}
