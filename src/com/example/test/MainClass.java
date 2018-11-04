package com.example.test;

import com.example.constant.DriverName;
import com.example.db.DatabaseDriver;
import com.example.factory.DatabaseFactory;

public class MainClass {

	public static void main(String[] args) {
		DatabaseDriver driver=DatabaseFactory.INSTANCE.getDriver(DriverName.MYSQL);
		System.out.println(driver.getConnection());
	}
}
