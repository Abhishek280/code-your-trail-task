package com.pickyourtrail.developer.test.springmovietitles.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${swagger.path.selector:/.*}")
	private String swaggerPathSelector;

	@Value("${swagger.title:This is Swagger API}")
	private String swaggerTitle;

	@Value("${swagger.desc:Movie Service}")
	private String swaggerDesc;

	@Value("${swagger.version:v1}")
	private String swaggerVersion;

	@Value("${swagger.author:null}")
	private String swaggerAuthor;

	@Value("${swagger.basePackage:null}")
	private String swaggerBasePackage;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(swaggerBasePackage))
				.paths(PathSelectors.regex(swaggerPathSelector)).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title(swaggerTitle)
				.description(swaggerDesc).version(swaggerVersion)
				.contact(swaggerAuthor).build();
		return apiInfo;
	}
}
