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
public class NestedIfElse {
    public static void main(String[] args) {
        float f = 765.0000f;
        double d = 765.00000000000000000;
        int i = 765;
        
        if(f == d){
            if(f == i){
                System.out.println("Here f,i and d are equivalent");
            }else{
                System.out.println("Here only f and d are equal");
            }
        }else{
            System.out.println("The values are not equal");
        }
    }
}
