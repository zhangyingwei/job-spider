package com.zhangyingwei.job.spider.store.job51;

import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;
import com.zhangyingwei.job.spider.job.JobItem;
import org.jsoup.select.Elements;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:52
 * @desc:
 */
public class Job51ItemStore implements IStore {
    @Override
    public void store(TaskResponse response) throws Exception {
        Elements basicinfo = response.select(".tCompany_center").select(".tHjob").select(".cn");
        String title = basicinfo.select("h1").attr("title");
        String company = basicinfo.select(".cname").select("a").attr("title");
        String money = basicinfo.select("strong").text();
        String place = basicinfo.select("span").text();

        Elements tabInnerBox = response.select(".tCompany_main").select(".tBorderTop_box");
        String desc = tabInnerBox.select(".job_msg").text();

        JobItem jobItem = new JobItem();
        jobItem.setTitle(title);
        jobItem.setCompany(company);
        jobItem.setMoney(money);
        jobItem.setPlace(place);
        jobItem.setDesc(desc);
        System.out.println(jobItem);
    }
}
