package com.zhangyingwei.job.spider.generator;

import com.zhangyingwei.cockroach.common.generators.StringGenerator;
import com.zhangyingwei.cockroach.executer.Task;
import com.zhangyingwei.job.spider.utils.SpiderUtils;

/**
 * Created by zhangyw on 2017/12/19.
 */
public class CookieGenerator implements StringGenerator {

    @Override
    public String get(Task task) {
        if (task.getGroup().startsWith("jobs.lagou")) {
            String time = SpiderUtils.currentTime();
            String cookie = "_ga=GA1.2.1995371448.1513573496; _gid=GA1.2.425186135.1513573496; user_trace_token="+time+"-fd6e01ba-e3b0-11e7-9da8-5254005c3644; LGUID="+time+"-fd6e08e3-e3b0-11e7-9da8-5254005c3644; showExpriedIndex=1; showExpriedCompanyHome=1; showExpriedMyPublish=1; hasDeliver=169; JSESSIONID=ABAAABAAAGFABEF71A8F9C08F6C5BA149E3CEE68E7164EC; LGSID=20171219104347-6fd3d8b8-e466-11e7-9dc7-5254005c3644; PRE_UTM=; PRE_HOST=www.baidu.com; PRE_SITE=https%3A%2F%2Fwww.baidu.com%2Flink%3Furl%3Dywb5h_oqWYEP6qvIYGT2Mc4a63uNgkaVb2gBkKa4lIS%26wd%3D%26eqid%3Dad592c2e0000cd89000000035a387cdf; PRE_LAND=https%3A%2F%2Fwww.lagou.com%2F; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1513575435,1513575448,1513588248,1513651427; index_location_city=%E5%8C%97%E4%BA%AC; TG-TRACK-CODE=index_user; SEARCH_ID=9df47a6ca4d9480cb7b6dc291c1e35c7; X_HTTP_TOKEN=4d675ede0ffa88578f1cfce8266bf18c; _putrc=C11C7DDB66637784; login=true; unick=%E5%BC%A0%E8%8B%B1%E4%BC%9F; _gat=1; LGRID=20171219105746-642f1439-e468-11e7-a00f-525400f775ce; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1513652266";
            return cookie;
        }
        return "";
    }
}
