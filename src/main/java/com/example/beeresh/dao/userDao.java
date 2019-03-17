package com.example.beeresh.dao;

import com.example.beeresh.beans.UserBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface userDao extends CrudRepository<UserBean,Long> {

      public  UserBean save(UserBean user);

      public List<UserBean> findAll();



}
