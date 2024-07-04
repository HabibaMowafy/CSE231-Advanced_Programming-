import java.util.Scanner;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Habiba
 */
public class Solution{
    
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            Line_2d line1 = new Line_2d (1,1,3,3);
            line1.print();

            System.out.print("Enter the position of the line: ");
            Point2D point = new Point2D ( input.nextDouble() , input.nextDouble() ) ;

            System.out.print("Enter the direction of the line :");
            Vector_2d vector = new Vector_2d ( input.nextDouble() , input.nextDouble() ) ;
            System.out.println();
            
            Line_2d line2 = new Line_2d(vector, point);
            line2.print();
            vector.add(new Vector_2d(10,20)).print(); 
        }
}
