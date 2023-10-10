package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("Влад", "Филипов", (byte) 12);
        System.out.println("User с именем – Влад добавлен в базу данных");
        us.saveUser("Иван", "Иванов", (byte) 13);
        System.out.println("User с именем – Иван добавлен в базу данных");
        us.saveUser("Николай", "Николаев", (byte) 14);
        System.out.println("User с именем – Николай добавлен в базу данных");
        us.saveUser("Савелий", "Савельев", (byte) 15);
        System.out.println("User с именем – Савелий добавлен в базу данных");
        List<User> userList = us.getAllUsers();
        for (User a : userList) {
            System.out.println(userList);
        }
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
