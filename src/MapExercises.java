import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExercises
{
    public static void loadPhonebook(Map<String, ContactDetails> book, String filename)
    {

    }
    public static void question4()
    {
        Scanner kb = new Scanner(System.in);
        Map<String, ContactDetails> phoneBook
                = new HashMap<>();
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
            }

        }while(choice != -1);

    }



    public static void main(String[] args)
    {
        question4();
    }
}
