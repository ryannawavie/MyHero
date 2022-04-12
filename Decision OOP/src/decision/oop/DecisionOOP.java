/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decision.oop;

import java.util.Scanner;

/**
 *
 * @author Ryan Nawavie
 */
public class DecisionOOP {
    public static void main(String args[]) {
      int level;
      int skillcomp;
      String status;

      System.out.println("Input Your Hero Level: ");
      Scanner inputlevel =new Scanner(System.in);
      level = inputlevel.nextInt();
      System.out.print("Skill Comprehension Level : ");
      Scanner inputskillcomp =new Scanner(System.in);
      skillcomp = inputskillcomp.nextInt();
      if(level >= 80 && skillcomp >= 67)
        {
            status = "Ready to challenge THE BOSS";
        }
        else
        {
            status = "Sorry, Level UP MORE !!!";
        }
        System.out.println(status);
        
    }
}
