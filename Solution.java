import java.util.*;
import java.text.*;
class Solution
{	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        String s=sc.next();
        boolean flag= true;
        char arr[]=new char[s.length()];
        int top=-1;
        for(char c : s.toCharArray())
        {
            //System.out.println(c);
            if(c=='{' || c=='(' || c=='[')
            {
                if(top==((arr.length)-1))
                    System.out.println("false");
                else
                {
                    top++;
                    arr[top]=c;
                    //System.out.println(arr[top]);
                }
            }
            else if(c==']' || c=='}' || c==')')
            {
                if(top!=-1)
                {
                    if(c==']' && arr[top]!='[')
                        flag=false;
                    if(c=='}' && arr[top]!='{')
                        flag=false;
                    if(c==')' && arr[top]!='(')
                        flag=false;
                    top--;
                }
            }
        }
        if(flag==true && top<0)
            System.out.println("true");
        else if(top>-1)
            System.out.println("false");
        else
            System.out.println("false");
		/*Stack<Character> stack = new Stack<>();
		while (s.hasNext()) 
        {    
            String ch=s.next();
            boolean flag = true;
            for(char sc : ch.toCharArray())
            {
                if(sc == '[' || sc == '{' || sc == '(')
                    stack.push(sc);
                else if(sc == ']' || sc == '}' || sc == ')') {
                    if(!stack.isEmpty()) {
                        if(sc == ']' && stack.pop() != '[')  flag=false;
                        else if(sc == '}' && stack.pop() != '{')  flag=false;
                        else if(sc == ')' && stack.pop() != '(')  flag=false;
                    }
                    
                }
            }   
            if(flag==true && stack.isEmpty()) System.out.println(true);
            else if(!stack.isEmpty()) System.out.println(false);
            else System.out.println(false);             
		}*/
	}
}