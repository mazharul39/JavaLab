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
public class Static {
     public static void main(String[] args) {
         Triangle tri=new Triangle(11,2);
       Triangle triangle1= new Triangle(tri);
        Triangle triangle2= new Triangle(3,2);
        
        if(Triangle.isEqual(tri, triangle1)){
            System.out.println("triangle3 is equal to triangle1");
        }
        else{
            System.out.println("triangle3 is not equal to triangle1");
        }
        if(Triangle.isEqual(tri, triangle2)){
            System.out.println("triangle3 is equal to triangle2");
        }
        else{
            System.out.println("triangle3 is not equal to triangle2");
        }
    }
    
}
