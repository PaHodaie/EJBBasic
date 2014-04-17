package com.ph.ejb.client;

import javax.naming.Context;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.ph.ejb.StudentBean;
import com.ph.ejb.StudentBeanRemote;
/**
 * this client is used to call through JNDI
 * EJB-logic  methods.
 * 
 * @author Parviz
 *
 */
public class StudentClient {
	public static void main(String[] args) {
		Context context;
		try {
			context = new InitialContext();
			StudentBeanRemote beanRemote = (StudentBeanRemote) context
					.lookup(StudentBean.RemoteJNDIName);
			beanRemote.studentTest();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
