package org.hajokns.service.impl;

import lombok.AllArgsConstructor;
import org.hajokns.entity.User;
import org.hajokns.repository.UserRepository;
import org.hajokns.service.UserService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
