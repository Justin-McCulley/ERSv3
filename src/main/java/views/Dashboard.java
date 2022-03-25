package views;

import models.Reimbursement;
import models.User;
import services.ReimbursementService;
import util.Print;

import java.util.Scanner;

public class Dashboard {
    public static void view(User user){
        ReimbursementService reimbursementService = new ReimbursementService();
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while(running){
            Print.dashboard(user);
            String input = scanner.nextLine();

            switch (input){
                case "1":
                    System.out.println(reimbursementService.getAllGivenUserId(user.getId()));
                    break;
                case "2":
                    System.out.print("Reimbursement Id: ");
                    String name = scanner.nextLine();
                    reimbursementService.createReimbursement(new Reimbursement(name, user.getId()));
                    System.out.println("Reimbursement was submitted.");
                    break;
                case "3":
                    System.out.println(reimbursementService.getAllGivenUserId(user.getId()));
                    System.out.print("Reimbursement Id: ");
                    String reimbId = scanner.nextLine();
                    reimbursementService.deleteReimbursement(Integer.parseInt(reimbId));
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid");

            }
        }
    }
}
