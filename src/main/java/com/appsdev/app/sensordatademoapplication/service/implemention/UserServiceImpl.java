package com.appsdev.app.sensordatademoapplication.service.implemention;

import com.appsdev.app.sensordatademoapplication.DTO.UserDetailsDTO;
import com.appsdev.app.sensordatademoapplication.entity.UserEntity;
import com.appsdev.app.sensordatademoapplication.repository.UserRepository;
import com.appsdev.app.sensordatademoapplication.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired  UserRepository userRepository;

    @Override
    public UserDetailsDTO registerUsers(UserDetailsDTO userDto) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        UserEntity storedUserEntity = userRepository.save(userEntity);

        BeanUtils.copyProperties(storedUserEntity, userDto);
        BeanUtils.copyProperties(userDto, userEntity);
        userDto.setAuthStatus(1);
        return userDto;
    }
}
