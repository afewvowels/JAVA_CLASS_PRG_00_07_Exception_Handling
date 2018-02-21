/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_07_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author kbsmith01
 */
public class JAVA_CLASS_PRG_00_07_Exception_Handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean looping = true;
        
        int numerator = 1;
        int denominator = 1;
        int result = 1;
        
        Scanner keyboard = new Scanner(System.in);
        
        

        
        do {
            try {
                System.out.print("Enter an integer numerator: ");
                numerator = keyboard.nextInt();
                looping = false;
            }
            catch(InputMismatchException ime) {
                keyboard.nextLine();
                System.out.println("\nThat is not an integer value.");
            }
        } while(looping);
        
        looping = true;
        do {
            try {
                System.out.print("Enter an integer denominator: ");
                denominator = keyboard.nextInt();
                looping = false;
            }
            catch(InputMismatchException imeEx) {
                System.out.println("\nThat is not an integer value.");
            }
        } while(looping);
        
        try {
            result = numerator / denominator;
            System.out.println("The result it " + result);
        }
        catch(ArithmeticException aeEx) {
            System.out.println("Arithmetic error");
        }
        
        
        System.out.println("Goodbye");
    }
    
}
