package shenyifeng.tk.at.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shenyifeng.tk.at.model.UserModel;
import shenyifeng.tk.at.remote.StorageService;
import shenyifeng.tk.at.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private StorageService storageService;

    @GetMapping("/add/user")
    public boolean add(UserModel userModel) {
        userService.insert(userModel);
        return true;
    }

    @GetMapping("add/storage")
    public boolean addStorage() {
        storageService.add("xkdiid", 100, 14);
        return true;
    }

    @PostMapping("/addEntry")
    public boolean addEntry(@RequestBody UserModel userModel) {
        userService.insert(userModel);
        return true;
    }

}
