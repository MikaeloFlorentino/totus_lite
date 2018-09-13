package com.totus.model;

import java.util.Date;
import com.totus.utilities.Constant;

/**
 *
 * @author mikaelo
 */
public class User extends Model{
    private final long ide = 1L;
    
    
    private UserType user_type;
    private String status;
    private String username;
    private String password;
    private String name;
    private String first_last_name;
    private String second_last_name;
    private Date birth_date;
    private String email;
    

    public User(){
        super(Constant.USER);
    }
    public User(int id){
        super(Constant.USER);
        super.setId(id);
    }

    public UserType getUser_type() {
        return user_type;
    }

    public void setUser_type(UserType usertType) {
        this.user_type = usertType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_last_name() {
        return first_last_name;
    }

    public void setFirst_last_name(String first_last_name) {
        this.first_last_name = first_last_name;
    }

    public String getSecond_last_name() {
        return second_last_name;
    }

    public void setSecond_last_name(String second_last_name) {
        this.second_last_name = second_last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}