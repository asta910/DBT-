package com.demo.dao;

import com.demo.bean.Person;

import java.sql.SQLException;

public interface DaoOperations {
    Person findPerson(String n,String p) throws SQLException;
}
