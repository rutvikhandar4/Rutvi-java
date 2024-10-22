package com.dao;

import java.sql.*;
import com.bean.User;
import com.util.DBUtil;

public class UserDao {
    public static boolean registerUser(User user) {
        try (Connection conn = DBUtil.creatConnection()) {
            String sql = "INSERT INTO student (first_name, last_name, email, mobile, address, gender, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getMobile());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getGender());
            ps.setString(7, user.getPassword());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static User loginUser(String email, String password) {
        User user = null;
        try (Connection conn = DBUtil.creatConnection()) {
            String sql = "SELECT * FROM student WHERE email = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setAddress(rs.getString("address"));
                user.setGender(rs.getString("gender"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
