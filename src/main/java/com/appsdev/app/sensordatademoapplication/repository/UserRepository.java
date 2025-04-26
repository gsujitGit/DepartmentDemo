package com.appsdev.app.sensordatademoapplication.repository;

import com.appsdev.app.sensordatademoapplication.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
