import static java.lang.Math.*;

/**
 *
 * @author Habiba
 */
public class Main {
   
    static void Rectangle_Area_Perimeter(float width, double height)
   {
      System.out.println("Rectangle's Perimeter = " + (2 * (height + width)) + "\t &\tRectangle's Area = " + height * width);
   }
    
    static void Square_Area_Perimeter(float length)
   {
      System.out.println("Square's Perimeter = " + (4 * length) + "\t &\tSquare's Area = " + pow(length,2));
   }
    
    static void Circle_Area_Perimeter(double radius)
   {
      System.out.println("Circle's Perimeter = " + (2 * Math.PI * radius) + "\t &\tCircle's Area = " + Math.PI * pow(radius,2));
   }
    
    public static void main(String[] args){
        Rectangle_Area_Perimeter(4,5.5);
        Square_Area_Perimeter(10);
        Circle_Area_Perimeter(3.2);
    }
}
