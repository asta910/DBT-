package com.demo.ui;

import com.demo.productService.LoginService;
import com.demo.productService.LoginServiceImpl;
import com.demo.productService.ProductService;
import com.demo.productService.ProductServiceImpl;

import java.util.Scanner;

public class TestBoth {
    public static void main(String[] args) {
        LoginService loginService = new LoginServiceImpl();
        ProductService productService = new ProductServiceImpl();

        System.out.println("Welcome..");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User name : ");
        String uName = sc.next();
        System.out.print("Enter password : ");
        String pass = sc.next();

        String role = loginService.getRole(uName,pass);

        if (role.equals("admin")){
            int choice = 0;
            while (choice != 7) {
                System.out.println("1. Add new product \n2. Delete product by ID \n3. Sort products by price \n4. Update product quantity  \n5. Update product price \n6. Add discount on product \n7. Exit.. \nEnter choice : ");
                choice = sc.nextInt();

                switch (choice){
                    case 1 -> {
                        if(productService.addProduct()){
                            System.out.println("Product added successfully");
                        }else{
                            System.out.println("Operation failed..");
                        }
                    }
                    case 2 -> {

                    }
                    case 3 -> {

                    }
                    case 4 -> {

                    }
                    case 5 -> {

                    }
                    case 6 -> {

                    }
                    default -> {

                    }
                }
            }
            System.out.println("Thank you for visiting..");
        }else if(role == "user") {

        }else{
            System.out.println("Wrong username or password, you can try again");
        }
    }
}
