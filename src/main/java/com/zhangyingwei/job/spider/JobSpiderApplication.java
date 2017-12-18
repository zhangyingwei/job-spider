package com.zhangyingwei.job.spider;

import com.zhangyingwei.cockroach.CockroachApplication;
import com.zhangyingwei.cockroach.annotation.AppName;
import com.zhangyingwei.cockroach.annotation.EnableAutoConfiguration;
import com.zhangyingwei.cockroach.annotation.Store;
import com.zhangyingwei.cockroach.annotation.ThreadConfig;
import com.zhangyingwei.cockroach.queue.CockroachQueue;
import com.zhangyingwei.job.spider.store.JobStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:17
 * @desc:
 */
@EnableAutoConfiguration
@AppName("招聘信息爬虫")
@Store(JobStore.class)
@ThreadConfig(num = 1)
public class JobSpiderApplication {
    public static void main(String[] args) throws Exception {
        CockroachQueue queue = new UrlProducer().product();
        CockroachApplication.run(JobSpiderApplication.class,queue);
    }
}
