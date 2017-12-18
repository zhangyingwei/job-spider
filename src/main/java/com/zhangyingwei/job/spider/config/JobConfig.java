package com.zhangyingwei.job.spider.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:23
 * @desc:
 */
public class JobConfig {
    private List<JobConfigItem> items;

    public JobConfig() {
        this.items = new ArrayList<JobConfigItem>();
    }

    public List<JobConfigItem> getItems() {
        return items;
    }

    public JobConfig addItem(JobConfigItem jobConfigItem){
        this.items.add(jobConfigItem);
        return this;
    }
}
