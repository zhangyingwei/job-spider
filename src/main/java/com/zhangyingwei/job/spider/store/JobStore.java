package com.zhangyingwei.job.spider.store;

import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;
import com.zhangyingwei.job.spider.store.zhilian.ZhiLianStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:21
 * @desc:
 */
public class JobStore implements IStore {
    private IStore zhilian = new ZhiLianStore();
    @Override
    public void store(TaskResponse response) throws Exception {
        if (response.isGroupStartWith("jobs")) {
            if (response.isGroupStartWith("jobs.zhilian")) {
                zhilian.store(response);
            }
        }
    }
}
