import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!input.equals("print")) {
            String temp = input;
            if (!temp.equals("cancel")) {
                queue.offer(temp);
            }
            if (temp.equals("cancel")) {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.peek());
                    queue.poll();
                } else {
                    System.out.println("Printer is on standby");
                }
            }



            input = scanner.nextLine();
        }

        queue.forEach(System.out::println);
    }
}
