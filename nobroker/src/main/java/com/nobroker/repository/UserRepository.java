package com.nobroker.repository;

import com.nobroker.enitty.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
