package com.example.api_lovepreet;

import com.example.api_lovepreet.Repository.AppUserRepo;
import com.example.api_lovepreet.dto.AppUserDto;
import com.example.api_lovepreet.service.AppUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiLovepreetApplication {

    public static void main(String[] args) {
       ApplicationContext context=SpringApplication.run(ApiLovepreetApplication.class, args);
        AppUserDto appUserDto = AppUserDto.builder()
                .appUserName("William Shakespeare")
                .appUserEmail("william@yahoo.com")
                .appUserPhone("9898989676")
                .build();

        AppUserService userService = context.getBean(AppUserService.class);
        AppUserRepo appUserRepo = context.getBean(AppUserRepo.class);
        //userService.addAppUser(appUserDto);
        userService.getAppUser(0,5).forEach(System.out::println);
        System.out.println(appUserRepo.findAppUserDtoByAppUserEmail("Tom@gmail.com"));
    }

}
