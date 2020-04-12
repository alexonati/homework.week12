package org.example;

import java.util.Random;

public enum TicketType {
   FULL ("Full",0),
   VIP ("VIP", 1),
   FREE_PASS ("Free-Pass", 2),
   ONE_DAY("One-Day", 3),
   ONE_DAY_VIP("One-Day-VIP", 4);


   public static TicketType randomTicket () {
      int pick = new Random().nextInt(TicketType.values().length);
      return TicketType.values()[pick];

   }

   private final String name;


   TicketType (String name, int i) {
      this.name = name;
   }
}




