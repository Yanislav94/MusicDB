package com.example.musicdb.service;

import com.example.musicdb.model.entity.User;
import com.example.musicdb.model.repository.UserRepository;
import com.example.musicdb.model.service.UserServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserServiceModel register(UserServiceModel userServiceModel) {
        User user = this.modelMapper.map(userServiceModel, User.class);

        return this.modelMapper
                .map(this.userRepository.saveAndFlush(user),
                        UserServiceModel.class);
    }

    @Override
    public UserServiceModel findByUsername(String username) {
        return this.userRepository.findByUsername(username).
                map(user -> this.modelMapper.map(user, UserServiceModel.class)).orElse(null);
    }
}
