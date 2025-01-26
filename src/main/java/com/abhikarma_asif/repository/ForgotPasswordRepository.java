package com.abhikarma_asif.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhikarma_asif.entity.ForgotPasswordToken;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken, Long>
{
	ForgotPasswordToken findByToken(String token);   	//Step-1
}