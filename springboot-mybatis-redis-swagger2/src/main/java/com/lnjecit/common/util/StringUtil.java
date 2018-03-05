package com.lnjecit.common.util;


import com.lnjecit.common.constants.Constants;

/**
 * 字符串工具类
 *
 * @author lnj
 * @create 2018-02-04 13:46
 **/
public class StringUtil {


    /**
     * 判断字符串是否为null 或长度为0
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return (null == str || str.length() == 0) ? true : false;
    }

    /**
     * 如果字符串为null，或空字符串，或全为空白字符串，返回true，否则返回false
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        if (isEmpty(str)) {
            return true;
        }
        return str.trim().length() == 0 ? true : false;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 驼峰法转下划线
     * @param line 源字符串
     * @return 转换后的字符串
     */
    public static String camel2Underline(String line){
        if(isBlank(line)){
            return Constants.EMPTY_STRING;
        }
        StringBuilder builder = new StringBuilder();
        char[] charArr = line.toCharArray();
        for (char ch : charArr) {
            if (Character.isUpperCase(ch)) {
                builder.append("_" + Character.toLowerCase(ch));
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}