package net.lermex.inaction.dao;

import net.lermex.inaction.domain.Users;

import java.util.List;

/**
 * Created by Vlad on 31.01.2016.
 */
public interface UsersDao {
    void addUser(Users user);
    List<Users> getAll();
    Users getByLogin(String login);
    void close();
}
