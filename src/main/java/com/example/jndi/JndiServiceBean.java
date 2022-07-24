package com.example.jndi;


import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.NamingManager;
import javax.sql.DataSource;

public class JndiServiceBean {

	public void startProcess() throws NamingException, SQLException {
	
//		NamingManager.setInitialContextFactoryBuilder(null);
//		NamingManager.getInitialContext(null);
		System.out.println(NamingManager.hasInitialContextFactoryBuilder());
		DataSource ds = (DataSource) new InitialContext().lookup("jdbc/ds1");
		Connection connection  = ds.getConnection();
		connection.close();
	
		System.out.println("Done !!!");
	}
}
