package com.zhangyingwei.job.spider.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangyw on 2017/12/19.
 */
public class SpiderUtils {
    public static String currentTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(new Date());
    }
}
