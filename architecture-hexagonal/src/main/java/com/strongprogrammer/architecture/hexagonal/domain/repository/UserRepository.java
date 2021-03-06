package com.strongprogrammer.architecture.hexagonal.domain.repository;

import com.strongprogrammer.architecture.hexagonal.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Thanos Floros (thanosfloros@strong-programmer.com)
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAll();
}
