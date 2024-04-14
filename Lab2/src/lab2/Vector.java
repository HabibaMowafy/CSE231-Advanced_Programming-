/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab2;

import static java.lang.Math.*;

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

   Vector add(Vector v){
      Vector additon_result = new Vector();
      additon_result.x = x + v.x;
      additon_result.y = y + v.y;
      return additon_result;
   }

   Vector sub(Vector v){
      Vector subtraction_result = new Vector();
      subtraction_result.x = x - v.x;
      subtraction_result.y = y - v.y;
      return subtraction_result;
   }
}
