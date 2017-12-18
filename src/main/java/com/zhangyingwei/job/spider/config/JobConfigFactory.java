package com.zhangyingwei.job.spider.config;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:41
 * @desc:
 */
public class JobConfigFactory {
    private static JobConfig jobConfig = new JobConfig();
    public static JobConfig create() {
        JobConfigItem item = new JobConfigItem();
        item.setUrl("http://sou.zhaopin.com/jobs/searchresult.ashx?bj=160000&sj=045&in=210500&jl=%E5%8C%97%E4%BA%AC&sm=0&p=1");
        item.setGroup("jobs.zhilian");
        jobConfig.addItem(item);
        return jobConfig;
    }
}
