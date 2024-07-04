import javafx.geometry.Point2D;

/**
 *
 * @author Habiba
 */
public class Line_2d{
    
   private Vector_2d vector;
   private Point2D point;

   public Line_2d(){
      vector = new Vector_2d(0,0);
      point  = new Point2D(0,0);
   }
   
   public Line_2d(Vector_2d vector, Point2D point){
      this.vector = vector ;
      this.point  = point ;
   }
   
   Line_2d(double x , double y , double x_of_vector, double y_of_vector){
      point  = new Point2D(x,y);
      vector = new Vector_2d(x_of_vector,y_of_vector);
   }
   
   void print(){
       System.out.println("Position: " + point);
       System.out.print("Direction: ");
       vector.print();
   }
}
