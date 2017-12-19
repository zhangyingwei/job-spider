package com.zhangyingwei.job.spider.store.job51;

import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:52
 * @desc:
 */
public class Job51Store implements IStore {
    private IStore item = new Job51ItemStore();
    @Override
    public void store(TaskResponse response) throws Exception {
        if (response.getGroup().startsWith("jobs.51job.items")) {
            item.store(response);
            return;
        }

        response.select("#resultList")
                .select(".el").select(".tg1").select("span")
                .select("a").stream()
                .map(element -> element.attr("href"))
                .forEach(elem -> {
                    try {
                        response.getQueue().push(new Task(elem,"jobs.51job.items"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
