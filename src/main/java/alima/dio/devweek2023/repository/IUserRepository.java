package alima.dio.devweek2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alima.dio.devweek2023.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
    
}
