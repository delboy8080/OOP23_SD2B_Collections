import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question6
{

    public static void main()
    {
        Map<String, String> grades = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Display all Students");
            System.out.println("4. Remove Student");
            System.out.println("5. Change Grade");
            choice = in.nextInt();
            in.nextLine();
            switch(choice)
            {
                case 1:
                {
                    String name, grade;
                    System.out.print("Name: ");
                    name = in.nextLine();
                    System.out.print("Grade: ");
                    grade = in.nextLine();
                    grades.put(name, grade);
                }
                break;
            }

        }while(choice != 0);
    }
}
