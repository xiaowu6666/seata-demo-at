package sheyifeng.tk.seata.storage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sheyifeng.tk.seata.storage.model.StorageModel;
import sheyifeng.tk.seata.storage.service.StorageService;

@RestController
@RequestMapping("/storage")
@Slf4j
public class StorageController {
    
    @Autowired
    private StorageService storageService;
    
    @GetMapping("add")
    public StorageModel add (StorageModel storageModel){
        int i = storageService.insert(storageModel);
        log.info("insert {}",i);
        return storageModel;
    }
    
}
