package com.adcc.raim.Tools;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by houxy on 2016/8/1.
 */
public class UserUtil {


    public static String MD5 (String msg){
            String md5Str = DigestUtils.md5Hex(msg);
            return md5Str;
    }
}
