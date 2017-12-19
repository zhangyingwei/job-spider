# job-spider 招聘信息爬虫

支持招聘平台
* 51JOB
* 拉钩网
* 58同城
* 智联招聘

```
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] ---------------------------config--------------------------
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] AppName: 招聘信息爬虫
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] Proxys: null
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] Threads: 1
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] ThreadSleep: 500
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] HttpClient: class com.zhangyingwei.cockroach.http.client.okhttp.COkHttpClient
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] HttpClientProgress: false
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] Store: class com.zhangyingwei.job.spider.store.JobStore
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] Cookie: 
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] CookieGenerator: class com.zhangyingwei.job.spider.generator.CookieGenerator
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] HttpHeaders: {Cookie=}
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] HttpHeadersGenerator: class com.zhangyingwei.job.spider.generator.HeaderGenerator
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] AutoClose: false
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] TaskErrorHandler: class com.zhangyingwei.cockroach.http.handler.DefaultTaskErrorHandler
[INFO ][2017/12/19 20:36:17 ][com.zhangyingwei.cockroach.config.CockroachConfig] -------------------------------------------------------------

```

```
[INFO ][2017/12/19 20:36:22 ][com.zhangyingwei.cockroach.executer.TaskExecuter] TaskExecuter-1 GET - Task{id='Task-5', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/554310027250487.htm'}
JobItem{title='诚聘零基础开发实习生+提供食宿', money='4001-6000元/月 ', company='北京百知尚行科技有限公司', place='北京', desc='任职要求： 1、大专及以上学历，年龄在18岁-30岁； 2、专业不限，有无经验均可，热爱互联网工作，有一定的逻辑思维； 3、对计算机有一定的兴趣，愿意在互联网行业长期发展； 4、有责任心、细致，有耐心，具有良好的团队合作意识； 5、学习能力强，工作热情高，富有责任感，在项目经理的指导下完成工作内容； 6、欢迎应往届大学毕业生或者想转行人士也可以参加。  福利待遇： 1、薪资=基本工资+项目提成+项目奖金+餐补，多劳多得，不设上限。 2、员工福利 1）五险一金+法定节假日+生日会+过节福利+关爱基金+婚假+产假； 2）节假日福利+（中秋、端午、新年）+定期团队活动； 3）上班时间：五天制，早上九点到下午六点，中午休息一小时，周六日双休。  ', nature='null', experience='null', degree='null', type='null'}
[INFO ][2017/12/19 20:36:23 ][com.zhangyingwei.cockroach.queue.TaskQueue] pool-1-thread-1 take task Task{id='Task-6', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/348261588251670.htm'}
[INFO ][2017/12/19 20:36:23 ][com.zhangyingwei.cockroach.executer.TaskExecuter] TaskExecuter-1 GET - Task{id='Task-6', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/348261588251670.htm'}
JobItem{title='零基础【应届/换行业】人工智能实训【A】', money='15001-20000元/月 ', company='硅谷汇(北京)软件技术有限公司', place='北京', desc='“青星计划”项目五大独特优势 ★★★★★资源优势       北京市高新技术人才引进的北京大学校友亲自掌舵运营执行，校友、朋友分布在百巴腾等企事业单位及政府部门的中坚力量，需求大量高端技术人才。 ★★★★★人才优势      运营执行机构是北京大学校友会创业训练营企业之一，北京大学是近百年以来全国人民公认为我国最好的大学之一，北大校友也是当年全国各地地方高考状元，实力和能力都是全国一流的。 ★★★★★层次优势      被投资人均是本科及以上学历，凸显本科生优势，择优投资。 ★★★★★圈子优势      人以类聚，物以群分，进入北大校友们的朋友圈，接受北京大学校友传授技术技能，和北京大学等高等学府的同学一起学习做朋友，直接帮你改良人生职业生涯发展规划。 ★★★★★资金优势      申请到青星计划指标的同学，远离不理智的高薪就业培训诱惑，有投资回报后即上班领工资了才交学费，无需任何第三方金融贷款公司贷款学习。 条件要求： 1、985、211计算机及理工类本科及以上学历优先 2、一般本科院校理工科类本科需要经过面试及测试选拔 3、勤奋上进，对高精尖的新技术具有开拓创新能力。满足（1、2）两个条件之一且简历没有被选上，对岗位有强烈需求欲望的请加微公众号信“青星科技”咨询。  ', nature='null', experience='null', degree='null', type='null'}
[INFO ][2017/12/19 20:36:23 ][com.zhangyingwei.cockroach.queue.TaskQueue] pool-1-thread-1 take task Task{id='Task-7', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/348261588251667.htm'}
[INFO ][2017/12/19 20:36:24 ][com.zhangyingwei.cockroach.executer.TaskExecuter] TaskExecuter-1 GET - Task{id='Task-7', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/348261588251667.htm'}
JobItem{title='零基础人工智能实习【A】', money='15001-20000元/月 ', company='硅谷汇(北京)软件技术有限公司', place='北京', desc='项目背景 一、领导人的号召         2017年10月18日，党第十九次全代大会开幕，领导人表第十八届委员会在大会上作报告。 　　领导人的报告时长约3个半小时，3万余字，举世瞩目。人民大会堂里，热烈的掌声响起70余次。        领导人说道：“深化供给侧结构性改革。建设现代化经济体系，必须把发展经济的着力点放在实体经济上，把提高供给体系质量作为主攻方向，显著增强我国经济质量优势。加快建设制造强国，加快发展先进制造业，推动互联网、大数据、人工智能和实体经济深度融合，在中高端消费、创新引领、绿色低碳、共享经济、现代供应链、人力资本服务等领域培育新增长点、形成新动能。支持传统产业优化升级，加快发展现代服务业，瞄准国际标准提高水平。促进我国产业迈向全球价值链中高端，培育若干先进制造业集群。” 从领导人的讲话中体现出:大数据，人工智能已经成为当前社会的热词。受到祖国的高度重视和大力支持。2015年8月31日，印发《促进大数据发展行动纲要》(国发〔2015〕50号)，2016年3月国家将大数据战略纳入十三五规划。同时各地出台政策支持人工智能大数据产业发展。  条件要求： 1、985、211类院校计算机及理工类本科及以上学历优先。 2、一般本科院校理工科类专业本科学历需要经过面试及测试选拔。 3、满足（1、2）两个条件之一且简历没有被选上，对岗位有强烈需求欲望的请加微公众号信“青星科技”咨询。 ', nature='null', experience='null', degree='null', type='null'}
[INFO ][2017/12/19 20:36:24 ][com.zhangyingwei.cockroach.queue.TaskQueue] pool-1-thread-1 take task Task{id='Task-8', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/468068285250629.htm'}
[INFO ][2017/12/19 20:36:24 ][com.zhangyingwei.cockroach.executer.TaskExecuter] TaskExecuter-1 GET - Task{id='Task-8', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/468068285250629.htm'}
JobItem{title='游戏辅助软件编程师（包住宿）', money='4001-6000元/月 ', company='巴士互娱(北京)科技有限公司', place='北京', desc='岗位职责： 1. 编写微信、qq等游戏外部报单系统，满足公司运营需求； 2. 编写游戏外部与游戏内部的聊天系统，满足公司日常运营需求； 3. 做好日常协作辅助系统维护，促使游戏外部辅助系统正常工作； 4. 完成部门领导交代的临时性工作。  任职要求：大学本科学历 软件专业 能完成领导的构思构想 有相关工作经验。 行业优秀者 忽略前者要求！ ', nature='null', experience='null', degree='null', type='null'}
[INFO ][2017/12/19 20:36:24 ][com.zhangyingwei.cockroach.queue.TaskQueue] pool-1-thread-1 take task Task{id='Task-9', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/505306737250488.htm'}
[INFO ][2017/12/19 20:36:25 ][com.zhangyingwei.cockroach.executer.TaskExecuter] TaskExecuter-1 GET - Task{id='Task-9', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/505306737250488.htm'}
JobItem{title='JAVA工程师 员工宿舍 高薪转正', money='4001-6000元/月 ', company='北京中祥辉科技有限公司', place='北京', desc='岗位要求： ①、应往届大专及以上学历，有较强的学习能力、语言沟通能力； ②、计算机(网络)、信息管理、经济管理、电子技术、工业工程、自动化、物流供应、自动化、电子商务、机械类、应用数学等相关专业； ③、有计算机语言基础者优先，如：C语言、Java、.NET、PHP等； ④、可接受入职前项目技能实习； 岗位职责： ①、全程参与软件项目的需求分析、设计、开发及测试等几个阶段； ②、参与重点、难点技术攻关； ③、软件项目关键、重点模块研发实现； ④、参与软件质量管理，负责保障代码质量，软件项目的持续优化、改进工作； ⑤、公司有完善的实习培养体系，给经验不足的员工提供前期的实习； 工作时间： 周一至周五，早9点-晚6点，周六日节假日正常休 ', nature='null', experience='null', degree='null', type='null'}
[INFO ][2017/12/19 20:36:25 ][com.zhangyingwei.cockroach.queue.TaskQueue] pool-1-thread-1 take task Task{id='Task-10', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/505306737250641.htm'}
[INFO ][2017/12/19 20:36:25 ][com.zhangyingwei.cockroach.executer.TaskExecuter] TaskExecuter-1 GET - Task{id='Task-10', group='jobs.zhilian.items', url='http://jobs.zhaopin.com/505306737250641.htm'}
JobItem{title='java初级开发+员工宿舍', money='4001-6000元/月 ', company='北京中祥辉科技有限公司', place='北京', desc='任职要求： 1.大专及以上文凭。专业不限，要有一定的逻辑思维,热爱互联网工作； 2.必须对java软件开发行业有兴趣；热爱互联网，喜欢从事IT技术类工作； 3.学习能力强，工作热情高，富有责任感，在项目经理指导下完成商业项目的开发； 4.欢迎优秀应届毕业生前来应聘。（学习能力强者可宽松学历要求） 岗位职责： 1、具备面向对象的编程思想，熟悉设计模式； 2、具备扎实的 Web开发基础，能够熟练使用 Jsp 、 Servlet 、 Spring 、Hibernate，深刻理解 HTML,  JavaScript, CSS； 3、具备扎实的数据库基础，Oracle优先； 4、熟练使用 SVN版本管理工具，并对软件配置管理的概念和方法有所了解； 5、团队协作，配合项目经理的管理工作，高效完成商业项目功能开发。 福利待遇 1、公司提供免费住宿，6-8人间，24小时热水，空调，独立卫生间。 2、实习薪资 实习期间包住，薪资为项目提成，多劳多得，不设上限。 3、上班时间 五天制，早上九点到下午六点，中午休息两小时，周六日双休。 工作职位： JAVA工程师、前端工程师、架构设计师、产品开发工程师、高级工程师、技术经理、技术总监、项目经理、项目总监、CTO ', nature='null', experience='null', degree='null', type='null'}

```