/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Poepart1 {
    public static String createAccount(String username, String password, String firstName, String lastName) {
        if (!isValidPassword(password)) {
            return "The password does not meet the complexity requirements.";
        }
        
        // In a real application, you would save the user details to a database here
        return "User has been registered successfully.";
    }
    
    public static boolean isValidPassword(String password) {
        // Check if password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }
        
        // Check if password contains a capital letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }
        
        // Check if password contains a number
        if (!Pattern.compile("\\d").matcher(password).find()) {
            return false;
        }
        
        // Check if password contains a special character
        if (!Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]").matcher(password).find()) {
            return false;
        }
        
        return true;
    }
}

