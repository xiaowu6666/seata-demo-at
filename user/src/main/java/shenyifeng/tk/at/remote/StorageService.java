package shenyifeng.tk.at.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shenyifeng.tk.at.bean.Storage;

@FeignClient(name = "demo-storage")
public interface StorageService {

    @GetMapping("/storage/add")
    Storage add(@RequestParam("commodityCode")String commodityCode,
                @RequestParam("count")int count,
                @RequestParam("userId")int userId);
}
