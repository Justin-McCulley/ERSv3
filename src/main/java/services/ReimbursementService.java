package services;

import models.User;

import models.Reimbursement;
import repositories.ReimbursementDAO;
import repositories.ReimbursementDAOImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReimbursementService {

  private ReimbursementDAO reimbursementDAO;

    public ReimbursementService(){
        this.reimbursementDAO = new ReimbursementDAOImpl();
    }

    public ReimbursementService(ReimbursementDAO reimbursementDAO){
        this.reimbursementDAO = reimbursementDAO;
    }

    public List<Reimbursement> getAllGivenUserId(Integer userId){
        return this.reimbursementDAO.getAllListsGivenUserId(userId);
    }

    public Reimbursement createReimbursement(Reimbursement reimbursement){

        if(this.reimbursementDAO.createReimbursement(reimbursement)){
            List<Reimbursement> lists = reimbursementDAO.getAllListsGivenUserId(reimbursement.getUserId());

           Collections.sort(lists, Comparator.comparing(Reimbursement::getUserId));
            return lists.get(lists.size() - 1);
       }

       return null;
    }

  public void deleteReimbursement(Integer reimbId){
        this.reimbursementDAO.deleteList(reimbId);
   }

}