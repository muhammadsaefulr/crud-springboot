package com.example.live.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Menambahkan Info Repository Ke Input ORM
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

