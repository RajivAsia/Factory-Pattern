/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapgfrog.fd.entity;

/**
 *
 * @author lenovo
 */
public class MathFactory {
    public static MathCommand get(String param){
        if (param.equalsIgnoreCase("1")){
            return new Addcommand();
        }
        if (param.equalsIgnoreCase("2")){
            return new SubClass();
        
    }
         if (param.equalsIgnoreCase("3")){
            return new MulCommand();
            
    
}
          if (param.equalsIgnoreCase("4")){
            return new DivClass();
          }
           if (param.equalsIgnoreCase("6")){
            return new ExitCommand();
           }
           if (param.equalsIgnoreCase("5")){
            return new PowerCommand();
           }
           return null;
    }
    }
    