/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapgfrog.fd;

import com.leapgfrog.fd.entity.MathCommand;
import com.leapgfrog.fd.entity.MathFactory;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("enter first number");
            double x=input.nextDouble();
            System.out.println("enter second number");
            double y=input.nextDouble();
            menu();
            
            String param=input.next();
            
            double total=1;
            
           MathCommand cmd = MathFactory.get(param);
           if(cmd!=null){
               total=cmd.Calulate(x, y);
               System.out.println("total is " +total);
           }
            System.out.println("Do you Want to continue[y/n]");
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);

            }
        }  
        }
        private static void menu(){
            System.out.println("1. Add"); 
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Power");
            System.out.println("6. Exit");
            System.out.println("Enter any choce[1-6]");
        
        
    }
    
}
