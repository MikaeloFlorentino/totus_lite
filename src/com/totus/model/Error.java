package com.totus.model;

/**
 *
 * @author mikaelo
 */
public class Error{
    private String status;
    private String detail;
    
    public Error(){
    }
    public Error(String status, String detail){
        this.status=status;
        this.detail=detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    
}
