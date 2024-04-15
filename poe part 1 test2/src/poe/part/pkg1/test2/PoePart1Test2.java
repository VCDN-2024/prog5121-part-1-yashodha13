
package poe.part.pkg1.test2; //  the package name

import javax.swing.JOptionPane; // Imports the JOptionPane class from the javax.swing package
import java.util.regex.*; // Imports classes from the java.util.regex package

public class PoePart1Test2 { // class named PoePart1Test2

    private String username; 
    private String password; 
    private boolean loggedIn; 
// the above code declares a private member variable to store the variables
    
    
    // Initializes loggedIn variable to false when an object of PoePart1Test2 is created
    public PoePart1Test2() { 
        loggedIn = false; 
    }

    public boolean checkUsername(String username) { 
        // the above code is a method to check  the username 
        return username.length() <= 5 && username.contains("_");
        // if the username meets the standards its true
    }

    public boolean checkPasswordComplexity(String password) { 
// the above code is a method to check the password
        return password.length() >= 8 && 
// its true if password is less then equal to 8 characters
                Pattern.compile("[A-Z]").matcher(password).find() && Pattern.compile("[0-9]").matcher(password).find() && Pattern.compile("[^A-Za-z0-9]").matcher(password).find();
        //the above code is checking if the password the user provides contains a capital letter, a number and special characater
    } 

    public String registerUser(String username, String password) { 
//  method to register user and password 


        if (checkUsername(username) && checkPasswordComplexity(password)) { 
// checks the username and password 
            this.username = username; 
// this code will set the username to the username entered 

            this.password = password; 
// this code uses the same concept as the one above which sets the password as the one provided 
            return "Account successfully created."; 
// displays a message if true



        } else {
            return "Invalid username or password."; 
// display  error message if false
        }
    }

    public boolean loginUser(String username, String password) { 
// the above code allows the user to login using their information


        if (this.username != null && this.password != null && 
// checks the username and password 
                this.username.equals(username) && this.password.equals(password)) { 

            loggedIn = true; 
// this code will check if the entered information is the same as the information stored if so the user is logged in


            return true; 
//  successful login
        } else {
            loggedIn = false; 


            return false; 
// its false if the information is not equal
        }
    }

    public String returnLoginStatus() { 
// Defines a method to return the login status
        return loggedIn ? "User logged in." : "User not logged in."; 
// displays a message based if code is correct or incorrect
    }

    public static void main(String[] args) { 

        PoePart1Test2 login = new PoePart1Test2(); 

        
        
        String username = JOptionPane.showInputDialog(null, "Enter username:");
 // this will ask the user to enter a username
        
        String password = JOptionPane.showInputDialog(null, "Enter password:"); 
// this will ask the user to enter a password
        System.out.println(login.registerUser(username, password)); 
// Registers the user with the username and password

        username = JOptionPane.showInputDialog(null, "Enter username for login:");
        // Prompts the user to enter a username for login
        
        
    
         
        password = JOptionPane.showInputDialog(null, "Enter password for login:"); 
   // Prompts the user to enter a password for login
        if (login.loginUser(username, password)) { 
// Logs in the user 
            JOptionPane.showMessageDialog(null, "Login successful."); 
// Displays a message  successful login

        } else {
            JOptionPane.showMessageDialog(null, "Login failed."); 
// Displays a message  failed login


        }
        System.out.println(login.returnLoginStatus()); 
// shows login in status
    }
}

//referrences:
//https://www.w3schools.com/
//https://stackoverflow.com/
//https://youtu.be/sFTbCVnUbLo?si=_5laLjZNENT4XAyj
//https://developer.mozilla.org/en-US/
//https://www.geeksforgeeks.org/

