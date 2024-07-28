package com.ileonnard.api_restful_java.domain.repository;

import com.ileonnard.api_restful_java.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
