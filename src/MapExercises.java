import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MapExercises
{
    public static ContactDetails parseLine(String line)
    {
        String name, home, mob, email;
        String[] data= line.split(";");
        name = data[0];
        home = data[1];
        mob = data[2];
        email = data[3];
        return new ContactDetails(name, home, mob, email);
    }
    public static void loadPhonebook(Map<String, ContactDetails> book, String filename)
            throws IOException
    {
            Scanner fin = new Scanner(new File(filename));
            while(fin.hasNextLine())
            {
                String line = fin.nextLine();
                ContactDetails cd = parseLine(line);
                book.put(cd.getName(), cd);
            }
    }
    public static void question4() throws IOException {
        Scanner kb = new Scanner(System.in);
        Map<String, ContactDetails> phoneBook
                = new HashMap<>();
        loadPhonebook(phoneBook, "phonebook.txt");

        int choice = 0;
        do {
            System.out.println("1. Add entry");
            System.out.println("2. Find entry");
            System.out.println("3. Display All entries");
            System.out.println("4. Remove entry");
            choice = kb.nextInt();
            kb.nextLine();
            switch(choice)
            {
                case 1: {
                    System.out.println("Name: ");
                    String name = kb.nextLine();
                    System.out.println("Home Phone Number: ");
                    String home = kb.nextLine();
                    System.out.println("Mobile Number: ");
                    String mob = kb.nextLine();
                    System.out.println("Email : ");
                    String email = kb.nextLine();
                    ContactDetails cd = new ContactDetails(name, home, mob, email);
                    phoneBook.put(name, cd);

                }break;
                case 2:
                {
                    System.out.println("Name: ");
                    String name = kb.nextLine();
                    if(phoneBook.containsKey(name))
                    {
                        System.out.println(name +" -> " + phoneBook.get(name));
                    }
                    else
                    {
                        System.out.println("Name not found.");
                    }
                }
                break;
                case 3:
                {
                    Set<Map.Entry<String, ContactDetails>> entries=
                            phoneBook.entrySet();
                    for(Map.Entry<String, ContactDetails> item : entries)
                    {
                        System.out.println(item.getKey() + "-> "
                                + item.getValue());
                    }
                }
                break;
                case 4:
                {
                    System.out.println("Name: ");
                    String name = kb.nextLine();
                    if(phoneBook.containsKey(name))
                    {
                        phoneBook.remove(name);
                        System.out.println("Entry removed");
                    }
                    else
                    {
                        System.out.println("Item does not exist");
                    }
                }
                break;
            }

        }while(choice != -1);

    }


    public static void question5() throws FileNotFoundException {
        Map<String, Set<Integer>> index = new HashMap<>();
        Scanner fin = new Scanner(new File("words.txt"));
        int lineNumber = 1;
        while(fin.hasNextLine())
        {
            String line = fin.nextLine();
            String[] words = line.split(" ");
            for(String s : words)
            {
                if(index.containsKey(s))
                {
                    index.get(s).add(lineNumber);
                }
                else
                {
                    Set<Integer> nums = new HashSet<>();
                    nums.add(lineNumber);
                    index.put(s, nums);
                }
            }
            lineNumber++;
        }

        Set<String> keys = index.keySet();

        for(String s: keys)
        {
            System.out.println(s + "-> " + index.get(s));
        }
    }

    public static void main(String[] args) throws IOException {
        question5();
    }
}
