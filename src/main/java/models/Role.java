package models;

enum RoleType{
    MANAGER, EMPLOYEE
}

public class Role {
    public static void main(String[] args) {
        RoleType rt = RoleType.EMPLOYEE;
        System.out.println();
        switch (rt) {
            case EMPLOYEE:
                System.out.println("You are registered as an employee.");
                break;
            case MANAGER:
                System.out.println("You are registered as a finance manager.");
                break;
        }
    }
}
