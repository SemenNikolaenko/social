package com.example.social.Repository;

import com.example.social.Entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(value = "user-role-entity-graph")
    User findByUsername(String username);

    @EntityGraph(value = "user-role-entity-graph")
    List<User> findAll();

    User findByActivationCode(String code);
}
