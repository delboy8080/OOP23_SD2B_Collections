import java.util.*;

public class ListQuestions
{

    public static void print(List<Integer> items)
    {
        ListIterator<Integer> iter = items.listIterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() +" ");
        }
        System.out.println();
    }
    public static List<Integer> removeN(List<Integer> items, int n)
    {
        List<Integer> nums = new ArrayList<Integer>();
        ListIterator<Integer> iter = items.listIterator();
        int i = 0;
        while(iter.hasNext())
        {
            if((i+1)%n != 0)
            {
                nums.add(iter.next());
            }
            else
            {
                iter.next();
            }
            i++;
        }
        return nums;

    }

    public static void split(List<Integer> org, List<Integer> left, List<Integer> right )
    {
        Iterator<Integer> iter = org.iterator();
        int i = 0;
        while(iter.hasNext())
        {
            if(i < Math.round(org.size()/2.0f))
            {
                left.add(iter.next());
            }
            else
            {
                right.add(iter.next());
            }
            i++;
        }
    }
    public static void removeDuplicates(List<Integer> items)
    {
        int x = 0;
        for(int i = 1; i < items.size();i++)
        {
            if(items.get(x) == items.get(i))
            {
                items.remove(i);
                i--;
            }
            else
            {
                x=i;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> items = new LinkedList<>();
        for(int i =1; i <=10;i++)
        {
            items.add(i);
        }
        print(items);
        System.out.println(removeN(items, 4));

        List<Integer> original = new LinkedList<>();
        for(int i = 1; i<=5;i++)
        {
            original.add(i);
        }
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        split(original, left, right);
        System.out.println(left);
        System.out.println(right);

        List<Integer> duplicates = new ArrayList<>();
        for(int x = 1; x <=5;x++)
        {
            for(int y = 0; y < x; y++)
            {
                duplicates.add(x);
            }
        }
        System.out.println("Original: " + duplicates);
        removeDuplicates(duplicates);
        System.out.println("Removed: " + duplicates);


    }
}
