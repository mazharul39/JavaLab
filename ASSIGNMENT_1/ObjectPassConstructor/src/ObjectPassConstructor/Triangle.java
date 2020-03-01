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
public class Triangle {
    int height;
    int ground;
    
    Triangle(int height,int ground){
        this.height= height;
        this.ground= ground;
    }
    Triangle(Triangle triangle1){
        this.height= triangle1.height;
        this.ground= triangle1.ground;
    }
    
    public boolean isEqual(Triangle triangle1){
        return this.height==triangle1.height&& this.ground==triangle1.ground;
    }
    public static boolean isEqual(Triangle rec1,Triangle rec2){
        return rec1.height==rec2.height&& rec1.ground==rec2.ground;
    }
    
    @Override
    public String toString(){
        return "height: "
                + this.height
                + " ground: "+ this.ground;
               
    
}
    
}
