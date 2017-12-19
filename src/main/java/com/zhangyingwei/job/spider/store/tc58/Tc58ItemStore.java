package com.zhangyingwei.job.spider.store.tc58;

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
public class Tc58ItemStore implements IStore {
    @Override
    public void store(TaskResponse response) throws Exception {
        Elements basicinfo = response.select(".pos_info");
        String title = basicinfo.select(".pos_title").text();

        Elements companyInfo = response.select(".company_baseInfo");
        String company = companyInfo.select(".comp_baseInfo_title").select("a").text();
        String money = basicinfo.select(".pos_salary").text();
        String place = basicinfo.select(".pos-area").text();

        Elements tabInnerBox = response.select(".pos_description").select(".posDes");
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
