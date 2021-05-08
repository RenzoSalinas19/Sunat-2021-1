package edu.usmp.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.usmp.demomvc.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
}
