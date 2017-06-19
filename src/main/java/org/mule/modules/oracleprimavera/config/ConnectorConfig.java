package org.mule.modules.oracleprimavera.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;

@Configuration(friendlyName = "Configuration" , configElementName="OraclePrimavera")
public class ConnectorConfig {
	
	@Configurable
	private String url;
	
	@Configurable
	private String user;
	
	@Configurable
	private String password;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Oracle Primavera Url Root Connection 
	 * 
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Oracle Primavera User Connection 
	 * 
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Oracle Primavera Password Connection 
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
}