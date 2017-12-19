package com.zhangyingwei.job.spider.generator;

import com.zhangyingwei.cockroach.common.generators.MapGenerator;
import com.zhangyingwei.cockroach.executer.Task;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyw on 2017/12/19.
 */
public class HeaderGenerator implements MapGenerator {
    private Map<String, String> headers = new HashMap<String,String>();
    @Override
    public Map get(Task task) {
        if (task.getGroup().startsWith("jobs.51job.items")) {
//            headers.put("Accept-Encoding", "gzip");
        }
        return headers;
    }
}
