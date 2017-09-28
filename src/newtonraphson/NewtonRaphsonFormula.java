/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

import java.util.LinkedList;

/**
 *
 * @author Core i5
 */



public class NewtonRaphsonFormula{
    
    LinkedList list = new LinkedList<>();
    LinkedList list2 = new LinkedList<>();
    LinkedList list3 = new LinkedList<>();
    
    double x;
        
    double evalf(double x){
        return x*x-2;
    }    
    
    double evaldf(double x){
        return 2*x;
    }    
    
       public double raiz( double x, double e, int n){
        double r= Double.NaN;
        int k=0;
        list2.add(x);
        while (Math.abs(evalf(x))>e&&k<n) {
            x=x-evalf(x)/evaldf(x);
            k++;
            list.add(x);
            list2.add(x);
            list3.add(k);
            
        }
        System.out.println("list3:"+list3);
         System.out.println("list:"+list);
         System.out.println("list:"+list.size());
        if(k<n)r=x;
        
        return r;
           
    }
     
      public int getlistsize(){
          return list.size();
      }
      
       public LinkedList getlist(){
          return list;
      }
       public LinkedList getlist2(){
          return list2;
      }
       public LinkedList getlist3(){
          return list3;
      }
       
       
}
