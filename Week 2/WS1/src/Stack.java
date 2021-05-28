public class Stack {

    private char[] stack;
    private int top;
    public Stack(int length) {

        stack = new char[length];
        top = -1;
    }
    public boolean checkEmpty()
    {
        if(top == -1) return true;
        else return false;
    }

    public char pop(){return stack[top--];}
    public void push(char str){stack[++top]=str;}
}
