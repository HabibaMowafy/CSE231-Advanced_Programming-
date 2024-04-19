/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question5;

/**
 *
 * @author Habiba
 */
public class Main {
    static int sum = 0;
    static int array_sum(int [] arr){
        for (int i = 0; i < arr.length; i++)
           sum += arr[i] ;
        return sum;
   }
    
    public static void main(String[] args){
        int [] arr = {10,20,30};
        System.out.println(array_sum(arr));
    }
}
