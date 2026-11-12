import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) throws InterruptedException {

        TicketPool ticketPool = new TicketPool(100);

        List<Thread> threads = new ArrayList<>();

        System.out.println("Ticket sales begin! Number of tickets: " + ticketPool.getAvailableTickets());

        for (int i = 1; i <= 500; i++) {
            User user = new User("Användare-" + i, ticketPool);
            Thread thread = new Thread(user);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("The ticket release is over! Remaining tickets: " + ticketPool.getAvailableTickets());


    }




}
