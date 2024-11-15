package com.demo.productService;

import com.demo.bean.Person;
import com.demo.dao.DaoOperationImpl;
import com.demo.dao.DaoOperations;

import java.sql.SQLException;

public class LoginServiceImpl implements LoginService{
    DaoOperations daoOperations = new DaoOperationImpl();
    public String getRole(String name,String pass){
        if (validator(name) && validator(pass)){
            try{
                Person p = daoOperations.findPerson(name,pass);
                String role = "None";
                if (p != null){
                    role = p.getRole();
                }
                if (role.equals("admin")){
                    return role;
                } else if (role.equals("user")) {
                    return role;
                }
            }catch(SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return "Invalid";
    }

    public boolean validator(String s){
        for (char ch : s.toCharArray()){
            if (ch == ' ' || ch == '\'' || ch == '=') return false;
        }
        return true;
    }


}
