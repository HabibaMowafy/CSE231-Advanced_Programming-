/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4;

/**
 *
 * @author Habiba
 */
public class MyStringBuffer {
    private final char[] array;
    
    public MyStringBuffer(String value){
        array = value.toCharArray();
    }
    
    
    void print(){
        System.out.println(toString());
    }
    
    int indexOf(char c){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }
    
    int length(){
        return array.length;
    }
    
    public MyStringBuffer erase(int index, int length){
        char[] newArr = new char[array.length - length];
        System.arraycopy(array, 0, newArr, 0, index);
        System.arraycopy(array, index + length, newArr, index, array.length - index - length);
        return new MyStringBuffer(new String(newArr)); 
    }
    
    public MyStringBuffer insert(int index, String str){
        char[] newArr = new char[array.length + str.length()];
        System.arraycopy(array, 0, newArr, 0, index);
        System.arraycopy(str.toCharArray(), 0, newArr, index, str.length());
        System.arraycopy(array, index, newArr, index + str.length(), array.length - index);
        return new MyStringBuffer(new String(newArr));
    }
    
    @Override
    public String toString() {
        return new String(array);
    }
}
