package com.fiona.mall.gataway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class MallCorsConfiguration {
    @Bean
   public CorsWebFilter corsWebFilter(){
       UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
       CorsConfiguration corsConfiguration = new CorsConfiguration();
       //配置跨域
       corsConfiguration.addAllowedHeader("*");
       corsConfiguration.addAllowedMethod("*"); //允许所有请求方式 put get。。
       corsConfiguration.addAllowedOrigin("*");//允许任意请求来源
       corsConfiguration.setAllowCredentials(true);//允许携带cookie


       source.registerCorsConfiguration("/**", corsConfiguration);

       return new CorsWebFilter(source);
   }
}

