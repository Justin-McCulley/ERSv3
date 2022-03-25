package repositories;

import models.Reimbursement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReimbursementDAOImpl implements ReimbursementDAO {
    String url = "jdbc:postgresql://jm-fsj-db.caafusmsl4id.us-east-1.rds.amazonaws.com/Project1";
    String username = "postgres";
    String password = "JayMack86!";

    @Override
    public List<Reimbursement> getAllListsGivenUserId(Integer userId) {
        List<Reimbursement> lists = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password)){

            String sql = "SELECT * FROM reimbursements WHERE reimb_author_fk = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lists.add(new Reimbursement(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getTimestamp(6),
                        rs.getInt(7),
                        rs.getTimestamp(8)));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return lists;
    }

    @Override
    public boolean createReimbursement(Reimbursement reimbursement) {
        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password)){

            String sql = "insert into reimbursements (status_fk, reimbursement_amount, type_fk, reimb_author_fk, reimb_resolver_fk) values (?, ?, ?, ?, ?);";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reimbursement.getStatus());
            ps.setInt(2, reimbursement.getAmount());
            ps.setInt(3, reimbursement.getType());
            ps.setInt(4, reimbursement.getUserId());
            ps.setInt(5, reimbursement.getRoleId());

            ps.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return false;
    }

    @Override
    public void deleteList(Integer reimbId) {
        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password)){

            String sql = "delete from reimbursements where reimbursement_id = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reimbId);

            ps.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}

