import static java.lang.Math.*;

/**
 *
 * @author Habiba
 */
public class Vector_2d{
    
   private double x, y;

   public Vector_2d(){
      x = 0;
      y = 0;
   }

   public Vector_2d(double x, double y){
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

   Vector_2d add(Vector_2d v){
      Vector_2d additon_result = new Vector_2d();
      additon_result.x = x + v.x;
      additon_result.y = y + v.y;
      return additon_result;
   }

   Vector_2d sub(Vector_2d v){
      Vector_2d subtraction_result = new Vector_2d();
      subtraction_result.x = x - v.x;
      subtraction_result.y = y - v.y;
      return subtraction_result;
   }
}
