package com.nad;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class AppConfig {

	@Bean
	public DataSource getDatasource() throws SQLException {
		OracleDataSource ds=new OracleDataSource();
		ds.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUser("system");
		ds.setPassword("Oracle123");
		ds.setImplicitCachingEnabled(true);
		ds.setFastConnectionFailoverEnabled(true);
		
		return ds;
	}
	
	/*
	 * @Bean public RouteServices getRouteServices() { return new RouteServices(); }
	 */
}
