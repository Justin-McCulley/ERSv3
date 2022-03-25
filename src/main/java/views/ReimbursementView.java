package views;

import services.ReimbursementService;

import java.util.Scanner;

public class ReimbursementView {
    public static void reimbursementView(){
        ReimbursementService reimbursementService = new ReimbursementService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Status(1-4): ");
        String status = sc.nextLine();

        System.out.println("Amount: ");
        String amount = sc.nextLine();

        System.out.println("Type(1-4): ");
        String type = sc.nextLine();

        System.out.println("UserId: ");
        String userId = sc.nextLine();

        System.out.println("Submitted to: ");
        String roleId = sc.nextLine();
    }
}
