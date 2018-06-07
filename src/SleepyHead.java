//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    int ans = JOptionPane.showConfirmDialog(null, "is it a weekday?", "",JOptionPane.YES_NO_OPTION);
        
        if(ans==0) {
        isWeekday = true;
  
        }
        else {
        isWeekday = false;
        	
        }
     int ans2 = JOptionPane.showConfirmDialog(null, "is it a vacation?", "",JOptionPane.YES_NO_OPTION);
        
     if(ans2==0) {
         isVacation = true;
      
         }
         else {
         isVacation = false;
         	
         }
     if(ans2==0 || isWeekday == false) {
    	 System.out.println("sleep in");
    	 
     }
     else if (isWeekday == true && isVacation == true) {
    	 System.out.println("sleep in");
    	 
     }
     
     else {
    	 System.out.println("get up lazybones!");
    	 
     }
     
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and if we are on vacation,
         * print “sleep in”.
         */
    }
}
