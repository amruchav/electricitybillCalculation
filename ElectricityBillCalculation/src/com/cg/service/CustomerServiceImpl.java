package com.cg.service;

import com.cg.DAO.CustomerDAOImpl;
import com.cg.DAO.ICustomerDAO;
import com.cg.bean.CustomerBean;

public class CustomerServiceImpl implements ICustomerService {
	ICustomerDAO dao=null;
	
	public int addDetails(CustomerBean bean){
		dao=new CustomerDAOImpl();
		return dao.addDetails(bean);
	}
}
