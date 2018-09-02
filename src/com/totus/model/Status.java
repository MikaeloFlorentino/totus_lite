package com.totus.model;

import com.totus.utilities.Constant;

/**
 *
 * @author mikaelo
 */
public class Status extends Model{
    private final long ide = 1L;
    
    private String description;

    public Status(){
        super(Constant.STATUS);
    }
    public Status(int id){
        super(Constant.STATUS);
        super.setId(id);
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}