package org.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.student.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}

