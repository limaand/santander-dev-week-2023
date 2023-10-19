package alima.dio.devweek2023.service;

import alima.dio.devweek2023.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
    
    
}
