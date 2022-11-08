// package Practical Assignment;

import java.util.*;

public class Stack
{
    static int j = 0;
    int size;
    int s;
    int a[] = null;

    Stack()
    {
        size=8;
        s = size;
        a = new int[size];
    }
    Stack(int size)
    {
        this.size = size;
        s = size;
        a = new int[size];
    }

    public void enqueue(int v)
    {
        a[--size] = v;
        // System.out.println(a[j-1]);
    }
    public void print()
    {
        System.out.println(Arrays.toString(a));
        // if(a!=null)
        // {
            // a = null;
            
        // }
    }
    public void dequeue()
    {
        a = null;
        // a = new int[8];
    }
    public boolean empty()
    {
        if(a==null)
        return true;
        else
        return false;
    }
    public int getSize()
    {
        return s;
    }
    //last in first out
}
