/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.Calendar;

/**
 *
 * @author hieun
 */
public class Static {
    
    public static String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    public static String PHONE_PATTERN = "^(0\\d{9}|1800\\d{6}|1900\\d{6})$"; 
    
    public static String getCurrentDate() {
        
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        
        return String.format("%d-%d-%d", year, month, day); 
    }
}
