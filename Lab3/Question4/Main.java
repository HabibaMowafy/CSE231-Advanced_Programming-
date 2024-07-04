/**
 *
 * @author Habiba
 */
public class Main {
       public static void main(String[] args){
            MyStringBuffer name = new MyStringBuffer("Name");
            System.out.println(name.length());
            System.out.println(name.indexOf('m'));
            name.print();
            MyStringBuffer buffer = new MyStringBuffer("Hello, world!");
            buffer.print();
            buffer.erase(0,7);
            buffer.print();
            buffer.insert(0, "Goodbye ");
            buffer.print();
        }
}
