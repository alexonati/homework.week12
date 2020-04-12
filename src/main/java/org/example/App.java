package org.example;


public class App
{
    public static void main( String[] args )
    {
        Gate gate = new Gate();
        Thread festivalStatisticsThread = new Thread(new FestivalStatisticsThread(gate));
        festivalStatisticsThread.start();

        for (int i = 0; i <500 ; i++) {
            TicketType ticketType = TicketType.randomTicket();
            new Thread(new FestivalAttendeeThread(gate, ticketType)).start();

        }
        try {
            festivalStatisticsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
