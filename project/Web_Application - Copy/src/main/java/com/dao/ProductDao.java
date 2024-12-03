package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.util.DBUtil;

public class ProductDao {

	public static void addProduct(Product p)
	{
		try {
			Connection conn=DBUtil.createConnection();
			String sql="insert into tblproduct(product_category,product_name,product_price,product_desc,product_image,uid) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, p.getProduct_category());
			pst.setString(2, p.getProduct_name());
			pst.setInt(3, p.getProduct_price());
			pst.setString(4, p.getProduct_desc());
			pst.setString(5, p.getProduct_image());
			pst.setInt(6, p.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateProduct(Product p)
	{
		try {
			Connection conn=DBUtil.createConnection();
			String sql="update tblproduct set product_category=?,product_name=?,product_price=?,product_desc=? where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, p.getProduct_category());
			pst.setString(2, p.getProduct_name());
			pst.setInt(3, p.getProduct_price());
			pst.setString(4, p.getProduct_desc());
			pst.setInt(5, p.getPid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteProduct(int pid)
	{
		try {
			Connection conn=DBUtil.createConnection();
			String sql="delete from tblproduct where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Product> getProductBySeller(int uid)
	{
		List<Product> list=new ArrayList<Product>();
		try {
			Connection conn=DBUtil.createConnection();
			String sql="Select * from tblproduct where uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_price(rs.getInt("product_price"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static List<Product> getAllProduct()
	{
		List<Product> list=new ArrayList<Product>();
		try {
			Connection conn=DBUtil.createConnection();
			String sql="Select * from tblproduct";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setUid(rs.getInt("uid"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Product getProduct(int pid)
	{
		Product p=null;
		try {
			Connection conn=DBUtil.createConnection();
			String sql="Select * from tblproduct where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setUid(rs.getInt("uid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
}
