import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExercises
{

    public static void main(String[] args) throws IOException {
        question9();
    }

    public static void question8() throws IOException
    {
        Set<String> uniqueWords = new TreeSet<>();
        Set<String> uniqueWordsHash = new HashSet<>();
        Scanner fIn = new Scanner(new File("words.txt"));
        while(fIn.hasNext())
        {
            String word = fIn.next();
            if(!uniqueWords.add(word))
            {
                System.out.println("Value not added: "+ word );
            }
            uniqueWordsHash.add(word);
        }

        System.out.println(uniqueWords);
        System.out.println(uniqueWordsHash);

    }

    public static void question9()
    {
        System.out.println(sieve(10000000));
    }

    public static Set<Integer> sieve(int N)
    {
        Set<Integer> values = new TreeSet();
        for(int i = 1; i <= N; i++)
        {
            values.add(i);
        }

        int x;
        for(int i=2; i < Math.sqrt(N); i++)
        {
            if(values.contains(i)) {
                x = 2;
                while (x * i <= N) {
                    values.remove(x * i);
                    x++;
                }
            }
        }
        return values;
    }
}
