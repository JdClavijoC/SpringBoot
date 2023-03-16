package com.procesos.concesionario.repository;

import com.procesos.concesionario.models.ConsessionaryUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ConsessionaryUser, Long>
{

}
