package com.zhangyingwei.job.spider.store.tc58;

import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:52
 * @desc:
 */
public class Tc58Store implements IStore {
    private IStore item = new Tc58ItemStore();
    @Override
    public void store(TaskResponse response) throws Exception {
        if (response.getGroup().startsWith("jobs.58tc.items")) {
            item.store(response);
            return;
        }

        response.select(".main")
                .select("ul").select("li").select(".job_title").select(".job_name")
                .select("a").stream()
                .map(element -> element.attr("href"))
                .forEach(elem -> {
                    try {
                        response.getQueue().push(new Task(elem,"jobs.58tc.items"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
