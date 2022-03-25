package views;

import models.User;
import services.UserService;

import java.util.Scanner;

public class Register {
    public static void view(){
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Username: ");
        String username = sc.nextLine();

        System.out.println("Password: ");
        String password = sc.nextLine();

        System.out.println("First Name: ");
        String firstname = sc.nextLine();

        System.out.println("Last Name: ");
        String lastname = sc.nextLine();

        userService.createUser(new User(username, password, firstname, lastname) );
    }
}
