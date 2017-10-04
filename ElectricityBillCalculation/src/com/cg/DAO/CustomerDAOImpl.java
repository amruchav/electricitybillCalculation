package com.cg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.DbUtil.DbUtil;
import com.cg.bean.CustomerBean;

public class CustomerDAOImpl implements ICustomerDAO{
	public int addDetails(CustomerBean bean){
		Connection conn=null;
		int row=0;
		try
		{
		conn=DbUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("INSERT INTO BILLDETAILS VALUES(?,?,?,?)");
		ps.setInt(1, bean.getConsumerNo());
		ps.setString(2, bean.getCustomerName());
		ps.setString(3, bean.getEmailId());
		ps.setString(4, bean.getPhoneNo());
		row=ps.executeUpdate();
		System.out.println(row);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
	}

}
