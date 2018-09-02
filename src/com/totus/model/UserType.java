package com.totus.model;

import com.totus.utilities.Constant;

/**
 *
 * @author mikaelo
 */
public class UserType extends Model{
    private long id = 1L;
    
    private String description;

    public UserType(){
        super(Constant.USER_TYPE);
    }
    public UserType(int id){
        super(Constant.USER_TYPE);
        super.setId(id);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}