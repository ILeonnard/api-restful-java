package com.ileonnard.api_restful_java.service;

import com.ileonnard.api_restful_java.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
