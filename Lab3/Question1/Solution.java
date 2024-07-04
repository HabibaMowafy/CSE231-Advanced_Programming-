import static Question1.Vector.*;

/**
 *
 * @author Habiba
 */
public class Solution {
    
    public static void main(String[] args){
        Vector v1 = new Vector(5,5);
        Vector v2 = new Vector();
        v2.read();
        add(v1,v2).print();
        sub(v1,v2).print(); 
    }
}
