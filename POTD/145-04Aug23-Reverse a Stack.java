//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution
{ 
    static void pushAtButtom(int data,Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButtom(data,s);
        s.push(top);
    }
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty())
            return;
        int top = s.pop();
        reverse(s);
        pushAtButtom(top,s);
        
    }
}
