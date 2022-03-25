package models;

enum ReimbursementStatus{
    PENDING, APPROVED, DENIED
}

public class Status{

    public static void main(String[] args) {
        ReimbursementStatus s = ReimbursementStatus.PENDING;
        System.out.println(s);
        switch(s){
            case PENDING:
                System.out.println("Your reimbursement claim has been submitted.");
                break;
            case APPROVED:
                System.out.println("Your reimbursement claim has been approved.");
                break;
            case DENIED:
                System.out.println("Your reimbursement claim has been denied.");
                break;
        }
    }
}