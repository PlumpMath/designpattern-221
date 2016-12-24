package com.yudeyang.command;

/* The test class or client
*
*
* */

public class PressSwitch {
   public static void main(String[] args){

      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);

      Switch mySwitch = new Switch();

      mySwitch.storeAndExecute(switchUp);
      
      mySwitch.storeAndExecute(switchDown);

   }
}