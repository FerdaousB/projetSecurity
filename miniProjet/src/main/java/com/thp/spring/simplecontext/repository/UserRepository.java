package com.thp.spring.simplecontext.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.simplecontext.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByName(String username);

	Boolean existsByName(String username);

	Boolean existsByMail(String email);
}
