package com.example.cafe.dao;

import com.example.cafe.POJO.User;
import com.example.cafe.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmailId(@Param("email")String email);
    List<UserWrapper>getAllUser();
    List<String>getAllAdmin();
    @Transactional
    @Modifying
    Integer updateStatus(@Param("status")String status,@Param("id")Integer id);
    User findByEmail(String email);
}
