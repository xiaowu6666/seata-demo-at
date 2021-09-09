package shenyifeng.demo.seata.consumer.base;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shenyifeng.steata.consumer.Run;
import shenyifeng.steata.consumer.bean.Storage;
import shenyifeng.steata.consumer.bean.User;
import shenyifeng.steata.consumer.remote.StorageService;
import shenyifeng.steata.consumer.remote.UserService;

@SpringBootTest(classes = Run.class)
public class RemoteTest {

    @Autowired
    private UserService userService;

    @Autowired
    private StorageService storageService;

    @Test
    public void remoteUserTest(){
        User user = new User();
        user.setAge(34);
        user.setEmail("zhangsan@qq.com");
        user.setName("张三");
        userService.addEntry(user);
    }

    @Test
    public void remoteStorageTest(){
        Storage storage = new Storage();
        storage.setId(3);
        storage.setCommodityCode("MKD");
        storage.setCount(1000);
        storageService.adEntry(storage);
    }
}
