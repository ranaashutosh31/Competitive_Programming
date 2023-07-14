/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.

Example 1:
Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1
Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence returned -1.
*/

class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        if(top1<top2-1) arr[++top1]=x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        if(top1<top2-1) arr[--top2]=x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1>-1) return arr[top1--];
        else return -1;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2<size) return arr[top2++];
        else return -1;
    }
}
