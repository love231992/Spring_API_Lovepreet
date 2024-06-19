package com.example.api_lovepreet.Repository;

import com.example.api_lovepreet.dto.AppUserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUserDto,Integer> {
    AppUserDto findAppUserDtoByAppUserEmail(String email);
}
