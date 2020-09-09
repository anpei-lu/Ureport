# Ureport2.x

## 结合SpringBoot来使用UReport最新版
 
 ##### 一、项目集成主要有3个点：

###### 1、pom引入
```
		<dependency>
            <groupId>com.bstek.ureport</groupId>
            <artifactId>ureport2-console</artifactId>
            <version>2.2.9</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.25</version>
        </dependency>
   ```
######  2、声明servlet
 ```
 @Bean
    public ServletRegistrationBean ureport(){
        ServletRegistrationBean bead = new ServletRegistrationBean(new UReportServlet());
        bead.addUrlMappings("/ureport/*");
        return bead;
    }
   ```
###### 3、引入配置文件

```
@ImportResource("classpath:ureport-console-context.xml")
```
![第二第三点图例](https://img-blog.csdnimg.cn/20200908101620762.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
![项目启动成功](https://img-blog.csdnimg.cn/20200908102014511.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)

##### 二、报表建立主要有3个步骤：
###### 1、数据库连接(数据源有三只举其一)
1.1 连接示例![mysql驱动](https://img-blog.csdnimg.cn/20200908102416616.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
![连接图解](https://img-blog.csdnimg.cn/20200908102706549.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
1.2 连接成功
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908103105486.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)

###### 2、添加数据集
2.1 右键![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908103245787.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
2.2 数据提取
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020090810370651.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
###### 3、制作报表
3.1 列表报表
3.1.1 制作报表模板
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908104406835.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
3.1.2 预览报表
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908104527813.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
3.2 饼图报表
3.2.1 制作报表模板
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908104642211.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)
3.2.2 预览 报表
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908104722424.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)

总结：
集成项目下载[github地址]()

优:
1、上手简单，需要集成调整的位置很少
2、学习成本低，几乎跟Excel一样
3、开源，代码源码可[下载](https://github.com/youseries/ureport)

缺:
1、停更
2、比较原始
3、每次重启报表模板所存的目录都会变，但这个应该是可以解决的
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020090811193856.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzI2NTAzNzM3,size_16,color_FFFFFF,t_70#pic_center)

上诉如有误，请评论更正，谢谢！
