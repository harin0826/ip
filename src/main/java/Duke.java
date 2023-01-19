import java.util.Scanner;
public class Duke {
    private static String DIV_OPEN = "____________________________________________________________\n";
    private static String DIV_CLOSE = "____________________________________________________________\n";
    public static void main(String[] args) {
        // Initialize
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n"
                + "\n";
        String greetings = "Hello! I'm Duke\n"
                + "What can I do for you?\n";
        String[] list = new String[101];
        int listNum = 1; // starts from 1 for convenience
        System.out.println(DIV_OPEN + logo + greetings + DIV_CLOSE);
        // Initialization complete

        // Accept user input in a loop
        Scanner sc = new Scanner(System.in);
        while(true) {

            String msg = sc.nextLine();

            // Terminate Duke
            if (msg.equals("bye")) {
                break;
            }

            // Commands
            System.out.println(DIV_OPEN); // DIV_OPEN for output

            // List
            if (msg.equals("list")) {
                for (int i = 1; i < listNum; i++) {
                    System.out.println(listNum + ". " + list[i] + "\n");
                }
            } else { // Add
                
            }

            System.out.println(DIV_CLOSE); // DIV_CLOSE for output
        }




        // End of program
        sc.close();
        System.out.println(DIV_OPEN + "Bye. Hope to see you again soon!\n"+ DIV_CLOSE);
    }
}
