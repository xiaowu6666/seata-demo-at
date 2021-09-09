package shenyifeng.steata.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import shenyifeng.steata.consumer.bean.Storage;

@FeignClient(name = "demo-storage",path = "storage")
public interface StorageService {

    @PostMapping("/addEntry")
    void adEntry(@RequestBody Storage storage);
}
