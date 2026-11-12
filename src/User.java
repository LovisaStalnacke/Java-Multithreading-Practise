public class User implements Runnable {

    private String userName;
    private TicketPool ticketPool;

    public User(String userName, TicketPool ticketPool) {
        this.userName = userName;
        this.ticketPool = ticketPool;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {}

    @Override
    public void run() {
        ticketPool.bookTicket(userName);
    }

}
