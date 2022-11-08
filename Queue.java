import java.util.Arrays;

public class Queue
{
    static int j = 0;
    //first in first out
    int size;
    int a[] = null;
    Queue()
    {
        size=8;
        a = new int[size];
    }
    Queue(int size)
    {
        this.size = size;
        a = new int[size];
    }

    public void enqueue(int v)
    {
        a[j++] = v;
        // System.out.println(a[j-1]);
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
        return size;
    }
    public void print()
    {
        System.out.println(Arrays.toString(a));
        
    }
}
