package com.zhangyingwei.job.spider.store.zhilian;

import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:52
 * @desc:
 */
public class ZhiLianStore implements IStore {
    private IStore item = new ZhiLianItemStore();
    @Override
    public void store(TaskResponse response) throws Exception {
        if (response.isGroupStartWith("jobs.zhilian.items")) {
            item.store(response);
            return;
        }

        response.select("#newlist_list_div")
                .select("table")
                .select(".zwmc")
                .select("a").stream()
                .map(element -> element.attr("href"))
                .forEach(elem -> {
                    try {
                        response.getQueue().push(new Task(elem,"jobs.zhilian.items"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
