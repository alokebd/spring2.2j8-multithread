package com.vision.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vision.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
