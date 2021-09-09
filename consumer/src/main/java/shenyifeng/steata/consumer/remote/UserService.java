package shenyifeng.steata.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import shenyifeng.steata.consumer.bean.User;

@FeignClient(name = "demo-user",path = "user")
public interface UserService {


    @PostMapping("/addEntry")
    void addEntry(@RequestBody User user);
}
