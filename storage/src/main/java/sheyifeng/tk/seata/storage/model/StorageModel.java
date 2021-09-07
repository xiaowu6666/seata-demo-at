package sheyifeng.tk.seata.storage.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "storage")
public class StorageModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY,generator = "JDBC")
    private int id;

    @Column(name = "commodity_code")
    private String commodityCode;

    @Column(name = "count")
    private int count;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "create_time")
    private LocalDateTime createTime = LocalDateTime.now();


}
