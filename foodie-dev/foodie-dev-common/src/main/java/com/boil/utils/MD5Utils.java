package com.boil.utils;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * @author lifuxiang
 * @Description
 * @date 2020/10/30 11:08
 */
public class MD5Utils {

    /**
     * 对字符串进行md5加密
     * @param strValue
     * @return
     * @throws Exception
     */
    public static String getMD5Str(String strValue) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        String newString = Base64.encodeBase64String(md5.digest(strValue.getBytes()));
        return newString;
    }


    public static void main(String[] args) {
        try {
            String md5 = getMD5Str("aaa");
            System.out.println(md5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
