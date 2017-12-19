package com.zhangyingwei.job.spider.store.lagou;

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
public class LaGouItemStore implements IStore {
    @Override
    public void store(TaskResponse response) throws Exception {
        String title = response.select(".job-name").attr("title");
        String company = response.select(".job-name").select(".company").text();

        Elements jobInfos = response.select(".job_request").select("p").select("span");
        String money = jobInfos.get(0).text();
        String place = jobInfos.get(1).text();

        Elements tabInnerBox = response.select("#job_detail").select("dd");
        String desc = tabInnerBox.text();

        JobItem jobItem = new JobItem();
        jobItem.setTitle(title);
        jobItem.setCompany(company);
        jobItem.setMoney(money);
        jobItem.setPlace(place);
        jobItem.setDesc(desc);
        System.out.println(jobItem);
    }
}
