package org.example;


public class App
{
    public static void main( String[] args )
    {
        Gate gate = new Gate();
        TicketType ticketType = TicketType.randomTicket();
        Thread festivalStatisticsThread = new Thread(new FestivalStatisticsThread(gate));
        festivalStatisticsThread.start();

        for (int i = 0; i <500 ; i++) {

            new Thread(new FestivalAttendeeThread(gate, ticketType));

        }
        try {
            festivalStatisticsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
