/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class POEpart1 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Account Creation");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        String result = createAccount(username, password, firstName, lastName);
        System.out.println(result);
        
        scanner.close();
    }

    private static String createAccount(String username, String password, String firstName, String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

}
