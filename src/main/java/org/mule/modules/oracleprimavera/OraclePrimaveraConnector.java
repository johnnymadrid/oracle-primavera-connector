package org.mule.modules.oracleprimavera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.modules.oracleprimavera.config.ConnectorConfig;

@Connector(name="oracle-primavera", friendlyName="OraclePrimavera")
public class OraclePrimaveraConnector {

    @Config
    ConnectorConfig config;
    
    private String sDriver = "org.sqlite.JDBC"; 

    /**
     * Custom processor connection to Oracle Primavera
     * 
     * @return A successful connection message
     */
    @Processor
    public String connect() {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	Connection conn = null;
    	String message = "false";
    	try {
			Class.forName(sDriver);
	    	conn = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
	    	String schema = conn.getSchema();
	        message = Boolean.toString(conn.isClosed()) + ", " + schema;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return message;
    	
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}