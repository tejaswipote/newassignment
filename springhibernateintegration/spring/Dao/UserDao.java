package com.spring.Dao;


import com.spring.model.User;

import java.util.List;

public interface UserDao {

    public void save(User user);

    public List<User> list();


}


