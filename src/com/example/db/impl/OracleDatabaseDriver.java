package com.example.db.impl;
/**
 * 
 */
import com.example.db.DatabaseDriver;

public class OracleDatabaseDriver implements DatabaseDriver {

	@Override
	public String getConnection() {
		return "Oracle connection";
	}

}
