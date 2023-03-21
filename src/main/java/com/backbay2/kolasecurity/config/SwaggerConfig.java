package com.backbay2.kolasecurity.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * 创建API
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 用来创建该API的基本信息，展示在文档的页面中（自定义展示的信息）
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给Swagger展示
                .select()
                // 扫描所有有注解的api，用这种方式更灵活
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                // 设置标题
                .title("Kola-Security项目系统接口文档")
                .description("Kola-Security项目骨架API文档")
                .version("1.0")
                .build();
    }


    //@Bean
    //public SwaggerProperties swaggerProperties() {
    //    return SwaggerProperties.builder()
    //            .apiBasePackage("com.macro.mall.tiny.modules")
    //            .title("mall-tiny项目骨架")
    //            .description("mall-tiny项目骨架相关接口文档")
    //            .contactName("macro")
    //            .version("1.0")
    //            .enableSecurity(true)
    //            .build();
    //}

}
