package org.student.service;

import org.student.dto.UserRequest;
import org.student.entity.User;

public interface UserService {

    void save(UserRequest userRequest);

    User findUserById(Long userId);
}
