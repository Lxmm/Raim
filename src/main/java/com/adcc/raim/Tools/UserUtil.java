package com.adcc.raim.Tools;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by houxy on 2016/8/1.
 */
public class UserUtil {

    private static String SALTVALUE="adcc";

    public static String MD5 (String msg){
            String str  = msg+SALTVALUE; //待加密字符串
            String md5Str = DigestUtils.md5Hex(str);
            return md5Str;
    }
}
