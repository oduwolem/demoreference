/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoreference;

import java.util.Arrays;

/**
 *
 * @author class
 */
public class DemoReference {

    /**
     * int iNumber =5;
     * int intNumber =5;
     * int iNumbers [];
     * int intNumbers [];
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int digits[] = {10,20,30,40};
        System.out.println("first element is " + numbers[0]);
        System.out.println("first element is " + digits[0]);
        
        System.out.println("reference stored in numbers is" + numbers);
        System.out.println("reference stored in numbers is" + digits);
        
        System.out.println(Arrays.toString(numbers));
        
        numbers = digits;
        System.out.println("numbers is" + numbers);
        System.out.println("digits is" + digits);
        
         System.out.println("first element is " + numbers[0]);
        System.out.println("first element is " + digits[0]);
        
        numbers[0]=99;
         System.out.println("first element is " + numbers[0]);
        System.out.println("first element is " + digits[0]);

        System.out.println("last element is " + numbers[3]);
        System.out.println("last element is " + digits[3]);        
    }
    
    
}
