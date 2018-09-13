package com.totus.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mikaelo
 */
public class Utilies {
    
    public String converterDate(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date)+"T"+new SimpleDateFormat("HH:mm:ss").format(date);
    }
    
    public String getToday(){
        return converterDate(new Date());
    }
}
