package com.example.db.impl;

import com.example.db.DatabaseDriver;

/**
 * 
 * @author krraj
 *
 */
public class MySQLDatabaseDriver implements DatabaseDriver {

	@Override
	public String getConnection() {
		return "Mysql connection";
	}

}
