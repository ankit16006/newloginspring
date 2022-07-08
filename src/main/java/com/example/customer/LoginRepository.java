package com.example.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface LoginRepository extends JpaRepository<Login, Integer> {
	

}
