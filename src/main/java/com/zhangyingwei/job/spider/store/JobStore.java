package com.zhangyingwei.job.spider.store;

import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;
import com.zhangyingwei.job.spider.store.job51.Job51Store;
import com.zhangyingwei.job.spider.store.lagou.LaGouStore;
import com.zhangyingwei.job.spider.store.tc58.Tc58Store;
import com.zhangyingwei.job.spider.store.zhilian.ZhiLianStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:21
 * @desc:
 */
public class JobStore implements IStore {
    private IStore zhilian = new ZhiLianStore();
    private IStore lagou = new LaGouStore();
    private IStore job51 = new Job51Store();
    private IStore tc58 = new Tc58Store();
    @Override
    public void store(TaskResponse response) throws Exception {
        if (response.getGroup().startsWith("jobs")) {
            if (response.getGroup().startsWith("jobs.zhilian")) {
                zhilian.store(response);
            } else if (response.getGroup().startsWith("jobs.lagou")) {
                lagou.store(response);
            } else if (response.getGroup().startsWith("jobs.51job")) {
                job51.store(response);
            } else if (response.getGroup().startsWith("jobs.58tc")) {
                tc58.store(response);
            }
        }
    }
}
