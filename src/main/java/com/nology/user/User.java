package com.nology.user;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private String userName;
    private String password;

    public User(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public User() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static User getUser() {
        return user;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static User user = new User();

    public static void register () {
        List<User> userList=new ArrayList<>();
        String [] memberDetails = new String[0];

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Name => ");
        String name = scanner.nextLine();

        System.out.print(" Enter userName => ");
        String userName = scanner.nextLine();

        System.out.print(" Enter password => ");
        String password = scanner.nextLine();

        User newUser = new User (name, userName, password);


        userList.add(newUser);


        System.out.println("Registration successful");
        System.out.println(newUser);


    }

    public static void logIn() {
    Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter user name => ");
        String loggedUserName = scanner.nextLine();

        System.out.println("Enter password => ");
        String loggedPassword = scanner.nextLine();

        if(loggedUserName.equals(user.getUserName()) && loggedPassword.equals(user.getUserName()))  {
            System.out.println(" User successfully logged-in.. ");
        } else {
            System.out.println(" In valid userName of password ");
        }

    }
    @Override
    public String toString(){
        return "User{" +
                "name= " + name +
                ", username= " + userName+
                ", password= " + password +
                "}";
    }

    public static void main(String[] args) {
        register();
        System.out.println(getUser());

    }


}
