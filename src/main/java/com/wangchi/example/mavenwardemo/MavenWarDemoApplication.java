package com.wangchi.example.mavenwardemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 将 SpringBoot项目 jar 包改成 war项目，让外置 Tomccat 可用
 * 1. 让启动类继承 SpringBootServletInitializer 类，重写 configure 方法，写法参考该类
 * 2. 修改 pom.xml 文件(写法参考该项目的pom文件)
 *    2.1 修改打包为方式为 war 包
 *    2.2 排除内置 Tomcat 包
 *    2.3 添加添加tomcat依赖tomcat
 *    2.4 添加Servlet依赖，只在编译时有效
 *    2.5 添加finalName
 */
@SpringBootApplication
public class MavenWarDemoApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
	    SpringApplication.run(MavenWarDemoApplication.class, args);
	}

    /**
     * 重写该方法，设置打成war包
     * @param builder
     * @return
     */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MavenWarDemoApplication.class);
	}
}

