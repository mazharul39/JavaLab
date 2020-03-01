/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassConstructor;

/**
 *
 * @author mazha
 */
public class Constructor {
    
         public static void main(String[] args) {
       Triangle triangle1= new Triangle(7,4);
        Triangle triangle2= new Triangle(triangle1);
        
        System.out.println("triangle1: ");
        System.out.println(triangle1);
        System.out.println("triangle2: ");
        System.out.println(triangle2);
    }
}
