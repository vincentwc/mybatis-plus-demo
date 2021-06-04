package com.vincent.pmsdemo.config;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * swagger配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()//build模式,返回一个建造者
//                .apis(RequestHandlerSelectors.any())//api的配置路径
				.apis(RequestHandlerSelectors.basePackage("com.vincent.pmsdemo.controller"))//api的配置路径
				.paths(PathSelectors.any())//扫描路径选择
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Spring Boot中使用Swagger2构建RESTful API") //文档标题
				.description("rest api 文档构建")//接口概述
				.version("1.0") //版本号
				.termsOfServiceUrl(String.format("url"))//服务的域名
				.build();
	}
}
