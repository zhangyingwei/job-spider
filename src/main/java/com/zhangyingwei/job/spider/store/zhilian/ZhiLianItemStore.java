package com.zhangyingwei.job.spider.store.zhilian;

import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.cockroach.executer.TaskResponse;
import com.zhangyingwei.cockroach.store.IStore;
import org.jsoup.select.Elements;

import java.util.stream.Collectors;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:52
 * @desc:
 */
public class ZhiLianItemStore implements IStore {
    @Override
    public void store(TaskResponse response) throws Exception {
        Elements titleBox = response.select(".top-fixed-box").select(".fl");
        String title = titleBox.select("h1").text();
        String company = response.select(".company-name-t").select("a").text();
        Elements jobInfos = response.select(".terminalpage").select("ul").select("li");
        String money = jobInfos.get(0).select("strong").text();
        String place = jobInfos.get(1).select("a").text();
        System.out.println(title);
        System.out.println(company);
        System.out.println(money);
        System.out.println(place);
        System.out.println("----------");
    }
}
