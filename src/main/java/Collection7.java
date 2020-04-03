import java.lang.reflect.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collection7
{
    private static int count;
    public static Deque queue = new LinkedList<>();
    int num = 4;

    public Deque getQueue()
    {
        return queue;
    }

    public void setQueue(Deque queue)
    {
        this.queue = queue;
    }

    public static int uniqueNum(int[] subArr)
    {
        if (subArr.length == 0)
        {
           count = 0;
        }
        for (int i = 0; i <subArr.length-1; i++)
        {
            if (subArr[i] != subArr[i+1])
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        //List<String>
        uniqueNum(new int[5]);
        count=3;
        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(1);
        queue.add(4);
        queue.add(4);
        try
        {
            String output = (String) queue.stream().collect(Collectors.joining(","));
            String h = (String) queue.stream().distinct().collect(Collectors.toList());
            System.out.println(output);
            System.out.println("unique: "+h);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
