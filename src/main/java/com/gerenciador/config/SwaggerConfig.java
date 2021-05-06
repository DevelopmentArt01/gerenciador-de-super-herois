//package com.gerenciador.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.nio.file.Path;
//import springfox.documentation.service.Contact;
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//
//    private static final String BASE_PACKAGE = "com.gerenciador.controller";
//    private static final String API_TITLE = "Gerenciamento  de Super Herois";
//    private static final String API_DESCRIPTION = "API WEB FLUX REACTIVE";
//    private static final String CONTACT_NAME = "YOUR NAME HERE";
//    private static final String CONTACT_EMAIL = "YOU EMAIL HERE";
//    private static final String CONTACT_GITHUB = "YOUR GITHUB";
//
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(buildApiInfo());
//
//    }
//
//
//    private ApiInfo buildApiInfo() {
//        return new ApiInfoBuilder()
//                .title(API_TITLE)
//                .description(API_DESCRIPTION)
//                .version("1.0.0")
//                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
//                .build();
//
//    }
//}
