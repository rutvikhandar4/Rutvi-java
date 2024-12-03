package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bean.User;
import com.util.DBUtil;

public class UserDao {

    // Method to register user
    public static void registerUser(User u) {
        String sql = "INSERT INTO tbluser(fname, lname, email, mobile, address, password, usertype) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, u.getFname());
            pst.setString(2, u.getLname());
            pst.setString(3, u.getEmail());
            pst.setLong(4, u.getMobile());
            pst.setString(5, u.getAddress());
            pst.setString(6, u.getPassword());
            pst.setString(7, u.getUsertype());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();  // Optionally log this
        }
    }

    // Method to check if email already exists
    public static boolean checkEmail(String email) {
        String sql = "SELECT * FROM tbluser WHERE email=?";
        try (Connection conn = DBUtil.createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, email);
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // If there is a result, email already exists
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Optionally log this
        }
        return false;
    }

    // Method to check if mobile number already exists
    public static boolean checkMobile(long mobile) {
        String sql = "SELECT * FROM tbluser WHERE mobile=?";
        try (Connection conn = DBUtil.createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setLong(1, mobile);
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // If there is a result, mobile number already exists
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Optionally log this
        }
        return false;
    }

    // Method to login user by email
    public static User loginUser(String email) {
        User u = null;
        String sql = "SELECT * FROM tbluser WHERE email=?";
        try (Connection conn = DBUtil.createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, email);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    u = new User();
                    u.setUid(rs.getInt("uid"));
                    u.setFname(rs.getString("fname"));
                    u.setLname(rs.getString("lname"));
                    u.setEmail(rs.getString("email"));
                    u.setMobile(rs.getLong("mobile"));
                    u.setAddress(rs.getString("address"));
                    u.setPassword(rs.getString("password"));
                    u.setUsertype(rs.getString("usertype"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Optionally log this
        }
        return u; // If no user is found, returns null
    }

    // Method to change user password
    public static void changePassword(String email, String password) {
        String sql = "UPDATE tbluser SET password=? WHERE email=?";
        try (Connection conn = DBUtil.createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, password);
            pst.setString(2, email);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();  // Optionally log this
        }
    }

    // Method to update user profile
    public static void updateProfile(User u) {
        String sql = "UPDATE tbluser SET fname=?, lname=?, mobile=?, address=? WHERE email=?";
        try (Connection conn = DBUtil.createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, u.getFname());
            pst.setString(2, u.getLname());
            pst.setLong(3, u.getMobile());
            pst.setString(4, u.getAddress());
            pst.setString(5, u.getEmail());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();  // Optionally log this
        }
    }
}
