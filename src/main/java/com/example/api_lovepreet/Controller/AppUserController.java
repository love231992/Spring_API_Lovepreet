package com.example.api_lovepreet.Controller;

import com.example.api_lovepreet.dto.AppUserDto;
import com.example.api_lovepreet.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appuser")
public class AppUserController {
    @Autowired
    AppUserService appUserService;

    @PostMapping("add")
    public String addUser(@RequestBody AppUserDto appUserDto){
        appUserService.addAppUser(appUserDto);
        return "User has been added";
    }

    @GetMapping("/getusers")
    public Page<AppUserDto> getAppUser(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "5") int size) {
        return appUserService.getAppUser(page,size);
    }

    @DeleteMapping("/deluser/{id}")
    public String delUserById(@PathVariable Integer id){
        appUserService.delAppUser(id);
        return "User with id "+ id +" has been deleted successfully";
    }

    @PatchMapping("/updateuser")
    public String updateAppUser(@RequestBody AppUserDto appUserDto){
        if (appUserService.updateAppUser(appUserDto)) {
            return "User details has been updated successfully";
        }
        return "User does not exists";
    }
}
