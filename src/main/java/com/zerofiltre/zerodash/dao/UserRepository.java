package com.zerofiltre.zerodash.dao;

import com.zerofiltre.zerodash.model.ZDUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ZDUser, Integer> {

    Optional<ZDUser> findOneByEmail(String email);

    Optional<ZDUser> findOneByPhoneNumber(String phoneNumber);
}
