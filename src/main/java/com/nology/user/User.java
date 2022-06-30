package com.nology.user;

import java.util.ArrayList;
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
        ArrayList<String> userList=new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Name => ");
        String name = scanner.nextLine();
        user.setName(name);

        System.out.print(" Enter userName => ");
        String userName = scanner.nextLine();
        user.setUsername(userName);

        System.out.print(" Enter password => ");
        String password = scanner.nextLine();
        user.setPassword(password);

        String newUser = name +" "+ userName +" "+ password;

        userList.add(newUser);



        System.out.println("Registration successful");



    }

    public static void logIn() {


    }


}
