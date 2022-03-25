package repositories;

import models.User;

import java.sql.*;

public class UserDAOImpl implements UserDAO{
    String url = "jdbc:postgresql://jm-fsj-db.caafusmsl4id.us-east-1.rds.amazonaws.com/Project1";
    String username = "postgres";
    String password = "JayMack86!";

    @Override
    public User getUserGivenUsername(String username) {
        User user = null;

        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password)){

            String sql = "SELECT * FROM users WHERE user_username = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                user = new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getTimestamp(6));
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return user;
    }

    @Override
    public void createUser(User user) {

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password)){

            String sql = "insert into users (user_username, user_password, user_firstname, user_lastname) values (?, ?, ?, ?);";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstname());
            ps.setString(4, user.getLastname());

            ps.executeUpdate();

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}