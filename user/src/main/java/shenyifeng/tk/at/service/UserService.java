package shenyifeng.tk.at.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shenyifeng.tk.at.dao.UserMapper;
import shenyifeng.tk.at.model.UserModel;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @GlobalTransactional
    @Transactional(rollbackFor = Exception.class)
    public void insert(UserModel userModel){
        userMapper.insert(userModel);
    }
}
