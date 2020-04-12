package org.example;

public class FestivalAttendeeThread implements Runnable {
   private Gate gate;
   private TicketType ticketType;

   public FestivalAttendeeThread (Gate gate, TicketType ticketType) {
      this.gate = gate;
      this.ticketType = ticketType;
   }

   @Override
   public void run () {
      try {

         Thread.sleep(11);
      } catch (Exception e) {
         // Throwing an exception
         System.out.println("Exception is caught");
      }
      gate.count(ticketType);
   }
}