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
public class IfElseStatement {
    
    public static void main(String[] args) {
        int alpha = 65;
        
        if(alpha == 45){
            System.out.println("The number 45 is there inside alpha");
        }else if(alpha == 75){
            System.out.println("The condition else-if is executed");
        }else{
            System.out.println("The value of alpha is 65"); 
        }
    }
}
