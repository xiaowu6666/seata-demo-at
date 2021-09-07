package shenyifeng.tk.at.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Storage {

    private int id;

    private String commodityCode;

    private int count;

    private int userId;

    private LocalDateTime createTime;

    public void setId(int id) { }
}
