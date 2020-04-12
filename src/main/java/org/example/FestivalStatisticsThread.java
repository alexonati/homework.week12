package org.example;

import java.util.concurrent.TimeUnit;

public class FestivalStatisticsThread implements Runnable{

   private Gate gate;

   public FestivalStatisticsThread (Gate gate) {
      this.gate = gate;
   }

   @Override
   public void run () {

      while (!gate.done()){
                     try {
                         Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     gate.printStats();
                 }

   }
}
