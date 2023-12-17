package com.treat.treatinder.domain.repo;

import com.treat.treatinder.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<User, Long> {
}
