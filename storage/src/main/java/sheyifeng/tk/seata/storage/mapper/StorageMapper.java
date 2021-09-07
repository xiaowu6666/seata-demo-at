package sheyifeng.tk.seata.storage.mapper;

import org.apache.ibatis.annotations.Mapper;
import sheyifeng.tk.seata.storage.model.StorageModel;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface StorageMapper extends BaseMapper<StorageModel> {
}
