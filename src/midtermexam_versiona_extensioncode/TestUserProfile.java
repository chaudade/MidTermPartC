/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Adeem
 */

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Available Genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (String genre : genres) {
            System.out.println(genre);
        }
        
        System.out.print("Choose your favorite genre: ");
        String favoriteGenre = scanner.nextLine();
        
        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        
        System.out.println("User profile created successfully!");
    }
}
