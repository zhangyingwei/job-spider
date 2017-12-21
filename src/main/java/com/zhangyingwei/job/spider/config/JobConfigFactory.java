package com.zhangyingwei.job.spider.config;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:41
 * @desc:
 */
public class JobConfigFactory {
    private static JobConfig jobConfig = new JobConfig();
    public static JobConfig create() {
        JobConfigItem zhilian = new JobConfigItem();
        zhilian.setUrl("http://sou.zhaopin.com/jobs/searchresult.ashx?bj=160000&sj=045&in=210500&jl=%E5%8C%97%E4%BA%AC&sm=0&p=1");
        zhilian.setGroup("jobs.zhilian");

        JobConfigItem lagou = new JobConfigItem();
        lagou.setUrl("https://www.lagou.com/zhaopin/Java/?labelWords=label");
        lagou.setGroup("jobs.lagou");

        JobConfigItem job51 = new JobConfigItem();
        job51.setUrl("http://search.51job.com/list/010000,000000,0000,00,9,99,java,2,1.html?lang=c&stype=1&postchannel=0000&workyear=99&cotype=99&degreefrom=99&jobterm=99&companysize=99&lonlat=0%2C0&radius=-1&ord_field=0&confirmdate=9&fromType=4&dibiaoid=0&address=&line=&specialarea=00&from=&welfare=");
        job51.setGroup("jobs.51job");

        JobConfigItem tc58 = new JobConfigItem();
        tc58.setUrl("http://bj.58.com/tech/?key=java&final=1&jump=1&PGTID=0d302408-0000-1cf0-9b96-81a2d7d67b64&ClickID=3");
        tc58.setGroup("jobs.58tc");

        jobConfig.addItem(zhilian);
        jobConfig.addItem(lagou);
        jobConfig.addItem(job51);
        jobConfig.addItem(tc58);
        return jobConfig;
    }
}
