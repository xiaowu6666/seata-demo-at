package shenyifeng.tk.at.dao;

import org.apache.ibatis.annotations.Mapper;
import shenyifeng.tk.at.model.UserModel;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<UserModel> {
}
