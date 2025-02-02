package org.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.dto.UserRequest;
import org.student.entity.Address;
import org.student.entity.User;
import org.student.repo.UserRepository;
import org.student.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        Address address = new Address();
        address.setStreet(userRequest.getAddress().getStreet());
        address.setCity(userRequest.getAddress().getCity());
        user.setAddress(address);

        userRepository.save(user);
    }



}
