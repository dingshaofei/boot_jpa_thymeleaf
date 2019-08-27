package com.offcn.bootjpathymeleaf.dao;

import com.offcn.bootjpathymeleaf.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByNameAndAge(String name,Integer age);
}
