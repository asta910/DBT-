package com.demo.dao;

import com.demo.bean.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoOperationImpl implements DaoOperations{
    static{

    }

    public Person findPerson(String name,String pass) throws SQLException {
        Connection c = DButils.getConnectionMy();
        try {
            PreparedStatement ps = c.prepareStatement("select * from login where username = ? and password = ? ");
            ps.setString(1,name);
            ps.setString(2,pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return new Person(rs.getString(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
