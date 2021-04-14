package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Martynov", (byte) 28);
        userService.saveUser("Vladimir", "Radchenko", (byte) 23);
        userService.saveUser("Vitaly", "Nalivaikin", (byte) 24);
        userService.saveUser("Alexander", "Mysovskiy", (byte) 24);
        System.out.println(userService.getAllUsers());


        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
