package Lab3;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static boolean isBalanced(String expression)
    {
        Deque<Character> stack = new LinkedList();
        boolean balanced = true;
        int index = 0;

        while(balanced==true && index<expression.length())
        {
            char ch = expression.charAt(index);

            if(isOpen(ch))
            {
                stack.push(ch);
            }
            else {
                if (isClose(ch)) {
                    if (stack.isEmpty()) {
                        balanced = false;
                    } else {
                        char topChar = stack.pop();
                        if (!areMatching(ch, topChar)) {
                            balanced = false;
                        }
                    }
                }
            }
            index++;
            }


        if(balanced && stack.isEmpty())
            return true;
        else
            return false;


    }

    private static boolean isOpen(char ch)
    {
        if(ch == '<' || ch == '(' || ch == '{' || ch == '[')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isClose(char ch)
    {
        if(ch == '>' || ch == ')' || ch == '}' || ch == ']')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean areMatching(char c1, char c2)
    {
        switch(c1){
            case '<':
                if(c2=='>')
                    return true;
                break;
            case '(':
                if(c2==')')
                    return true;
                break;
            case '{':
                if(c2=='}')
                    return true;
                break;
            case '[':
                if(c2==']')
                    return true;
                break;
            case '>':
                if(c2=='<')
                    return true;
                break;
            case ')':
                if(c2=='(')
                    return true;
                break;
            case '}':
                if(c2=='{')
                    return true;
                break;
            case ']':
                if(c2=='[')
                    return true;
                break;
            default:
                return false;
        }
        return false;

    }
}
