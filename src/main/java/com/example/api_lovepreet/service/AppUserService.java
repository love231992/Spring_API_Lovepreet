package com.example.api_lovepreet.service;

import com.example.api_lovepreet.Repository.AppUserRepo;
import com.example.api_lovepreet.dto.AppUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    @Autowired
    AppUserRepo appUserRepo;
    public void addAppUser(AppUserDto appUserDto){
        appUserRepo.save(appUserDto);
    }

    public Page<AppUserDto> getAppUser(Integer page, Integer size){
        Pageable pageable = PageRequest.of(page,size);
        return appUserRepo.findAll(pageable);
    }

    public void delAppUser(Integer id){
        appUserRepo.deleteById(id);
    }

    public boolean updateAppUser(AppUserDto appUserDto){
        if (appUserRepo.existsById(appUserDto.getAppUserId())) {
            appUserRepo.save(appUserDto);
            return true;
        }
        return false;
    }
 }
