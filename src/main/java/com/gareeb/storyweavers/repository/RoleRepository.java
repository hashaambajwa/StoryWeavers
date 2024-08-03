package com.gareeb.storyweavers.repository;

import com.gareeb.storyweavers.models.ERole;
import com.gareeb.storyweavers.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);

}
