import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Collection8
{
    public static void main(String[] args)
    {
        Queue<Integer>queue = new LinkedList<Integer>();
        Set<Integer>set = new HashSet<Integer>();
        int intNumber = 5;
        queue.add(6);
        queue.add(2);
        queue.add(6);
        queue.add(8);
        queue.add(3);
        queue.add(6);
        queue.add(6);
        //int[] subArray =
        set.addAll(queue);

        System.out.println("queue = "+queue);
        System.out.println("Output:\n"+set.size());
    }
}
