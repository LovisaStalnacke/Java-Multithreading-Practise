public class TicketPool {

    private int availableTickets;

    public TicketPool(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public boolean bookTicket(String userName){

        if (availableTickets <= 0){
            return false;
        } else {
            try {
                Thread.sleep(500);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets--;
            System.out.println(userName + " köpte en biljett! Kvar: " + availableTickets);
            return true;
        }
    }




}
