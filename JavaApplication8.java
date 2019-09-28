/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author uk023
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
  
        
        int a, b , sum , j,p,i,q ;
        Scanner s = new Scanner(System.in);
        System.out.println("enter values for a and b");
        a=s.nextInt();
        b=s.nextInt();
        j=0;
        sum=a+b;
        int a1[]=new int[sum];
        int b1[]=new int[sum];
        int c[]= new int[sum];
        for( i =1;i<=a/2;i++)
       {
        if(a%i==0)
         { a1[j]=i;
          j++;
         }
         
    }
        j=0;
        for( i =1;i<=b/2;i++)
       {
        if(b%i==0)
         { b1[j]=i;
          j++;
         }
         
    }
       
    for(p=0;p<=a/2;p++)
    {
            
        for(q=0;q<=b/2;b++)
        {
            if(a1[p]==b1[q])
            {
                for(i=0;i<a+b;i++)
                {
                 if(c[i]!=a1[p])
                {
                   c[i]=a1[p];
                }
            }
        }
    }
}

for(i=0;i<a+b;i++)
System.out.print(c[i]);
}
}
        
        
        
        
        
   
    

