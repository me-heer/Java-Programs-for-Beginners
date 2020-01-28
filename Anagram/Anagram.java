
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
			System.out.println("Enter String1 : ");			
			String str1 = inp.next();
			System.out.println("Enter String2 : ");
			String str2 = inp.next();
			
			if(str1.length() != str2.length())
			{
				System.out.println("NO");
			}
		   else
		   {
			   char tmp1[] = str1.toCharArray();
			   char tmp2[] = str2.toCharArray();
			   Arrays.sort(tmp1);
			   Arrays.sort(tmp2);
			   String str11 = new String(tmp1);
			   String str22 = new String(tmp2);
			   if(str11.equals(str22)) System.out.println("YES");
			   else System.out.println("NO");
		   }
	}

}
