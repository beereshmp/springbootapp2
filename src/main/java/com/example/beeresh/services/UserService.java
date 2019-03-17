package com.example.beeresh.services;

import com.example.beeresh.beans.UserBean;
import com.example.beeresh.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    userDao dao;


    public UserBean save(UserBean user) {

        user=dao.save(user);
        return user;
    }


    public List<UserBean> findAll() {
        List<UserBean> l=dao.findAll();
        return l;
    }


//    @Override
//    public <S extends UserBean> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<UserBean> findById(String s) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(String s) {
//        return false;
//    }
//
//    @Override
//    public Iterable<UserBean> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<UserBean> findAllById(Iterable<String> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(String s) {
//
//    }
//
//    @Override
//    public void delete(UserBean userBean) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends UserBean> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }



}
