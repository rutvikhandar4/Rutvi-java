package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.util.DBUtil;

public class CartDao {

    public static void addToCart(Cart c) {
        try (Connection conn = DBUtil.createConnection()) {
            String sql = "INSERT INTO tblcart (uid, pid, product_price, product_qty, total_price) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, c.getUid());
                pst.setInt(2, c.getPid());
                pst.setInt(3, c.getProduct_price());
                pst.setInt(4, c.getProduct_qty());
                pst.setInt(5, c.getTotal_price());
                pst.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeFromCart(int uid, int pid) {
        try (Connection conn = DBUtil.createConnection()) {
            String sql = "DELETE FROM tblcart WHERE uid = ? AND pid = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, uid);
                pst.setInt(2, pid);
                pst.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Cart> getCartByUser(int uid) {
        List<Cart> list = new ArrayList<>();
        try (Connection conn = DBUtil.createConnection()) {
            String sql = "SELECT * FROM tblcart WHERE uid = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, uid);
                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        Cart c = new Cart();
                        c.setCid(rs.getInt("cid"));
                        c.setPid(rs.getInt("pid"));
                        c.setUid(rs.getInt("uid"));
                        c.setProduct_price(rs.getInt("product_price"));
                        c.setProduct_qty(rs.getInt("product_qty"));
                        c.setTotal_price(rs.getInt("total_price"));
                        c.setPayment_status(rs.getBoolean("payment_status"));
                        list.add(c);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Cart getCart(int cid) {
        Cart c = null;
        try (Connection conn = DBUtil.createConnection()) {
            String sql = "SELECT * FROM tblcart WHERE cid = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, cid);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        c = new Cart();
                        c.setCid(rs.getInt("cid"));
                        c.setPid(rs.getInt("pid"));
                        c.setUid(rs.getInt("uid"));
                        c.setProduct_price(rs.getInt("product_price"));
                        c.setProduct_qty(rs.getInt("product_qty"));
                        c.setTotal_price(rs.getInt("total_price"));
                        c.setPayment_status(rs.getBoolean("payment_status"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static boolean checkCart(int uid, int pid) {
        boolean flag1 = false;
        try (Connection conn = DBUtil.createConnection()) {
            String sql = "SELECT * FROM tblcart WHERE uid = ? AND pid = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, uid);
                pst.setInt(2, pid);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        flag1 = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag1;
    }

    public static void updateCart(Cart c) {
        try (Connection conn = DBUtil.createConnection()) {
            String sql = "UPDATE tblcart SET product_qty = ?, total_price = ? WHERE cid = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, c.getProduct_qty());
                pst.setInt(2, c.getTotal_price());
                pst.setInt(3, c.getCid());
                pst.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
