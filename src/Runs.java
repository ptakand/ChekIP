import java.util.Scanner;

public class Runs {
    private boolean run = true;

    public void softTerminate() {
        run = false;
    }

    public void run() {
        Scanner scIP = new Scanner(System.in);
        while (run) {
            System.out.println("Enter IP address or ' quit ' to exit ");
            String input = null;
            if (scIP.hasNext()) {
                input = scIP.nextLine();
            }
            if (input.equals("quit")) {
                scIP.close();
                softTerminate();
                break;
            } else {
                Print.print(input);
                continue;
            }
        }
    }
}
