//package com.alexandrl.blogdriver.configuration;
//
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.alexandrl")
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(final ViewControllerRegistry registry) {
//        registry.addViewController("/")
//                .setViewName("index");
//    }
//
//    @Bean
//    ViewResolver viewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("main/resources/templates/");
//        resolver.setSuffix(".html");
//        return resolver;
//    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//                .addResourceHandler("/**", "/js/**", "/css/**", "/fonts/**", "/img/**")
//                .addResourceLocations("/resources/static/", "/resources/static/js/", "/resources/static/css/", "/resources/static/fonts/", "/resources/static/img/");
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//    }
//}