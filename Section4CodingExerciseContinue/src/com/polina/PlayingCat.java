package com.polina;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
       if (temperature >= 25) {
           if (temperature <= 45) {
               if (summer) {
                   return true;
               } else {
                   if (temperature <= 35) {
                       return true;
                   }
               }
           }
       }
       return false;
    }
}
