/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Habiba
 */
public class Vector{

   private double x, y;

   public Vector(){
      x = 0;
      y = 0;
   }

   public Vector(double x, double y){
      this.x = x;
      this.y = y;
   }

   double getX(){
      return this.x;
   }

   double getY(){
      return this.y;
   }

   void setX(double x){
      this.x = x;
   }

   void setY(double y){
      this.y = y;
   }

   double magnitude(){
      return sqrt(pow(x,2) + pow(y,2));
   }

   double angle(){
      return atan(y / x) * (180 / PI);
   }

   void print(){
      System.out.println(" Kartesian form: " + x + "i + " + y + "j");
      System.out.println("Angle-Magnitude form: " + magnitude() + "[" + angle() + "]");
      System.out.println();
   }

   static Vector add(Vector v1, Vector v2){
      Vector additon_result = new Vector();
      additon_result.x = v1.x + v2.x;
      additon_result.y = v1.y + v2.y;
      return additon_result;
   }

   static Vector sub(Vector v1, Vector v2){
      Vector subtraction_result = new Vector();
      subtraction_result.x = v1.x - v2.x;
      subtraction_result.y = v1.y - v2.y;
      return subtraction_result;
   }
   
   void read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X Component: ");
        x = input.nextDouble();
        System.out.print("Enter Y Component: ");
        y = input.nextDouble();
   }
}
