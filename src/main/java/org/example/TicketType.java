package org.example;

import java.util.Random;

public enum TicketType {
   FULL("Full"),
   VIP("VIP"),
   FREE_PASS("Free-Pass"),
   ONE_DAY("One-Day"),
   ONE_DAY_VIP("One-Day-VIP");


   public static TicketType randomTicket () {
      int pick = new Random().nextInt(TicketType.values().length);
      return TicketType.values()[pick];

   }

   private final String name;


   TicketType (String name) {
      this.name = name;
   }
}




