package com.boil.utils;

import java.text.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @Description          时间处理工具类
 * @author lifuxiang
 * @date 2020/10/30 11:32
 */
public class DateUtils {

    /**
     *  Base ISO 8601 date format yyyyMMdd i.e,20021225
     */
    public static final String ISO_DATA_FORMAT = "yyyyMMdd";

    public static final String ISO_EXPANDED_DATE_FORMAT = "yyyy-MM-dd";

    public static String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static String DATE_PATTERN = "yyyyMMddHHmmss";

    private static boolean LENIENT_DATE = false;

    private static Random random = new Random();

    private static final int ID_BYTES = 10;

    public synchronized static String generateId() {
        UUID uuid = new UUID(32,32);
        String id = uuid.toString();
        return id.replaceAll("-","");
    }


    public static Date stringToDate(String dateString) {
        return stringToDate(dateString,ISO_EXPANDED_DATE_FORMAT,LENIENT_DATE);
    }


    public static Date stringToDate(String dateString,String pattern,boolean is_date) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            Date date = format.parse(dateString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
