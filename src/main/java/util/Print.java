package util;

import models.Reimbursement;
import models.User;

public class Print {
    public static void landing(){
        System.out.println("Reimbursement Service");
        System.out.println("1) Login");
        System.out.println("2) Register");
        System.out.println("0) EXIT");
    }

    public static void dashboard(User user){
        System.out.println("Welcome, " + user.getFirstname() + " " + user.getLastname());
        System.out.println("1) Display all reimbursements for " + user.getFirstname());
        //System.out.println("2) Create new reimbursement");
        System.out.println("3) Delete reimbursement");
        System.out.println("0) LOGOUT");
    }
}
