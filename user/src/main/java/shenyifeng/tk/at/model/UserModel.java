package shenyifeng.tk.at.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int Id;

    private String name;

    private String email;

    private Date createTime = new Date();

    @Column(name = "age")
    private int age;
}
