package repositories;

import models.Reimbursement;
import java.util.List;

public interface ReimbursementDAO {
    List<Reimbursement> getAllListsGivenUserId(Integer userId);
    boolean createReimbursement(Reimbursement reimbursement);
    void deleteList(Integer reimbursement);
}
