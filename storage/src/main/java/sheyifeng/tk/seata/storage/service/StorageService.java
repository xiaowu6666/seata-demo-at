package sheyifeng.tk.seata.storage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheyifeng.tk.seata.storage.mapper.StorageMapper;
import sheyifeng.tk.seata.storage.model.StorageModel;

@Service
public class StorageService {

    @Autowired
    private StorageMapper storageMapper;

    public int insert(StorageModel storageModel){
        return storageMapper.insert(storageModel);
    }
}
