import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueQuestion
{

    public static void main(String[] args) {
        PriorityQueue<Task> queue = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        String choice = "";
        do {
            System.out.print(">");
            choice = in.next();
            if(choice.equalsIgnoreCase("add")){
                int priority = in.nextInt();
                String task = in.nextLine();
                Task tsk = new Task(priority, task);
                queue.add(tsk);
            }
            else if(choice.equalsIgnoreCase("next")){
                if(!queue.isEmpty()) {
                    Task tsk = queue.poll();
                    System.out.println(tsk);
                }
                else {
                    System.out.println("Nothing left to do. Relax and merry christmas!");
                }
            }
            else if(choice.equalsIgnoreCase("preview"))
            {
                if(!queue.isEmpty()) {
                    Task tsk = queue.peek();
                    System.out.println(tsk);
                }
            }
        }while(!choice.equalsIgnoreCase("exit"));

    }
}
