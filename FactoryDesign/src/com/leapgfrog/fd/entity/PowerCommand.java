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
public class PowerCommand extends MathCommand{

    @Override
    public double Calulate(double x, double y) {
      double total=1;
      for(int i=1;i<=y;i++){
        total=total*y;
    }
      return total;
    }
    
}
