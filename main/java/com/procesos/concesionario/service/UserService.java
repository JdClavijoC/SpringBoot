package com.procesos.concesionario.service;


import com.procesos.concesionario.models.ConsessionaryUser;
import com.procesos.concesionario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public Optional<ConsessionaryUser> getUserById(Long id)
    {
        return userRepository.findById(id);
    }

}
