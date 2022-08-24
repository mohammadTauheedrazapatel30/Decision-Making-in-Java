/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.decision_making;

import java.util.Scanner;



/**
 *
 * @author Mohammad Tauheed
 */
public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Use between 1 to 8");          
        Scanner scan = new Scanner(System.in);
          
          int i = scan.nextInt();
          
          switch(i){
              case 1:
                  System.out.println("Your number is 1");
                  break;
                  
              case 2:
                  System.out.println("Your number is 2");
                  break;
                  
              case 3:
                  System.out.println("Your number is 3");
                  break;
                  
              case 4:
                  System.out.println("Your number is 4");
                  break;
                  
              case 5:
                  System.out.println("Your number is 5");
                  break;
                  
              case 6:
                  System.out.println("Your number is 6");
                  break;
                  
              case 7:
                  System.out.println("Your number is 7");
                  break;
                  
              case 8:
                  System.out.println("Your number is 8");
                  break;
              default :
                  System.out.println("YOur number doesn't match here !");
                  break;
          }
    }
}
