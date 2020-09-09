package com.ureport;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName: AppStart
 * @Description:
 * @Author: anpei.lu
 * @Date: 2020/02/23 18:47:35
 **/
@ImportResource("classpath:ureport-console-context.xml")
@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
    }


    @Bean
    public ServletRegistrationBean ureport(){
        ServletRegistrationBean bead = new ServletRegistrationBean(new UReportServlet());
        bead.addUrlMappings("/ureport/*");
        return bead;
    }
}

