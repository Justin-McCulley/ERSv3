import models.Reimbursement;
import models.User;
import repositories.ReimbursementDAO;
import repositories.ReimbursementDAOImpl;
import repositories.UserDAO;
import repositories.UserDAOImpl;

public class MainDriver {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        ReimbursementDAO reimbursementDAO = new ReimbursementDAOImpl();

        //reimbursementDAO.createReimbursement(new Reimbursement(2, 1500, 1, 3, 1));
        //userDAO.createUser(new User("ChiliLuvr69", "OhYeAh!", "Kevin", "Malone"));
        //System.out.println(userDAO.getUserGivenUsername("ChiliLuvr69"));
        //reimbursementDAO.deleteList(4);
        // System.out.println(reimbursementDAO.getAllListsGivenUserId(3));

    }
}
