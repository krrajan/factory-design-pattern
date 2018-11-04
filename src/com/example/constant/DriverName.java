package com.example.constant;
/**
 * 
 * @author krraj
 *
 */
public enum DriverName {
	ORACLE("oracle"), MYSQL("mysql");

	private String driver;

	private DriverName(String driver) {
		this.driver = driver;
	}

	public String getDriverName() {
		return driver;
	}
}
