package com.example.factory;

import com.example.constant.DriverName;
import com.example.db.DatabaseDriver;
import com.example.db.impl.MySQLDatabaseDriver;
import com.example.db.impl.OracleDatabaseDriver;

public enum DatabaseFactory {
	INSTANCE;
	
	public DatabaseDriver getDriver(DriverName driverName) {
		DatabaseDriver driver=null;
		switch (driverName) {
		case ORACLE:
			driver=new OracleDatabaseDriver();
			break;
		case MYSQL:
			driver=new MySQLDatabaseDriver();
			break;
		default:
			break;
		}
		return driver;
	}
}
