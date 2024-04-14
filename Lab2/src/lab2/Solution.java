/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Habiba
 */
public class Solution{
    
    static double vector_average (Vector v[]){
        double sum = 0;
        for (int i = 0; i < v.length; i++)
           sum += v[i].magnitude();
        return sum/v.length;
   }
   
   public static void main(String[] args){
        Vector v1 = new Vector();
        System.out.print("Vector 1 = ");
        v1.print();

        Vector v2 = new Vector(3,Math.sqrt(3));
        System.out.print("Vector 2 = ");
        v2.print();

        v1.setX(10);
        v1.setY(20);
        System.out.println("Vector 1 = " + v1.getX() + "i " + v1.getY() + "j");
        System.out.println("Angle-Magnitude form: " + v1.magnitude() +" [" + v1.angle() + "]");
        System.out.println();

        System.out.print("Addition result = ");
        (v2.add(v1)).print();

        System.out.print("Vector 3 = ");
        Vector v3 = v2.sub(v1);
        v3.print();

        Vector [] v = {v1,v2,v3,v2.add(v1)}; 
        System.out.println("Average magnitude of the vectors = " + vector_average(v));
   }   
}
