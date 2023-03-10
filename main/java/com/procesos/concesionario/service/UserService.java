package com.procesos.concesionario.service;


import com.procesos.concesionario.models.User;
import com.procesos.concesionario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(Long id)
    {
        return userRepository.findById(id);
    }

}
