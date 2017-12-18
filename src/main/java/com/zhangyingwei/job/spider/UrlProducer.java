package com.zhangyingwei.job.spider;

import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.cockroach.queue.CockroachQueue;
import com.zhangyingwei.cockroach.queue.TaskQueue;
import com.zhangyingwei.job.spider.config.JobConfig;
import com.zhangyingwei.job.spider.config.JobConfigFactory;
import com.zhangyingwei.job.spider.config.JobConfigItem;

import java.util.List;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:20
 * @desc:
 */
public class UrlProducer {
    private CockroachQueue queue = null;
    private JobConfig jobConfig;

    public UrlProducer() {
        this.queue = TaskQueue.of();
        this.jobConfig = JobConfigFactory.create();
    }

    public CockroachQueue product() {
        List<JobConfigItem> items = this.jobConfig.getItems();
        items.stream().forEach(item -> {
            try {
                this.queue.push(new Task(item.getUrl(),item.getGroup()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return queue;
    }
}
