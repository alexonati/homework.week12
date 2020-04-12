package org.example;

import java.util.Date;

public class Gate {

//   TicketType ticketType = TicketType.randomTicket();
//   TicketType ticketType2 = TicketType.values()[1];
//   TicketType ticketType3 = TicketType.values()[2];
//   TicketType ticketType4 = TicketType.values()[3];
//   TicketType ticketType5 = TicketType.values()[4];

   private int fulls ;
   private int vips ;
   private int freePass ;
   private int oneDays ;
   private int oneDayVips ;

   void printStats(){
      System.out.println(String.format("Count at %s  with Full = %s , freePass = %s, oneDays = %s, oneDayVips = %s, vips = %s with total = %s",new Date().toString(),fulls,freePass,oneDays,oneDayVips,vips,(fulls+freePass+oneDays+oneDayVips+vips)));
   }

synchronized void count(TicketType ticketType) {
      switch (ticketType){
         case FULL:
            fulls++;
            break;
         case FREE_PASS:
            freePass++;
            break;
         case ONE_DAY:
            oneDays++;
            break;
         case ONE_DAY_VIP:
            oneDayVips++;
            break;
         case VIP:
            vips++;
            break;
         default: throw new RuntimeException();
      }
   }

   public boolean done() {
      return (fulls+freePass+oneDays+oneDayVips+vips == 500);
   }
}
