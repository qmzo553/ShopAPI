package com.example.shopapi.config;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring MVC에 대한 설정파일. 웹에대한 설정파일
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // CORS는 프론트엔트, 백엔드 개발자라면 반드시 이해!
    // CORS에 대한 설정. CORS는 Cross Origin Resource Sharing의 약자.
    // 프론트엔드는 3000번 포트 (React.js), 백엔드는 8080번 포트
    // http://localhost:3000 ---> 8080 api를 호출할 수 있도록 설정.

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 어떤 path이든
                .allowedOrigins("http://localhost:3000") // 이 path의 요청을
                .allowedMethods("GET", "POST", "PATCH", "PUT", "OPTIONS", "DELETE"); // 이러한 method를 받아들인다.
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new IfLoginArgumentResolver());
    }
}
