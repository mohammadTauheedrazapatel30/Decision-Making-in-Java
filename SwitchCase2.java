/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.decision_making;

/**
 *
 * @author Mohammad Tauheed
 */
public class SwitchCase2 {

    public static void main(String[] args) {

        String month = "1";

        switch (month) {
            //case value1 :
            case "January":
                System.out.println("First Month");
                break;
            case "Febraury":
                System.out.println("Second Month");
                break;
            case "March":
                System.out.println("Third Month");
                break;
            case "April":
                System.out.println("Fourth Month");
                break;
            case "May":
                System.out.println("Fifth Month");
                break;
            case "June":
                System.out.println("First Month");
                break;
            case "July":
                System.out.println("Second Month");
                break;
            case "August":
                System.out.println("Third Month");
                break;
            case "September":
                System.out.println("Fourth Month");
                break;
            case "October":
                System.out.println("Fifth Month");
                break;
            case "November":
                System.out.println("First Month");
                break;
            case "December":
                System.out.println("Second Month");
                break;
            default :
                System.out.println("Doesn't match any case !");
                break;
        }
    }

}
