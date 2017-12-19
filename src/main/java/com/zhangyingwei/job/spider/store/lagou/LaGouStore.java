package com.zhangyingwei.job.spider.store.lagou;

import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:52
 * @desc:
 */
public class LaGouStore implements IStore {
    private IStore item = new LaGouItemStore();
    @Override
    public void store(TaskResponse response) throws Exception {
        if (response.getGroup().startsWith("jobs.lagou.items")) {
            item.store(response);
            return;
        }

        response.select("ul.item_con_list")
                .select("li")
                .select(".p_top")
                .select("a").stream()
                .map(element -> element.attr("href"))
                .forEach(elem -> {
                    try {
                        response.getQueue().push(new Task(elem,"jobs.lagou.items"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
